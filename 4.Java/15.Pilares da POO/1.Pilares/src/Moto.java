
public class Moto extends Veiculo {

  @Override
  //O override está me dizendo que o método atual está se sobrepondo ao método que está disponível na classe pai
  public void ligar() {
    System.out.println("Moto ligada");
  }
}
