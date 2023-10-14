package main.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerExample {

  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    // MÉTODO 1 PARA FAZER

    /*
     * Consumer<Integer> imprimirNumeroPar = numero -> {
     * if(numero %2 ==0)
     * System.out.println(numero);
     * };
     * 
     * numeros.stream().forEach(imprimirNumeroPar);
     */

    // MÉTODO 2

    /*
     * numeros.stream().forEach(new Consumer<Integer>() {
     * 
     * @Override
     * public void accept(Integer integer) {
     * if(integer%2 == 0){
     * System.out.println(integer);
     * }
     * }
     * 
     * });
     */

    // MÉTODO 3 - USANDO LAMBDA

    
     
     numeros.stream()
      .filter(numero -> numero % 2 == 0) //este é um predicate
      .forEach(System.out::println);
     
     

  }

}
