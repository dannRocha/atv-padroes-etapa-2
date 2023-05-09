package patterns.q5.factory.impl;

import patterns.q5.factory.LocalidadeAbstractFactory;
import patterns.q5.model.Data;
import patterns.q5.model.Moeda;
import patterns.q5.model.impl.data.DataBrasil;
import patterns.q5.model.impl.moeda.MoedaBrasil;

public class LocalidadeBrasilFactory implements LocalidadeAbstractFactory {

    private final int day;
    private final float value;

    private LocalidadeBrasilFactory(int day, float value) {
        this.day = day;
        this.value = value;
    }

    public static LocalidadeAbstractFactory createFactory(int day, float value) {
        return new LocalidadeBrasilFactory(day, value);
    }

    @Override
    public Data getData() {
        return new DataBrasil(day);
    }

    @Override
    public Moeda getMoeda() {
        return new MoedaBrasil(value);
    }
}
