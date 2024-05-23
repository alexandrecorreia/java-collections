package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add( new Tarefa(descricao) );
    }

    public void removerTarefa(String descricao ){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for(Tarefa t : tarefaList){
            if( t.getDescricao().equalsIgnoreCase(descricao) ){
                tarefasParaRemover.add(t);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList.toString());
    }

    public static void main(String[] args) {
        
        //Testando os metodos criados
        ListaTarefa listaTarefa = new ListaTarefa();

        // Verificando a qtde de tarefas
        System.out.println( "Numero total de elementos : " + listaTarefa.obterNumeroTotalTarefas() );

        // Adicionando tarefa
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 1");
        System.out.println( "Numero total de elementos : " + listaTarefa.obterNumeroTotalTarefas() );

        // Remover Tarefa
        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println( "Numero total de elementos : " + listaTarefa.obterNumeroTotalTarefas() );

        // Obter Descricao Tarefa
        listaTarefa.obterDescricoesTarefas();
    }
}
