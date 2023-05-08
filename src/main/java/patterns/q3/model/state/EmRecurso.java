package patterns.q3.model.state;

import patterns.q3.model.Processo;

public class EmRecurso extends EstadoProcesso {
    private Status status = Status.EM_RECURSO;

    @Override
    public Status getStatus() {
        return status;
    }

    @Override
    public void encerrar(Processo processo) {
        System.out.println("operação não permitida");
    }

    @Override
    public void avancar(Processo processo) {
        processo.setEstadoProcesso(new EmAvaliacao());
    }

}
