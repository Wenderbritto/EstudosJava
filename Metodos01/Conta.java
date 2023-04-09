package Metodos01;

public class Conta {
    public int numero;
    public double saldo;
    public double limite=200;

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if(this.saldo >= valor)
        {
            this.saldo -= valor;
        }
    }

    public double consultarSaldoTotal(){
        return this.saldo + this.limite;
    }

    public void transferir(double valor, Conta destino){
        this.saldo -= valor;
        destino.saldo += valor;
    }



    
}
