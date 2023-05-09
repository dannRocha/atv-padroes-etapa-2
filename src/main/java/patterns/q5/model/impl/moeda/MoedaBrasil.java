package patterns.q5.model.impl.moeda;

import patterns.q5.model.Moeda;

public class MoedaBrasil implements Moeda {
    private final String id = "R$";
    private final float value;

    public MoedaBrasil(float value) {
        this.value = value;
    }


    @Override
    public String getValue() {
        return id + value;
    }

    @Override
    public String toString() {
        return "Moeda{" +
                "value='" + getValue() + '\'' +
                '}';
    }
}
