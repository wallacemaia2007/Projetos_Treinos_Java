package Exercícios_Java;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NadadorClassificacao {
    public static String NadadorClassificacao(int idade){
        String classificacao = "";
        if (idade >= 5 && idade <= 7) {
            classificacao = "Infantil A";
            System.out.println("Você é um nadador "+classificacao);
        }else if (idade >= 8 && idade <=10) {
            classificacao = "Infantil B";
            System.out.println("Você é um nadador "+classificacao);
        }else if (idade >= 11 && idade <=13) {
            classificacao = "Juvenil A";
            System.out.println("Você é um nadador "+classificacao);
        }else if (idade >= 14 && idade <=17) {
            classificacao = "Juvenil B";
            System.out.println("Você é um nadador "+classificacao);
        }else if (idade >= 18 && idade <=25) {
            classificacao = "Sênior";
            System.out.println("Você é um nadador "+classificacao);
        }else{
            System.out.println("Idade fora da faixa etária!");
        }
        return classificacao;
    }
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        int idade;
        try{
            System.out.println("Qual a sua idade?");
            idade = lScanner.nextInt();
            NadadorClassificacao(idade);
        }catch( InputMismatchException e){
            System.out.println("Formato inválido!");
        }
        lScanner.close();
    }
}
