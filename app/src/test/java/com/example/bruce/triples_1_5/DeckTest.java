package com.example.bruce.triples_1_5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {

    Deck deck;

    @Before
    public void startCode(){
        deck = new Deck(81);
    }


    @Test
    public void createShuffledDeck() {
        Card topCard;
        Card nextCard;
        for (int i = 0; i < 40; i++) {
            topCard = deck.getTopCard();
            nextCard = deck.getTopCard();
            assertTrue(topCard != nextCard);
        }
    }

    @Test
    public void getNumCardsInDeck() {
            int expectedNumber = 82;
            int realNumber = deck.getNumCardsInDeck();
            assertEquals(expectedNumber, realNumber);
    }

    @Test
    public void getTopCard() {
            Card expectedCard = deck.getCard(0);
            Card realityCard = deck.getTopCard();
            assertEquals(expectedCard, realityCard);
    }
}