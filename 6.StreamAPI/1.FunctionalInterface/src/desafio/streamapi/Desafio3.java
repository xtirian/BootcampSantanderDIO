package desafio.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio3 {

  
  public static void main(String[] args) {

    //Desafio 3 - Verifique se todos os números da lista são positivos:

  //cria a lista
  List<Integer> numeros = Arrays.asList(-1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

  /*
  * O resultado para este desafio foi totalmente diferente do que eu imaginei.
  * À principio achei que poderia passar um Functional pra criar uma lista de booleans e depois passar o Predicate, mas não deu certo, então vi a propriedade anymatch e a allmatch.
  * Usei elas para verificar se todos os elementos são acima de zero.
  * Adicionei um elemento negativo à lista para tirar a prova

  * Implementei 2 métodos
  */
  
  Predicate<Integer> verifPredicate = n -> n >= 0;

  // MÉTODO 1 - Verifiquei se todos são positivos. Se todos forem positivos, retorna true, caso contrário, retorna false.
  boolean verificaSeTodosPositivos = numeros.stream().allMatch(n -> n>=0);

  //MÉTODO 2 - Verifica se há 1 negativo e retorna o oposto. Se houver negativo, vai retornar false.
  // Fiz este método pois imaginei que não precisaria percorrer toda a lista se o primeiro elemento já for negativo
  // O único cuidado extra que deve ter é de aplicar a lógica contrária, já que estamos procurando pelo oposto do que queremos.
  boolean verificaSeTemNegativo = numeros.stream().anyMatch(n -> n<0);

  System.out.println("Todos os números da lista são positivos? " + !verificaSeTemNegativo);

  
  
    
  }




  
}
