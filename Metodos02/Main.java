package Metodos02;

/*Crie uma classe publica Conta com os atributos "numero", "saldo" e "limite".
Crie os metodos para sacar, depositar, transferir e consultar o saldo. Crie dois 
objetos para fazer manipulacoes, como transferir, exibir as imformacoes da conta,
etc. */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        
        Scanner leitor = new Scanner(System.in);
        
        Conta c1 = new Conta();
        
        System.out.println("\nDigite o número da conta c1: ");
        c1.numero = leitor.nextInt();
        System.out.println("Digite o saldo da conta c1: ");
        c1.saldo = leitor.nextDouble();
        
        System.out.println("\n<<<C1 : CONTA>>>");
        System.out.println("Número: " + c1.numero);
        System.out.println("Saldo: " + c1.saldo);
        System.out.println("Limite: " + c1.limite);
        
        Conta c2 = new Conta();
        
        System.out.println("\nDigite o número da conta c2: ");
        c2.numero = leitor.nextInt();
        System.out.println("Digite o saldo da conta c2: ");
        c2.saldo = leitor.nextDouble();        
        
        System.out.println("\n<<<C2 : CONTA>>>");
        System.out.println("Número: " + c2.numero);
        System.out.println("Saldo: " + c2.saldo);
        System.out.println("Limite: " + c2.limite);        
        
        
        System.out.println("Digite um valor para transferência (c1 -> c2): ");
        double valorDaTransferencia = leitor.nextDouble();
        boolean resposta = c1.Transferir(valorDaTransferencia, c2);
        
        if(resposta){
            System.out.println("\nTransferindo... " + valorDaTransferencia + " reais");
        }
        else
        {
            System.out.println("\nSaldo insuficiente para transferência ");
        }
        
        System.out.println("\n<<<C1 : CONTA>>>");
        System.out.println("Número: " + c1.numero);
        System.out.println("Saldo: " + c1.saldo);
        System.out.println("Limite: " + c1.limite);
        
        System.out.println("\n<<<C2 : CONTA>>>");
        System.out.println("Número: " + c2.numero);
        System.out.println("Saldo: " + c2.saldo);
        System.out.println("Limite: " + c2.limite);
    }
    
}
