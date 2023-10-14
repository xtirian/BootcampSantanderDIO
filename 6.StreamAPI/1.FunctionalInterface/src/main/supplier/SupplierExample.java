package main.supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Representa uma opra~]ao que não aceita nenhum argumento e retorna um resultado do tipo
 * É comumente usada para criar ou fornecesses novos objetos de um determinado tipo.
 */

public class SupplierExample {
  public static void main(String[] args) {

    // Criar um Supplier de saudação
    Supplier<String> saudacao = () -> "Olá, seja bem-vindo!";

    // Usar o Supplier para gerar uma lista com 5 saudacoes
    List<String> listaSaudacao = Stream.generate(saudacao) //gera a saudacao dentro da lista com o functiona interface Stream. O generate gera infinitamente, por isso é necessário definir um limite
      .limit(5) //Define o limite
      .collect(Collectors.toList()); //usa o collector para agrupar as saudacoes em uma collection para que possa ser inserida no List

    /*Outro método de realizar isto utilizando osupplier diretamente.
     * 
     * Neste método, criamos o supplier dentro do próprio generate
     */
    List<String> listaSaudacao2 = Stream.generate(
      new Supplier<String>() {

        @Override
        public String get() {
          return "Olá, seja bem-vindo!";
        }        
      }
    ).limit(5).toList();

    /* O método mais rápido, usando o LAMBDA */
    List<String> listaSaudacao3 = Stream.generate( () -> "Olá, seja bem-vindo!").limit(5).toList();


    //Este é usando o METHOD REFERENCE
    // listaSaudacao.forEach(System.out::println);

    //este é o METHOD LAMBDA
    listaSaudacao3.forEach(s->System.out.println(s));

  }
}
