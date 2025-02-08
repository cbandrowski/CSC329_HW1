package org.example.csc329_hw1;

public class Player {
    private String name;
    private int score;

    /**
     * Default constructor
     *
     */
    public Player() {
        this.name = "";
        this.score = 0;
    }

    /**
     * Constructor
     * @param name
     * @param score
     */
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    /**
     * Copy Constructor
     * Deep copy of player
     * copying over
     * @param other
     */
    public Player(Player other) {
        this.name = new String(other.name);
        this.score = other.score;
    }

    /**
     * getName Method
     * used to pull name from player object
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * setName
     * used to set name of player object
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getScore
     * used to get the score of player object
     * @return int score
     */
    public int getScore() {
        return score;
    }

    /**
     * setScore
     * used to set the score on player object
     * @param score
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * createClone
     * this calls the player copy constructor and will create a copy
     * Player ex2 = ex1.createClone()
     */
    public Player createClone() {
        //This will call forward the Copy Constructor to be used and copy the original player
        return new Player(this);
    }
    /**
     * Equals
     * compares names of players
     */

    public boolean playerEquals(Player other) {
        return this.name.equals(other.name);
    }

    /**
     *toString
     *
     */
    public String toString() {
        return "Name: " + name + " Score: " + score;
    }

}
