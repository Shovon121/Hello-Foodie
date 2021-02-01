package com.example.moderndashboard;

public class DynamicRvModel {

    String name;
  private int image;
  int pos;


    public DynamicRvModel() {
    }

    public DynamicRvModel(String name, int image,int pos) {
        this.name = name;
        this.image = image;
        this.pos = pos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getPos() {
        return pos;
    }
}
