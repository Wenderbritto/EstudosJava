package ExercicioCalculadorBasica;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
   System.out.println("\n<<<<< CALCULADORA >>>>>");
        System.out.println();
        
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.print("Digite o valor de X: ");
            double x = leitor.nextDouble();
            
            System.out.print("Digite o valor de Y: ");
            double y = leitor.nextDouble();
            
            System.out.println();
            
            Calculadora c1 = new Calculadora(x, y);
            
            double soma = c1.Somar();
            double subtracao = c1.Subtrair();
            double multiplicacao = c1.Multiplicar();
            double divisao = c1.Dividir();
            
            System.out.println("X: " + x);
            System.out.println("Y: " + y);
            
            System.out.println();
            
            System.out.println("Soma: " + soma);
            System.out.println("Subtração: " + subtracao);
            System.out.println("Multiplicação: " + multiplicacao);
            System.out.println("Divisão: " + divisao);
        }
  }
}