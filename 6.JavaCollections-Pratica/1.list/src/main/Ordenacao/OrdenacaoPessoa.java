package main.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

  List<Pessoa> listaPessoas;

  public OrdenacaoPessoa() {

    this.listaPessoas = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, int idade, double altura) {

    listaPessoas.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordenarPorIdade(){
    List<Pessoa> pessoasPorIdaddeList = new ArrayList<>(listaPessoas);

    Collections.sort(pessoasPorIdaddeList);

    return pessoasPorIdaddeList;


    
  }

  public List<Pessoa> ordenarPorAltura(){
    List<Pessoa> pessoasPorAlturaList = new ArrayList<>(listaPessoas);

    Collections.sort(pessoasPorAlturaList, new ComparatorPorAltura());

    return pessoasPorAlturaList;


  }

  public static void main(String[] args) {

  }

}
