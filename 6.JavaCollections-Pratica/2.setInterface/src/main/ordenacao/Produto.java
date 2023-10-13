package main.ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {
  //atributos

  private String nome;
  private long cod;
  private double preco;
  private int quantidade;
  
  public Produto(String nome, long cod, double preco, int quantidade) {
    this.nome = nome;
    this.cod = cod;
    this.preco = preco;
    this.quantidade = quantidade;
  }
  @Override
  public int compareTo(Produto p) {
    return nome.compareToIgnoreCase(p.getNome());
  } 
  

  public String getNome() {
    return nome;
  }

  public long getCod() {
    return cod;
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  @Override
  public String toString() {
    return "Produto [nome=" + nome + ", cod=" + cod + ", preco=" + preco + ", quantidade=" + quantidade + "]";
  }

  @Override
  public int hashCode() {
    final long prime = 31;
    long result = 1;
    result = prime * result + cod;
    return (int) result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Produto other = (Produto) obj;
    if (cod != other.cod)
      return false;
    return true;
  }
  

  

}

class ComparatorPorPreco implements Comparator<Produto>{

  @Override
  public int compare(Produto produto1, Produto produto2) {

    return Double.compare(produto1.getPreco(), produto2.getPreco());
  }
  
}
