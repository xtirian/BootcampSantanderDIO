import java.util.Scanner;
import java.util.Locale;

public class Contador {

    public static void main(String[] args) throws Exception {
        Scanner scanParametro = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro Parâmetro");
        int parametroUm = scanParametro.nextInt();
        System.out.println("Digite o segundo Parâmetro");
        int parametroDois = scanParametro.nextInt();

        scanParametro.close();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.err.println("O primeiro parâmetro deve ser menor que o segundo");
        }

    }

    static void contar(int parametroUm, int ParametroDois) throws ParametrosInvalidosException {
        if (parametroUm < ParametroDois) {
            int contagem = ParametroDois - parametroUm;

            for (int x = 1; x <= contagem; x++) {
                System.out.println("Imprimindo o número " + x);
            }
        } else {
            throw new ParametrosInvalidosException();
        }

    }
}
