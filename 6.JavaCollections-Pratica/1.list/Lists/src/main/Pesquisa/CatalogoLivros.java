package main.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

  private List<Livro> calatofoLivros;

  public CatalogoLivros() {

    this.calatofoLivros = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int ano) {

    calatofoLivros.add(new Livro(titulo, autor, ano));
  }

  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> livrosDoAutor = new ArrayList<>();

    if (!calatofoLivros.isEmpty()) {
      for (Livro livro : calatofoLivros) {
        if (livro.getAutor().equalsIgnoreCase(autor)) {
          livrosDoAutor.add(livro);
        }

      }
    }
    return livrosDoAutor;
  }

  public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {

    List<Livro> livrosPorAno = new ArrayList<>();

    if (!calatofoLivros.isEmpty()) {
      for (Livro livro : calatofoLivros) {
        if (livro.getAno() >= anoInicial && livro.getAno() <= anoFinal) {
          livrosPorAno.add(livro);
        }
      }
    }

    return livrosPorAno;
  }

  public List<Livro> pesquisaPorTitulo(String titulo) {

    List<Livro> livroPorTitulo = new ArrayList<>();

    if (!calatofoLivros.isEmpty()) {
      for (Livro livro : calatofoLivros) {
        if (livro.getTitulo().toLowerCase().contains(titulo)) {
          livroPorTitulo.add(livro);
        }
      }
    }

    return livroPorTitulo;
  }

  public static void main(String[] args) {

    CatalogoLivros catalogo = new CatalogoLivros();

    catalogo.adicionarLivro("Harry Potter e a Pedra Filosofal", "J. K. Rowling", 1997);
    catalogo.adicionarLivro("Harry Potter e a Câmara Secreta", "J. K. Rowling", 1998);
    catalogo.adicionarLivro("Harry Potter e o Prisioneiro de Azkaban", "J. K. Rowling", 1999);
    catalogo.adicionarLivro("Harry Potter e o Cálice de Fogo", "J. K. Rowling", 2000);
    catalogo.adicionarLivro("Harry Potter e a Ordem da Fênix", "J. K. Rowling", 2003);
    catalogo.adicionarLivro("Harry Potter e o Enigma do Príncipe", "J. K. Rowling", 2005);
    catalogo.adicionarLivro("Harry Potter e as Relíquias da Morte", "J. K. Rowling", 2007);
    catalogo.adicionarLivro("A Sociedade do Anel", "J. R. R. Tolkien", 1954);
    catalogo.adicionarLivro("As Duas Torres", "J. R. R. Tolkien", 1954);
    catalogo.adicionarLivro("O Retorno do Rei", "J. R. R. Tolkien", 1955);

    System.out.println(catalogo.pesquisaPorTitulo("anel"));
  }
}
