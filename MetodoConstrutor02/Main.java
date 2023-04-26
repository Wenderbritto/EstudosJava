package MetodoConstrutor02;
/*Crie uma classe publica CONTA com os atributos "numero", "saldo" e "limite". E 
uma classe publica CLIENTE com os atributos "numero", "nome" e "CPF". Crie objetos,
crie construtor, e manipule eles. */
class Main {
    public static void main(String[] args) {

      Cliente cl1 = new Cliente();
      Cliente cl2 = new Cliente(1234);
  
      System.out.println(cl1.numero);
      System.out.println(cl1.nome);
      System.out.println(cl1.cpf);
  
      System.out.println();
  
      System.out.println(cl2.numero);
      System.out.println(cl2.nome);
      System.out.println(cl2.cpf);
    }
  }
