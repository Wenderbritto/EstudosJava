package SobrecargaMetodos;

public class Conta {
    public int numero;
    public double saldo;
    
    public void imprimeExtrato()
    {
        this.imprimeExtrato(15);
    }
    
    public void imprimeExtrato(int dias)
    {
        System.out.println("Executou imprimeExtrato(int dias)"); 
    }
}
