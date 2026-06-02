// Aqui adicionei o package por conta de estar localizado em uma pasta cheio de outros exercícios diferentes
package SeqBemFormada;

// Importei Scanner e ArrayList pq foram funções que eu utilizei (pra ler input do user e criar lista)
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    // Criei uma lista pra ir adicionando o que o usuário fosse digitando
    ArrayList<String> valorDigitado1 = new ArrayList<String>();

    // Criei uma "str" vazia no formato de string q eu usaria um método de join nela depois pra pegar a string completa da lista
    String str = "";

    for (int i = 0; i < 100; i++){

      System.out.print("Digite: ");

      String valorDigitado2 = scanner.nextLine();

      if (valorDigitado2.equals("X") || valorDigitado2.equals("x")){
        break;
      }

      valorDigitado1.add(valorDigitado2);

      str = String.join("", valorDigitado1);      
    }

    int contPar1 = 0;
    int contPar2 = 0;

    int contCol1 = 0;
    int contCol2 = 0;

    for (int i = 0; i < str.length(); i++){

      if (i == 0 && valorDigitado1.get(i).equals(")") || i == 0 && valorDigitado1.get(i).equals("]")){
        System.out.println("MALFORMADA");
        break;
      } 

      if (valorDigitado1.get(i).equals("(")){   contPar1++;  }
      else if (valorDigitado1.get(i).equals(")")){   contPar2++;  }
      else if (valorDigitado1.get(i).equals("[")){   contCol1++;  }
      else if (valorDigitado1.get(i).equals("]")){   contCol2++;  }

      if (contPar2 > contPar1 || contCol2 > contCol1){
        System.out.println("MALFORMADA");
        break;
      }
    }
    scanner.close();
  }
}
