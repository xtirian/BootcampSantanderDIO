package main.pesqisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
  private Set<Contato> agendaContato;

  public AgendaContatos() {
    this.agendaContato = new HashSet<>();
  }

  public void adicionarContato(String nome, int numero){

    agendaContato.add(new Contato(nome, numero));
  }
  
  public void exibirContatos(){

    System.out.println(agendaContato);
  }
  
  public Set<Contato> pesquisarPorNome(String nome){
    Set<Contato> contatosPorNome = new HashSet<>();
    for (Contato contato : agendaContato) {
      if(contato.getNome().startsWith(nome,0)){
        contatosPorNome.add(contato);
      };
   }

    return contatosPorNome;
  }

  public Contato atualizarNumeroContato(String nome, int novoNumero){

   Contato contatoAtualizado= null;

   for (Contato contato : agendaContato) {

    if(contato.getNome().equalsIgnoreCase(nome)){

      contato.setNumero(novoNumero);
      contatoAtualizado = contato;
      System.out.println(contato);
      break;
    }
    
   }
   return contatoAtualizado;
  }

public static void main(String[] args) {
  AgendaContatos agendaTeste = new AgendaContatos();

  agendaTeste.adicionarContato("Matheus", 111111111);
  agendaTeste.adicionarContato("Marcos", 111111111);
  agendaTeste.adicionarContato("Lucas", 111111111);
  agendaTeste.adicionarContato("Joao", 111111111);
  agendaTeste.adicionarContato("Atos", 111111111);
  agendaTeste.adicionarContato("Romanos", 111111111);
  agendaTeste.adicionarContato("Malaquias", 111111111);
  agendaTeste.adicionarContato("Ezequiel", 111111111);

  agendaTeste.atualizarNumeroContato("Romanos", 22222222);
  agendaTeste.atualizarNumeroContato("Matheus", 333333333);

  agendaTeste.exibirContatos();

 

}


  
}
