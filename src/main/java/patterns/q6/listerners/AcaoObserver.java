package patterns.q6.listerners;

import patterns.q6.model.Acao;

public interface AcaoObserver {
    void notificaAlteracao (Acao acao);
}
