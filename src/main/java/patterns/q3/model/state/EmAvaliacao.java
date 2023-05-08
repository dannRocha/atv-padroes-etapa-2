package patterns.q3.model.state;

import patterns.q3.model.Processo;

public class EmAvaliacao extends EstadoProcesso {

    private Status status = Status.EM_AVALIACAO;

    public EmAvaliacao() {
        avisarInteressado();
    }

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

        if(true/*operacao para indefirir ou indefir*/) {
            processo.setEstadoProcesso(new Deferir());
            return;
        }

        processo.setEstadoProcesso(new Indeferir());
    }


    private void avisarInteressado() {
        System.out.println("avisando interessado");
    }
}

