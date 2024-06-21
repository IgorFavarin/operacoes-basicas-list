package List.OperacoesBasicas.CarrinhoDeCompra;

public class Item {
    //atributos
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String n, double p, int qtd){
        this.nome = n;
        this.preco = p;
        this.quantidade = qtd;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]\n";
    }
}
