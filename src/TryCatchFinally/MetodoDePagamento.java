package TryCatchFinally;

public interface MetodoDePagamento{
  boolean processarPagamento(double valor, String moeda);
  String obterComprovante();
  String validarTransacao(String idTransacao);
  double calcularTaxa(double valor);
}
