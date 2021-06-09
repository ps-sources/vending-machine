package main.vending;

import java.util.Map;

public class Beverage {
    String name;
    Map<String, Integer> ingredients;

    public Beverage(String name, Map<String, Integer> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return name;
    }


}
