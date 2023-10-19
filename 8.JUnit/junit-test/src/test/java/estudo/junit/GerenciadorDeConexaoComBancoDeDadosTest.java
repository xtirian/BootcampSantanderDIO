package estudo.junit;

import org.junit.Test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

public class GerenciadorDeConexaoComBancoDeDadosTest {

  GerenciadorDeConexaoComBancoDeDados bd = new GerenciadorDeConexaoComBancoDeDados();
  
  @Before
  public void  configuraconexao(){
    
    bd.iniciarConexao();

  }


  @Test
  public void gerenciadorConexao(){
    Assert.assertTrue(true);
  }

  @After
  public void  fechaconexao(){
    
    bd.finalizarConexao();

  }
}
