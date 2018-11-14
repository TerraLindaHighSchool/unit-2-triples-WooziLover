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
        mLevel = level;
        mCardOnBoard = new ArrayList<>();
        mSelectedCards = new ArrayList<>();
        mScore = 0;
    }

    /*************************************************
     * Getters and Setters
     *************************************************/

    protected Card getCardOnBoard(int index){
        return  mCardOnBoard.get(index);
    }

    protected int getNumOfCardsSelected(){
        return mSelectedCards.size();
    }

    protected int getNumOfCardsInDeck(){
        return deck.getNumCardsInDeck();
    }

    protected int getSelectedCardIndex(int index){
        return mSelectedCards.get(index);
    }

    protected void setStartTime(){
        mStartTime = (int)System.currentTimeMillis();
    }

    protected void setTriplesRemaining(){
        mTriplesRemaining = deck.getNumCardsInDeck() / 3;
    }


    /*************************************************
     * Methods that place cards to board
     *************************************************/
    protected void addCardToBoard(){
        Card mCard = deck.getTopCard();
        mCardOnBoard.add(mCard);
    }

    protected void replaceCardOnBoard(int index){
        Card mCard = deck.getTopCard();
        mCardOnBoard.get(index);
        mCardOnBoard.set(index, mCard);

    }

    /*************************************************
     * Methods that keep track of selected cards
     *************************************************/

    protected void addSelectedCardIndex(int cardIndex){
        mSelectedCards.add(cardIndex);
    }

    protected void removeSelectedCardIndex(int cardIndex){
        mSelectedCards.remove(cardIndex);
    }

    //Check to make sure this is correct

    protected void resetSelectedCardIndices(){
        for(int i = 0; i < mSelectedCards.size(); i++){
            mSelectedCards.remove(mSelectedCards);
        }
    }

    /*************************************************
     * Scoring
     *************************************************/
    protected int updateScore() {
        mScore++;
        return mScore; // temporary placeholder until implementation
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
