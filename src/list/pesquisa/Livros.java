package list.pesquisa;

public class Livros {

    private String titulo;
    private String autor;
    private int anoDePublicacao;

    public Livros(String titulo, String autor, int anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public String toString() {
        return "Título do livro: "
                + titulo
                +" - Autor: "
                + autor
                +" - Ano de Publicação: "
                + anoDePublicacao
                + "\n";
    }
}
