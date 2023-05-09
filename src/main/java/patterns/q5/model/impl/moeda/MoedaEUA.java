package patterns.q5.model.impl.moeda;

import patterns.q5.model.Moeda;

public class MoedaEUA implements Moeda {

    private final String id = "U$";
    private final float value;

    public MoedaEUA(float value) {
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
