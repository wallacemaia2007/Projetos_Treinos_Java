package Exercícios_Java;
import java.util.Scanner;

public class RendimentoPoupanca {
    public static void main(String[] args) {
        
        int mes;
        float deposito;
        Scanner lScanner = new Scanner(System.in);

        System.out.println("Quanto você depositará na sua poupança?");
        deposito = lScanner.nextFloat();
        System.out.println("Durante quantos meses esse dinheiro ficará lá parado?");
        mes = lScanner.nextInt();

        System.out.println("Certo durante " + mes + " meses você obterá um rendimento de "+ deposito*Math.pow(1+0.0007,mes) + " reais ");

        lScanner.close();

    }
    
}
