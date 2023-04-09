package AssociacaoDeClasses;

/*Crie uma classe publica:  "Cliente" com o atributo "nome". E crie uma classe publica: 
"CartaoDeCredito" com os atributos "numero", "dataValidade" e e associe com a classe Cliente.
Atribua valores para os atributos das classes e imprima na tela. */
public class Main {
    public static void main(String[] args){

        Cliente cliente1 = new Cliente();
        cliente1.nome = "Maria Andrade";

        CartaoDeCredito cc1 = new CartaoDeCredito();
        cc1.cliente = cliente1;
        cc1.dataValidade = "10/2027";
        cc1.numero = 4605;

        System.out.println("\n<<< Cliente1 >>>");
        System.out.println("Nome: " + cc1.cliente.nome);
    
        System.out.println("\n<<< Cartao de Crédito: cc1 >>>");
        System.out.println("Número: " + cc1.numero);
        System.out.println("Data de Validade: " + cc1.dataValidade);
    
}}
