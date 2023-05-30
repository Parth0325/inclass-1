package exercise1;

import java.util.Random;
import java.util.Scanner;

public class Card {

   private String suit;
   private int value;

   public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

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

       

