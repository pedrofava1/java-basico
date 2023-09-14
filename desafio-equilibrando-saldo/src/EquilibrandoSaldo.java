import java.util.Scanner;
import java.util.Locale;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

        saldoAtual = depositar(saldoAtual, valorDeposito);
        saldoAtual = retirar(saldoAtual, valorRetirada);
        scanner.close();
        
        System.out.printf("Saldo atualizado na conta: %.1f", saldoAtual);
    }
    static double depositar(double saldoAtual, double valorDeposito) {
        saldoAtual = saldoAtual + valorDeposito;

        return saldoAtual;
    }
    
    static double retirar(double saldoAtual, double valorRetirada) {
        saldoAtual = saldoAtual - valorRetirada;

        return saldoAtual;
    }
}