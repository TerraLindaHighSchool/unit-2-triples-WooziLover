package com.example.bruce.triples_1_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {

    @Test
    public void getShape() {
        Card[] one = {
                new Card(Card.Shape.NOSHAPE, Card.Color.GREEN, 0, 0, 0, 0),
                new Card(Card.Shape.TRIANGLE, Card.Color.GREEN, 0, 0, 0, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, 0, 0),
                new Card(Card.Shape.SQUARE, Card.Color.GREEN, 0, 0, 0, 0)};
        Card.Shape[] t = {Card.Shape.values()[0], Card.Shape.values()[1], Card.Shape.values()[2], Card.Shape.values()[3]};
        Card.Shape[] s = new Card.Shape[4];
        for (int i = 0; i < one.length; i++) {
            s[i] = one[i].getShape();
        }
        assertArrayEquals(s, t);
    }

    @Test
    public void getColor() {
        Card[] one = {
                new Card(Card.Shape.NOSHAPE, Card.Color.NOCOLOR, 0, 0, 0, 0),
                new Card(Card.Shape.TRIANGLE, Card.Color.RED, 0, 0, 0, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.BLUE, 0, 0, 0, 0),
                new Card(Card.Shape.SQUARE, Card.Color.GREEN, 0, 0, 0, 0)};
        Card.Color[] t = {Card.Color.values()[0], Card.Color.values()[1], Card.Color.values()[2], Card.Color.values()[3]};
        Card.Color[] s = new Card.Color[4];
        for (int i = 0; i < one.length; i++) {
            s[i] = one[i].getColor();
        }
        assertArrayEquals(s, t);
    }

    @Test
    public void getNumber() {
        Card[] one = {
                new Card(Card.Shape.NOSHAPE, Card.Color.GREEN, 0, 0, 0, 0),
                new Card(Card.Shape.TRIANGLE, Card.Color.GREEN, 1, 0, 0, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 2, 0, 0, 0),
                new Card(Card.Shape.SQUARE, Card.Color.GREEN, 3, 0, 0, 0)};
        int[] t = {0, 1, 2, 3};
        int[] s = new int[4];
        for (int i = 0; i < one.length; i++) {
            s[i] = one[i].getNumber();
        }
        assertArrayEquals(s, t);
    }

    @Test
    public void getAlpha() {
        Card[] one = {
                new Card(Card.Shape.NOSHAPE, Card.Color.GREEN, 0, 0, 0, 0),
                new Card(Card.Shape.TRIANGLE, Card.Color.GREEN, 0, 1, 0, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 2, 0, 0),
                new Card(Card.Shape.SQUARE, Card.Color.GREEN, 0, 3, 0, 0)};
        int[] t = {0, 1, 2, 3};
        int[] s = new int[4];
        for (int i = 0; i < one.length; i++) {
            s[i] = one[i].getAlpha();
        }
        assertArrayEquals(s, t);
    }


    @Test
    public void getImageID() {
    Card[] one = {
                new Card(Card.Shape.NOSHAPE, Card.Color.GREEN, 0,0, R.drawable.blank_0_0_0, 0),
                new Card(Card.Shape.NOSHAPE, Card.Color.GREEN, 0, 0, R.drawable.circle_blue_1_0, 0),
                new Card(Card.Shape.TRIANGLE, Card.Color.GREEN, 0, 0, R.drawable.circle_blue_1_1, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.circle_blue_1_2, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.circle_blue_2_0, 0),
                new Card(Card.Shape.SQUARE, Card.Color.GREEN, 0, 0, R.drawable.circle_blue_2_1, 0),
                new Card(Card.Shape.SQUARE, Card.Color.GREEN, 0, 0, R.drawable.circle_blue_2_2, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.circle_blue_3_0, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.circle_blue_3_1, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.circle_blue_3_2, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.circle_green_1_0, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.circle_green_1_1, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.circle_green_1_2, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.circle_green_2_0, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.circle_green_2_1, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.circle_green_2_2, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.circle_green_3_0, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.circle_green_3_1, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.circle_green_3_2, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.circle_red_1_0, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.circle_red_1_1, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.circle_red_1_2, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.circle_red_2_0, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.circle_red_2_1, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.circle_red_2_2, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.circle_red_3_0, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.circle_red_3_1, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.circle_red_3_2, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.square_blue_1_0, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.square_blue_1_1, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.square_blue_1_2, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.square_blue_2_0, 0),
                new Card(Card.Shape.SQUARE, Card.Color.GREEN, 0, 0, R.drawable.square_blue_2_1, 0),
                new Card(Card.Shape.SQUARE, Card.Color.GREEN, 0, 0, R.drawable.square_blue_2_2, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.square_blue_3_0, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.square_blue_3_1, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.square_blue_3_2, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.square_green_1_0, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.square_green_1_1, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.square_green_1_2, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.square_green_2_0, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.square_green_2_1, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.square_green_2_2, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.square_green_3_0, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.square_green_3_1, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.square_green_3_2, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.square_red_1_0, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.square_red_1_1, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.square_red_1_2, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.square_red_2_0, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.square_red_2_1, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.square_red_2_2, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.square_red_3_0, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.square_red_3_1, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.square_red_3_2, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.triangle_blue_1_0, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.triangle_blue_1_1, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.triangle_blue_1_2, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.triangle_blue_2_0, 0),
                new Card(Card.Shape.SQUARE, Card.Color.GREEN, 0, 0, R.drawable.triangle_blue_2_1, 0),
                new Card(Card.Shape.SQUARE, Card.Color.GREEN, 0, 0, R.drawable.triangle_blue_2_2, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.triangle_blue_3_0, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.triangle_blue_3_1, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.triangle_blue_3_2, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.triangle_green_1_0, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.triangle_green_1_1, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.triangle_green_1_2, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.triangle_green_2_0, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.triangle_green_2_1, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.triangle_green_2_2, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.triangle_green_3_0, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.triangle_green_3_1, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.triangle_green_3_2, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.triangle_red_1_0, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.triangle_red_1_1, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.triangle_red_1_2, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.triangle_red_2_0, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.triangle_red_2_1, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.triangle_red_2_2, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.triangle_red_3_0, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.triangle_red_3_1, 0),
                new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, R.drawable.triangle_red_3_2, 0)};
 //       Card.Shape[] t = {Card.Shape.values()[0], Card.Shape.values()[1], Card.Shape.values()[2], Card.Shape.values()[3]};
     //   Card.Shape[] s = new Card.Shape[62];
    //    for (int i = 0; i < one.length; i++) {
   //         s[i] = one[i].getImageID();
   //     }
    //    assertArrayEquals(s, t);
    }
/*
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
}




