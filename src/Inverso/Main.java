package Inverso;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    // Scanner para ler oq o usuário digita
    Scanner scanner = new Scanner(System.in);

    // Passo para ler oq o usuário digitou
    System.out.print("Digite um número com no máximo 3 dígitos: ");
    int valorDigitado = scanner.nextInt();

    // Lógica usada para pegar cada dígito individualmente
    String primeiroDigito = String.valueOf(valorDigitado/100);
    String segundoDigito = String.valueOf((valorDigitado/10) % 10);
    String terceiroDigito = String.valueOf(valorDigitado%10);
  
    // Variável que irá conter o número inteiro invertido
    String valorInverso = terceiroDigito + segundoDigito + primeiroDigito;

    System.out.println(valorInverso);

    System.out.println(110%10);

    scanner.close();

  }
}
