package list.ordenacao;

import java.util.*;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoas;

    public OrdenacaoPessoas() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoas.add(new Pessoa(nome, idade, altura));
    }

    //metodo em conjunto com o copareTo
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    //metodo em conjuto com comparetor
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoas);
        Collections.sort(pessoasPorAltura, new Pessoa.ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public void exibirPessoa(){
        List<Pessoa> pessoaParaExibir = new ArrayList<>();
        for (Pessoa p : pessoas){
            System.out.println(p.getNome() + " " + p.getIdade() + " " + p.getAltura());
        }
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("João", 45, 1.65);
        ordenacaoPessoas.adicionarPessoa("Pedro", 25, 1.75);
        ordenacaoPessoas.adicionarPessoa("Jorge", 15, 1.95);

        System.out.println(" ");
        System.out.println("Exibindo Pessoas");
        ordenacaoPessoas.exibirPessoa();

        System.out.println(" ");
        System.out.println("Pessoas por idade: \n" + ordenacaoPessoas.ordenarPorIdade());

        System.out.println(" ");
        System.out.println("Pessoas por Altura: \n" + ordenacaoPessoas.ordenarPorAltura());

    }
}



