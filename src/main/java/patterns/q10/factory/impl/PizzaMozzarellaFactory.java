package patterns.q10.factory.impl;

import patterns.q10.factory.PizzaAbstractFactory;
import patterns.q10.model.Pizza;
import patterns.q10.model.impl.PizzaMozzarella;

public class PizzaMozzarellaFactory implements PizzaAbstractFactory {
    @Override
    public Pizza create() {
        return new PizzaMozzarella("Mozzarella Pizza", 11.9D);
    }
}
