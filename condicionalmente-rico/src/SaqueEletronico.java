import java.util.Scanner;

public class SaqueEletronico {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int saldoTotal = scanner.nextInt();
    int valorSaque = scanner.nextInt();
    
    saldoTotal = sacar(saldoTotal, valorSaque);

    scanner.close();
  }
  
  static int sacar(int saldoTotal, int valorSaque){
  
    if(saldoTotal >= valorSaque){
      saldoTotal -= valorSaque;
      System.out.println("Saque realizado com sucesso. Novo saldo: " + saldoTotal);
      return saldoTotal;
    }
    System.out.println("Saldo insuficiente. Saque nao realizado!");
    return saldoTotal;
  }
}