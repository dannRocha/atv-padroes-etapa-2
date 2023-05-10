package patterns.q6.listerners.handlers;

import patterns.q6.listerners.AcaoObserver;
import patterns.q6.model.Acao;

public class Corretora implements AcaoObserver {
    private String nome;
    public Corretora(String nome) {
        this.nome = nome;
    }

    @Override
    public void notificaAlteracao(Acao acao) {
        System.out.println(" Corretora " + this.nome + " sendo notificada :");

        System.out.println(
            "A ação "
                + acao.getCodigo()
                + " teve o seu valor alterado para " +
                acao.getValor()
        );
    }
}
