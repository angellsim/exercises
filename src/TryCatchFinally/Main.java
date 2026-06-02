package TryCatchFinally;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      try {
      MetodoDePagamento pagamento = new PagamentoPIX();
    
      boolean status = pagamento.processarPagamento(500, "BRL");
    
      if(status){
          String comprovante = pagamento.obterComprovante();
    
          Notificacao notificacao = new NotificacaoWhatsApp();
    
          notificacao.enviarNotificacao("+55 62 992336291", "Pagamento realizado com sucesso" + comprovante);
      }
    
      Relatorio relatorio = new RelatorioFinanceiro();
      relatorio.gerarRelatorioMensal();
      MetodoDePagamento pagamento1 = new PagamentoCartaoCredito();
      Notificacao notificacao1 = new NotificacaoSMS();
      MetodoDePagamento pagamento2 = new PagamentoPIX();
      Notificacao notificacao2 = new NotificacaoEmail();
      MetodoDePagamento pagamento3 = new PagamentoBoleto();
      Notificacao notificacao3 = new NotificacaoWhatsApp();
      MetodoDePagamento pagamento4 = new PagamentoCartaoCredito();
      Notificacao notificacao4 = new NotificacaoEmail();
      MetodoDePagamento pagamento5 = new PagamentoPIX();
      Notificacao notificacao5 = new NotificacaoSMS();
      MetodoDePagamento pagamento6 = new PagamentoBoleto();
      Notificacao notificacao6 = new NotificacaoEmail();
      MetodoDePagamento pagamento7 = new PagamentoCartaoDebito();
      Notificacao notificacao7 = new NotificacaoWhatsApp();
      MetodoDePagamento pagamento8 = new PagamentoPIX();
      Notificacao notificacao8 = new NotificacaoEmail();
      MetodoDePagamento pagamento9 = new PagamentoCartaoDebito();
      Notificacao notificacao9 = new NotificacaoSMS();
      MetodoDePagamento pagamento10 = new PagamentoBoleto();
      Notificacao notificacao10 = new NotificacaoWhatsApp();
    
      Relatorio relatorio1 = new RelatorioAuditoria();
      Relatorio relatorio2 = new RelatorioFinanceiro();

    } catch (Exception e) {
        System.out.println("Ocorreu um erro: " + e.getMessage());
      } finally {
        System.out.println("Execução finalizada.");
      }
    
      sc.close();
    }
}