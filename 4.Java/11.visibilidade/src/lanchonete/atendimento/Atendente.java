package lanchonete.atendimento;

public class Atendente {
  	public void servindoMesa() {
		//...?
		pegarLancheCozinha();
		System.out.println("SERVINDO A MESA");
	}
	private void pegarLancheCozinha() {
		System.out.println("PEGANDO O LANCHE NA COZINHA");
	}
	public void receberPagamento() {
		System.out.println("RECEBENDO PAGAMENTO");
	}
	// private void trocarGas() {
	// 	System.out.println("ATENDENTE TROCANDO O GÃS");
	// }
	// private void pegarPedidoBalcao() {
	// 	System.out.println("PEGANDO O PEDIDO NO BALCÃƒO");
	// }
}
