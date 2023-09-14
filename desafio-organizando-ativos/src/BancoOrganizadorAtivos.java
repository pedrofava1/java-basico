import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BancoOrganizadorAtivos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList < String > ativos = new ArrayList < > ();

    //Entrada dos tipos de ativos
    int quantidadeAtivos = scanner.nextInt();

    // Entrada dos códigos dos ativos
    for (int i = 0; i <= quantidadeAtivos; i++) {
      String codigoAtivo = scanner.nextLine();
      ativos.add(codigoAtivo);
    }

    ArrayList<String> sortedArray = ordenarAtivos(ativos);
    printAtivos(sortedArray);
    scanner.close();
  }
  static ArrayList <String> ordenarAtivos(ArrayList < String > ativos) {
        Collections.sort(ativos);
        return ativos;
      }

  static void printAtivos(ArrayList < String > sortedArray) {
    for (int i = 0; i < sortedArray.size(); i++) {
      System.out.println(sortedArray.get(i));
    }
  }
}
