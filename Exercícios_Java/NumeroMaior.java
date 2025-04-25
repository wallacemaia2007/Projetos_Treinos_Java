package Exercícios_Java;
import java.util.Scanner;
public class NumeroMaior {
    public static void main(String[] args) {
        
        int num1;
        int num2;
        Scanner lScanner = new Scanner(System.in);

        System.out.println("Digite o 1° valor:");
        num1 = lScanner.nextInt();
        System.out.println("Digite o 2° valor:");
        num2 = lScanner.nextInt();
        if (num1>num2) {
            System.out.println("O número "+num1+" é maior que "+num2);
            
        }if (num2>num1) {
            System.out.println("O número "+num2+" é maior que "+num1);
            
            
        }if (num1 == num2) {
            System.out.println("Os números são iguais");
        }
        lScanner.close();

    }
}
