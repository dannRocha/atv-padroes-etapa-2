package patterns.q10.decorator;

import patterns.q10.model.Pizza;

import java.lang.reflect.InvocationTargetException;

public  abstract class CondimentDecorator implements Pizza {

    protected final Pizza self;
    private CondimentDecorator currentDecorators;

    protected CondimentDecorator(Pizza pizza) {
        this.self = pizza;
    }

    @Override
    public void setDescripion(String description) {

    }

    public static CondimentDecorator given(Pizza pizza) {
        return new CondimentDecoratorBase(pizza);
    }

    abstract public String getDescription();
    abstract public Double cost();

    public CondimentDecorator apply(Class<?> decorator) {
        CondimentDecorator decoratorInstance = null;
        try {
            var constructor = decorator.getDeclaredConstructor(Pizza.class);
            decoratorInstance = (CondimentDecorator) constructor
                    .newInstance(currentDecorators != null ? currentDecorators : self);

            decoratorInstance.currentDecorators = decoratorInstance;

        }
        catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        return decoratorInstance;
    }

    private static class CondimentDecoratorBase extends CondimentDecorator {

        protected CondimentDecoratorBase(Pizza pizza) {
            super(pizza);
        }

        @Override
        public String getDescription() {
            return self.getDescription();
        }

        @Override
        public Double cost() {
            return self.cost();
        }
    }
}
