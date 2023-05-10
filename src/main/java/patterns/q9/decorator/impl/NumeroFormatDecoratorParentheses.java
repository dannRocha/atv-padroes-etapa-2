package patterns.q9.decorator.impl;

import patterns.q9.decorator.NumeroFormatDecorator;
import patterns.q9.model.NumeroFormat;

public class NumeroFormatDecoratorParentheses extends NumeroFormatDecorator {
    public NumeroFormatDecoratorParentheses(NumeroFormat numeroWrapper) {
        super(numeroWrapper);
    }

    @Override
    public String format() {
        return String.format("(%s)", self.format());
    }
}
