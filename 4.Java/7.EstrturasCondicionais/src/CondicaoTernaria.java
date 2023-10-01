public class CondicaoTernaria {  

  public static void main(String[] args) {
    float nota = 3F;
    //String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

    // agora vou mostrar o else if no ternário

    String resultado = nota >= 7? "Aprovado": nota >= 5 && nota<7? "Recuperação": "Reprovado"; 
    System.out.println(resultado);
  }

}
