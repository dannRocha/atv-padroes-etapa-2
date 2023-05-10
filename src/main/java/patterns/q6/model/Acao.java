package patterns.q6.model;

import patterns.q6.listerners.AcaoObserver;

import java.util.HashSet;
import java.util.Set;

public class Acao {
    private final String codigo;
    private double valor;

    private Set<AcaoObserver> interessados = new HashSet<>();

    public void registraInteressado(AcaoObserver interessado) {
        this.interessados.add(interessado);
    }
    public void cancelaInteresse(AcaoObserver interessado) {
        this.interessados.remove(interessado);
    }

    public Acao(String codigo, double valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;

        interessados.forEach(it -> {
            it.notificaAlteracao(this);
        });
    }
}
