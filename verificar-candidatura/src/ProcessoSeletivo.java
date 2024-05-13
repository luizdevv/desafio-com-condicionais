import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual sua expectativa salarial?");
        double salario = scanner.nextDouble();
    
        analisarCandidato(salario);

        scanner.close();
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
