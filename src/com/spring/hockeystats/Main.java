package com.spring.hockeystats;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Hand hand1 = new Hand(5);

        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 2; i++){
            System.out.println(hand1.toString());
            System.out.println("Would you like to re roll?(y/n): ");
            String answer = in.nextLine();
            if(answer.matches("n")){
                break;
            }
            System.out.println("What dice would you like to re roll(ex. 1 4 5) : ");
            String diceToRoll = in.nextLine();
            if(diceToRoll.isEmpty()){
                continue;
            }
            String[] diceNumberstoRoll = diceToRoll.split(" ");

            for (String die : diceNumberstoRoll){
                hand1.getHand().get(Integer.parseInt(die) - 1).roll();
            }
        }

        System.out.println(hand1);

    }
}
