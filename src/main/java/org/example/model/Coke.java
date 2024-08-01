package org.example.model;

import org.example.model.enums.Kind;

public class Coke extends ProductForSale{

    private Kind kind;

    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    public Coke(String type, double price, String description, Kind kind) {
        super(type, price, description);
        this.kind = kind;
    }

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    @Override
    public void showDetails() {
        System.out.println("You chose " + kind + " coke.");
    }
}
