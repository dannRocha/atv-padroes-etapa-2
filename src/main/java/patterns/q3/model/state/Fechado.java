package patterns.q3.model.state;

import patterns.q3.model.Processo;

public class Fechado extends EstadoProcesso {

    private Status status = Status.FECHADO;

    private EstadoProcesso processo;
    @Override
    public Status getStatus() {
        return this.status;
    }

    @Override
    public void encerrar(Processo processo) {
        System.out.println("documento encerrado");
    }

    @Override
    public void avancar(Processo processo) {
        System.out.println("documento encerrado");
    }

}
