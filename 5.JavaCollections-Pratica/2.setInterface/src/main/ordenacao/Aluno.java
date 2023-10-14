package main.ordenacao;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno> {

  // atributos
  String nome;
  long matricula;
  double media;

  public Aluno(String nome, long matricula, double media) {
    this.nome = nome;
    this.matricula = matricula;
    this.media = media;
  }

  public String getNome() {
    return nome;
  }

  public long getMatricula() {
    return matricula;
  }

  public double getMedia() {
    return media;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (matricula ^ (matricula >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Aluno other = (Aluno) obj;
    if (matricula != other.matricula)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Aluno " + nome + "[matricula=" + matricula + ", media=" + media + "]";
  }

  @Override
  public int compareTo(Aluno aluno) {

    return nome.compareToIgnoreCase(aluno.getNome());
  }

}

class ComparatorPorNota implements Comparator<Aluno> {

  @Override
  public int compare(Aluno aluno1, Aluno aluno2) {
    return Double.compare(aluno1.getMedia(), aluno2.getMedia());
  }

}
