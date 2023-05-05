public class Conta
{
  protected int numero;
  protected double saldo;

  public Conta(int numero, double saldo)
  {
    this.numero = numero
    this.saldo = saldo;
  }

  public void Sacar(double valor)
  {
    if(valor <= this.saldo)
    {
      this.saldo -= valor; 
    }
  }

  public void SetNumero(int numero)
  {
    this.numero = numero;
  }

  public int GetNumero()
  {
    return this.numero;
  }

  public double GetSaldo()
  {
    return this.saldo;
  }
}