package patterns.q3.model.state;

import patterns.q3.model.Processo;

public class Deferir extends EstadoProcesso {
    private Status status = Status.DEFERIDO;
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
        encerrar(processo);
    }
}
