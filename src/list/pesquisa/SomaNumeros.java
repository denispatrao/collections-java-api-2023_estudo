package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    List<Integer> numerosInteiros;

    public SomaNumeros() {
        this.numerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(Integer numero) {
        numerosInteiros.add(numero);

    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer i : numerosInteiros) {
            soma += i;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = 0;
        for (Integer i : numerosInteiros) {
            if (i > maiorNumero) {
                maiorNumero = i;
            }
        }
        return maiorNumero;
    }

    private int encontrarMenorNumero() {
        int menorNumero = encontrarMaiorNumero();
        for (Integer i : numerosInteiros) {
            if (i < menorNumero) {
                menorNumero = i;
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        System.out.println(numerosInteiros);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(15);
        somaNumeros.adicionarNumero(43);
        somaNumeros.adicionarNumero(22);
        somaNumeros.adicionarNumero(26);
        somaNumeros.adicionarNumero(103);

        System.out.println("");
        System.out.println("Os numeros digitados são: ");
        somaNumeros.exibirNumeros();
        System.out.println("");
        System.out.println("Soma: " + somaNumeros.calcularSoma());
        System.out.println("");
        System.out.println("O maior é: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("");
        System.out.println("O menor é: " + somaNumeros.encontrarMenorNumero());
    }
}
