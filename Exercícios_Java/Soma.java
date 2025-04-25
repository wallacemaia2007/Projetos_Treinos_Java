package Exercícios_Java;
import java.util.Scanner;

public class Soma {
    public static void main(String[] args){
        
    int n1;
    int n2;
    Scanner lScanner = new Scanner(System.in);

    System.out.println("DIgite o 1° número");
    n1 = lScanner.nextInt();

    System.out.println("Digite o 2° número");
    n2 = lScanner.nextInt();
    
    System.out.println("A soma é:");
    System.out.println(n1 + n2);

    lScanner.close();

    }
    
}
