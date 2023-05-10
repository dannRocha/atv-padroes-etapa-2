package patterns.q10.decorator.impl;

import patterns.q10.decorator.CondimentDecorator;
import patterns.q10.model.Pizza;

public class CreamCheeseDecorator extends CondimentDecorator {


    public CreamCheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return self.getDescription() + " tomato,";
    }

    @Override
    public Double cost() {
        return 1.2D + self.cost();
    }
}
