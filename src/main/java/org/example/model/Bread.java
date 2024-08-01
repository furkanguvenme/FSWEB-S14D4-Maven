package org.example.model;

import org.example.model.enums.Shape;

public class Bread extends ProductForSale{

    private Shape shape;

    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    public Bread(String type, double price, String description, Shape shape) {
        super(type, price, description);
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void showDetails() {
        System.out.println("You chose " + shape + " bread.");
    }
}
