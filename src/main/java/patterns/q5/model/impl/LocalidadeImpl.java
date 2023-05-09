package patterns.q5.model.impl;

import patterns.q5.factory.LocalidadeAbstractFactory;
import patterns.q5.model.Data;
import patterns.q5.model.Localidade;
import patterns.q5.model.Moeda;

public class LocalidadeImpl implements Localidade {

    private final Data data;
    private final Moeda moeda;

    public LocalidadeImpl(LocalidadeAbstractFactory factory) {
        data = factory.getData();
        moeda = factory.getMoeda();
    }

    @Override
    public Data getData() {
        return data;
    }

    @Override
    public Moeda getMoeda() {
        return moeda;
    }

    @Override
    public String toString() {
        return "Localidade{" +
                "data=" + data +
                ", moeda=" + moeda +
                '}';
    }
}
