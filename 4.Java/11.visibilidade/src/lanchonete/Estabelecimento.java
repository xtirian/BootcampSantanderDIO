package lanchonete;

public class Estabelecimento {
  	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		//aÃ§Ãµes que nÃ£o precisam estarem disponÃ­veis para toda a aplicaÃ§Ã£o
		cozinheiro.lavarIngredientes();
		cozinheiro.baterVitaminaLiquidificador();
		cozinheiro.selecionarIngredientesVitamina();
		cozinheiro.prepararLanche();
		cozinheiro.prepararVitamina();
		cozinheiro.prepararVitamina();
		
		//aÃ§Ãµes que estabelecimento precisa ter ciÃªncia
		cozinheiro.adicionarSucoNoBalcao();;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		Almoxarife almoxarife = new Almoxarife();
		//aÃ§Ãµes que nÃ£o precisam estarem disponÃ­veis para toda a aplicaÃ§Ã£o
		almoxarife.controlarEntrada();
		almoxarife.controlarSaida();
		//aÃ§Ã£o que somente o seu pacote cozinha precisa conhecer (default)
		almoxarife.entregarIngredientes();
		almoxarife.trocarGas();
		
		Atendente atendente = new Atendente();
		atendente.pegarLancheCozinha();
		atendente.receberPagamento();
		atendente.servindoMesa();
		//aÃ§Ã£o que somente o seu pacote cozinha precisa conhecer (default)
		atendente.trocarGas();
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		//nÃ£o deveria, mas o estabelecimento
		//ainda nÃ£o definiu normas de atendimento
		cliente.pegarPedidoBalcao();
		
		//esta aÃ§Ã£o Ã© muito sigilosa, qua tal ser privada ?
		cliente.consultarSaldoAplicativo();
		
		//jÃ¡ pensou os clientes ouvindo que o gÃ¡s acabou ?
		cozinheiro.pedirParaTrocarGas(atendente);
		cozinheiro.pedirParaTrocarGas(almoxarife);
		
	}
}
