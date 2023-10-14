package main.ordenacao;

public class Evento {
  //atributos

  private String evento;
  private String atracao;


  
  public Evento(String evento, String atracao) {
    this.evento = evento;
    this.atracao = atracao;
  }

  
  public String getEvento() {
    return evento;
  }
  public String getAtracao() {
    return atracao;
  }


  @Override
  public String toString() {
    return "Evento [evento=" + evento + ", atracao=" + atracao + "]";
  }

  

}
