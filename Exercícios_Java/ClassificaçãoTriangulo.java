package Exercícios_Java;
import java.util.Scanner;

public class ClassificaçãoTriangulo {
    public static void main(String[] args) {
            /*Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo. 
        Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno. 
        Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos 
        outros dois lados.  
        a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;  
        b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais. 
        c. Triângulo equilátero é também isóscele;  
        d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;*/
        
        Scanner leitor = new Scanner(System.in);
        float lado1 , lado2 , lado3;

        System.out.println("Digite o 1° lado: ");
        lado1 = leitor.nextFloat();
        System.out.println("Digite o 2° lado: ");
        lado2 = leitor.nextFloat();
        System.out.println("Digite o 3° lado: ");
        lado3 = leitor.nextFloat();

            if (lado1 + lado2 > lado3 && lado3 + lado2 > lado1 && lado3 + lado1 > lado2) {
                System.out.println("Os lados forman um triângulo!");    
                if (lado1 == lado2 && lado2 == lado3) {
                    System.out.println("O triangulo é Equilátero\nMas tambem é Isóceles!");
                }else if (lado1 == lado2 || lado2 == lado3) {
                    System.out.println("O triangulo é Isóceles!");
                }else{
                    System.out.println("O triângulo é Escaleno!");
                }
            }else{
                System.out.println("As medidas não formam um triângulo!");               
            }
    leitor.close();    
    }
}
