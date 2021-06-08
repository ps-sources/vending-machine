package main.vending;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Machine {
    Outlet outlets;
    Ingredient quantity;
    Beverage beverages;

    public Machine(){
        this.outlets = null;
        this.quantity = null;
        this.beverages = null;
    }

    public Machine(Outlet outlets, Ingredient quantity,Beverage beverages){
        this.outlets = outlets;
        this.quantity = quantity;
        this.beverages = beverages;
    }

    public Outlet getOutlets() {
        return outlets;
    }

    public void setOutlets(Outlet outlets) {
        this.outlets = outlets;
    }

    public Ingredient getQuantity() {
        return quantity;
    }

    public void setQuantity(Ingredient quantity) {
        this.quantity = quantity;
    }

    public Beverage getBeverages() {
        return beverages;
    }

    public void setBeverages(Beverage beverages) {
        this.beverages = beverages;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "outlets=" + outlets +
                ", quantity=" + quantity +
                ", beverages=" + beverages +
                '}';
    }

    public boolean lowLevelIndicator(){
        return false;
    }
}
