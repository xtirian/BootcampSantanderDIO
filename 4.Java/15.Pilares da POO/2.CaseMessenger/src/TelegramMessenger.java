public class TelegramMessenger extends ServicoMensagemInstantaneo {

	@Override
	public void enviarMensagem() {

		System.out.println("Enviando mensagem pelo Telegram Messanger");

		salvarHistoricoMensagem();

	}

	@Override
	public void receberMensagem(){
	System.out.println("Recebendo mensagem pelo Telegram Messanger");
	salvarHistoricoMensagem();
}
	

	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histÃ³rico da mensagem");
	}
}
