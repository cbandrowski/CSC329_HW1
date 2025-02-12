package org.example.csc329_hw1;

/**
 * Node class
 * Created Node class for use of Player Nodes
 * @author Cody Bandrowski
 */

public class Node {
    private Player player;
    private Node next;

    /**
     * Default Constructor
     * @param player
     */
    public Node(Player player) {
        this.player = player;
        this.next = null;
    }

    /**
     * initializes data or current and next user
     * @param newPlayer
     * @param newNext
     */
    public Node(Player newPlayer, Node newNext) {
        this.player = newPlayer;
        this.next = newNext;
    }
    public Player getPlayer() {
        return player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }

}
