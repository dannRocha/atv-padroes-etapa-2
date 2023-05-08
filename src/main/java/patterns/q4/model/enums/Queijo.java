package patterns.q4.model.enums;

public enum Queijo {
    PRATO("prato"),
    MUSSARELA("mussarela"),
    CHEDDAR("cheddar");

    private final String nome;

    Queijo(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Queijo{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
