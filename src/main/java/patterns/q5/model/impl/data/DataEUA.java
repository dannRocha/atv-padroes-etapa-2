package patterns.q5.model.impl.data;

import patterns.q5.model.Data;
import patterns.q5.model.exceptions.InvalidContentException;

import java.util.Calendar;

public class DataEUA implements Data {

    private final String conteudo;
    private static final String[] dias = {"SUN", "MON", "THR", "FOU", "THI", "SIX", "SAT"};

    public DataEUA(int day) {

        if(day < Calendar.SUNDAY  && day > Calendar.SATURDAY) {
            throw new InvalidContentException();
        }

        this.conteudo = dias[day - 1];
    }

    @Override
    public String getConteudo() {
        return conteudo;
    }

    @Override
    public String toString() {
        return "Data{" +
                "conteudo='" + getConteudo() + '\'' +
                '}';
    }
}
