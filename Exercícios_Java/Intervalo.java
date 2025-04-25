package Exercícios_Java;
import java.util.Scanner;
public class Intervalo {
    public static void main(String[] args){

        int valor;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor:");
        valor = leitor.nextInt();

        if (valor >= 100 && valor <=200) {
            System.err.println("O número está no intervalo");
            
        }else{
            System.err.println("O número não está no intervalo");
        }


        leitor.close();

    }
    
}
