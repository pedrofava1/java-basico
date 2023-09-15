import java.util.Scanner;

public class Deposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0;

            double valor = scanner.nextDouble();

            if (valor == 0) {
                System.out.println("Encerrando o programa...");
            }

            else if (valor < 0) {
                System.out.println("Valor invalido! Digite um valor maior que zero.");
            } 

            else {
                saldo += valor; 
                System.out.println("Deposito realizado com sucesso!");
                System.out.printf("Saldo atual: R$ %.2f\n", saldo);
            }
        scanner.close();
    }
}