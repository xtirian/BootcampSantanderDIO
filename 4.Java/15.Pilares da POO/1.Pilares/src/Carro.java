import java.util.concurrent.ThreadLocalRandom;

public class Carro extends Veiculo {
    

   

    int combustivel = ThreadLocalRandom.current().nextInt(0, 100);
    String[] cambio = {"N", "1", "2","3", "4", "5", "R"};

    @Override
    //O override está me dizendo que o método atual está se sobrepondo ao método que está disponível na classe pai
    public void ligar() {
        String currentCambio = confereCambio();
        boolean currentCombustivel = confereCombustivel();

        if(currentCombustivel == true && currentCambio == "P"){
            
            System.out.println("Carro Ligou");
        } else if(currentCambio != "P") {
            System.out.println("Verificar o Câmbio");            
            System.out.println("Carro não Ligou");
        } else if(currentCombustivel == false){
            System.out.println("Sem Combustível");
            System.out.println("Carro não Ligou");
        };
    }

    private boolean confereCombustivel() {
        if (combustivel == 0) {
            System.out.println("Carro não tem combustível");
            return false;
        } else if (combustivel > 0 && combustivel <= 10) {
            System.out.println("Acende Luz de Reserva no Combustível");
            System.out.println("Indicador de Combustível: " + combustivel);
            return true;
        } else {
            System.out.println("Indicador de Combustível: " + combustivel);
            return true;
        }
    }

    private String confereCambio() {
        String currentCambio = cambio[ThreadLocalRandom.current().nextInt(0,cambio.length)];
        
        System.out.println("Indicador de Câmbio no Visor: " + currentCambio);
        return currentCambio;
    }

    public void desligar() {
        System.out.println("Carro Ligado");
    }
}
