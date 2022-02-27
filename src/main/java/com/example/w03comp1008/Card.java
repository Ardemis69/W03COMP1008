package com.example.w03comp1008;

import java.util.Arrays;
import java.util.List;

public class Card {
    //instance variables
    private String suit, faceName;

    /**
     * Constructor
     * */
    public Card( String faceName ,String suit) {
        setSuit(suit);
        setFaceName(faceName);
    }

    public String getSuit() {
        return suit;
    }



    public String getFaceName() {
        return faceName;
    }

    public void setSuit(String suit) {
        //setting whatever suit given to lowercase
        suit= suit.toLowerCase();

        //Validating that if and only if the suit class has the same values as that of the getValidSuits class.
        //Then only assign it to the setter. Else throw exception.
        if (getValidSuits().contains(suit)){
            this.suit = suit;
        }else{throw new IllegalArgumentException(suit+"NOT Valid suit" +getValidSuits());}

    }

    //we created a list object that returns all the valid suits and wwe named it getvalidSuits()
    //And, we told it to return Arrays.asList
    public static List<String> getValidSuits(){
        return Arrays.asList("clubs","hearts","spades","diamond");
    }



    //I created this array list that contains all the valid face names
    //This will validate the user entries and check whether the entered card fall under this list
    public static List<String> getValidFaceName(){
        return Arrays.asList("2","3","4","5","6","7","8","9","10","jack","queen","king","ace");
    }

    public void setFaceName(String faceName) {
        faceName= faceName.toLowerCase();
        //Before binding it to the face name, this if statement will check whether the card falls under the list of valid facenames

     if(getValidFaceName().contains(faceName)){
         this.faceName = faceName;
     }else{
         throw new IllegalArgumentException(faceName+"Not Valid Face Card"+getValidFaceName());
     }

    }
    //Now this toString method will allow us to represent String  values when we call them in our main method
    public String toString(){
        return String.format("%s,%s",faceName,suit);
    }

    //this method is for getting the color of the card
    public  String getColor(){
        if (suit.equals("hearts") || suit.equals("diamond"))
            return  "red";
        else
            return "black";
    }

    //this method is for getiing the actual face value
    public int getFaceValue(){
        return getValidFaceName().indexOf(faceName)+2;
    }
}
