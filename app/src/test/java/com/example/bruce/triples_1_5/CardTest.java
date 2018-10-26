package com.example.bruce.triples_1_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {


   @Test
    public void getShape() {
       Card[] one = {
               new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0),
               new Card(Card.Shape.SQUARE, Card.Color.GREEN, 0, 0)};
       Card.Shape[] t = {Card.Shape.CIRCLE, Card.Shape.CIRCLE};
       Card.Shape[] s = new Card.Shape[2];
       for (int i = 0; i < one.length; i++) {
           s[i] = one[i].getShape();
       }
       assertArrayEquals(s, t);
    }

    @Test
    public void getColor() {
       Card one = new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0);
       Card.Color t = Card.Color.GREEN;
       Card.Color s = one.getColor();
       assertTrue(s==t);
    }

    @Test
    public void getNumber() {

        }
    }
/*
    @Test
    public void getAlpha() {
    }

    @Test
    public void getImageID() {
    }

    @Test
    public void getSelectedImageID() {
    }

    @Test
    public void getIsSelected() {
    }

    @Test
    public void setIsSelected() {
    }
*/



