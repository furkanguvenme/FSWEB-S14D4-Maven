package org.example.model;

import org.example.model.enums.Kind;
import org.example.model.enums.Shape;
import org.example.model.enums.Species;

public class Store {
    public static void main(String[] args) {
        ProductForSale chocolate = new Chocolate("Hand Made",4.99,"Delicious experience!", Species.BITTER);
        ProductForSale bread = new Bread("Home Made", 2.75,"Mother's taste!!", Shape.LOAFBREAD);
        ProductForSale coke = new Coke("Mass Production", 1.5, "Enjoy the Refreshment!", Kind.CHERRY);
        ProductForSale[] product = {chocolate, bread, coke};
        listProducts(product);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale prod : products) {
           prod.showDetails();
        }
    }
}