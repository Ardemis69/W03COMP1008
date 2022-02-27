package com.example.w03comp1008;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;
    //In order to initialise this we need to write this
//this makes it sort of automated--necessary!!!!
public class CardViewController implements Initializable {

    @FXML
    private Label cardLabel;

    @FXML
    private Label cardValueLabel;

    @FXML
    private Label faceNameLabel;

    @FXML
    private Label suitLabel;

    private DeckOfCards deck;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //this creates a new deck of cards
        deck = new DeckOfCards();
        //dealing cards
        Card card= deck.dealTopCard();
        //setting it up with the label in scenebuilder
        cardLabel.setText(card.toString());
        //Now do the same stuff for others
        //but the facevalue label is an int data so to convert it do the following
        cardValueLabel.setText(Integer.toString(card.getFaceValue()));
        //same for the rest
        faceNameLabel.setText(card.getFaceName());
        suitLabel.setText(card.getSuit());
    }
        @FXML
        void viewNextCard() {
            //dealing cards
            Card card= deck.dealTopCard();
            //setting it up with the label in scenebuilder
            cardLabel.setText(card.toString());
            //Now do the same stuff for others
            //but the facevalue label is an int data so to convert it do the following
            cardValueLabel.setText(Integer.toString(card.getFaceValue()));
            //same for the rest
            faceNameLabel.setText(card.getFaceName());
            suitLabel.setText(card.getSuit());

        }
}
