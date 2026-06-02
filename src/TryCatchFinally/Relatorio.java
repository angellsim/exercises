package TryCatchFinally;

public interface Relatorio{
  void gerarRelatorioMensal();
  void gerarRelatorioTransacao(String idTransacao);
  void exportarCSV(String caminhoArquivo);
}
