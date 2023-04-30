package ExercicioCalculadorBasica;

public class Calculadora {

    public double A;
    public double B;

    public Calculadora(double A, double B){
        this.A = A;
        this.B = B;
    }

    public double Somar(){
        return this.A + this.B;
    }
    
    public double Subtrair(){
        return this.A - this.B;
    }

    public double Dividir(){
        return this.A / this.B;
    }

    public double Multiplicar(){
        return this.A * this.B;
    }
}
