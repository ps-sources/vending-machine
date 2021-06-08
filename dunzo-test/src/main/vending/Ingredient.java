package main.vending;

public class Ingredient {
    int water;
    int milk;
    int sugar;
    int tea;
    int coffee;

    public Ingredient() {
        this.water = 0;
        this.milk = 0;
        this.sugar = 0;
        this.tea = 0;
        this.coffee = 0;
    }

    public Ingredient(int water, int milk, int sugar, int tea, int coffee) {
        this.water = water;
        this.milk = milk;
        this.sugar = sugar;
        this.tea = tea;
        this.coffee = coffee;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getTea() {
        return tea;
    }

    public void setTea(int tea) {
        this.tea = tea;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "water=" + water +
                ", milk=" + milk +
                ", sugar=" + sugar +
                ", tea=" + tea +
                ", coffee=" + coffee +
                '}';
    }
}
