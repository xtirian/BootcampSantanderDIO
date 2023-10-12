package main.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

  // atributo
  private List<Tarefa> tarefaList;

  public ListaTarefa() {
    // criando um constructor para que sempre que criar uma lista de tarefa, ela
    // chamar uma arraylist vazia
    this.tarefaList = new ArrayList<>();
  }

  public void adicionarTarefa(String descricao) {

    // a Tarefa é o TIPO GENÉRICO criado para esta tarefaList. Nós instanciamos um
    // novo objeto dentro da array list e inserimos a descrição dentro dele
    tarefaList.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao) {
    List<Tarefa> tarefasParaRemover = new ArrayList<>();

    for (Tarefa t : tarefaList) {
      if (t.getDescricao().equalsIgnoreCase(descricao)) {
        tarefasParaRemover.add(t);
      }
    }

    tarefaList.removeAll(tarefasParaRemover);

  }

  public int obterNumeroTotalTarefas() {
    return tarefaList.size();
  }

  public void obterDescricoesTarefas() {
    System.out.println(tarefaList);
  }

  public static void main(String[] args) {
    ListaTarefa ListaTarefa = new ListaTarefa();

    System.out.println("O numero total de elementos na lista é " + ListaTarefa.obterNumeroTotalTarefas());

    ListaTarefa.adicionarTarefa("tarefa1");
    ListaTarefa.adicionarTarefa("tarefa1");
    ListaTarefa.adicionarTarefa("tarefa3");
    System.out.println("O numero total de elementos na lista é " + ListaTarefa.obterNumeroTotalTarefas());


    ListaTarefa.obterDescricoesTarefas();
    
  };

}
