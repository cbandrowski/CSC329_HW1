package org.example.csc329_hw1;

public class PQList<Player> implements PlayerADT<Player>{

 private org.example.csc329_hw1.Node head;
 private org.example.csc329_hw1.Node tail;
 private int size;

    /**
     * Default Constructor
     *
     */
    public PQList(){
    this.head = null;
    this.tail = null;
    this.size = 0;
}

    /**
     * Copy Constructor
     *
     * @param other
     */
    public PQList(PQList other){
        this.head = other.head;
        this.tail = other.tail;
        this.size = other.size;

}

public PQList createClone(){
        PQList clone = new PQList(); //Makes Empty PQlist
        Node temp = this.head; //Makes temp the head of Original PQlist
        while(temp != null){ //This will go until tail.next if reached which will be null
            clone.add(new Player(temp.pl))
        }

        return clone;
}

    @Override
    public void add(Player a) {
        Node temp = new Node(a);

        //If linkedlist is Empty then it will make head and tail the new temp node
        if(isEmpty()){
        head = tail = temp;
         }else{
            //This will change tail next reference from null to the new node
        tail.setNext(temp);
        //This will then change tail from previous node to the new one as it's the new tail
        tail = temp;
        }
        size++;
    }

    @Override
    public Player getHighestScoreplayer() {
        return null;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;

    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
