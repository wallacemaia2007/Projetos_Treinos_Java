package Exercícios_Java;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Fatorial {
    public static int CalcularFatorial(int numero){
        int resultado=1;
        for(int contador = 1;contador<=numero;contador++){
            resultado *= contador;
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        while (true) {
            try{
                System.out.print("Digite um número: ");
                int numero = leitor.nextInt();

                int Fatorial = CalcularFatorial(numero);
                System.out.println(numero+"! = "+Fatorial);
                break;
            }catch(InputMismatchException e){
                System.out.println("Formato inválido!");
                leitor.nextLine();
            }
        }
        leitor.close();
    }
}