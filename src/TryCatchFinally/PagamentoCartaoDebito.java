package TryCatchFinally;

public class PagamentoCartaoDebito implements MetodoDePagamento{ 
  public boolean processarPagamento(double valor, String moeda){
      System.out.println("O pagamento de " + valor + " " + moeda + " está sendo processado");
      return true;
  }
  public String obterComprovante(){
      String comprovante = "Comprovante";
      return comprovante;
  }
  public String validarTransacao(String idTransacao){
      return idTransacao + " valido";
  }
  public double calcularTaxa(double valor){
      double taxa = valor + (0.2 * valor);
      return taxa;
  }
}
