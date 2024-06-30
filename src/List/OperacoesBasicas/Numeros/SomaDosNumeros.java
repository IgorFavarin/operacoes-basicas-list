package List.OperacoesBasicas.Numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaDosNumeros {
    private List<Numeros> numerosList;

    public SomaDosNumeros(){
        this.numerosList = new ArrayList<>();
    }

    public void  adicionarNumero(int numero){
        numerosList.add(new Numeros(numero));
    }

    public int calcularSoma(){
        int  soma = 0;
        if(!numerosList.isEmpty()){
            for(Numeros n : numerosList){
                soma += n.getNumeros();
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int max = numerosList.get(0).getNumeros();
        if(!numerosList.isEmpty()){
             
            for (int i = 1; i < numerosList.size(); i++){
                if(numerosList.get(i).getNumeros() > max){
                    max = numerosList.get(i).getNumeros();
                }
            } 
        }
        return max;
    }

    public int encontrarMenorNumero(){
    
        int min = numerosList.get(0).getNumeros();
        if(!numerosList.isEmpty()){
             
            for (int i = 1; i < numerosList.size(); i++){
                if(numerosList.get(i).getNumeros() < min){
                    min = numerosList.get(i).getNumeros();
                }
            } 
        }
        return min;
    }

    public void exibirNumeros(){
        if(!numerosList.isEmpty()){
            for(Numeros n : numerosList){
                System.out.println(n.getNumeros());
            }
        }
    }

    public static void main(String[] args) {
        SomaDosNumeros somaDosNumeros = new SomaDosNumeros();
        somaDosNumeros.adicionarNumero(10);
        somaDosNumeros.adicionarNumero(9);
        somaDosNumeros.adicionarNumero(5);
        somaDosNumeros.adicionarNumero(1);
        somaDosNumeros.adicionarNumero(11);
        somaDosNumeros.adicionarNumero(12);
        somaDosNumeros.adicionarNumero(20);
        somaDosNumeros.adicionarNumero(2);
        somaDosNumeros.adicionarNumero(6);

        System.out.println(somaDosNumeros.calcularSoma());
        System.out.println(somaDosNumeros.encontrarMaiorNumero());
        System.out.println(somaDosNumeros.encontrarMenorNumero());
        somaDosNumeros.exibirNumeros();

    }

    
}
