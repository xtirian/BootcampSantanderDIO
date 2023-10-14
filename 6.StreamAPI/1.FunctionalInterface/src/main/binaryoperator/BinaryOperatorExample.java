package main.binaryoperator;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

/**
 * Representa uma operação que combine dois argumentos do Tipo T e retorna um resultado do mesmo tipo T,
 * É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
 */

public class BinaryOperatorExample {

  public static void main(String[] args) {
    //criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;
    BinaryOperator<Integer> multiplicar = (num1, num2) -> num1 * num2;

   int resultadoSoma = numeros.stream().reduce(0, somar);
   int resultadoMultiplicacao = numeros.stream().reduce(1, multiplicar); // a identity é a variável temporária. No caso da multiplcação e outras operações binárias, tem que colocar números neutros. Por isso na multiplicação é o numero 1 e na soma é o 0


   int resultadoSoma2 = numeros.stream().reduce(0, new BinaryOperator<Integer>(){

    @Override
    public Integer apply(Integer num1, Integer num2) {
      
      return num1 + num2;
    }
   });

   int resultadoSoma3 = numeros.stream().reduce(0, (num1, num2) -> num1 + num2);

   //EXTRA, USANDO O METODO REFERENCE
   int resultadoSoma4 = numeros.stream().reduce(0, Integer::sum);

    System.out.println(resultadoSoma4);
    System.out.println(resultadoMultiplicacao);

  }
  
}
