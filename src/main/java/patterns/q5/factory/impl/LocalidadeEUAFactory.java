package patterns.q5.factory.impl;

import patterns.q5.factory.LocalidadeAbstractFactory;
import patterns.q5.model.Data;
import patterns.q5.model.Moeda;
import patterns.q5.model.impl.data.DataEUA;
import patterns.q5.model.impl.moeda.MoedaEUA;

public class LocalidadeEUAFactory implements LocalidadeAbstractFactory {

    private final int day;
    private final float value;

    private LocalidadeEUAFactory(int day, float value) {
        this.day = day;
        this.value = value;
    }

    public static LocalidadeAbstractFactory createFactory(int day, float value) {
        return new LocalidadeEUAFactory(day, value);
    }

    @Override
    public Data getData() {
        return new DataEUA(day);
    }

    @Override
    public Moeda getMoeda() {
        return new MoedaEUA(value);
    }
}
