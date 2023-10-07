public class SistemaIBGE {
  public static void main(String[] args) {
    for(EstadoBrasileiro e: EstadoBrasileiro.values()){
      System.out.println(e.getNome() + " - " + e.getSigla());
    }

    EstadoBrasileiro eb = EstadoBrasileiro.RIO_JANEIRO;

    System.out.println(eb.getNome());
    System.out.println(eb.getSigla());
    System.out.println(eb.getIbge());
  }
}
