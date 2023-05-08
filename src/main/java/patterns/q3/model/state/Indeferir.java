package patterns.q3.model.state;

import patterns.q3.model.Processo;

public class Indeferir extends EstadoProcesso {

    private Status status = Status.INDEFERIDO;
    @Override
    public Status getStatus() {
        return null;
    }

    @Override
    public void encerrar(Processo processo) {
        processo.setEstadoProcesso(new Fechado());
    }

    @Override
    public void avancar(Processo processo) {
        processo.setEstadoProcesso(new EmRecurso());
    }
}
