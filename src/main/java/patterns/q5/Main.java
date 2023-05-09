package patterns.q5;

import patterns.q5.factory.impl.LocalidadeEUAFactory;
import patterns.q5.model.Localidade;
import patterns.q5.factory.LocalidadeAbstractFactory;
import patterns.q5.factory.impl.LocalidadeBrasilFactory;
import patterns.q5.model.impl.LocalidadeImpl;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        LocalidadeAbstractFactory factoryBR = LocalidadeBrasilFactory.createFactory(Calendar.MONDAY, 10f);
        LocalidadeAbstractFactory factoryUS = LocalidadeEUAFactory.createFactory(Calendar.MONDAY, 10f);

        Localidade locBrasil = new LocalidadeImpl(factoryBR);
        Localidade locUSA = new LocalidadeImpl(factoryUS);

        System.out.println(locBrasil);
        System.out.println(locUSA);
    }
}
