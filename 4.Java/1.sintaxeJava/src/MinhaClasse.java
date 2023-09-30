
public class MinhaClasse {
  //Código fica aqui

   public static void main( String [] args){

    String nome = "Matheus";
    String segundNome = "Fernandes";
   
    System.out.println(nomeCompleto(nome, segundNome));
  };

  public static String nomeCompleto( String primeiroNome, String sobrenome){

   return "Resultado do método " + primeiroNome.concat(" ").concat(sobrenome);

  };

 
  

}