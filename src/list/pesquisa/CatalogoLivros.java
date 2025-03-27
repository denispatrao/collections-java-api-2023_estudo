package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livros> listalivros;

    public CatalogoLivros() {
        this.listalivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listalivros.add(new Livros(titulo, autor, anoPublicacao));
    }

    public void exibirTodosLivros() {
        for (Livros l : listalivros) {
            System.out.printf("Título do livro: %s - Autor: %s - Ano de Publicação: %d%n", l.getTitulo(), l.getAutor(), l.getAnoDePublicacao());
        }
    }

    public List<Livros> pesquisaPorAutor(String autor) {
        List<Livros> livroPorAutor = new ArrayList<>();
        if (!listalivros.isEmpty()) {
            for (Livros liv : listalivros) {
                if (liv.getAutor().equalsIgnoreCase(autor)) {
                    livroPorAutor.add(liv);
                }
            }
        }
        return livroPorAutor;
    }

    public List<Livros> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livros> livroPorIntervalo = new ArrayList<>();
        if (!listalivros.isEmpty()) {
            for (Livros liv : listalivros) {
                if (liv.getAnoDePublicacao() >= anoInicial && liv.getAnoDePublicacao() <= anoFinal) {
                    livroPorIntervalo.add(liv);
                }
            }
        }
        return livroPorIntervalo;
    }


    public Livros pesquisaPorTitulo(String titulo) {
        Livros livroPorTitulo = null;
        if (!listalivros.isEmpty()) {
            for (Livros liv : listalivros) {
                if (liv.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = liv;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();

        System.out.println(" ");
        System.out.println("--------------------------Lista de todos os livros------------------------------");
        catalogoLivros.adicionarLivro("A Mula", "Manoel", 2020);
        catalogoLivros.adicionarLivro("O Besta", "Jorge", 2021);
        catalogoLivros.adicionarLivro("O Animal", "Felipe", 2022);
        catalogoLivros.adicionarLivro("O Jumento", "Marcelo", 2023);
        catalogoLivros.adicionarLivro("O Burro", "João", 1994);
        catalogoLivros.exibirTodosLivros();

        System.out.println(" ");
        System.out.println("------------------------------Lista por autor-----------------------------------");
        System.out.println(catalogoLivros.pesquisaPorAutor("Jorge"));

        System.out.println(" ");
        System.out.println("----------------------------Lista por intervalo---------------------------------");
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2020, 2022));

        System.out.println(" ");
        System.out.println("----------------------------Lista por Titulo---------------------------------");
        System.out.println(catalogoLivros.pesquisaPorTitulo("A Mula"));

    }
}
