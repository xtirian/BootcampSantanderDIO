package estudo.junit;

import org.junit.Assert;
import org.junit.Test;

public class TransferenciaEntreContasTest {
  

  @Test
  public void validar(){
    Conta conta1= new Conta("2224", 200);
    Conta conta2= new Conta("2222", 10);

    TransferenciaEntreContas transferencia1 = new TransferenciaEntreContas(conta1, conta2, 100);


  }
}
