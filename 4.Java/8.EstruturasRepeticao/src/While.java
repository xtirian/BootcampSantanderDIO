
import java.util.concurrent.ThreadLocalRandom;

public class While {
  public static void main(String[] args) {
    double mesada = 50.0;
    double carrinho = 0;

    while (mesada > 0) {
      Double valorDoce = valorAleatorio();
      double troco = 0;
      if (valorDoce > mesada) {
        troco = mesada;
        mesada = 0;
        valorDoce = 0.0;
      }
      System.out.println("Doce do valor: " + valorDoce + " Adicionado ao carrinho");
      mesada = mesada - valorDoce;
      carrinho = carrinho + valorDoce;      
    }
    System.out.println("Mesada:" + mesada);
    System.out.println("Carrinho:" + carrinho);
    System.out.println("Troco:" + (50 - carrinho));
    System.out.println("Joãozinho gastou toda a sua mesada em doces");

    /*
     * Não se preocupe quanto a formatação de valores
     * Iremos explorar os recursos de formatação em breve !!
     */
  }

  private static double valorAleatorio() {
    return ThreadLocalRandom.current().nextDouble(2, 8);
  }

}
