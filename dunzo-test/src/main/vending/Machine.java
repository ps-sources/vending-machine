package main.vending;

import java.util.List;
import java.util.Map;

public class Machine implements Runnable {
    int outlets;
    Map<String, Integer> quantity;
    List<Beverage> beverages;
    int counter;

    public Machine() {
        this.counter = 0;
        this.outlets = 1;
        this.quantity = null;
        this.beverages = null;
    }

    public int getOutlets() {
        return outlets;
    }

    public Machine setOutlets(int outlets) {
        this.outlets = outlets;
        return this;
    }

    public Map<String, Integer> getQuantity() {
        return quantity;
    }

    public Machine setQuantity(Map<String, Integer> quantity) {
        this.quantity = quantity;
        return this;
    }

    public List<Beverage> getBeverages() {
        return beverages;
    }

    public Machine setBeverages(List<Beverage> beverages) {
        this.beverages = beverages;
        return this;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "outlets=" + outlets +
                "\n, quantity=" + quantity +
                "\n, beverages=" + beverages +
                '}';
    }


    synchronized public void refillIngredients() {
        if (quantity.get(Ingredients.HOT_WATER.name()) <= 50) {
            System.out.println(" -HOT WATER refilled");
            quantity.put(Ingredients.HOT_WATER.name(), 300);
        }
        if (quantity.get(Ingredients.HOT_MILK.name()) <= 50) {
            System.out.println(" -HOT MILK refilled");
            quantity.put(Ingredients.HOT_MILK.name(), 300);
        }
        if (quantity.get(Ingredients.GREEN_MIXTURE.name()) <= 10) {
            System.out.println(" -GREEN MIXTURE refilled");
            quantity.put(Ingredients.GREEN_MIXTURE.name(), 100);
        }
        if (quantity.get(Ingredients.SUGAR_SYRUP.name()) <= 10) {
            System.out.println(" -SUGAR SYRUP refilled");
            quantity.put(Ingredients.SUGAR_SYRUP.name(), 100);
        }
        if (quantity.get(Ingredients.COFFEE_SYRUP.name()) <= 10) {
            System.out.println(" -COFFEE SYRUP refilled");
            quantity.put(Ingredients.COFFEE_SYRUP.name(), 100);
        }
    }

    @Override
    public void run() {
        Beverage b = beverages.get(counter++);
        serveBeverage(b);
    }

    synchronized public void serveBeverage(Beverage b) {
        if (isIngredientAvailable(b)) {
            System.out.println(b.name + " is prepared");
            for (Map.Entry<String, Integer> entry : quantity.entrySet()) {
                if (b.ingredients.containsKey(entry.getKey())) {
                    entry.setValue(entry.getValue() - b.ingredients.get(entry.getKey()));
                }
            }
        }
    }

    synchronized public boolean isIngredientAvailable(Beverage b) {
        Boolean availability = true;
        for (Map.Entry<String, Integer> entry : quantity.entrySet()) {
            if (b.ingredients.containsKey(entry.getKey())) {
                int available = entry.getValue();
                int required = b.ingredients.get(entry.getKey());

                if (available - required < 0) {
                    availability = false;

                    if (available == 0)
                        System.out.println(b.name + " cannot be prepared because item " + entry.getKey() + " is not available");
                    else
                        System.out.println(b.name + " cannot be prepared because item " + entry.getKey() + " is not sufficient");
                    break;
                }
            }
        }
        return availability;
    }

}
