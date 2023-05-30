package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack = 11, Queen = 12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * 
 * Modified by [Your Name] May 2023
 */
public class Card {

    private String suit; //clubs, spades, diamonds, hearts
    private int value;//1-13

    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Card[] hand = new Card[7];

        Random random = new Random();

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of your card (1-10, 11 for Jack, 12 for Queen, 13 for King): ");
        int value = scanner.nextInt();
        System.out.print("Enter the suit of your card (0 for Hearts, 1 for Diamonds, 2 for Clubs, 3 for Spades): ");
        int suit = scanner.nextInt();

        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suit]);

        boolean foundMatch = false;

        for (Card card : hand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                foundMatch = true;
                break;
            }
        }

        if (foundMatch) {
            printInfo();
        }
    }


    /**
     * A simple method to print out personal information. Follow the instructions to
     * replace this information with your own.
     */
    private static void printInfo() {

        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is [Your Name]");
        System.out.println();

        System.out.println("My career ambitions:");
        System.out.println("-- Add your career ambitions here");
        System.out.println();

        System.out.println("My hobbies:");
        System.out.println("-- Add your hobbies here");

        System.out.println();
    }
}
