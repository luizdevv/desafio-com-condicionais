import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual sua expectativa salarial?");
        double salario = scanner.nextDouble();
    
        analisarCandidato(salario);
        selecaoCandidato();

        scanner.close();
    }

    static void selecaoCandidato () {

        String [] candidatos = {"FELIPE", "JOÃO", "LUIZ", "GUSTAVO", "RICARDO", "ALICE", "VITOR", "GUILHERME", "JOSÉ", "FERNANDO"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados <= 5 && candidatoAtual < candidatos.length) {
            
            String candidato = candidatos[candidatoAtual];
            double salario = valorPretendido();

            System.out.println("O candidato " + candidato + ". Solicitou este salário R$: " + salario);

            if (salario <= salarioBase) {
                
                System.out.println( candidato + " foi selecionado.");

                candidatosSelecionados++;
            }

            candidatoAtual++;
        }
    }

    static double valorPretendido () {

        return ThreadLocalRandom.current().nextDouble(1800, 2500);
    }

    static void analisarCandidato (double salarioPretendido) {

        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            
            System.out.println("LIGAR PARA O CANDIDATO.");
        } else if (salarioBase == salarioPretendido) {
            
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA.");   
        } else {

            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS...");
        }
    }
}
