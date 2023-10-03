public class CondicionalSimples {

  public static void main(String[] args) {
    double saldo = 25.0;
    double valorSolicitado = 22.0;

    if (valorSolicitado < saldo){
      saldo = saldo - valorSolicitado;

      System.out.println("Saque realizado com sucesso");
      System.out.println("Novo Saldo: "+saldo);

    }else
      System.out.println("Saldo Insuficiente. Valor disponível: " + saldo);

    
  }
  
}