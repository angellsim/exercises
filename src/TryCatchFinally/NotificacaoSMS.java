package TryCatchFinally;

public class NotificacaoSMS implements Notificacao{
  public void enviarNotificacao(String destino, String mensagem){
      String notificacao = "A notificação " + mensagem + " foi enviada para " + destino;
      System.out.println(notificacao);
  }
  public void agendarNotificacao(String destino, String mensagem, String dataHora){
      String notificacao = "A notificação " + mensagem + " será enviada para " + destino + "no horário: " + dataHora;
      System.out.println(notificacao);
  }
  public boolean verificarStatusDeEntrega(String idMensagem){
      return true;
  }

}