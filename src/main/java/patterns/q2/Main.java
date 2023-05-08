package patterns.q2;

import patterns.q2.builders.LivroBuilder;

public class Main {
    public static void main(String[] args) {
        var livro = LivroBuilder.aLivro()
                .nomeNacional("Java. Como programar")
                .nomeOriginal("Java how to programmer")
                .ano(2003)
                .autores("H. M. Deitel", "P. J. Deitel")
                .edicao(4)
                .cidade("Porto Alegre")
                .editora("Bookman")
                .tradutores("Carlos Arthur Lang Lisbôa")
                .paginas(1386)
                .isbn(9788536301235L)
                .build();

        System.out.println(livro);

    }
}
