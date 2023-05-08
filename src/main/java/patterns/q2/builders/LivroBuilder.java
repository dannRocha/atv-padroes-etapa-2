package patterns.q2.builders;

import patterns.q2.model.Livro;

import java.util.Arrays;

public class LivroBuilder {

    public static NomeNacional aLivro() {
        return Step.aStep();
    }



    public static interface NomeNacional {
        NomeOriginal nomeNacional(String nome);
    }

    public static interface NomeOriginal {
        Ano nomeOriginal(String nome);
    }

    public static interface Ano {
        Autores ano(int ano);
    }

    public static interface Autores {
        Edicao autores(String ...autores);
    }

    public static interface Edicao {
        Cidade edicao(int edicao);
    }

    public static interface Cidade {
        Editora cidade(String nomeCidade);
    }

    public static interface Editora {
        Tradurores editora(String nomeEditora);
    }

    public static interface Tradurores {
        Paginas tradutores(String...nomes);
    }

    public static interface Paginas {
        Isbn paginas(int numero);
    }

    public static interface Isbn {
        Build isbn(long isbn);
    }

    public static interface Build {
        Livro build();
    }

    private static class Step implements NomeNacional  , NomeOriginal, Ano, Autores, Edicao, Cidade, Tradurores, Paginas, Editora, Isbn, Build {
        private Livro livro;

        private Step() {
            livro = new Livro();
        }

        public static Step aStep() {
            return new Step();
        }

        @Override
        public NomeOriginal nomeNacional(String nome) {
            livro.setNomeNacional(nome);
            return this;
        }

        @Override
        public Ano nomeOriginal(String nome) {
            livro.setNomeOriginal(nome);
            return this;
        }

        @Override
        public Autores ano(int ano) {
            livro.setAno(ano);
            return this;
        }

        @Override
        public Edicao autores(String...autores) {
            livro.setAutores(Arrays.asList(autores));
            return this;
        }

        @Override
        public Cidade edicao(int edicao) {
            livro.setEdicao(edicao);
            return this;
        }

        @Override
        public Editora cidade(String nomecidade) {
            livro.setCidade(nomecidade);
            return this;
        }

        @Override
        public Tradurores editora(String nomeEditora) {
            livro.setEditora(nomeEditora);
            return this;
        }

        @Override
        public Paginas tradutores(String...nomes) {
            livro.setTradutores(Arrays.asList(nomes));
            return this;
        }

        @Override
        public Isbn paginas(int numero) {
            livro.setPaginas(numero);
            return this;
        }

        @Override
        public Build isbn(long isbn) {
            livro.setIsbn(isbn);
            return this;
        }

        @Override
        public Livro build() {
            return livro;
        }
    }
}

