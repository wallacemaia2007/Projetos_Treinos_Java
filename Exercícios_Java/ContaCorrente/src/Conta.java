/*Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos: 
número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e 
saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios. */
import java.util.Scanner;
public class Conta {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        Contacorrente contas = new Contacorrente(123456, "Wallace",0);
        int resposta = 1;

        System.out.println("Digite seu nome");
        contas.setNome(leitor.nextLine());
        System.out.println("Qual o número da sua conta?");
        contas.setNumeroConta(leitor.nextInt());
        System.out.println("O seu saldo atual é de: "+contas.getSaldo());

        while (resposta != 3) {
            
            System.out.println("Oque você deseja fazer?\n[ 0 ] Ver saldo atual \n[ 1 ] Sacar \n[ 2 ] Depositar \n [ 3 ] Sair ");
            resposta = leitor.nextInt();
            switch (resposta) {
                case 0:
                System.out.println("O seu saldo atual é de: "+contas.getSaldo());                
                break;
                case 1:
                System.out.println("Quanto irá ser sacado?");
                contas.setSaque(leitor.nextFloat());
                System.out.println("Valor Sacado com sucesso!");
                break;
                
                case 2:
                System.out.println("Quanto será depositado?");                
                System.out.println("Valor depositado com sucesso!");
                break;
                
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida");
                break;
            }
        }
        leitor.close();
        
    }
}
