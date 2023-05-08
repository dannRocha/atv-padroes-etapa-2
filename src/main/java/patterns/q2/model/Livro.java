package patterns.q2.model;

import java.util.List;

public class Livro {
    private String nomeNacional;
    private int ano;
    private List<String> autores;
    private int edicao;
    private String cidade;
    private String editora;
    private String nomeOriginal;
    private List<String> tradutores;
    private int paginas;
    private long isbn;

    public Livro(String nomeNacional, int ano, List<String> autores, int edicao, String cidade, String editora, String nomeOriginal, List<String> tradutores, int paginas, long isbn) {
        this.nomeNacional = nomeNacional;
        this.ano = ano;
        this.autores = autores;
        this.edicao = edicao;
        this.cidade = cidade;
        this.editora = editora;
        this.nomeOriginal = nomeOriginal;
        this.tradutores = tradutores;
        this.paginas = paginas;
        this.isbn = isbn;
    }

    public Livro() {
    }

    public String getNomeNacional() {
        return nomeNacional;
    }

    public void setNomeNacional(String nomeNacional) {
        this.nomeNacional = nomeNacional;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<String> getAutores() {
        return autores;
    }

    public void setAutores(List<String> autores) {
        this.autores = autores;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getNomeOriginal() {
        return nomeOriginal;
    }

    public void setNomeOriginal(String nomeOriginal) {
        this.nomeOriginal = nomeOriginal;
    }

    public List<String> getTradutores() {
        return tradutores;
    }

    public void setTradutores(List<String> tradutores) {
        this.tradutores = tradutores;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nomeNacional='" + nomeNacional + '\'' +
                ", ano=" + ano +
                ", autores=" + autores +
                ", edicao=" + edicao +
                ", cidade='" + cidade + '\'' +
                ", editora='" + editora + '\'' +
                ", nomeOriginal='" + nomeOriginal + '\'' +
                ", tradutores=" + tradutores +
                ", paginas=" + paginas +
                ", isbn=" + isbn +
                '}';
    }
}
