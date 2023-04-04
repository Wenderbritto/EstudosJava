package ClasseAtributosObjeto;

public class Main {
    public static void main(String[] args){

        //Crie um objeto do tipo Conta, chamado c1
        Conta c1 = new Conta();

        //Atribui valores aos atributos
        c1.numero = 1234;
        c1.limite = 200;
        c1.saldo = 1000;

        //Imprime na tela 
        System.out.println("Numero: " + c1.numero);
        System.out.println("Saldo: " + c1.saldo);
        System.out.println("Limite: " + c1.limite);
        
    }
}
