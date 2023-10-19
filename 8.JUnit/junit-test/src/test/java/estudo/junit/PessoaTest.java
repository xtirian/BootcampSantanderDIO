package estudo.junit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class PessoaTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void deveCalcularIdadeCorretamente(){

        Pessoa matheus = new Pessoa("Matheus", LocalDate.of(1995,2,19));

        Assert.assertEquals(28, matheus.getIdade());

    }

    @Test
    public void deveRetornarSeMaiorIdade(){
       Pessoa matheus = new Pessoa("Matheus", LocalDate.of(1995,2,19));

       assertTrue("null", matheus.ehMaiorDeIdade());

       Pessoa ostra = new Pessoa("Matheus", LocalDate.of(2011,2,19));

       assertFalse("null", ostra.ehMaiorDeIdade());
    }
}
