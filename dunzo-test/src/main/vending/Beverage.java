package main.vending;

import com.fasterxml.jackson.annotation.JsonProperty;
import main.vending.products.GreenTea;
import main.vending.products.HotMilk;
import main.vending.products.HotTea;

public class Beverage {
    @JsonProperty("hotMilk")
    HotMilk hotMilk;
    @JsonProperty("hotTea")
    HotTea hotTea;
    @JsonProperty("greenTea")
    GreenTea greenTea;

    public Beverage() {
    }

    public Beverage(HotMilk hotMilk, HotTea hotTea, GreenTea greenTea) {
        this.hotMilk = hotMilk;
        this.hotTea = hotTea;
        this.greenTea = greenTea;
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "hotMilk=" + hotMilk +
                ", hotTea=" + hotTea +
                ", greenTea=" + greenTea +
                '}';
    }
}
