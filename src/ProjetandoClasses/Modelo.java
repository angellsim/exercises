package ProjetandoClasses;

import java.util.Scanner;

class CadastroCliente {
  String cpfCliente;
  String nomeCliente;
  String enderecoCliente;
  String telefoneCliente;
  String emailCliente;

  public String getCpf(){ return this.cpfCliente; }
  public String getNome(){ return this.nomeCliente; }
  public String getEndereco(){ return this.enderecoCliente; }
  public String getTelefone(){ return this.telefoneCliente; }
  public String getEmail(){ return this.emailCliente; }

  public void pegarDadosCliente(){
    Scanner scanner = new Scanner(System.in);

    System.out.print("CPF: ");
    this.cpfCliente = scanner.nextLine();

    System.out.print("Nome: ");
    this.nomeCliente = scanner.nextLine();

    System.out.println("Endereço: ");
    this.enderecoCliente = scanner.nextLine();

    System.out.println("Telefone: ");
    this.telefoneCliente = scanner.nextLine();

    System.out.println("E-mail: ");
    this.emailCliente = scanner.nextLine();

    scanner.close();
  }
}

class CadastroCarro {

  String placa;
  String modelo;
  String ano;
  String fabricante;
  String cor;

  public String getPlaca(){ return this.placa;  }
  public String getModelo(){ return this.modelo;  }
  public String getAno(){ return this.ano;  }
  public String getFabricante(){ return this.fabricante;  }
  public String getCor(){ return this.cor;  }

  public void pegarDadosCarro(){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Placa: ");
    this.placa = scanner.nextLine();

    System.out.print("Modelo: ");
    this.modelo = scanner.nextLine();

    System.out.println("Ano: ");
    this.ano = scanner.nextLine();

    System.out.println("Fabricante: ");
    this.fabricante = scanner.nextLine();

    System.out.println("Cor: ");
    this.cor = scanner.nextLine();

    scanner.close();
  }

}