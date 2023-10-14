package desafio.streamapi;

import java.util.Arrays;
import java.util.List;

public class Desafio5 {

  public static void main(String[] args) {
    //Calcule a média dos números maiores que 5
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    //Não sei se fiz da melhor forma possivel, mas dividi em 3 etapas:
    //Somei os itens
    int resultadoSoma = numeros.stream().filter(num -> num > 5).reduce(0, (num1,num2) -> num1+num2);
    //Peguei a quantidade de itens
    int resultadoQuantidade = numeros.stream().filter(num -> num > 5).toList().size();

    int media = resultadoSoma/resultadoQuantidade;

    System.out.println(media);
  }
  
}
