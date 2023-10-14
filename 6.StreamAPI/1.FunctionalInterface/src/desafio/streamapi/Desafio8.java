package desafio.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafio8 {
  // Desafio 8 - Somar os dígitos de todos os números da lista:
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    // entendi que a soma dos digitos e não dos numeros, então numeros como 10 serão
    // 1 + 0
    // tentar gerar uma nova lista separando os numeros compostos por mais de 1 digito;

    //primeiro crio uma lista de strings usando o Functional Interface
    List<String> transformaString = numeros.stream().map(num -> num.toString()).toList();

    //Instancio a lista onde serão inseridos os digitos, ainda em formato string
    List<String> transformaDigitoString = new ArrayList<>();

    // rodo aqui um algoritmo para dissecar cada string em digitos e cada digito será adicionado a lista que acabei de instanciar
    for (String string : transformaString) {
      String[] retorno = string.split("");

      for (String Digi : retorno) {        
        transformaDigitoString.add(Digi);
      }      
    }

    //pego todos os digitos inseridos e os transformo em numeros
    List<Integer> listaDigitos = transformaDigitoString.stream().map(digito -> Integer.parseInt(digito)).toList();


    //crio a variavel que irá receber o valor da soma
    int somaTodosDigitos = listaDigitos.stream().reduce(0, (digito1,digito2) -> digito1 + digito2 );

    //imprimo o resultado.
    System.out.println(somaTodosDigitos);

  }

}
