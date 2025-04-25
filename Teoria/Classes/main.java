package Teoria.Classes;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        

        Pessoa objetPessoa = new Pessoa(70.0f,1.5f);
        Scanner lScanner = new Scanner(System.in);

        System.out.println("DIgite o peso");
        objetPessoa.setPeso(lScanner.nextFloat());
        System.err.println("Digite a altura");
        objetPessoa.setAltura(lScanner.nextFloat());

        System.out.println("O seu IMC é de:"+objetPessoa.caucularIMC());

        
        

    
    
    }
    
}
