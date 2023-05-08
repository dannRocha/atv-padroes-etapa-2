package patterns.q4.model;

import patterns.q4.model.enums.Pao;
import patterns.q4.model.enums.Presunto;
import patterns.q4.model.enums.Queijo;
import patterns.q4.model.enums.Salada;

public class Ingrediente {
    private Pao pao;
    private Queijo queijo;
    private Presunto presunto;
    private Salada salada;


    public Pao getPao() {
        return pao;
    }

    public void setPao(Pao pao) {
        this.pao = pao;
    }

    public Queijo getQueijo() {
        return queijo;
    }

    public void setQueijo(Queijo queijo) {
        this.queijo = queijo;
    }

    public Presunto getPresunto() {
        return presunto;
    }

    public void setPresunto(Presunto presunto) {
        this.presunto = presunto;
    }

    public Salada getSalada() {
        return salada;
    }

    public void setSalada(Salada salada) {
        this.salada = salada;
    }

    @Override
    public String toString() {
        return "Ingrediente{" +
                "pao=" + pao +
                ", queijo=" + queijo +
                ", presunto=" + presunto +
                ", salada=" + salada +
                '}';
    }
}
