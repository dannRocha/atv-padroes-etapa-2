package patterns.q5.model.impl.data;

import patterns.q5.model.Data;
import patterns.q5.model.exceptions.InvalidContentException;

import java.util.Calendar;

public class DataBrasil implements Data {

    private final String conteudo;
    private static final String[] dias = {"DOM", "SEG", "TER", "QUA", "QUI", "SEX", "SAB"};

    public DataBrasil(int day) {

        if(day < Calendar.SUNDAY  && day > Calendar.SATURDAY) {
            throw new InvalidContentException();
        }

        this.conteudo = String.valueOf(dias[day - 1]);
    }

    @Override
    public String getConteudo() {
        return conteudo
            .replace(".", ",");
    }

    @Override
    public String toString() {
        return "Data{" +
                "conteudo='" + getConteudo() + '\'' +
                '}';
    }
}
