package com.example.w03comp1008;

import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCards {
    private ArrayList<Card> deck;

    public DeckOfCards(){
        //empty array list
        deck = new ArrayList<>();
        //we created a for loop
        //  String suit: means object in each position of the suit list we created
        //Card.getValidSuit means the collection we want it to iterate over
        for (String suit: Card.getValidSuits()){
            //This for loop, loops over each object in the facenames list and assigns it to a suit
            for (String faceName: Card.getValidFaceName()){
                //I have created a newCard object that saves these cards to our instance variable deck
                Card newCard= new Card(faceName,suit);
                deck.add(newCard);
            }

        }



    }
    //Now for shuffling the deck
    public void shuffle(){
        Collections.shuffle(deck);
    }
    public Card dealTopCard(){
        if(deck.size()>0)
        return deck.remove(0);
        else
            return null;
    }
}
