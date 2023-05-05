package HerancaContaECorrente;

class Main {
    public static void main(String[] args) {
  
      Conta c1 = new Conta(123, 1000);
  
      c1.Sacar(500);
  
      System.out.println("Saldo: " + c1.GetSaldo());
  
      Corrente cc1 = new Corrente(345, 1500, 0);
  
      cc1.Sacar(1600);
  
      System.out.println("Saldo: " + cc1.GetSaldo());
      System.out.println("Limite: " + cc1.GetLimite()); 
      
    }
  }
