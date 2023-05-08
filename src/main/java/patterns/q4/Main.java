package patterns.q4;

import patterns.q4.factory.SanduicheFactory;
import patterns.q4.factory.SanduicheLanchonetCGFactory;
import patterns.q4.factory.SanduicheLanchonetJPFactory;
import patterns.q4.factory.SanduicheLanchonetRTFactory;

public class Main {
    public static void main(String[] args) {
        SanduicheFactory cgFactory = new SanduicheLanchonetCGFactory();
        SanduicheFactory jpFactory = new SanduicheLanchonetJPFactory();
        SanduicheFactory rtFactory = new SanduicheLanchonetRTFactory();


        System.out.println(cgFactory.montarSanduice());
        System.out.println(jpFactory.montarSanduice());
        System.out.println(rtFactory.montarSanduice());
    }
}
