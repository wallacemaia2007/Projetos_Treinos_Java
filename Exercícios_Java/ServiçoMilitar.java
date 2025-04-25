package Exercícios_Java;
import java.util.Scanner;

public class ServiçoMilitar {
    public static void main(String[] args) {
        
        String nome = " ";
        char sexo;
        int idade;
        char resposta = 's';
        Scanner lScanner = new Scanner(System.in);

        while (resposta == 's') {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Cadastrando pessoas no Exército!");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Qual o seu nome?");
            nome = lScanner.nextLine();
            System.out.println("Olá "+nome);
            System.out.println("Qual o seu sexo? [M] ou [F]");
            sexo = lScanner.nextLine().charAt(0);

            if(sexo == 'm'){
                System.out.println("Quantos anos você tem?");
                idade = lScanner.nextInt();
                lScanner.nextLine(); 
                if (idade>=18) {
                    System.out.println("Está na hora de se alistar no tiro de guerra rapaz.");
                }else{
                    System.out.println("Você ainda não tem idade para se alistar.");
                }
            }else if (sexo =='f') {
                System.out.println("Mulheres não precisam se alistar!");
            }else{
                System.out.println("Sexo inválido!");
            }
            System.out.println("Deseja continuar? [S] ou [N]");
            resposta = lScanner.nextLine().charAt(0);
            
        }
        System.out.println("Programa concluído!");
        lScanner.close();
    }
    
}
