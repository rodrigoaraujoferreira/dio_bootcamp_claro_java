package desafios;

import java.util.Scanner;

public class VerificacaoServico {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);


	        String servico = scanner.nextLine().trim();
	        String entradaCliente = scanner.nextLine().trim();

	        String[] partes = entradaCliente.split(",");
	        String nomeCliente = partes[0];

	        boolean servicoContratado = false;
	        for (int i = 1; i < partes.length; i++) {
	            if (partes[i].trim().equalsIgnoreCase(servico)) {
	                servicoContratado = true;
	                break;
	            }
	        }

	        if (servicoContratado) {
	            System.out.println("Sim");
	        } else {
	            System.out.println("Nao");
	        }

	        scanner.close();
	    }
	}
