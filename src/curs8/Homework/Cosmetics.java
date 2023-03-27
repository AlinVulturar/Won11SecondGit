package curs8.Homework;

import curs8.Homework.Product;

public class Cosmetics extends Product {

    public Cosmetics(int weight) {
        this.weight = weight;
    }

    public Cosmetics(String colour) {
        this.colour = colour;
    }

    public String isColour() {
        return colour;
    }

    public void setColour(boolean color) {
        this.color = color;
    }

    private String colour;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private int weight;

}
