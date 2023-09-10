import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o numero da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite o numero da agencia: ");
        String agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Digite o nome do titular: ");
        String titular = scanner.nextLine();

        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

System.out.println("Olá, " + titular + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia +" , conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

    }
} 
