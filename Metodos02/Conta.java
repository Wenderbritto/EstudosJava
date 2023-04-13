package Metodos02;

public class Conta {

    public int numero;
    public double saldo;
    public double limite = 200;

    public boolean Sacar(double valor)
    {
        if(this.saldo >= valor){
            this.saldo -= valor;
            
            return true;
        }
        else
        {
            return false;
        }  
    }

    public void Depositar(double valor)
    {
        this.saldo += valor;
    }

    public double ConsultarSaldoTotal()
    {
        return this.saldo + this.limite;
    }
    
    public boolean Transferir(double valor, Conta destino)
    {
        if(this.saldo >= valor){
           this.saldo -= valor;
           destino.saldo += valor;
           
           return true;
        }
        else
        {
            return false;
        }
    }

}