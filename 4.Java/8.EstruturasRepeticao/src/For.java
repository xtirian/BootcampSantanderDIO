public class For {

  /**
   * <h1>For proposition</h1>
   * <p>1 int carneirinhos 1 -> O programa entende que a variável carneirinhos, começa como valor igual a 1 e isso acontece somete uma vez</p>
   * 
   * <p>2. Carneirinhos <= 20 -> O programa verifica se a variavel carneirinhos ainda é menor ou igual a 20</p>
   * <p>3. O programa começa a executar o algoritmo, no nosso caso, imprima a quantidade de carneirinhos em contagem</p>
   * <p>4. carneirinhos++ -> o valor da variável caneirinhos é aumentada em mais 1</p>
   * <p>5.O fluxo é finalizado, quando a variável carneirinhos for igual a 20</p>
   * @param args
   */

  public static void main(String[] args){
    for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}
  }
}

