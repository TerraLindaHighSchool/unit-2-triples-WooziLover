package com.example.bruce.triples_1_5;

import android.content.Context;
import java.util.ArrayList;

public class GameModel {
    private Deck deck;
    private ArrayList<Card> mCardOnBoard;
    private ArrayList<Integer> mSelectedCards;
    private long mStartTime;
    private int mScore, mTriplesRemaining, mLevel;

    GameModel(int numOfCardsInDeck, int level){
        deck = new Deck(numOfCardsInDeck);
        mCardOnBoard = new ArrayList<>();
        mSelectedCards = new ArrayList<>();
    }

/*************************************************
 * Getters and Setters
 *************************************************/

    protected int getCardOnBoard(int index){
    index = mCardOnBoard.size();
    return index;
    }

    protected int getNumOfCardsSelected(){
        return mSelectedCards.size();
    }

   /* protected int getNumOfCardsInDeck(){
        return
        //return mSelectedCards.size();
    }
    */

    protected int getSelectedCardIndex(int index){
    return index;
    }

    protected void setStartTime(){
        mLevel = (int)System.currentTimeMillis();
    }

    protected void setTriplesRemaining(){
        mTriplesRemaining = deck.getNumCardsInDeck() / 3;
    }


        /*************************************************
         * Methods that place cards to board
         *************************************************/
    protected void addCardToBoard(){
        // to be implemented
    }

    protected void replaceCardOnBoard(int index){
        // to be implemented
    }

    /*************************************************
     * Methods that keep track of selected cards
     *************************************************/

    protected void addSelectedCardIndex(int cardIndex){
        // to be implemented
    }

    protected void removeSelectedCardIndex(int cardIndex){
        // to be implemented
    }

    protected void resetSelectedCardIndices(){
        // to be implemented
    }

    /*************************************************
     * Scoring
     *************************************************/
    protected int updateScore() {
        // to be implemented
        return -1; // temporary placeholder until implementation
    }

    /*************************************************
     * Methods that determine play
     *************************************************/

    protected boolean isTriple(int firstCard, int secondCard, int thirdCard){
        // to be implemented
        return true; // temporary placeholder until implementation
    }

    protected boolean playIsPossible(){
        // to be implemented
        return true;  // temporary placeholder until implementation
    }

    protected String getGameOverMessage(Context context){
        String message = context.getString(R.string.game_over);
        if(mTriplesRemaining > 0)
            message = "      " + message + "\n" + context.getString(R.string.play_not_possible);
        return message;
    }
}

