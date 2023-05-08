package patterns.q3.model.state;

import patterns.q3.model.Processo;

public abstract class EstadoProcesso {

    public abstract Status getStatus();

    public abstract void encerrar(Processo processo);
    public abstract void avancar(Processo processo);

}
