package patterns.q9;

import patterns.q9.decorator.NumeroFormatDecorator;
import patterns.q9.decorator.impl.NumeroFormatDecoratorBrackets;
import patterns.q9.decorator.impl.NumeroFormatDecoratorKeys;
import patterns.q9.decorator.impl.NumeroFormatDecoratorParentheses;
import patterns.q9.model.NumeroFormat;
import patterns.q9.model.impl.Numero;

public class Main {
    public static void main(String[] args) {
        var classicDecoratorImpl = new NumeroFormatDecoratorKeys(
                new NumeroFormatDecoratorBrackets(
                        new NumeroFormatDecoratorParentheses(
                                Numero.valueOf(1)
                        )
                )
        );

        var decoratorImpl = NumeroFormatDecorator
            .then(Numero.valueOf(1))
            .apply(NumeroFormatDecoratorParentheses.class)
            .apply(NumeroFormatDecoratorBrackets.class)
            .apply(NumeroFormatDecoratorKeys.class);


        System.out.println(decoratorImpl.format());
        System.out.println(classicDecoratorImpl.format());

        assert decoratorImpl.format().equals(classicDecoratorImpl.format());
    }
}
