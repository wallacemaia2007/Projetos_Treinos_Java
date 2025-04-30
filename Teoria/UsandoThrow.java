package Teoria;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UsandoThrow {
    public static void main(String[] args){
        int n1;
        int n2;
        int n3;
        String nome;
        Scanner leiScanner = new Scanner(System.in);
    
    try{
        System.out.println("Qual o seu nome:");
        nome = leiScanner.nextLine();
        System.out.println("Digite a 1° nota:");
        n1 = leiScanner.nextInt();
        System.out.println("Digite a 2° nota:");
        n2 = leiScanner.nextInt();
        System.out.println("Digite a 3° nota:");
        n3 = leiScanner.nextInt();
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
        System.out.println("Nome do aluno:");
        System.out.println(nome);
        System.out.println("Média de notas:");
        System.out.println((n1+n2+n3)/3);
        
        throw new Exception("Minhaexceção"); // ela funciona como uma forçada a levar para a exceção criada no Catch!
        
    }catch(Exception Minhaexceção){
        
        System.out.println("Formato inválido!");
        leiScanner.nextLine();   
    
    }
leiScanner.close();
}
}
