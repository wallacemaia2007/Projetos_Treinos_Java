import java.util.Scanner;

public class Cauculadora {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        Operadores objetoOperadores = new Operadores();
        int continuar = 1;

        System.out.println("Digite o 1° valor");
        objetoOperadores.setN1(lScanner.nextInt());
        System.out.println("Digite o 2° valor");
        objetoOperadores.setN2(lScanner.nextInt());

        while (continuar == 1) {

            while (continuar == 1) {
                
                System.out.println("Qual operação você irá realizar?");
                System.out.println("[ 0 ] Soma");
                System.out.println("[ 1 ] Subtração");
                System.out.println("[ 2 ] Multiplicação");
                System.out.println("[ 3 ] Divisão");
                System.out.println("[ 4 ] Escolher novos valores");
        
                int valorOperacao = lScanner.nextInt();
                
                if (valorOperacao == 0) {
                    System.out.println("A soma entre os valores é: "+objetoOperadores.caucularSoma());

                }if (valorOperacao == 1 ) {
                    System.out.println("A subtração entre os valores é: "+ objetoOperadores.caucularSubtração());

                }if (valorOperacao == 2) {
                    System.out.println("A multiplicação dos valores é: "+objetoOperadores.caucularMultiplicação());

                }if (valorOperacao == 3) {
                    System.out.println("A divisão entre os valores é: "+ objetoOperadores.caucularDivisão());

                }if (valorOperacao == 4) {
                    System.out.println("Digite o 1° valor");
                    objetoOperadores.setN1(lScanner.nextInt());
                    System.out.println("Digite o 2° valor");
                    objetoOperadores.setN2(lScanner.nextInt());
                    break;
                }
                if (valorOperacao < 0 || valorOperacao > 4 ) {
                    System.out.println("Opção inválida!");
                }
                System.out.println("Deseja continuar? \n[ 0 ] Não \n[ 1 ] Sim");
                continuar = lScanner.nextInt();
            }if (continuar == 0 ) {
                break;
            }
        }
            lScanner.close();
        }
    }
    

