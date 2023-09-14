import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
   
        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();
        double valorFinal = 0;

        valorFinal = jurosCompostos(valorInicial, taxaJuros, periodo, valorFinal);

        System.out.printf("Valor final do investimento: R$ %.2f", valorFinal);
        
        scanner.close();
    }

    static double jurosCompostos(double valorInicial, double taxaJuros, int periodo, double valorFinal) {
        double potencia = Math.pow(1 + taxaJuros, periodo);
        valorFinal = valorInicial * potencia;

        return valorFinal;
    }
}