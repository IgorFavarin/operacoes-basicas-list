package List.OperacoesBasicas.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    //atributos
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String n, int i, double a){
        this.nome = n;
        this.idade = i;
        this.altura = a;
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }   

    public double getAltura() {
        return altura;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
       return "Produto [nome=" + nome + ", preco=" + idade + ", quantidade=" + altura + "]\n";
    }
}

class ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }

}
