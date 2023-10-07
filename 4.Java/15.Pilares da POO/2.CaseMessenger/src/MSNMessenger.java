public class MSNMessenger extends ServicoMensagemInstantaneo {
  @Override
  public void enviarMensagem() {
    // primeiro confirmar se esta conectado a internet
    validarConectadoInternet();

    System.out.println("Enviando mensagem pelo MSN Messanger");

    // depois de enviada, salva o histÃ³rico da mensagem
    salvarHistoricoMensagem();

  }

  @Override
  public void receberMensagem() {
    System.out.println("Recebendo mensagem pelo MSN Messanger");
  }

  // mÃ©todos privadas, visÃ­veis somente na classe
  

  private void salvarHistoricoMensagem() {
    System.out.println("Salvando o histÃ³rico da mensagem");
  }
}
