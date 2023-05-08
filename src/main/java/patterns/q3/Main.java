package patterns.q3;

import patterns.q3.model.Processo;

public class Main {

    public static void main(String[] args) {
        var processo = new Processo();

        processo.avancar();
        System.out.println(processo);
        processo.avancar();
        System.out.println(processo);
        processo.avancar();
        processo.encerrar();
    }


}
