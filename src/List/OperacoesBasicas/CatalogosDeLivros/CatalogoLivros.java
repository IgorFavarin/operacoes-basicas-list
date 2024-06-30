package List.OperacoesBasicas.CatalogosDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
     //atributos  private List<Tarefa> tarefaList;

    private List<Livro> livrosList;

    public CatalogoLivros(){
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String nome, String autor, int anoDePublicacao){
        livrosList.add(new Livro(nome, autor, anoDePublicacao));

    }
    public List<Livro> pesquisaPorAutor(String autor){
        List<Livro> livroPorAutor = new ArrayList<>();
        
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livroPorAutor.add(l);

                }
            }
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloDeAno(int anoInicial, int anoFinal){
        List<Livro> livroPorIntervaloAno = new ArrayList<>();
        
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livroPorIntervaloAno.add(l);
                }
            }
        }
        return livroPorIntervaloAno;
    }

    public Livro pesquisaPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
                
            }
        }
        return livroPorTitulo;
    }
    
    public static void main(String[] args) {
        CatalogoLivros catalogolivros = new CatalogoLivros();
        catalogolivros.adicionarLivro("livro 1", "autor 1", 2000);
        catalogolivros.adicionarLivro("livro 2", "autor 1", 1990);
        catalogolivros.adicionarLivro("livro 2", "autor 2", 2010);
        catalogolivros.adicionarLivro("livro 4", "autor 3", 2015);

        System.out.println(catalogolivros.pesquisaPorAutor("autor 1"));
        System.out.println(catalogolivros.pesquisaPorIntervaloDeAno(2005, 2020));
        System.out.println(catalogolivros.pesquisaPorTitulo("livro 2"));
    }


}
