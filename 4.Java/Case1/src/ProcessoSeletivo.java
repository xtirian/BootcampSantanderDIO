import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    // SALÁRIO BASE
    static double salarioBase = 2000.00;
    // LISTA DE CANDIDATOS
    static String[] candidatos = {
            "Matheus",
            "Márcia",
            "Daniel",
            "Luis",
            "Rafael",
            "Stela",
            "Cristiane",
            "Augusto",
            "Cornélius",
            "Louis",
            "Cláudia",
            "Lestat"
    };

    public static void main(String[] args) throws Exception {
        selecaoCadidatos();
    }

    static void selecaoCadidatos() {
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println(
                    "O(A) candidato(a) " + candidato + " solicitou este valor de salário: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O(A) candidato(a) " + candidato + " FOI selecionado para a vaga");
                candidatosSelecionados++;

                System.out.println("SOLUÇÃO: " + confereSalario(salarioPretendido));

                if (confereSalario(salarioPretendido) == "LIGAR PARA O CANDIDATO"
                        || confereSalario(salarioPretendido) == "LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA") {

                    tentarContato(candidato);

                }

            } else {
                System.out.println("O(A) candidato(a) " + candidato + " NÃO foi selecionado");
            }

            System.out.println("Candidato(s) Selecionado(s): " + candidatosSelecionados);
            candidatoAtual++;
        }

    }

    static double valorPretendido() {
        double valor = ThreadLocalRandom.current().nextDouble(1800, 2200);
        return valor;
    }

    static String confereSalario(double salarioPretendido) {

        if (salarioPretendido < salarioBase) {
            return "LIGAR PARA O CANDIDATO";
        } else if (salarioPretendido == salarioBase) {
            return "LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA";
        } else {
            return "AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS";
        }
    }

    static void tentarContato(String candidato) {

        boolean tentarNovamente = true;
        int tentativas = 1;

        while (tentarNovamente == true) {
            int odd = ThreadLocalRandom.current().nextInt(1, 3);
            System.out.println("LIGANDO...");
            System.out.println("...");
            System.out.println("...");
            if (odd == 1) {
                System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " APÓS " + tentativas + " TENTATIVAS");
                tentarNovamente = false;
            } else if (tentativas == 3) {
                tentarNovamente = false;
                System.out.println(
                        "NÃO CONSEGUI CONTATO. NÚMERO MÁXIMO DE TENTATIVAS ATINGIDO. TENTAR NOVAMENTE EM OUTRO HORÁRIO");
            } else {
                tentarNovamente = true;
                System.out.println("NÃO CONSEGUI CONTATO, VOU TENTAR NOVAMENTE");
            }
            tentativas++;
        }
    }
}
