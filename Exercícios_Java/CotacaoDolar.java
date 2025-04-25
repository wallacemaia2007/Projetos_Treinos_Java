package Exercícios_Java;

import java.util.Scanner;

public class CotacaoDolar {
    public static void main(String[] args){

        float cotacaoDolar;
        float qntDolarConta;
        float QntReal;
        Scanner lScanner = new Scanner(System.in);

        System.out.println("Quantidade em real para ser convertida:");
        QntReal = lScanner.nextFloat();
        System.out.println("Qual a cotação do dólar de hoje?");
        cotacaoDolar = lScanner.nextFloat();
        System.out.println("Quantos dólares há na sua conta?");
        qntDolarConta = lScanner.nextFloat();

        System.out.println("A cotação do dólar hoje está de 1 para "+ cotacaoDolar + " reais");
        System.out.println("Na sua conta bancária você possui "+ qntDolarConta +" dólares" );
        System.out.println("Convertendo os "+QntReal+" reais para dólares você ficará com "+ (qntDolarConta + QntReal/cotacaoDolar) + " dólares na sua conta bancária");
    
        lScanner.close();
    }
    
}
