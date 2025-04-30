package Exercícios_Java;
import java.util.InputMismatchException;
import java.util.Scanner;
public class AprovadoOuReprovado {
    public static void main(String[] args) {
        
        String nome;
        float nota1;
        float nota2;
        float nota3;
        float media;
        Scanner lScanner = new Scanner(System.in);

        try{

            System.out.println("Qual o seu nome?");
            nome = lScanner.nextLine();
            System.out.println("Nota 1:");
            nota1 = lScanner.nextFloat();
            System.out.println("Nota 2:");
            nota2 = lScanner.nextFloat();
            System.out.println("Nota 3:");
            nota3 = lScanner.nextFloat();
            media = (nota1+nota2+nota3)/3;
            
            
            if (media>=7) {
                System.out.println(nome);
                System.out.println("Sua média foi de "+media);
                System.out.println("Você foi Aprovado!");   
            }
            if (media<=5) {
                System.out.println(nome);
                System.out.println("Sua média foi de "+media);
                System.out.println("Você foi Reprovado!");
            }
            if (media>5 && media<7) {
                System.out.println(nome);
                System.out.println("Sua média foi de "+media);
                System.out.println("Você está de recuperação!");
            }
        } catch (InputMismatchException exception){
            System.out.println("Formato inválido!");
        }
            lScanner.close();
    
    }
    
}
