package patterns.q4.model.enums;

public enum Salada {
    SEM_VERDURA("sem verdura"),
    COM_VERDURA("com verdura");
    private final String nome;

    Salada(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Salada{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
