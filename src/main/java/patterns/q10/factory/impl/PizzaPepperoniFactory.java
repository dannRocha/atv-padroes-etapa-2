package patterns.q10.factory.impl;

import patterns.q10.factory.PizzaAbstractFactory;
import patterns.q10.model.Pizza;
import patterns.q10.model.impl.PizzaMozzarella;
import patterns.q10.model.impl.PizzaPepperoni;

public class PizzaPepperoniFactory implements PizzaAbstractFactory {
    @Override
    public Pizza create() {
        return new PizzaPepperoni("Pepperoni Pizza", 14.9D);
    }
}
