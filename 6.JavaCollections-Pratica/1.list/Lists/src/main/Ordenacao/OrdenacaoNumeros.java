package main.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros implements Comparable<Integer> {
  List<Integer> listaNumeros;

  public OrdenacaoNumeros() {
    this.listaNumeros = new ArrayList<>();
  }

  @Override
  public int compareTo(Integer i) {    
    return Integer.compare(i, i);    
  }




  public void adicionarNumero(int numero){

    listaNumeros.add(numero);
  }

  public List<Integer> ordenarAscendente(){
    List<Integer> listaOrdenadaAscendenIntegers = new ArrayList<>(listaNumeros);

    Collections.sort(listaOrdenadaAscendenIntegers);


    return listaOrdenadaAscendenIntegers;
  }

  public List<Integer> ordenarDescendente(){
    List<Integer> listaOrdenadaDescendenIntegers = new ArrayList<>(listaNumeros);

    Collections.sort(listaOrdenadaDescendenIntegers, Collections.reverseOrder());    

    return listaOrdenadaDescendenIntegers;
  }

  public static void main(String[] args) {
    OrdenacaoNumeros listaTeste = new OrdenacaoNumeros();

    listaTeste.adicionarNumero(1);
    listaTeste.adicionarNumero(2);
    listaTeste.adicionarNumero(4);
    listaTeste.adicionarNumero(643);
    listaTeste.adicionarNumero(285);
    listaTeste.adicionarNumero(52374);
    listaTeste.adicionarNumero(25);
    listaTeste.adicionarNumero(8789);
    listaTeste.adicionarNumero(45);
    listaTeste.adicionarNumero(486);
    listaTeste.adicionarNumero(84063);
    listaTeste.adicionarNumero(7625);


    System.out.println(listaTeste.ordenarAscendente());
    System.out.println(listaTeste.ordenarDescendente());


  }

  
  
  
}
