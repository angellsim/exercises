package ClassesObjetosModulos;

class Aluno {

  String nome;
  String endereco;
  String telefone;
  String email;
  String matricula;

  public Aluno(String nome, String endereco, String telefone, String email, String matricula){
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
    this.email = email;
    this.matricula = matricula;
  }

  public String getNome(){  return nome;  }
  public String getEndereco(){  return endereco;  }
  public String getTelefone(){  return telefone;  }
  public String getEmail(){  return email;  }
  public String getMatricula(){  return matricula;  }

  public void setNome(String nome){ this.nome = nome; }
  public void setEndereco(String endereco){ this.endereco = endereco; }
  public void setTelefone(String telefone){ this.telefone = telefone; }
  public void setEmail(String email){ this.email = email; }
  public void setMatricula(String matricula){ this.matricula = matricula; }


}