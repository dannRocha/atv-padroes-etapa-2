package patterns.q4.model;

import patterns.q4.model.enums.Pao;
import patterns.q4.model.enums.Presunto;
import patterns.q4.model.enums.Queijo;
import patterns.q4.model.enums.Salada;

public class SanduicheImpl implements Sanduiche {
    private Pao pao;
    private Queijo queijo;
    private Presunto presunto;
    private Salada salada;

    public SanduicheImpl(Pao pao, Queijo queijo, Presunto presunto, Salada salada) {
        this.pao = pao;
        this.queijo = queijo;
        this.presunto = presunto;
        this.salada = salada;
    }

    public Pao getPao() {
        return pao;
    }

    public Queijo getQueijo() {
        return queijo;
    }

    public Presunto getPresunto() {
        return presunto;
    }

    public Salada getSalada() {
        return salada;
    }

    @Override
    public String toString() {
        return "Sanduiche{" +
                "pao=" + pao +
                ", queijo=" + queijo +
                ", presunto=" + presunto +
                ", salada=" + salada +
                '}';
    }
}
