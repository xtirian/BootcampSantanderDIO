package escola;

public class Escola {
  
  public static void main(String[] args){
    //vou acessar aluno que está default, ou seja, visivel apenas no pacote Escola
    Aluno felipe = new Aluno();
    felipe.setNome("Felipe");
    felipe.setIdade(12);


    printAluno(felipe);


    
  }

  private static void printAluno(Aluno aluno){
    System.out.println("O aluno " + aluno.getNome() + " tem " + aluno.getIdade() + " anos");
  }
}
