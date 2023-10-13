package main.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
  // atributo

  private Set<Convidado> convidadosSet;

  public ConjuntoConvidado() {

    this.convidadosSet = new HashSet<>();
  }

  public void adicionarConvidado(String nome, int codigoConvite) {
    convidadosSet.add(new Convidado(nome, codigoConvite));
  }

  public void removerConvidadoPorCodigoConvite(int codigoConvite) {
    Convidado convidadoParaRemover = null;

    
      for (Convidado c : convidadosSet) {

        if (c.getCodigoConvite() == codigoConvite) {
          convidadoParaRemover = c;
          break;
        } 
      }

      if(convidadoParaRemover == null){
        System.out.println("Convidado não encontrado");
      }
    convidadosSet.remove(convidadoParaRemover);
  }

  public int contarConvidados() {
    return convidadosSet.size();
  }

  public void exibirConvidados() {
    System.out.println(convidadosSet);
  }


  public static void main(String[] args) {
    ConjuntoConvidado conjuntoTeste = new ConjuntoConvidado();

    conjuntoTeste.adicionarConvidado("Convidado1", 1);
    conjuntoTeste.adicionarConvidado("Convidado2", 2);
    conjuntoTeste.adicionarConvidado("Convidado3", 3);
    conjuntoTeste.adicionarConvidado("Convidado4", 4);
    conjuntoTeste.adicionarConvidado("Convidado5", 5);
    conjuntoTeste.adicionarConvidado("Convidado6",6);
    conjuntoTeste.adicionarConvidado("Convidado7",7);
    conjuntoTeste.adicionarConvidado("Convidado8",8);


    conjuntoTeste.removerConvidadoPorCodigoConvite(4);
    conjuntoTeste.exibirConvidados();

  }
}
