package main.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
  // atributo

  private List<Item> carrinhoCompras;

  public CarrinhoCompras() {

    this.carrinhoCompras = new ArrayList<>();
  }

  public void adicionarItem(String nome, int quantidade, double preco) {

    carrinhoCompras.add(new Item(nome, quantidade, preco));
  }

  public void removerItem(String nome) {

    List<Item> itensParaRemover = new ArrayList<>();

    for(Item item : carrinhoCompras){
      if(item.getNome().equalsIgnoreCase(nome)){
        itensParaRemover.add(item);
      }
    }

    carrinhoCompras.removeAll(itensParaRemover);

  }

  public double calcularValorTotal() {
    double total = 0.00;

    for (Item item : carrinhoCompras) {
      int quantidade = item.getQuantidade();
      double preco = item.getPreco();

      double totalItem = quantidade * preco;

      total += totalItem;    

    }

    return total;
  }

  public List<Item> exibirItens() {

    return carrinhoCompras;
  }

  public static void main(String[] args) {

    CarrinhoCompras carrinho = new CarrinhoCompras();

    carrinho.adicionarItem("mouse", 1, 50);
    carrinho.adicionarItem("teclado", 1, 125.99);
    carrinho.adicionarItem("monitor", 1, 423.78);
    System.out.println(carrinho.exibirItens());

    System.out.println(carrinho.calcularValorTotal());
    
    carrinho.removerItem("mouse");
    System.out.println(carrinho.exibirItens());

    System.out.println(carrinho.calcularValorTotal());

  }

}
