public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2365064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("Ocorreu um erro ao formatar o cep");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}