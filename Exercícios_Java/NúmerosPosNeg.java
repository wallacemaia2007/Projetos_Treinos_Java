package Exercícios_Java;
import java.util.Scanner;

public class NúmerosPosNeg {
    public static void main(String[] args) {
        
        char resposta = 's';
        Scanner lScanner = new Scanner(System.in);

        while (resposta == 's' || resposta == 'S') {
            System.out.println("Digite um número");
            int num = lScanner.nextInt();
            if (num<0) {
                System.out.println("O número "+num+" é negativo");
            }if (num == 0) {
                System.out.println("O número é igual a zero");
            }else{
                System.out.println("O número"+num+" é positivo");
            }
            System.out.println("Deseja continuar? [s] ou [n]");
            resposta = lScanner.next().charAt(0);
            
        }
        System.out.println("Programa concluído!");
        lScanner.close();
    }
    
}
