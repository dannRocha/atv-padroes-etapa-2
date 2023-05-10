package patterns.q8.decorator;

import patterns.q8.Emissor;

public abstract class EmissorDecorator implements Emissor {

    private final Emissor emissor;

    public EmissorDecorator(Emissor emissor) {
        this.emissor = emissor;
    }

    public abstract void envia(String mensagem);

    public Emissor getEmissor() {
        return emissor;
    }
}
