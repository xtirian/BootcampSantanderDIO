import java.util.Locale;
import java.util.Scanner;

public class ScannerAboutMe {

  /**
   * <h1>Usando Scanner de args</h1>
   * Usar os contratos de Locale e Scanner
   */
  public static void main(String[] args) {

    Scanner scanData = new Scanner(System.in).useLocale((Locale.US));

    System.out.println("Digite o seu nome: ");
    String nome = scanData.next();
    System.out.println("Digite o seu sobrenome: ");
    String sobrenome = scanData.next();
    System.out.println("Digite a sua idade: ");
    int idade = scanData.nextInt(); // vamos falar sobre Wrappers
    System.out.println("Digite a sua altura: ");
    double altura = scanData.nextDouble();

    System.out.println("Ola, me chamo " + nome + " " + sobrenome);
    System.out.println("Tenho " + idade + " anos ");
    System.out.println("Minha altura é " + altura + "m ");
  }

}
