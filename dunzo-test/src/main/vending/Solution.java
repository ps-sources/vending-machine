package main.vending;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public static void main(String[] args) throws InterruptedException {
        /**
         * Assumption:
         * 1 - A machine contains 'n' outlets
         * 2 - We are providing ingredients with maximum capacity into coffee machine manually
         * 3 - Providing list of beverages with required Ingredients needed for each beverages
         * */

        int n = (int)(Math.random()*10)%4 + 1;
        Machine machine = new Machine();
        machine.setOutlets(n);

        Map<String, Integer> quantity = new HashMap<>();
        quantity.put(Ingredients.HOT_WATER.name(), 300);
        quantity.put(Ingredients.HOT_MILK.name(), 100);
        quantity.put(Ingredients.GREEN_MIXTURE.name(), 50);
        quantity.put(Ingredients.SUGAR_SYRUP.name(), 50);
        quantity.put(Ingredients.COFFEE_SYRUP.name(), 50);
        machine.setQuantity(quantity);


        /* hot milk */
        Map<String, Integer> hotMilk = new HashMap<>();
        hotMilk.put(Ingredients.HOT_MILK.name(), 100);

        /* hot coffee */
        Map<String, Integer> hotCoffee = new HashMap<>();
        hotCoffee.put(Ingredients.HOT_WATER.name(), 50);
        hotCoffee.put(Ingredients.HOT_MILK.name(), 30);
        hotCoffee.put(Ingredients.SUGAR_SYRUP.name(), 10);
        hotCoffee.put(Ingredients.COFFEE_SYRUP.name(), 10);

        /* green tea */
        Map<String, Integer> greenTea = new HashMap<>();
        greenTea.put(Ingredients.HOT_WATER.name(), 70);
        greenTea.put(Ingredients.GREEN_MIXTURE.name(), 15);
        greenTea.put(Ingredients.SUGAR_SYRUP.name(), 15);

        /* black coffee */
        Map<String, Integer> blackCoffee = new HashMap<>();
        blackCoffee.put(Ingredients.HOT_WATER.name(), 70);
        blackCoffee.put(Ingredients.SUGAR_SYRUP.name(), 10);
        blackCoffee.put(Ingredients.COFFEE_SYRUP.name(), 20);

        List<Beverage> beverages = new ArrayList<>();
        beverages.add(new Beverage("Hot Milk", hotMilk));
        beverages.add(new Beverage("Hot Coffee", hotCoffee));
        beverages.add(new Beverage("Green Tea", greenTea));
        beverages.add(new Beverage("Black Coffee", blackCoffee));

        machine.setBeverages(beverages);


        System.out.println("Outlets: " + machine.getOutlets() + "\nBeverages: " + machine.getBeverages() + "\nAvailable: " + machine.getBeverages().size());
        System.out.println();

        for (int j = 0; j < beverages.size(); j++) {
            if(j >= n) Thread.sleep(2000);
            Thread thread = new Thread(machine);
            thread.start();
        }

        // Filling out Ingredients
        Thread.sleep(5000);
        System.out.println("\nRefilling Ingredients");
        machine.refillIngredients();
    }
}
