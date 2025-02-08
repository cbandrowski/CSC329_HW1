package org.example.csc329_hw1;
import org.example.csc329_hw1.Player;

/**
 * PQList- implements PlayerADT interface
 * Class will manage the list of players taken in from files
 * @author Cody Bandrowski
 */
public class PQList implements PlayerADT {

    private org.example.csc329_hw1.Node head;
    private org.example.csc329_hw1.Node tail;
    private int size;

    /**
     * Default Constructor
     */
    public PQList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Copy Constructor
     *
     * @param other
     */
    public PQList(PQList other) {
        this.head = other.head;
        this.tail = other.tail;
        this.size = other.size;

    }

    /**
     * createClone
     * Method makes a clone of another PQList
     * @return
     */
    public PQList createClone() {
        PQList clone = new PQList(); //Makes Empty PQlist
        Node temp = this.head; //Makes temp the head of Original PQlist
        while (temp != null) { //This will go until tail.next if reached which will be null
            //temp will getPlayer info and then createClone() and add to clone PQList
            clone.add(new Player(temp.getPlayer().createClone()));
            //Changes to next item in linked list
            temp = temp.getNext();
        }

        return clone;
    }

    /**
     * Add
     * Method adds new player to end of PQList
     * @param a
     */
    @Override
    public void add(Player a) {
        Node temp = new Node(a);
        //If linkedlist is Empty then it will make head and tail the new temp node
        if (isEmpty()) {
            head = tail = temp;
        } else {
            //This will change tail next reference from null to the new node
            tail.setNext(temp);
            //This will then change tail from previous node to the new one as it's the new tail
            tail = temp;
        }
        size++;
    }

    /**
     * getHighestScorePlayer
     * method will start with head as highest node use as a start to traverse list
     * if highest is head it will remove node and shift head forward 1
     * if tail it will set tail to previous node
     * if in another place it will remove and connect previous node to next after highest
     * @return
     */
    @Override
    public Player getHighestScoreplayer() {
        if (isEmpty()) {
            return null;
        }
        Node highest = this.head;//Make head highest since it is start
        Node current = this.head;//This will traverse list
        Node highPrev = null;//previous node of highest
        Node prev = null; //keep track of prev node during traversal


        while (current != null) {

            if (current.getPlayer().getScore() > highest.getPlayer().getScore()) {
                highest = current;//Set the new highest node
                highPrev = prev;//Keeping track of prev node before highest
            }
            prev = current; //move prev forward
            current = current.getNext();//move current forward
        }
        //if highest is head move head forward to next node which will remove it
        if(highest == this.head) {
            head = head.getNext();

        } else if (highest == tail) {//if highest is tail it will set tail to previous node
            tail = highPrev;
            tail.setNext(null);
        }else {//if not tail or h
        highPrev.setNext(highest.getNext());
        }

        size--;
        return highest.getPlayer();

    }

    /**
     * clear
     * Method clears List of all data
     */
    @Override
    public void clear() {
        head = tail = null;
        size = 0;

    }

    /**
     * getSize
     * Method method will return current number of nodes in list
     * @return
     */
    @Override
    public int getSize() {
        return size;
    }

    /**
     * isEmpty()
     * Method checks if there are any nodes in list by seeing if head is null
     * @return true if list is empty and false if it contains any nodes
     */
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * tostring
     * Returns a string list of PQList
     * @return String
     */
    public String toString() {
        if (isEmpty()) {
            return "List is empty";
        }
        StringBuilder builder = new StringBuilder();
        Node current = head;
        while(current != null) {
            builder.append(current.getPlayer()).append('\n');
            current = current.getNext();
        }
        return builder.toString();
    }
}
