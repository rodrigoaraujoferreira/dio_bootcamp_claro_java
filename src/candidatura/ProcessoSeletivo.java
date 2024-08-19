package candidatura;

public class ProcessoSeletivo {
	
	public static void main(String[] args) {
		System.out.println("Processo seletivo");
		analisarCandidatira(1900);
		analisarCandidatira(2000);
		analisarCandidatira(2200);
	}
	
	static void analisarCandidatira(double salarioPretendido) {
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato");
		}else if (salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contra proposta");
		}else {
			System.out.println("Aguardar o resultado dos demais candidatos");
		}
	}

}
