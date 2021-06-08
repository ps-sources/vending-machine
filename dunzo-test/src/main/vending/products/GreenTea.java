package main.vending.products;

import main.vending.Beverage;
import main.vending.Ingredient;

public class GreenTea extends Ingredient {

    public GreenTea() {
    }
    public GreenTea(int water, int sugar, int tea, int coffee) {
        super(water, 0, sugar, tea, coffee);
    }
}
