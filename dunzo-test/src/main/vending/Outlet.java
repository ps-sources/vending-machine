package main.vending;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Outlet {
    @JsonProperty("count")
    int count;

    public Outlet() {
    }

    public Outlet(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Outlet{" +
                "count=" + count +
                '}';
    }
}
