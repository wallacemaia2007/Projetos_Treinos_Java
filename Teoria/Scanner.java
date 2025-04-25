package Teoria;
import java.util.Scanner;

public class Scanner{
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        int idade = leitor.nextInt();
        float cotacaoDolar = leitor.nextFloat();
        double cotacaoEuro = leitor.nextDouble();
        String nome = leitor.nextLine();
        String codigoRua = leitor.next();

        System.out.println("texto que será exibido no console");
        System.out.print("bom dia");

    }
    }