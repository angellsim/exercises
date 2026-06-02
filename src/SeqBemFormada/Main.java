// Aqui adicionei o package por conta de estar localizado em uma pasta cheio de outros exercícios diferentes
package SeqBemFormada;

/*  Importei Scanner e ArrayList pq foram funções que eu utilizei (pra ler input do user e criar lista)
Detalhe que eu tentei importar um método .join do apache pra conseguir aplicar minha ideia mas não deu certo
*/
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

    // Loop FOR com máximo de 100 caracteres que o usuário pode digitar
    for (int i = 0; i < 100; i++){

      System.out.print("Digite apenas 1 caractere: ");

      /* Aqui eu leio o que o usuário digita (eu pensei depois em fazer por "char" ao invés de String porque aí)
      eu não cortava pela raiz a exceção do usuário digitar mais de um caractere de uma vez mas como já tava muito longe eu deixei assim mesmo */

      String valorDigitado2 = scanner.nextLine();

      // Verifico se o valor digitado é X ou x pra quebrar o for loop e já começar a validação

      if (valorDigitado2.equals("X") || valorDigitado2.equals("x")){
        break;
      }

      // adiciono na lista o valor que o usuário digitar (caso ele não tenha quebrado o loop)
      valorDigitado1.add(valorDigitado2);

      // uso o método join pra agrupar os elementos da lista e formar uma única sentença
      str = String.join("", valorDigitado1);      
    }

    /*  Aqui eu fiz uma lógica de que: para funcionar primeiramente, a quantidade de parênteses e colchetes
    devem ser idênticas porque se for ímpar já assume que tem algo errado 
    Detalhe: contPar1 -- Parênteses Aberto e contPar2 -- Parênteses Fechado (mesma coisa p/ contCol 1 e 2) */
    int contPar1 = 0;
    int contPar2 = 0;

    int contCol1 = 0;
    int contCol2 = 0;

    boolean correto = true;

    // loop de verificação caractere por caractere
    for (int i = 0; i < str.length(); i++){

      // Primeiro caso de exceção é se o primeiro valor digitado pelo usuário é o parênteses fechado ou colchete fechado
      if (i == 0 && valorDigitado1.get(i).equals(")") || i == 0 && valorDigitado1.get(i).equals("]")){
        System.out.println("MALFORMADA");
        correto = false;
        break;
      } 

      // Aqui ele começa a fazer a verificação da lógica e adicionar 1 valor p/ cada trequinho
      if (valorDigitado1.get(i).equals("(")){   contPar1++;  }
      else if (valorDigitado1.get(i).equals(")")){   contPar2++;  }
      else if (valorDigitado1.get(i).equals("[")){   contCol1++;  }
      else if (valorDigitado1.get(i).equals("]")){   contCol2++;  }

      // outro método de verificação onde se o contador das fechadas estiver maior que o da aberta já pode finalizar que tá errado de qualquer jeito então nem precisa verificar o restante
      if (contPar2 > contPar1 || contCol2 > contCol1){
        System.out.println("MALFORMADA");
        correto = false;
        break;
      }

      // Verificação do CORRETO -- se a quantidade deles forem iguais, pode zerar (eu não lembro pq eu fiz isso mas eu sei que depois que adicionei não vi mais nenhum erro)
      if (contPar1 == contPar2){
        contPar1 = 0;
        contPar2 = 0;
      } else if (contCol1 == contCol2) {
        contCol1 = 0;
        contCol2 = 0;
      }
    }

    // outra verificação porque SE o usuario digitar todos fechando e abrindo corretamente porém deixar 1 faltando, ele não da bem-formada nem digita mal-formada pelos outros, então teve que vir aqui mesmo
    if (contPar1 == contPar2 && contCol1 == contCol2 && correto){
      System.out.println("BEM-FORMADA");
    } else {
      if (correto) { // Se passar das verificações mas ainda estiver incorreto, ele garante o "Malformada"
        System.out.println("MALFORMADA");
      }
    }

    scanner.close();
  }
}
