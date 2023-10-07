public class FacebookMessenger extends ServicoMensagemInstantaneo {

  @Override
  public void enviarMensagem() {
		validarConectadoInternet();
		

	}

	@Override
	public void receberMensagem(){
		validarConectadoInternet();

	}
	
  
}
