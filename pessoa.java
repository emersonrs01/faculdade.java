public class pessoa{
  private String nome;
  private String endereco;
  private String bairro;
  private int cep;
  private String cidade;
  private String estado;

  public pessoa(String nome,String endereco,String bairro,int cep,String cidade,String estado){
    this.nome = nome;
    this.endereco = endereco;
    this.bairro = bairro;
    this.cep = cep;
    this.cidade = cidade;
    this.estado = estado;
  }
  public String getNome(){
    return nome;
  }
  public String getEndereco(){
    return endereco;
  }
  public String getBairro(){
    return bairro;
  }
  public int getCep(){
    return cep;
  }
  public String getCidade(){
    return cidade;
  }
  public String getEstado(){
    return estado;
  }
}