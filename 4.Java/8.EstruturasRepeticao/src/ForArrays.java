public class ForArrays {

  /**
   * <h1>ForEach ou ForOf</h1>
   * <p>O for each no java é feito da seguinte forma:</p>
   * <p><em>for(String item : Array )</em></p>
   * <p></p>
   * <p></p>
   * <p></p>
   * @param alunos
   */

  public static void main(String[] args) {
    String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

    // Forma abreviada
    for (String aluno : alunos) {
      System.out.println("O nome do aluno é: " + aluno);
    }
  }
}