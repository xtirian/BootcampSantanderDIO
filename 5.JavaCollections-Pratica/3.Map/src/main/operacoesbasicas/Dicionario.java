package main.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

  private Map<String, String> dicionarioMap;

  public Dicionario() {

    this.dicionarioMap = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, String definicao){
    dicionarioMap.put(palavra, definicao);
  }
  public void removerPalavra(String palavra){

    if(!dicionarioMap.isEmpty())
      dicionarioMap.remove(palavra);
  }

  public void exibirPalavra(){
    System.out.println(dicionarioMap);
  }

  public String pesquisarPorPalavra(String palavra){
    String definicaoProcurada = null;

    if(!dicionarioMap.isEmpty())
      definicaoProcurada = dicionarioMap.get(palavra);

    return definicaoProcurada;
  }



  
  
}
