import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("digite um cep : ");
        var cep  = leitura.nextLine();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);

            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);

            } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando na roda");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
