package Exercícios_Java;
import java.util.Scanner;
public class InversaoDeVariaveis {
    public static void main(String[] args){

        int a;
        int b;
        int c;
        Scanner lScanner = new Scanner(System.in);

        System.out.println("Digite o valor a ser inserido na variável A");
        a = lScanner.nextInt();
        System.out.println("Digite o valor a ser inserido na variável B");
        b = lScanner.nextInt();

        c = b;
        b = a;
        a = c;

        System.out.println("O valor na variável A é:");
        System.out.println(a);
        System.out.println("O valor na variável B é:");
        System.out.println(b);
    
        
        lScanner.close();

    }
}
