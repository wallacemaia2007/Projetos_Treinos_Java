package Exercícios_Java;
import java.util.Scanner;
public class Operadores {
    public static void main(String[] args){

        int n1;
        int n2;
        Scanner leiScanner = new Scanner(System.in);

        System.out.println("Digite o 1° número:");
        n1 = leiScanner.nextInt();

        System.out.println("Digite o 2° número:");
        n2 = leiScanner.nextInt();
        
        System.out.println("A soma será:");
        System.out.println(n1+n2);
        System.out.println("A subtração será:");
        System.out.println(n1-n2);
        System.out.println("A multiplicação será:");
        System.out.println(n1*n2);
        System.out.println("A divisão será:");
        System.out.println(n1/n2);

        leiScanner.close();

    }
    
}
