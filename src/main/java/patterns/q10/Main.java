package patterns.q10;

import patterns.q10.decorator.CondimentDecorator;
import patterns.q10.decorator.impl.BaconDecorator;
import patterns.q10.decorator.impl.CreamCheeseDecorator;
import patterns.q10.decorator.impl.OreganoDecorator;
import patterns.q10.decorator.impl.TomatoDecorator;
import patterns.q10.factory.PizzaAbstractFactory;
import patterns.q10.factory.impl.PizzaMozzarellaFactory;
import patterns.q10.factory.impl.PizzaPepperoniFactory;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PizzaAbstractFactory mFactory = new PizzaMozzarellaFactory();
        PizzaAbstractFactory pFactory = new PizzaPepperoniFactory();

        var mozzarellaPizza = mFactory.create();
        var pepperoniPizza = pFactory.create();

        var mozzarellaTiny = CondimentDecorator
            .given(mozzarellaPizza)
            .apply(TomatoDecorator.class);

        var mozzarellaLarge = CondimentDecorator
            .given(mozzarellaPizza)
            .apply(TomatoDecorator.class)
            .apply(CreamCheeseDecorator.class);

        var pepperoniTiny = CondimentDecorator
            .given(pepperoniPizza)
            .apply(OreganoDecorator.class)
            .apply(BaconDecorator.class);

        var pepperoniLarge = CondimentDecorator
            .given(pepperoniPizza)
            .apply(OreganoDecorator.class)
            .apply(BaconDecorator.class)
            .apply(TomatoDecorator.class);

        System.out.println("Pizza -- Valor");

        Arrays.asList(mozzarellaPizza, mozzarellaTiny, mozzarellaLarge, pepperoniPizza, pepperoniTiny, pepperoniLarge)
            .forEach(it -> {
                System.out.println(it.getDescription()  + " --- " + it.cost() );
            });

    }
}
