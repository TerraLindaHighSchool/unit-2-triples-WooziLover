package com.example.bruce.triples_1_5;

import android.content.Context;
import java.util.ArrayList;

public class GameModel {
    private Deck deck;
    private ArrayList<Card> mCardOnBoard;
    private ArrayList<Integer> mSelectedCards;
    private long mStartTime;
    private int mScore, mTriplesRemaining, mLevel;

    GameModel(int numOfCardsInDeck, int level) {
        deck = new Deck(numOfCardsInDeck);
        mLevel = level;
        mCardOnBoard = new ArrayList<>();
        mSelectedCards = new ArrayList<>();
        mScore = 0;
        mTriplesRemaining = numOfCardsInDeck / 3;
    }

    /*************************************************
     * Getters and Setters
     *************************************************/

    protected Card getCardOnBoard(int index) {
        return mCardOnBoard.get(index);
    }

    protected int getNumOfCardsSelected() {
        return mSelectedCards.size();
    }

    protected int getNumOfCardsInDeck() {
        return deck.getNumCardsInDeck();
    }

    protected int getSelectedCardIndex(int index) {
        return mSelectedCards.get(index);
    }

    protected void setStartTime() {
        mStartTime = (int) System.currentTimeMillis();
    }

    protected void setTriplesRemaining() {
        mTriplesRemaining--;
    }


    /*************************************************
     * Methods that place cards to board
     *************************************************/
    protected void addCardToBoard() {
        Card mCard = deck.getTopCard();
        mCardOnBoard.add(mCard);
    }

    protected void replaceCardOnBoard(int index) {
        Card mCard = deck.getTopCard();
        mCardOnBoard.set(index, mCard);
    }

    /*************************************************
     * Methods that keep track of selected cards
     *************************************************/

    protected void addSelectedCardIndex(int cardIndex) {
        mSelectedCards.add(cardIndex);
    }

    protected void removeSelectedCardIndex(int cardIndex) {
        mSelectedCards.remove(new Integer(cardIndex));
    }

    //Check to make sure this is correct

    protected void resetSelectedCardIndices() {
        for (int i = 0; i < 3; i++) {
            mSelectedCards.remove(0);
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
    
    protected boolean isTriple(int firstCard, int secondCard, int thirdCard) {
        Card[] mCards = {getCardOnBoard(firstCard), getCardOnBoard(secondCard), getCardOnBoard(thirdCard)};
        return (mCards[0].getShape().ordinal() + mCards[1].getShape().ordinal() + mCards[2].getShape().ordinal()) % 3 == 0
                && (mCards[0].getColor().ordinal() + mCards[1].getColor().ordinal() + mCards[2].getColor().ordinal()) % 3 == 0
                && (mCards[0].getNumber() + mCards[1].getNumber() + mCards[2].getNumber()) % 3 == 0
                && ((mCards[0].getAlpha() + mCards[1].getAlpha() + mCards[2].getAlpha()) % 3 == 0);
    }

        protected boolean playIsPossible () {
            // to be implemented
            return true;  // temporary placeholder until implementation
        }

        protected String getGameOverMessage (Context context){
            String message = context.getString(R.string.game_over);
            if (mTriplesRemaining > 0)
                message = "      " + message + "\n" + context.getString(R.string.play_not_possible);
            return message;
        }
    }

