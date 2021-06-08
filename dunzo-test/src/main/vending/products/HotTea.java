package main.vending.products;

import main.vending.Beverage;
import main.vending.Ingredient;

public class HotTea extends Ingredient {

    public HotTea() {
    }

    public HotTea(int water, int milk, int sugar, int tea, int coffee) {
        super(water, milk, sugar, tea, coffee);
    }
}
