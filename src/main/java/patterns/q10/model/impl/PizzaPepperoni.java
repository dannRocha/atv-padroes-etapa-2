package patterns.q10.model.impl;

import patterns.q10.model.Pizza;

public class PizzaPepperoni implements Pizza {

    private String description;
    private Double cost;

    public PizzaPepperoni(String description, Double cost) {
        this.description = description;
        this.cost = cost;
    }

    @Override
    public void setDescripion(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Double cost() {
        return cost;
    }
}
