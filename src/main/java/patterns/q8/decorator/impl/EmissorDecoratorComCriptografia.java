package patterns.q8.decorator.impl;

import patterns.q8.Emissor;
import patterns.q8.decorator.EmissorDecorator;

public class EmissorDecoratorComCriptografia extends EmissorDecorator {
    public EmissorDecoratorComCriptografia(Emissor emissor) {
        super(emissor);
    }

    @Override
    public void envia(String mensagem) {
        System.out.println("Enviando mensagem criptografada: ");
        getEmissor().envia(criptografia(mensagem));
    }

    private String criptografia(String mensagem) {
        return new StringBuilder(mensagem).reverse().toString();
    }
}
