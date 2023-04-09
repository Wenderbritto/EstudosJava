package Metodos01;
/*Crie uma classe Conta com os seguintes atributos publicos: numero, saldo
 e limite. Depois crie os metodos publicos "Depositar", "Sacar", "ConsultarSaldoTotal" e 
 "Transferir". Por fim, crie um objeto do tipo Conta, atribua valores para os 
 atributos e imprima na tela.*/
public class Main {
    public static void main (String[] args) throws Exception{

        Conta c1 = new Conta();
        c1.numero = 1234;
        c1.saldo = 500;

        System.out.println("\n<<< c1 : conta >>>");
        System.out.println("Número: " + c1.numero);
        System.out.println("Saldo: " + c1.saldo);

        c1.depositar(100);
        System.out.println("\nDepositando 100 reais");

        System.out.println("\n<<< c1 : conta >>>");
        System.out.println("Número: " + c1.numero);
        System.out.println("Saldo: " + c1.saldo);

        c1.sacar(200);
        System.out.println("\nSacando 200 reais");

        System.out.println("\n<<< c1 : conta >>>");
        System.out.println("Número: " + c1.numero);
        System.out.println("Saldo: " + c1.saldo);

        double saldoTotal = c1.consultarSaldoTotal();
        System.out.println("\nSaldo total: " + saldoTotal);


    }
    
}
