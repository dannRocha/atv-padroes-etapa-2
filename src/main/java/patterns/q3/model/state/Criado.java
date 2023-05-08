package patterns.q3.model.state;

import patterns.q3.model.Processo;

public class Criado extends EstadoProcesso {
    private Status status = Status.CRIADO;

    @Override
    public Status getStatus() {
        return status;
    }

    @Override
    public void encerrar(Processo processo) {
        processo.setEstadoProcesso(new Fechado());
    }

    @Override
    public void avancar(Processo processo) {
        processo.setEstadoProcesso(new EmAvaliacao());
    }
}
