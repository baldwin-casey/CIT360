/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package single.caseysportfolio;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.Queue;
import java.util.Map;
import java.util.Random;
/**
 *
 * @author cbald
 */
public class collections {
   public static int count = 0;
   public static List deck = new ArrayList<>();
   public static List hand = new ArrayList<>();
   public static void collection() {
    System.out.println("COLLECTIONS!\n");
    builddeck();
    drawcards();
   }
   
    public static void builddeck() {
    //Need to build the deck
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
   System.out.println(deck.size() + 1 + " Cards in the deck");
   Collections.shuffle(deck);
   }
   

public static void drawcards() {
    //Random firstrandom = new Random();
     //firstrandom.ints(1,0,deck.size());
   //System.out.println(deck."35");
   //deck.copy();
    //deck.remove(firstrandom);
    
}
}

