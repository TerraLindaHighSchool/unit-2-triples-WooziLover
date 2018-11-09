package com.example.bruce.triples_1_5;

import java.util.ArrayList;

public class Card extends ArrayList<Integer> {

    private Shape mShape;
    private Color mColor;
    private int mNumber, mAlpha, mImage, mSelectedImageID;
    boolean  mIsSelected;


    public Card(Shape shape, Color color, int number, int alpha, int image, int selectedImageID) {
        mShape = shape;
        mColor = color;
        mNumber = number;
        mAlpha = alpha;
        mImage = image;
        mSelectedImageID = selectedImageID;
    }

    /***************************************
     Making the enum of shape and color.
     **************************************/

    public enum Shape {
        NOSHAPE, TRIANGLE, CIRCLE, SQUARE
    }

    public enum Color {
        NOCOLOR, RED, BLUE, GREEN
    }

    /***********************************
     * Getters and Setters
     **********************************/

    protected Shape getShape() {
        return mShape;
    }

    protected Color getColor(){
        return mColor;
    }

    protected int getNumber(){
        return mNumber;
    }

    protected int getAlpha(){
        return mAlpha;
    }

    protected int getImageID(){
        return mImage;
    }

    protected int getSelectedImageID(){
        return mSelectedImageID;
    }

    protected boolean getIsSelected(){
        return mIsSelected;
    }

    protected void setIsSelected(boolean s)
    {
        mIsSelected = s;

    }
}




