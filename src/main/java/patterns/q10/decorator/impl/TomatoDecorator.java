package patterns.q10.decorator.impl;

import patterns.q10.decorator.CondimentDecorator;
import patterns.q10.model.Pizza;

public class TomatoDecorator extends CondimentDecorator {

    public TomatoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return self.getDescription() + " tomato,";
    }

    @Override
    public Double cost() {
        return 0.1D + self.cost();
    }
}
