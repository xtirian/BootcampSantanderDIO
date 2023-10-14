package desafio.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio7 {
  //Desafio 7 - Encontrar o segundo número maior da lista

  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    //gero uma lista ordenada
    List<Integer> numerosOrdenados = numeros.stream().sorted().toList();

    /* 
    * imprimo o numero na penultima posicao.
    * size() - 2 pois o size começa a contar a partir do 1 e o índex a partir do 0 
    * Então tiro 1 para nivelar o size com o index e tiro + 1 pois quero imprimir o penultimo item.
    */
    System.out.println(numerosOrdenados.get(numerosOrdenados.size()-2));
    
  }
}
