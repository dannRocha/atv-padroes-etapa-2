package patterns.q10.decorator.impl;

import patterns.q10.decorator.CondimentDecorator;
import patterns.q10.model.Pizza;

public class BaconDecorator extends CondimentDecorator {
    public BaconDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return self.getDescription() + " bacon,";
    }

    @Override
    public Double cost() {
        return 0.8D + self.cost();
    }
}
