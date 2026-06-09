package ClassesObjetosModulos;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nome: ");
    String nomeAluno = scanner.nextLine();

    System.out.print("Endereço: ");
    String enderecoAluno = scanner.nextLine();

    System.out.print("Telefone: ");
    String telefoneAluno = scanner.nextLine();

    System.out.print("E-mail: ");
    String emailAluno = scanner.nextLine();

    System.out.print("Matrícula: ");
    String matriculaAluno = scanner.nextLine();

    Aluno aluno1 = new Aluno(nomeAluno, enderecoAluno, telefoneAluno, emailAluno, matriculaAluno);

    System.out.print(aluno1.getNome() + " | " + aluno1.getEndereco() + " | " + aluno1.getTelefone() + " | " + aluno1.getEmail() + " | " + aluno1.getMatricula());

    scanner.close();

  }  
}
