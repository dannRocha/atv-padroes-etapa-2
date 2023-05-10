package patterns.q10.decorator.impl;

import patterns.q10.decorator.CondimentDecorator;
import patterns.q10.model.Pizza;

public class OreganoDecorator extends CondimentDecorator {

    public OreganoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return self.getDescription() + " oregano,";
    }

    @Override
    public Double cost() {
        return 0.5D + self.cost();
    }
}
