package Exercícios_Java;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número para mostra a tabuada!");
        numero = leitor.nextInt();

        for(int contador = 0; contador <=10; contador++){
            int resultado = contador * numero;
            System.out.println(numero+" x "+contador+" = "+resultado);
        }

        leitor.close();

    }
    
}
