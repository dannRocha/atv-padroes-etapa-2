package patterns.q8;

import patterns.q8.decorator.impl.EmissorDecoratorComCompressao;
import patterns.q8.decorator.impl.EmissorDecoratorComCriptografia;

public class Main {
    public static void main(String[] args) {
        var mensagem = "";
        var emissorCript = new EmissorDecoratorComCriptografia(new EmissorBasico());
        emissorCript.envia(mensagem);


        var emissorCompr = new EmissorDecoratorComCompressao(new EmissorBasico());
        emissorCompr.envia(mensagem);

        var emissorCopritCompr = new EmissorDecoratorComCriptografia(new EmissorDecoratorComCompressao(new EmissorBasico()));
        emissorCopritCompr.envia(mensagem);
    }
}
