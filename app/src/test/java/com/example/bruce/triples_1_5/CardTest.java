package com.example.bruce.triples_1_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {

    Card[] one = {
            new Card(Card.Shape.NOSHAPE, Card.Color.NOCOLOR, 0, 0, R.drawable.circle_blue_1_0, R.drawable.circle_blue_2_1_selected),
            new Card(Card.Shape.TRIANGLE, Card.Color.RED, 1, 1, R.drawable.square_green_1_1, R.drawable.square_green_3_0_selected),
            new Card(Card.Shape.CIRCLE, Card.Color.BLUE, 2, 2, R.drawable.triangle_red_3_2, R.drawable.triangle_red_1_2_selected),
            new Card(Card.Shape.SQUARE, Card.Color.GREEN, 3, 3, R.drawable.blank_0_0_0, R.drawable.circle_green_2_0_selected)};

    @Test
    public void getShape() {
        Card.Shape[] t = {Card.Shape.values()[0], Card.Shape.values()[1], Card.Shape.values()[2], Card.Shape.values()[3]};
        Card.Shape[] s = new Card.Shape[4];
        for (int i = 0; i < one.length; i++) {
            s[i] = one[i].getShape();
        }
        assertArrayEquals(s, t);
    }

    @Test
    public void getColor() {
        Card.Color[] t = {Card.Color.values()[0], Card.Color.values()[1], Card.Color.values()[2], Card.Color.values()[3]};
        Card.Color[] s = new Card.Color[4];
        for (int i = 0; i < one.length; i++) {
            s[i] = one[i].getColor();
        }
        assertArrayEquals(s, t);
    }

    @Test
    public void getNumber() {
        int[] t = {0, 1, 2, 3};
        int[] s = new int[4];
        for (int i = 0; i < one.length; i++) {
            s[i] = one[i].getNumber();
        }
        assertArrayEquals(s, t);
    }

    @Test
    public void getAlpha() {
        int[] t = {0, 1, 2, 3};
        int[] s = new int[4];
        for (int i = 0; i < one.length; i++) {
            s[i] = one[i].getAlpha();
        }
        assertArrayEquals(s, t);
    }


    @Test
    public void getImageID() {
        int[] t = {R.drawable.circle_blue_1_0, R.drawable.square_green_1_1, R.drawable.triangle_red_3_2, R.drawable.blank_0_0_0};
        int[] s = new int[4];
        for (int i = 0; i < one.length; i++) {
            s[i] = one[i].getImageID();
        }
        assertArrayEquals(s, t);
    }

    @Test
    public void getSelectedImageID() {
        int[] t = {R.drawable.circle_blue_2_1_selected, R.drawable.square_green_3_0_selected, R.drawable.triangle_red_1_2_selected, R.drawable.circle_green_2_0_selected};
        int[] s = new int[4];
        for(int i = 0; i < one.length;i++) {
            s[i] = one[i].getSelectedImageID();
        }
        assertArrayEquals(s, t);
    }

    /*************************************************
     * I combined the setIsSelected and getIsSelected
     ************************************************/

    @Test
    public void setAndGetIsSelected(){
        one[1].setIsSelected(false);
        one[2].setIsSelected(false);
        one[1].getSelectedImageID();
        one[2].getSelectedImageID();
        boolean[] expected = {true, true, false};
        boolean[] reality = {true, true, false};
        assertArrayEquals(expected, reality);
    }
}




