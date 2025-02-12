package org.example.csc329_hw1;

/**
 * PLayerADT
 * Interface for PQList
 */

public interface PlayerADT {
    //Adds a player object to the priority queue
    void add(Player a);

    //Get the player with the highest score. Use the player’s score to determine priority
    //THE PLAYER SHOULD ALSO BE REMOVED FROM THE PRIORITY QUEUE
    Player getHighestScoreplayer();

    //clear all players from the priority queue
    void clear();

    //Returns the number of players being stored in the priority queue
    int getSize();

    // Returns true if the priority queue is empty.
    boolean isEmpty();
}
