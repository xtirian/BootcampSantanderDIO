public class Usuario {
  

  public static void main(String [] args){

    SmartTV smartTV = new SmartTV();

    System.out.println("TV Ligada? " + smartTV.ligado);
    System.out.println("Canal atual: " + smartTV.canal);
    System.out.println("Volume atual: " + smartTV.volume);

    smartTV.ligar();

    System.out.println("Novo Status -> TV Ligada? " + smartTV.ligado);

    // smartTV.desligar();

    // System.out.println("Novo Status -> TV Ligada? " + smartTV.ligado);

    smartTV.aumentarVolume();
    smartTV.diminuirVolume();

    smartTV.mudarCanal(150);


  }
}
