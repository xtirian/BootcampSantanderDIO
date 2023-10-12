package main.OperacoesBasicas;

public class Item {
  //atributos
  String nome;
  double preco;
  int quantidade;

  //constructor
  public Item(String nome, int quantidade, double preco) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  @Override
  public String toString() {
    return "Item [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
  }

  

  
  
}
