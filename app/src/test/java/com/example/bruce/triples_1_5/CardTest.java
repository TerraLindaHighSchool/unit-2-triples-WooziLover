package com.example.bruce.triples_1_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {

    Card[] card = {
            new Card(Card.Shape.NOSHAPE, Card.Color.NOCOLOR, 0, 0, R.drawable.circle_blue_1_0, R.drawable.circle_blue_2_1_selected),
            new Card(Card.Shape.TRIANGLE, Card.Color.RED, 1, 1, R.drawable.square_green_1_1, R.drawable.square_green_3_0_selected),
            new Card(Card.Shape.CIRCLE, Card.Color.BLUE, 2, 2, R.drawable.triangle_red_3_2, R.drawable.triangle_red_1_2_selected),
            new Card(Card.Shape.SQUARE, Card.Color.GREEN, 3, 3, R.drawable.blank_0_0_0, R.drawable.circle_green_2_0_selected)};

    @Test
    public void getShape() {
        Card.Shape[] actualValue = {Card.Shape.values()[0], Card.Shape.values()[1], Card.Shape.values()[2], Card.Shape.values()[3]};
        Card.Shape[] expectedValue = new Card.Shape[4];
        for (int i = 0; i < card.length; i++) {
            expectedValue[i] = card[i].getShape();
        }
        assertArrayEquals(expectedValue, actualValue);
    }

    @Test
    public void getColor() {
        Card.Color[] actualValue = {Card.Color.values()[0], Card.Color.values()[1], Card.Color.values()[2], Card.Color.values()[3]};
        Card.Color[] expectedValue = new Card.Color[4];
        for (int i = 0; i < card.length; i++) {
            expectedValue[i] = card[i].getColor();
        }
        assertArrayEquals(expectedValue, actualValue);
    }

    @Test
    public void getNumber() {
        int[] actualValue = {0, 1, 2, 3};
        int[] expectedValue = new int[4];
        for (int i = 0; i < card.length; i++) {
            expectedValue[i] = card[i].getNumber();
        }
        assertArrayEquals(expectedValue, actualValue);
    }

    @Test
    public void getAlpha() {
        int[] actualValue = {0, 1, 2, 3};
        int[] expectedValue = new int[4];
        for (int i = 0; i < card.length; i++) {
            expectedValue[i] = card[i].getAlpha();
        }
        assertArrayEquals(expectedValue, actualValue);
    }


    @Test
    public void getImageID() {
        int[] actualValue = {R.drawable.circle_blue_1_0, R.drawable.square_green_1_1, R.drawable.triangle_red_3_2, R.drawable.blank_0_0_0};
        int[] expectedValue = new int[4];
        for (int i = 0; i < card.length; i++) {
            expectedValue[i] = card[i].getImageID();
        }
        assertArrayEquals(expectedValue, actualValue);
    }

    @Test
    public void getSelectedImageID() {
        int[] actualValue = {R.drawable.circle_blue_2_1_selected, R.drawable.square_green_3_0_selected, R.drawable.triangle_red_1_2_selected, R.drawable.circle_green_2_0_selected};
        int[] expectedValue = new int[4];
        for(int i = 0; i < card.length;i++) {
            expectedValue[i] = card[i].getSelectedImageID();
        }
        assertArrayEquals(expectedValue, actualValue);
    }

    /*************************************************
     * I combined the setIsSelected and getIsSelected
     ************************************************/

    @Test
    public void setAndGetIsSelected(){
        card[1].setIsSelected(false);
        card[2].setIsSelected(false);
        card[1].getSelectedImageID();
        card[2].getSelectedImageID();
        boolean[] expectedValue = {true, true, false};
        boolean[] actualValue = {true, true, false};
        assertArrayEquals(expectedValue, actualValue);
    }
}




