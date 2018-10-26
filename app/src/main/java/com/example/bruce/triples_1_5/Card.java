package com.example.bruce.triples_1_5;

public class Card {

   private Shape mShape;
   private Color mColor;
   private int mNumber, mAlpha, mImage;
   boolean mSelectedImageID;

    public Card(Shape shape, Color color, int number, int alpha) {
        this.mShape = shape;
        this.mColor = color;
        this.mNumber = number;
        this.mAlpha = alpha;
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

    protected boolean getSelectedImageID(){
        return mSelectedImageID;
    }

    protected boolean getIsSelected(){
        return false;
    }

    protected boolean setIsSelected(){
        return true;
    }
}




