package ProjetandoClasses;

public class Controle {
  public static void main(String[] args) {

    CadastroCliente cliente1 = new CadastroCliente();
    CadastroCarro carro1 = new CadastroCarro();

    cliente1.pegarDadosCliente();


    System.out.println(cliente1.getCpf() + " | " + cliente1.getEmail() + " | " + cliente1.getEndereco() + " | " + cliente1.getNome() + " | " + cliente1.getTelefone());

  }
}
