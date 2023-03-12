//Criou uma classe chamada "Pessoa"
public class Pessoa{

  //Criou os atributos da classe Pessoa
  private String nome;
  private int idade;
  private float altura;

  //Criar o Método Construtor
  //<Modificado> <NomeDaClasse> (parametros)

  //Criou o método construtor e passou alguns parametros
  public Pessoa(String nome, int idade, float altura) {

    //Assim que for executado o programa vai aparecer essa mensagem
    System.out.println("=====Cidadão=====");

    //O atributo "nome" recebe a variável "nome" do construtor
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;

  }
  
  //Método criado para imprimir os dados do cidadão. 
  public void imprimirDados(){
    System.out.format("Nome: %s\nIdade: %d\nAltura: %.2f", 
    nome, idade, altura);
 }

}

