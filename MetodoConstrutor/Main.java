//Classe principal
class Main {
  public static void main(String[] args) {

    //Cria um objeto "pessoa" e passa os valores dos parametros
    Pessoa pessoa = new Pessoa("João", 52, 1.88f);

    //Chama o método criado na classe pessoa para imprimir os dados
    pessoa.imprimirDados();
  }
}