package desafio.streamapi;

import java.util.Arrays;
import java.util.List;

public class Desafio2 {


  //  Desafio 2 - Imprima a soma dos números pares da lista:

  public static void main(String[] args) {
    //Cria a lista
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    // Imprime os numeros pares para conferência
    numeros.stream().filter(n -> n%2==0).forEach(System.out::println);

    /**
    * soma os numeros pares usando a interface BinaryOperator 
    */
    
    int somaPares = numeros.stream().filter(n -> n%2==0).reduce(0, (n1,n2)-> n1+n2);

    System.out.println(somaPares);

  }
  
}
