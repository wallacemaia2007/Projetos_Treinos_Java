package Exercícios_Java;
import java.util.Scanner;
public class Salario {
    public static void main(String[] args){

    String nome;
    float salario;
    int vendas;
    Scanner lScanner = new Scanner(System.in);

    System.out.println("Qual o seu nome:");
    nome = lScanner.nextLine();
    System.out.println("Qual o seu salário atual:");
    salario = lScanner.nextFloat();
    System.out.println("Qual o valor total em vendas:");
    vendas = lScanner.nextInt();

    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println("Nome do Funcionário:");
    System.out.println(nome);
    System.out.println("Salário fixo:");
    System.out.println(salario);
    System.out.println("Salário final no mês");
    System.out.println(salario + (0.15*vendas));
    
    lScanner.close();


    }
    
}
