package patterns.q8.decorator.impl;

import patterns.q8.Emissor;
import patterns.q8.decorator.EmissorDecorator;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public class EmissorDecoratorComCompressao extends EmissorDecorator {
    public EmissorDecoratorComCompressao(Emissor emissor) {
        super(emissor);
    }

    @Override
    public void envia(String mensagem) {
        System.out.println("Enviando mensagem comprimida: ");
        String mensagemComprimida;
        try {
            mensagemComprimida = comprime(mensagem);
        } catch (Exception e) {
            mensagemComprimida = mensagem;
        }

        getEmissor().envia(mensagem);
    }

    private String comprime(String mensagem) throws IOException {
        var out  = new ByteArrayOutputStream();
        var dout = new DeflaterOutputStream(out, new Deflater());
        dout.write(mensagem.getBytes());
        dout.close();
        return String.valueOf(out.toByteArray());
    }
}
