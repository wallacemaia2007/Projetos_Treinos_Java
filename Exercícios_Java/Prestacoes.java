package Exercícios_Java;
import java.util.Scanner;
public class Prestacoes {
    public static void main(String[] args) {
        
        int valorProduto;
        int prestacoes;
        double valorFinal;
        Scanner lScanner = new Scanner(System.in);

        System.out.println("Qual o valor do produto?");
        valorProduto = lScanner.nextInt();
        System.out.println("Podemos parcelar este valor até 10 vezes sem juros, e em até 24 vezes com juros de 1% ao mês");
        System.out.println("Em quantas prestações você irá querer pagar?");
        prestacoes = lScanner.nextInt();

        if (prestacoes<=10) {
            valorFinal = valorProduto/prestacoes;
            System.out.println("Você pagará parcelas de "+valorFinal+" reais por mês");
            
        } if (prestacoes>10 && prestacoes<=24) {
            valorFinal = ((valorProduto*Math.pow(1.01, prestacoes))/prestacoes );
            System.out.printf("Com o juros de 1%% ao mês você pagará R$ %.2f por mês em %d prestações\n", valorFinal, prestacoes);
            
        }else{
            System.out.println("Número de prestações incorreto, reinicie o programa.");
        }
        
        lScanner.close();
    }
    
}
