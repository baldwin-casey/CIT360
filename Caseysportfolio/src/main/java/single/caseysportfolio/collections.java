/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.Queue;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author cbald
 This program is fueled by mountain dew and pizza rolls
 */
public class Main {
   public static int count = 0;
   public static int handcount = 0;
   public static List deck = new ArrayList<>();
   public static List hand = new ArrayList<>();
   //REMOVE ME AFTER TESTING
   //LINE SHOULD BE public static void collection() {
   public static void main(String[] args) {
    System.out.println("COLLECTIONS!\n");
    builddeck();
    drawcards();
	displayhand();
	gameresult();
   }
   
    public static void builddeck() {
    //Need to build the deck and shuffle the cards
    deck.add(count, "2 Hearts");
    deck.add(count++, "3 of Hearts");
    deck.add(count++, "4 of Hearts");
    deck.add(count++, "5 of Hearts");
    deck.add(count++, "6 of Hearts");
    deck.add(count++, "7 of Hearts");
    deck.add(count++, "8 of Hearts");
    deck.add(count++, "9 of Hearts");
    deck.add(count++, "10 of Hearts");
    deck.add(count++, "Jack of Hearts");
    deck.add(count++, "Queen of Hearts");
    deck.add(count++, "King of Hearts");
    deck.add(count++, "Ace of Hearts");
    deck.add(count++, "2 of Diamonds");
    deck.add(count++, "3 of Diamonds");
    deck.add(count++, "4 of Diamonds");
    deck.add(count++, "5 of Diamonds");
    deck.add(count++, "6 of Diamonds");
    deck.add(count++, "7 of Diamonds");
    deck.add(count++, "8 of Diamonds");
    deck.add(count++, "9 of Diamonds");
    deck.add(count++, "10 of Diamonds");
    deck.add(count++, "Jack of Diamonds");
    deck.add(count++, "Queen of Diamonds");
    deck.add(count++, "King of Diamonds");
    deck.add(count++, "Ace of Diamonds");
    deck.add(count++, "2 of Spades");
    deck.add(count++, "3 of Spades");
    deck.add(count++, "4 of Spades");
    deck.add(count++, "5 of Spades");
    deck.add(count++, "6 of Spades");
    deck.add(count++, "7 of Spades");
    deck.add(count++, "8 of Spades");
    deck.add(count++, "9 of Spades");
    deck.add(count++, "10 of Spades");
    deck.add(count++, "Jack of Spades");
    deck.add(count++, "Queen of Spades");
    deck.add(count++, "King of Spades");
    deck.add(count++, "Ace of Spades");
    deck.add(count++, "2 of Clubs");
    deck.add(count++, "3 of Clubs");
    deck.add(count++, "4 of Clubs");
    deck.add(count++, "5 of Clubs");
    deck.add(count++, "6 of Clubs");
    deck.add(count++, "7 of Clubs");
    deck.add(count++, "8 of Clubs");
    deck.add(count++, "9 of Clubs");
    deck.add(count++, "10 of Clubs");
    deck.add(count++, "Jack of Clubs");
    deck.add(count++, "Queen of Clubs");
    deck.add(count++, "King of Clubs");
    deck.add(count++, "Ace of Clubs");
    System.out.println("Unshuffled");
    System.out.println(deck);
   System.out.println(deck.size() + " Cards in the deck");
   Collections.shuffle(deck);
   }
   

public static void drawcards() {
	//Draw the First card, remove the card from the deck, decrease the size of the deck, add card to hand
    Random firstrandom = new Random();
	int f = firstrandom.nextInt(count);
	String result = deck.get(f).toString();
    hand.add(handcount, result);
	deck.remove(f);
	count--;
	
	//Draw the Second Card, remove the card from the deck, decrease the size of the deck, add card to hand
	Random secondrandom = new Random();
	int s = secondrandom.nextInt(count);
	result = deck.get(s).toString();
    hand.add(handcount++, result);
	deck.remove(s);
	count--;
	
}

public static void displayhand() {
	//This displays the current score and asks the player to input a choice. 
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(hand.get(0).toString());
        if (m.find()) {
        int firstvalue = Integer.parseInt(m.group(0));
        }

        	//This displays the current score and asks the player to input a choice. 
        Pattern p2 = Pattern.compile("\\d+");
        Matcher m2 = p2.matcher(hand.get(1).toString());
        if (m2.find( )) {
        int secondvalue = Integer.parseInt(m2.group(0));
           //int firstvalue = 5;
           //int secondvalue = 3;
        } 
            int cardresult = firstvalue + secondvalue;
	System.out.println("You drew: ");
	System.out.println(hand.toString());
	System.out.println("For a total of: " + cardresult);
	System.out.println("Would you like to [D]raw or [S]tay? ");
	try {
	Scanner in = new Scanner(System.in);
          String a = in.nextLine();
          switch(a){
              case "D": 
              drawextracard();
          break;
              case "S":
              //Returns to main program  
              break;
        default:
    System.out.println("Enter a vaild selection and try again");
}
}
catch (Exception e) {
     System.out.println("ERROR " + e.getMessage());
}

}

public static void drawextracard(){
	Random extrarandom = new Random();
	int e = extrarandom.nextInt(count);
	String result = deck.get(e).toString();
    hand.add(handcount++, result);
	deck.remove(e);
	count--;
}

public static void gameresult() {
//Here is some code
}
}

