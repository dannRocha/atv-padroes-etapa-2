package patterns.q9.decorator;

import patterns.q9.model.NumeroFormat;

import java.lang.reflect.InvocationTargetException;

public abstract class NumeroFormatDecorator implements NumeroFormat {
    protected final NumeroFormat self;
    private NumeroFormatDecorator currentDecorators;

    protected NumeroFormatDecorator(NumeroFormat numeroWrapper) {
        this.self = numeroWrapper;
    }

    public NumeroFormatDecorator apply(Class<?> decorator) {
        NumeroFormatDecorator decoratorInstance = null;
        try {

            var constructor = decorator.getDeclaredConstructor(NumeroFormat.class);
            decoratorInstance = (NumeroFormatDecorator) constructor
                    .newInstance(currentDecorators != null ? currentDecorators : self);

            decoratorInstance.currentDecorators = decoratorInstance;

        }
        catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }


        return decoratorInstance;
    }

    public static NumeroFormatDecorator then(NumeroFormat numeroFormat) {
        return new NumeroFormatDecoratorBase(numeroFormat);
    }

    public abstract String format();


    private static class NumeroFormatDecoratorBase extends NumeroFormatDecorator {
        protected NumeroFormatDecoratorBase(NumeroFormat numeroWrapper) {
            super(numeroWrapper);
        }

        @Override
        public String format() {
            return self.format();
        }
    }
}
