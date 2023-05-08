package patterns.q4.model;

import patterns.q4.model.enums.Pao;
import patterns.q4.model.enums.Presunto;
import patterns.q4.model.enums.Queijo;
import patterns.q4.model.enums.Salada;

public interface Sanduiche {
    Pao getPao();
    Queijo getQueijo();
    Presunto getPresunto();
    Salada getSalada();
    String toString();
}
