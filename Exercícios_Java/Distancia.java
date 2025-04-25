package Exercícios_Java;
import java.util.Scanner;
public class Distancia {
    public static void main(String[] args){
    
        float distancia;
        float combustivel;
        Scanner lScanner = new Scanner(System.in);

        System.out.println("Digite a distância percorrida:");
        distancia = lScanner.nextFloat();
        System.out.println("Digite a quantidade de combustível gasta:");
        combustivel = lScanner.nextFloat();
        System.out.println("A média de combustível gasta foi de:");
        System.out.print(distancia/combustivel);

        lScanner.close();
    }
    
}
