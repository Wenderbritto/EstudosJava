public class Corrente extends Conta
{
  private double limite = 200;

  public Corrente(int numero, double saldo, double limite)
  {
    super(numero, saldo);
    if(limite != 0){
       this.limite = limite;
    }
  }

  
  public void Sacar(double valor)
  {
    if(valor <= this.saldo + this.limite)
    {
      if(valor <= this.saldo)
      {
        this.saldo -= valor;
      }
      else
      {
        valor -= this.saldo;
        this.saldo = 0;
        this.limite -= valor;
      }
    }
  }

  public double GetLimite()
  {
    return this.limite;
  }
}