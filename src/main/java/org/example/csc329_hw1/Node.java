package org.example.csc329_hw1;

public class Node <Player>{
    private Player player;
    private Node<Player> next;

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
    public Node(Player newPlayer, Node<Player> newNext) {
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
    public void setNext(Node<Player> next) {
        this.next = next;
    }

}
