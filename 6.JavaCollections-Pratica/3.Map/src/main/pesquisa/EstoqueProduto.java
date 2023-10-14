package main.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
  //atributos
  private Map<Long, Produto> estoqueProdutosMap;

  public EstoqueProduto() {
    this.estoqueProdutosMap = new HashMap<>();
  }

  public void adicionarProduto(long cod, String nome, int quantidade, double preco){

    estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
  }

  public void exibirProdutos(){
    System.out.println(estoqueProdutosMap);
  }

  public double calcularValorTotalEstoque(){
    double valorEstoque = 0;

    if(!estoqueProdutosMap.isEmpty()){
      for(Produto produto: estoqueProdutosMap.values()){
        valorEstoque += produto.getQuantidade() * produto.getPreco();
      }
    }

    return valorEstoque;
  }

  public Produto obterProdutoMaisCaro(){    
    Produto produtoMaisCaro = null;
    double maiorPreco = Double.MIN_VALUE;


    if(!estoqueProdutosMap.isEmpty()){

      for (Produto p : estoqueProdutosMap.values()) {
        if(p.getPreco() > maiorPreco)
        produtoMaisCaro = p;
      }
      

    }

    return produtoMaisCaro;
  } 
  
  public static void main(String[] args) {

    EstoqueProduto estoqueTeste = new EstoqueProduto();

    estoqueTeste.adicionarProduto(10, "Produto1", 2, 10);
    estoqueTeste.adicionarProduto(11, "Produto2", 5, 5);
    estoqueTeste.adicionarProduto(12, "Produto3", 1, 15);


    System.out.println(estoqueTeste.calcularValorTotalEstoque());
    
  }
  
}
