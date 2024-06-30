package List.OperacoesBasicas.OrdenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numerosList;

    public OrdenacaoNumeros(){
        this.numerosList = new ArrayList<>();
    }

    public void  adicionarNumero(int numero){
        this.numerosList.add(numero);
    }

    public void exibirNumeros(){
        if(!numerosList.isEmpty()){
            for(int i =0; i < this.numerosList.size(); i++){
                System.out.println(this.numerosList.get(i));
            }
        }
    }

    // metodos usando comparable para ordenação

    public List<Integer> ordenarAscendente(){
        List<Integer> ordenarCrescente = new ArrayList<>(this.numerosList);
        Collections.sort(ordenarCrescente);
        return ordenarCrescente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> ordenarDecrescente = new ArrayList<>(this.numerosList);
        ordenarDecrescente.sort(Collections.reverseOrder());
        return ordenarDecrescente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(9);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(11);
        ordenacaoNumeros.adicionarNumero(12);
        ordenacaoNumeros.adicionarNumero(20);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(6);

        //ordenacaoNumeros.exibirNumeros();
        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());

    }

    
}
