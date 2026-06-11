package MaximoDivisorComum;

public class MaximoDivisorComum {

  int num1;
  int num2;

  public MaximoDivisorComum(int num1, int num2){
    this.num1 = num1;
    this.num2 = num2;
  }

  public int obterPrimeiroNumero(){ return this.num1; }
  public int obterSegundoNumero(){ return this.num2; }
  public int calcular(){
    while (this.num2 != 0){
      int resto = num1 % num2;
      num1 = num2;
      num2 = resto; 
    }

    return num1;
  }


  public static void main(String[] args) {
    MaximoDivisorComum mdc;
    mdc = new MaximoDivisorComum(3, 6);

    System.out.println(String.format("O MDC entre %d e %d é %d", mdc.obterPrimeiroNumero(), mdc.obterSegundoNumero(), mdc.calcular()));

    mdc = new MaximoDivisorComum(15, 25);
    System.out.println(String.format("O MDC entre %d e %d é %d", mdc.obterPrimeiroNumero(), mdc.obterSegundoNumero(), mdc.calcular()));
    
    mdc = new MaximoDivisorComum(4, 9);
    System.out.println(String.format("O MDC entre %d e %d é %d", mdc.obterPrimeiroNumero(), mdc.obterSegundoNumero(), mdc.calcular()));
  }
}
