package main.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

  private Set<Aluno> gerenciadorAlunos;

  public GerenciadorAlunos() {

    this.gerenciadorAlunos = new HashSet<>();
  }

  public void adicionarAluno(String nome, long matricula, double media) {
    gerenciadorAlunos.add(new Aluno(nome, matricula, media));
  }

  public void removerAluno(long matricula) {
    if (!gerenciadorAlunos.isEmpty()) {
      for (Aluno aluno : gerenciadorAlunos) {
        if (aluno.getMatricula() == matricula) {
          gerenciadorAlunos.remove(aluno);
        }
      }
    }
  }

  public void exibirAlunos() {
    System.out.println(gerenciadorAlunos);
  }

  public Set<Aluno> exibirAlunosPorNome() {
    Set<Aluno> alunosPorNome = new TreeSet<>(gerenciadorAlunos);

    return alunosPorNome;

  }

  public Set<Aluno> exibirAlunosPorNota() {
    
    //Esta versão do código retorna a lista de alunos da menor nota para a maior nota, como eu queria que as notas aparescessem da maior para a menor, busquei um novo método
    //Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());


    //O método encontrado para isto foi o *.descendingSet();
    Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota()).descendingSet();

    //Este método funciona como espécie de reverseOrder para o Set   
        alunosPorNota.addAll(gerenciadorAlunos);
    

    return alunosPorNota;
  }

  public static void main(String[] args) {
    GerenciadorAlunos gerenciadorTeste = new GerenciadorAlunos();

    gerenciadorTeste.adicionarAluno("Matthews", 1516156, 8);
    gerenciadorTeste.adicionarAluno("Fernandes", 54234235, 5);
    gerenciadorTeste.adicionarAluno("Gael", 23424541, 10);
    gerenciadorTeste.adicionarAluno("Alice", 435234, 9);
    gerenciadorTeste.adicionarAluno("Carly", 45635, 9.5);
    gerenciadorTeste.adicionarAluno("Dem", 4658736, 4);

    System.out.println(gerenciadorTeste.exibirAlunosPorNota());

    
  }

}
