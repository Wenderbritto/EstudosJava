package MetodoConstrutor02;

public class Conta {

    public int numero;
    public double saldo;
    public double limite;

    public Conta()
    {
      System.out.println("construtor padrão exec.");
    }
  
    public Conta(int numero)
    {
      this.numero = numero;
    }
    
    public Conta(int numero, double saldo)
    {
      this(numero);
      this.saldo = saldo;
    }

}
