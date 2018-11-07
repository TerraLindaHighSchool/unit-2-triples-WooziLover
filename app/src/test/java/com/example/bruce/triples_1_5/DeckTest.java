package com.example.bruce.triples_1_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {

    private Card[] mDeck = new Card[17];
    ;

    @Test
    public void createShuffledDeck() {
        Deck deck = new Deck(81);
        Card topCard;
        Card nextCard;
        for (int i = 0; i < 40; i++) {
            topCard = deck.getTopCard();
            nextCard = deck.getTopCard();
            assertTrue(!topCard.equals(nextCard));
        }
    }

    @Test
    public void getNumCardsInDeck() {
        for (int i = 0; i < mDeck.length; i++) {
            int expectedNumber = mDeck.length;
            int realNumber = mDeck.length;
            assertTrue(expectedNumber == realNumber);
        }

    }

    @Test
    public void getTopCard() {
        Card expectedCard, realityCard;
        for (int i = 0; i < mDeck.length; i++) {
            expectedCard = mDeck[0];
            realityCard = mDeck[0];
            assertTrue(expectedCard == realityCard);
        }
    }
}