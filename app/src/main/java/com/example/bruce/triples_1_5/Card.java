package com.example.bruce.triples_1_5;

public class Card {

    private Shape mShape;
    private Color mColor;
    private int mNumber, mAlpha, mImage, mSelectedImageID;
    boolean  mIsSelected;


    public Card(Shape shape, Color color, int number, int alpha, int image, int selectedImageID) {
        this.mShape = shape;
        this.mColor = color;
        this.mNumber = number;
        this.mAlpha = alpha;
        this.mImage = image;
        this.mSelectedImageID = selectedImageID;
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
        return this.mShape;
    }

    protected Color getColor(){
        return this.mColor;
    }

    protected int getNumber(){
        return this.mNumber;
    }

    protected int getAlpha(){
        return this.mAlpha;
    }

    protected int getImageID(){
        return this.mImage;
    }

    protected int getSelectedImageID(){
        return this.mSelectedImageID;
    }

    protected boolean getIsSelected(){
        return this.mIsSelected;
    }

    protected void setIsSelected(boolean s)
    {
        this.mIsSelected = s;

    }
}




