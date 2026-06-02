package SeqBemFormada;

import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    ArrayList<String> valorDigitado1 = new ArrayList<String>();

    String str = "";

    for (int i = 0; i < 100; i++){

      System.out.println("Digite: ");

      String valorDigitado2 = scanner.nextLine();

      if (valorDigitado2.equals("X") || valorDigitado2.equals("x")){
        break;
      }

      valorDigitado1.add(valorDigitado2);

      str = String.join("", valorDigitado1);      
    }

    System.out.println(valorDigitado1);
    System.out.println(str);

    scanner.close();
  }
}
