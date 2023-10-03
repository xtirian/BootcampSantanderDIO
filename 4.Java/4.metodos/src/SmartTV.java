public class SmartTV {
  // Ela precisa ter as características ligada (boolean), Canal(int) e volume(int)

  boolean ligado = false;
  int canal = 1;
  int volume = 25;

  public void ligar() {
    ligado = true;
  }

  public void desligar() {
    ligado = false;
  }

  public void aumentarVolume() {
    if (ligado) {
      volume++;
      System.out.println(volume);
    } else {
      System.out.println("Tv Desligada");
    }
  }

  public void diminuirVolume() {
    if (ligado) {
      volume--;
      System.out.println(volume);
    } else {
      System.out.println("Tv Desligada");
    }
  }

  public void mudarCanal(int novoCanal){
    canal = novoCanal;
    System.out.println("Entrando no canal: " + novoCanal);

  }

  public void aumentarCanal(){
    canal++;
  }

  public void diminuirCanal(){
    canal--;
  }

}
