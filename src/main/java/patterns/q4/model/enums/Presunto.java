package patterns.q4.model.enums;

public enum Presunto {
    FRANGO("de frango"),
    PERU("de peru");

    private final String nome;

    Presunto(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Presunto{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
