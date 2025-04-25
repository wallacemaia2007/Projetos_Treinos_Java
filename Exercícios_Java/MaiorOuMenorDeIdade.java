package Exercícios_Java;
import java.util.Scanner;

public class MaiorOuMenorDeIdade {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        int ContadorMaior = 0;
        int ContadorMenor = 0;
        int idade;
        for(int c = 1;c <= 10;c++){
            System.out.println("Qual a sua idade");
            idade = lScanner.nextInt();
            if (idade <18) {
                System.out.println("Você é menor de idade");
                ContadorMenor ++;
            }else{
                System.out.println("Você é maior de idade");
                ContadorMaior ++;
            }
        }
        System.out.println("Cadastro concluído!");
        System.out.println("Número total de maiores de idade:"+ContadorMaior);
        System.out.println("Número total de menores de idade:"+ContadorMenor);
        lScanner.close();

    }
    
}
