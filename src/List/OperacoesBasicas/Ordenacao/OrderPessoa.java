package List.OperacoesBasicas.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderPessoa {
    
    private List<Pessoa> pessoaList;

    public OrderPessoa(){
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome,idade,altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);

        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrderPessoa ordendarPessoa = new OrderPessoa();

        ordendarPessoa.adicionarPessoa("pessoa 1'", 15, 1.60);
        ordendarPessoa.adicionarPessoa("pessoa 2'", 11, 1.65);
        ordendarPessoa.adicionarPessoa("pessoa 3'", 10, 1.70);
        ordendarPessoa.adicionarPessoa("pessoa 4'", 21, 1.74);
        ordendarPessoa.adicionarPessoa("pessoa 5'", 18, 1.62);
        ordendarPessoa.adicionarPessoa("pessoa 6'", 20, 1.80);
        ordendarPessoa.adicionarPessoa("pessoa 7'", 31, 1.92);

        System.out.println(ordendarPessoa.pessoaList);
        System.out.println("Orenando por idade \n" + ordendarPessoa.ordenarPorIdade());
        System.out.println("Orenando por altura \n" + ordendarPessoa.ordenarPorAltura());
    }
    
}
