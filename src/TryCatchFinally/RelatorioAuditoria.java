package TryCatchFinally;

public class RelatorioAuditoria implements Relatorio{
  public void gerarRelatorioMensal(){
      String relatorio = "relatorio";
      System.out.println(relatorio);
  }
  public void gerarRelatorioTransacao(String idTransacao){
      String relatorio = idTransacao + " relatorio";
      System.out.println(relatorio);
  }
  public void exportarCSV(String caminhoArquivo){
      System.out.println("Arquivo CSV exportado " + caminhoArquivo);
  }
}
