package Candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"Felipe", "Márcia", "Júlia", "Paulo", "Augusto"};
        for (String candidato: candidatos) {
            entrarEmContato(candidato);
        }
    }
    
    static void entrarEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
		boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO!");

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA.");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE " + tentativasRealizadas + " TENTATIVAS REALIZADAS.");
    }

    // Método auxiliar
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }
    
    static void imprimirSelecionados() {
        String [] candidatos = {"Felipe", "Márcia", "Júlia", "Paulo", "Augusto"};
        System.out.println("Imprimindo a lista de candidatos informando o índice de elemento: ");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de número " + (indice+1) + " é " + candidatos[indice]);
        }

       /* 
       System.out.println("Forma abreviada de interação ( for each )");
        for(String candidato : candidatos) {
            System.out.println("O candidato selecionado foi: " + candidato);
        }
        */
        
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"Felipe", "Márcia", "Júlia", "Paulo", "Augusto", "Mônica", "Fabrício", "Mirela", "Daniela", "Jorge"};

        double salarioBase = 2000.0;
        int totalSelecionados = 0;
		int proximoCandidato = 0;

		while (totalSelecionados <5 && proximoCandidato < candidatos.length) {
			String candidato = candidatos[proximoCandidato++];
			double valorPretendido = valorPretendido();

			System.out.println("O candidato " + candidato + " está solicitando " + valorPretendido);

			if (valorPretendido > salarioBase) {
				System.out.println(" O candidato " + candidato + " NÃO foi selecionado ");
			} else {
				System.out.println(" O candidato " + candidato + " foi selecionado ");
				totalSelecionados++;
			}
			
		}
            System.out.println("Total de selecionados: " + totalSelecionados);
            System.out.println("Total de entrevistados: " + proximoCandidato);
    }

    // Método auxiliar
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2400.0);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS...");
        }
    }
}
