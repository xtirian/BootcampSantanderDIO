import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) throws Exception {

        try {
            Scanner scanData = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = scanData.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanData.next();

            System.out.println("Digite sua idade");
            int idade = scanData.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanData.nextDouble();

            // imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanData.close();
        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos");
            System.out.println("Idade: 15 ou 26 ou 54");
            System.out.println("Altura: 1.58 ou 1.80");

        }
    }
}

