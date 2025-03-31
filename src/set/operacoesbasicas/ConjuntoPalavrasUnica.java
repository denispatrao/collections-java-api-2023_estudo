package set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnica {

    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnica() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (palavrasUnicas.contains(palavra)) {
            palavrasUnicas.remove(palavra);
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasUnicas);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnica conjuntoPalavrasUnica = new ConjuntoPalavrasUnica();

        conjuntoPalavrasUnica.adicionarPalavra("Palavra 1");
        conjuntoPalavrasUnica.adicionarPalavra("Palavra 2");
        conjuntoPalavrasUnica.adicionarPalavra("Palavra 3");
        conjuntoPalavrasUnica.adicionarPalavra("Palavra 4");

        System.out.println(" ");
        System.out.println("Exibindo o conjunto de palavras unicas");
        conjuntoPalavrasUnica.exibirPalavrasUnicas();
        System.out.println(" ");
        conjuntoPalavrasUnica.removerPalavra("Palavra 2");
        System.out.println("Lista atualizada após remoção");
        conjuntoPalavrasUnica.exibirPalavrasUnicas();
        System.out.println(" ");
        System.out.println("Verificando se existe a palavra no conjunto");
        System.out.println("A palavra: " + conjuntoPalavrasUnica.verificarPalavra("Palavra 4"));
    }
}
