package List.OperacoesBasicas.CarrinhoDeCompra;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    

    private List<Item> carrinho;

    public CarrinhoDeCompras(){
        this.carrinho = new ArrayList<>();
    }
    
    public void adicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        //cria nova lista vazia
        List<Item> removerItem = new ArrayList<>();
        //percore a lista
        for(Item i : carrinho){
            //compara se o nome passado no metodo removerItem é igual o nome de algum item na lista Item
            if(i.getNome().equalsIgnoreCase(nome)){
                //se for igual ele adiciona nesta lista
                removerItem.add(i);
            }   
        }
        //remove os itens da carinho que são iguais ao removerItem
        carrinho.removeAll(removerItem);
    }

    public double calcularPrecoTotal() {
        double precoTotal = 0.0;
        for (Item item : carrinho) {
            precoTotal += item.getPreco() * item.getQuantidade();
        }
        return precoTotal;
    }

    public void exibirItens(){
        System.out.println(carrinho);

    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("celular", 1200.0, 1);
        carrinhoDeCompras.adicionarItem("fone", 800.50, 2);
        carrinhoDeCompras.adicionarItem("prato", 25.50, 12);

        System.out.println("preço total é: " + carrinhoDeCompras.calcularPrecoTotal());
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("prato");
        System.out.println("novo preço total é: " + carrinhoDeCompras.calcularPrecoTotal());
        carrinhoDeCompras.exibirItens();

    }
}
