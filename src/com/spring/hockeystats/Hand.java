package com.spring.hockeystats;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Die> hand;

    @Override
    public String toString() {
        return "Hand{" +
                "hand=" + hand +
                '}';

        //for each loop calling each dies toString method
    }

    public Hand(int numOfDies) {
        ArrayList<Die> newHand = new ArrayList<>();
        for(int i = numOfDies; i > 0; i--){
            Die die = new Die();
            newHand.add(die);
        }
        this.hand = newHand;
    }

    public ArrayList<Die> getHand() {
        return hand;
    }

}
