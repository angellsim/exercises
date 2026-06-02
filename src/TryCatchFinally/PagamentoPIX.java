package TryCatchFinally;

public class PagamentoPIX implements MetodoDePagamento{
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
  @Override
  public double calcularTaxa(double valor){
    double taxa = 0;
    return taxa;
  }
}