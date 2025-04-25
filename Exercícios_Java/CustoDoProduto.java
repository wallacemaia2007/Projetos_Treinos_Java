package Exercícios_Java;
import java.util.Scanner;

public class CustoDoProduto {
    public static void main(String[] args) {
        
        
        float valorProduto;
        float porcentual;
        Scanner lScanner = new Scanner(System.in);
        
        System.out.println("Qual o valor de custo do produto?");
        valorProduto = lScanner.nextFloat();
        System.out.println("Qual o acrécimo ao produto em porcentagem para ser colocado a venda?");
        porcentual = lScanner.nextFloat();
        System.out.println("O valor de venda do produto será de "+ valorProduto*porcentual+" reais");

        lScanner.close();
        
    }
}
