package main.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
  Set<Produto> cadastroProdutos;

  public CadastroProdutos() {
    this.cadastroProdutos = new HashSet<>();
  }

  public void adicionarProduto(long cod, String nome, double preco, int quantidade) {

    cadastroProdutos.add(new Produto(nome, cod, preco, quantidade));
  }

  public Set<Produto> exibirProdutosPorNome() {
    Set<Produto> produtosPorNome = new TreeSet<>(cadastroProdutos);

    return produtosPorNome;

  }

  public Set<Produto> exibirProdutosPorPreco(){
    Set<Produto> produtoPorPreco = new TreeSet<>(cadastroProdutos);

    return produtoPorPreco;


  }

}
