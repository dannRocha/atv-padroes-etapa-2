package patterns.q4.model.enums;

public enum Pao {
    INTEGRAL("integral"),
    FRANCES("frances"),
    BOLA("bola");



    private final String nome;

    Pao(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pao{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
