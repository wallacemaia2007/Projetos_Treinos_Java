package Exercícios_Java;
import java.util.Scanner;
public class CelsiusParaFahrenheit {
    public static void main(String[] args){
        
        float tempC;
        Scanner lScanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em C°:");
        tempC = lScanner.nextFloat();

        System.out.println("A temperatura em graus F° será de:");
        System.out.println((tempC*9+160)/5);
    
        lScanner.close();
    }
}
