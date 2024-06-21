package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    //atributo
    private List<Tarefa> tarefaList;

    //contrutor
    public ListaTarefas(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        //cria nova lista vazia
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        //percore a lista
        for(Tarefa t : tarefaList){
            //compara se a descrição passada no metodo removerTarefa é igual a descrição de alguma tarefa na lista Tarefa
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                //se for igual ele adiciona nesta lista
                tarefasParaRemover.add(t);
            }   
        }
        //remove os itens da tarefaList que são iguais ao tarefasParaRemover
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricaoTarefa(){
        System.out.println(tarefaList);

    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("estudar");
        listaTarefas.adicionarTarefa("estudar1");
        listaTarefas.adicionarTarefa("estudar1");

        System.out.println("O numero total é " +listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricaoTarefa();
    }
    
}
