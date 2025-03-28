package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> listaDeNumeros;

    public OrdenacaoNumeros() {
        this.listaDeNumeros = new ArrayList<>();
    }

    public void adicionarNumeroInteiro(int numero){
        listaDeNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> ascendente = new ArrayList<>(listaDeNumeros);
        Collections.sort(ascendente);
        return ascendente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> descendente = new ArrayList<>(listaDeNumeros);
        descendente.sort(Comparator.reverseOrder());
        return descendente;
    }

    public static void main(String[] args) {

        OrdenacaoNumeros ordencao = new OrdenacaoNumeros();

        System.out.println("Numeros");
        ordencao.adicionarNumeroInteiro(2);
        ordencao.adicionarNumeroInteiro(5);
        ordencao.adicionarNumeroInteiro(1);
        ordencao.adicionarNumeroInteiro(4);
        ordencao.adicionarNumeroInteiro(3);
        System.out.println(ordencao.listaDeNumeros);

        System.out.println(" ");
        System.out.println("Lista ordenada de forma ascendente: ");
        System.out.println(ordencao.ordenarAscendente());

        System.out.println(" ");
        System.out.println("Lista ordenada de forma descendente: ");
        System.out.println(ordencao.ordenarDescendente());
    }
}


