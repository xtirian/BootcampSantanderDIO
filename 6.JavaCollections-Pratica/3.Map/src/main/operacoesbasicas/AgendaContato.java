package main.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {

  // atributo
  private Map<String, Integer> agendaContatoMap;

  public AgendaContato() {

    this.agendaContatoMap = new HashMap<>();
  }

  public void adicionarContato(String nome, Integer telefone) {
    agendaContatoMap.put(nome, telefone);
  }

  public void removerContato(String nome) {
    //a key e um valor unico

    if (!agendaContatoMap.isEmpty()) {
      if (agendaContatoMap.containsKey(nome))
        agendaContatoMap.remove(nome);
      else
        System.out.println("Nome não encontrado");
    }
  }


  public void exibirContatos(){
    System.out.println(agendaContatoMap);
  }

  public Integer pesquisarPorNome(String nome){
    Integer numeroSolicitado = null;

    if(!agendaContatoMap.isEmpty()){
      numeroSolicitado = agendaContatoMap.get(nome);
    }

    return numeroSolicitado;

  }

  public static void main(String[] args) {
    AgendaContato agendaTeste = new AgendaContato();

    agendaTeste.adicionarContato("Matheus", 992988735);
    agendaTeste.adicionarContato("Gael", 985547852);
    agendaTeste.adicionarContato("Cris", 1351205512);
    agendaTeste.adicionarContato("Monique", 11551513);
    agendaTeste.adicionarContato("Ana", 1155338412);
    agendaTeste.adicionarContato("Mari", 515135535);agendaTeste.adicionarContato("Matheus", 1111111);

    agendaTeste.removerContato("Monique");

    agendaTeste.exibirContatos();


    System.out.println(agendaTeste.pesquisarPorNome("Matheus"));
    
  }
}
