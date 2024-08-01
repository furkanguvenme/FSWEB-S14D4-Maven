package org.example.model;

import org.example.model.enums.Species;

public class Chocolate extends ProductForSale{

    private Species species;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, double price, String description, Species species) {
        super(type, price, description);
        this.species = species;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    @Override
    public void showDetails() {
        System.out.println("You chose "+ species + " chocolate.");
    }
}
