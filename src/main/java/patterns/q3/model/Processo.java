package patterns.q3.model;

import patterns.q3.model.state.EstadoProcesso;
import patterns.q3.model.state.Gestacao;
import patterns.q3.model.state.Status;

public class Processo {
    protected EstadoProcesso estadoProcesso;

    public Processo() {
        this.estadoProcesso = new Gestacao();
    }

    public Status getStatus() {
        return estadoProcesso.getStatus();
    }

    public void encerrar() {
        estadoProcesso.encerrar(this);
    }
    public void avancar() {
        estadoProcesso.avancar(this);
    }

    public void setEstadoProcesso(EstadoProcesso estadoProcesso) {
        this.estadoProcesso = estadoProcesso;
    }

    @Override
    public String toString() {
        return "Processo{" +
                "estadoProcesso=" + estadoProcesso.getStatus() +
                '}';
    }
}
