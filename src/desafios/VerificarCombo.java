package desafios;
import java.util.Scanner;

public class VerificarCombo {

    // Função para verificar se o cliente contratou um combo completo
    public static String verificarComboCompleto(String[] servicosContratados) {
        // Variáveis booleanas para verificar a contratação de cada serviço
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        // Itere sobre os serviços contratados
        for (String i : servicosContratados) {
            // Remova espaços em branco e converta o serviço para minúsculas
            i = i.trim().toLowerCase();

            // Verifique qual serviço foi contratado e ajuste as flags correspondentes
            switch (i) {
                case "movel":
                    movelContratado = true;
                    break;
                case "banda larga":
                    bandaLargaContratada = true;
                    break;
                case "tv":
                    tvContratada = true;
                    break;
            }
        }

        // Verifique se todos os serviços foram contratados
        if (movelContratado && bandaLargaContratada && tvContratada) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de serviços contratados
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] servicosContratados = input.split(",");

        // Verificando se o cliente contratou um combo completo
        String resultado = verificarComboCompleto(servicosContratados);

        // Exibindo o resultado
        System.out.println(resultado);

        // Fechando o scanner
        scanner.close();
    }
}
