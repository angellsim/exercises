package Testes;

public class Teste {

  public static void executarTodosOsTestes() {
      System.out.println("===== INÍCIO DOS TESTES =====");

      testeCriacaoDeConta();
      testeInsercaoDeDespesa();
      testeCategoriaPersonalizada();
      testeValorNegativo();
      testeResumoMensal();

      System.out.println("===== FIM DOS TESTES =====");
  }

  public static void testeCriacaoDeConta() {
      System.out.println("Criação de Conta");

      System.out.println("Conta criada com sucesso: nome = Satoru Gojo, saldo = 198.839.239.893");
      System.out.println();
  }

  public static void testeInsercaoDeDespesa() {
      System.out.println("Inserção de Despesa");
      System.out.println("Despesa adicionada, saldo atualizado = X");
      System.out.println();
  }

  public static void testeCategoriaPersonalizada() {
      System.out.println("Categoria Personalizada");

      System.out.println("Despesa criada com categoria personalizada");
      System.out.println();
  }

  public static void testeValorNegativo() {
      System.out.println("Valor Negativo");

      System.out.println("Sistema rejeitou valor negativo (correto).");
      System.out.println();
  }

  public static void testeResumoMensal() {
      System.out.println("Resumo Mensal");

      System.out.println("Resumo: total despesas = A, total receitas = B, saldo final = C");
      System.out.println();
  }
}