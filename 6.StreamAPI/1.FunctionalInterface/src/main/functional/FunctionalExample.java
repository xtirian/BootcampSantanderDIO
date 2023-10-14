package main.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar ou mapear elementos do Stream em outros valores ou outros tipos. 
 */

public class FunctionalExample {

  public static void main(String[] args) {

    //Criar uma lista de numeros inteiros
    List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    //usar a Function com expressao lambda pra dobrar todos os numeros.
    Function<Integer, Integer> dobrar = numero -> numero*2;

    //usar a funcao para dobrar todos os nmeros no Stream e armazenalos em outra lista
    List<Integer> numerosDobrados = numeros.stream().map(numero -> numero*2).toList();
    List<Integer> numerosDobrados2 = numeros.stream().map(dobrar).toList();
    List<Integer> numerosDobrados3 = numeros.stream().map(new Function<Integer,Integer>() {

      @Override
      public Integer apply(Integer integer) {
        return integer*2;
      }
      
      
    }).toList();

    //imprimir numeros dobrados

    numerosDobrados.forEach(d -> System.out.println(d));
    //OU
    numerosDobrados.forEach(System.out::println);


  }
  
}
