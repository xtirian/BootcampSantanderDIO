package main.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

  // LEMBRAR QUE COLLECTIONS NÃO ACEITAM TIPOS PRIMITIVOS
  private List<Integer> listaInteiros;

  @Override
  public String toString() {
    return "SomaNumeros [listaInteiros=" + listaInteiros + "]";
  }

  public SomaNumeros() {
    this.listaInteiros = new ArrayList<>();
  }

  public void adicionarNumero(int novoNumero) {

    listaInteiros.add(novoNumero);
  }

  public int calculaSoma() {
    int resultadoSoma = 0;

    if (!listaInteiros.isEmpty()) {
      for (Integer valor : listaInteiros) {
        resultadoSoma += valor;
      }
    }
    return resultadoSoma;
  }

  public int encontraMaiorNumero() {
    int maiorNumero = 0;
    if (!listaInteiros.isEmpty()) {
      for (Integer valor : listaInteiros) {
        if (valor > maiorNumero) {
          maiorNumero = valor;
        }

      }
    }
    return maiorNumero;
  }

  public int encontraMenorNumero() {
    int menorNumero = 0;
    if (!listaInteiros.isEmpty()) {

      for (Integer valor : listaInteiros) {
        if (menorNumero == 0 || valor < menorNumero) {
          menorNumero = valor;
        }

      }
    }
    return menorNumero;
  }

  public void exibirNumeros() {

    System.out.println(listaInteiros);
  }

  public static void main(String[] args) {
    SomaNumeros listaTeste = new SomaNumeros();

    listaTeste.adicionarNumero(185);
    listaTeste.adicionarNumero(17);
    listaTeste.adicionarNumero(14);
    listaTeste.adicionarNumero(12);
    listaTeste.adicionarNumero(16);
    listaTeste.adicionarNumero(11);
    listaTeste.adicionarNumero(51);
    listaTeste.adicionarNumero(321);
    listaTeste.adicionarNumero(11);
    listaTeste.adicionarNumero(10);

    listaTeste.exibirNumeros();
  }

}
