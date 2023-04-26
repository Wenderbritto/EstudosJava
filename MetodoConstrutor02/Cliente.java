package MetodoConstrutor02;

public class Cliente {

    public int numero;
    public String nome;
    public int cpf;

    public Cliente()
    {
      System.out.println("executando const. padrao");
    }
  
    public Cliente(int numero)
    {
      this.numero = numero; 
    }

    
}
