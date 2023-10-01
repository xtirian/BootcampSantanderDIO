public class AboutMe {

  /**
   * <h1>Passando argumentos pelo terminal</h1>
   * No terminal colocar a seguinte informação:
   * <br />
   * <em>$ java AboutMe Matheus Fernandes 28 1.81</em>
   * <br />
   * <p>eja que os argumentos foram passados logo após chamar a classe, respeitando a ordem dos argumentos. o primeiro argumento foi o args[0] = nome e assim por diante.</p>
   * 
   * @params nome = args[0]
   * @params sobrenome = args[1]
   * @params idadde = args[2]
   * @params altura = args[3]
   */
    public static void main(String[] args) {
        //os argumentos começam com indice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "m ");
    }


}
