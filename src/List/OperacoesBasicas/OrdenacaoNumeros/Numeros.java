package List.OperacoesBasicas.OrdenacaoNumeros;

public class Numeros implements Comparable<Numeros>{
    private int numeros;
    
    public Numeros(int n){
        this.numeros = n;
    }

    public int getNumeros() {
        return numeros;
    }

    @Override
    public int compareTo(Numeros n) {
        return Integer.compare(this.numeros, n.getNumeros());
    }

}
