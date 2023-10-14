package main.predicate;

import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

/**
 * Representa uma função que aceita um argumento do Tipo T e retorna um valor booleano ( V ou F).
 * É comumente usado para filtrar os elementos do Stream com base em alguma condição.
 */

public class PredicateExample {
  public static void main(String[] args) {
    //Cria uma lista de palavras
    List<String> palavras = Arrays.asList("java", "python", "javascript", "c", "go", "ruby");

    //Cria um Predicate que verifica se a palavra tem 5 ou mais caracteres
    Predicate<String> verificaPalavra = palavra -> palavra.length() >= 5;

    palavras.stream().filter(palavra -> palavra.length() >=5).forEach(System.out::println);
    palavras.stream().filter(verificaPalavra).forEach(System.out::println);
    
  }
}
