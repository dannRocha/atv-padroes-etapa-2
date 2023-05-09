package patterns.q5.factory;

import patterns.q5.model.Data;
import patterns.q5.model.Moeda;

public interface LocalidadeAbstractFactory {
    Data getData();
    Moeda getMoeda();
}
