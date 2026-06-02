package TryCatchFinally;

public interface Notificacao{
  void enviarNotificacao(String destino, String mensagem);
  void agendarNotificacao(String destino, String mensagem, String dataHora);
  boolean verificarStatusDeEntrega(String idMensagem);
}
