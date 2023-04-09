package ClassesAtributosObjetos02;

/* Crie as seguintes classes publicas: CONTA, AGENCIA, CLIENTE e FUNCIONARIO. Elas devem ter os 
seguintes atributos, CONTA: "numero" e "saldo", AGENCIA: "numero", CLIENTE: "codigo" e "nome", 
FUNCIONARIO: "codigo", "nome" e "salario". Crie objeto para cada um e atribua valores para cada 
um e imprima na tela cada uma delas. */

public class Main {
    public static void main(String[] args){


        //Declara uma variável do tipo Conta = Instância o objeto.
        Conta c1 = new Conta();
        //Atribui valores para os atributos do objeto. 
        c1.numero = 1234;
        c1.saldo = 4500f;
        System.out.println("Conta");
        System.out.println("Número: " + c1.numero);
        System.out.println("Saldo: "+ c1.saldo);
        System.out.println();

        Agencia ag1 = new Agencia();
        ag1.numero = 0001;
        System.out.println("Agência: " + ag1.numero);
        System.out.println();

        Cliente cli = new Cliente();
        cli.codigo = 001;
        cli.nome = "João Silva";
        System.out.println("Cliente");
        System.out.println("Código: " + cli.codigo);
        System.out.println("Nome: " + cli.nome);
        System.out.println();

        Funcionario fun = new Funcionario();
        fun.codigo = 002;
        fun.nome = "Paulo Souza";
        fun.salario = 2500f;
        System.out.println("Funcionário");
        System.out.println("Código: " + fun.codigo);
        System.out.println("Nome: " + fun.nome);
        System.out.println("Salário: " + fun.salario);



    
    
}}
