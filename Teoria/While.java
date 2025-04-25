package Teoria;
import java.util.Scanner;
public class While {
    public static void main(String[] args) {
        
        Scanner lScanner = new Scanner(System.in);
        int TotalAlunos = 10;
        while (TotalAlunos > 0) {
            System.out.println("Nome do aluno:");
            String nomeAluno = lScanner.nextLine();
            System.out.println("Idade do aluno:");
            int idadeAluno = lScanner.nextInt();

            System.out.println("O nome do aluno é :"+nomeAluno+ "\nE sua idade é: "+idadeAluno);

            TotalAlunos = TotalAlunos - 1;

            
            
            
        }
        lScanner.close();
    }
    
}
