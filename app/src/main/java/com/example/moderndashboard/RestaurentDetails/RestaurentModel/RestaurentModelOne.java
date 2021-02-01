package com.example.moderndashboard.RestaurentDetails.RestaurentModel;

public class RestaurentModelOne {

    private String text;
    private int image;
    private int pos;


    public RestaurentModelOne() {
    }

    public RestaurentModelOne(String text, int image,int pos) {
        this.text = text;
        this.image = image;
        this.pos= pos;
    }
    public RestaurentModelOne(String text, int image) {
        this.text = text;
        this.image = image;

    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

