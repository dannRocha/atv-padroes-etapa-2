package patterns.q9.model.impl;

import patterns.q9.model.NumeroFormat;

public class Numero implements NumeroFormat {
    private final int numero;

    private Numero(int numero) {
        this.numero = numero;
    }

    public static NumeroFormat valueOf(int numero) {
        return new Numero(numero);
    }

    @Override
    public String format() {
        return String.valueOf(numero);
    }
}
