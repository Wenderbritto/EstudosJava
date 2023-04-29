package MetodoGetSet;

public class Main {
    public static void main(String[]args){

        Conta c1 = new Conta();

        c1.setNumero(1234);
        c1.setSaldo(1000);
        c1.setLimite(200);

        int numero = c1.getNumero();
        System.out.println("Numero: "+numero);
        System.out.println("Saldo: "+c1.getSaldo());
        System.out.println("Limite: "+c1.getLimite());

        








    }
}
