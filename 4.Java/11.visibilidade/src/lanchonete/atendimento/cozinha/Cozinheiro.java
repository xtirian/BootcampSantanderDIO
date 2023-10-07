package lanchonete.atendimento.cozinha;


public class Cozinheiro {
	//pode ser default
	public void adicionarLancheNoBalcao() {
		System.out.println("ADICIONANDO LANCHE NATURAL HAMBÃšRGUER NO BALCÃƒO");
	}
	//pode ser default
	public void adicionarSucoNoBalcao() {
		System.out.println("ADICIONANDO SUCO NO BALCÃƒO");
	}
	//pode ser default
	public void adicionarComboNoBalcao() {
		prepararCombo();
	}
	private void prepararLanche() {
		System.out.println("PREPARANDO LANCHE TIPO HAMBÃšRGUER");
		selecionarIngredientesLanche();
		lavarIngredientes();
		fritarIngredientesLanche();
	}
	private void prepararVitamina() {
		System.out.println("PREPARANDO SUCO");
		selecionarIngredientesVitamina();
		baterVitaminaLiquidificador();
	}
	private void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	private void selecionarIngredientesLanche() {
		pedirIngredientes(null);
		System.out.println("SELECIONADO O PÃƒO, SALADA, OVO E CARNE");
	}
	private void selecionarIngredientesVitamina() {
		pedirIngredientes(null);
		System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
	}
	private void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES");
	}
	private void baterVitaminaLiquidificador() {
		System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
	}
	private void fritarIngredientesLanche() {
		pedirParaTrocarGas(null);
		System.out.println("FRITANDO A CARNE E OVO PARA O HAMBÃšRGUER");
	}

	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	
	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}