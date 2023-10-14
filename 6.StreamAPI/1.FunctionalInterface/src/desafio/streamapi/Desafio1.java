package desafio.streamapi;

import java.util.Arrays;
import java.util.List;


// Mostrar a lista na ordem numérica

public class Desafio1 {
  public static void main(String[] args) {


    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    //Neste caso não irei usar nenhum Consumer ou Interface além do Sorted, pois ele por si só já organiza os elementos em sua ordem natual.    
    numeros.stream().sorted().forEach(System.out::println);


  }
}
