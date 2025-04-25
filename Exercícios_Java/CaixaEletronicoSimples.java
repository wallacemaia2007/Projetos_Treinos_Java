package Exercícios_Java;
import java.util.Scanner;

public class CaixaEletronicoSimples {
    public static void main(String[] args) {
        
        Scanner lScanner = new Scanner(System.in);
        float saldo = 1000;
        int resposta = 1;
        float DinheiroSacado;
        float DinheiroDepositado;
        
        while (resposta != 4) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Olá, bem-vindo ao caixa eletrônico!\nOque você deseja fazer hoje?");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println(" [ 1 ] Ver saldo\n [ 2 ] Sacar\n [ 3 ] Depositar\n [ 4 ] Sair");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

            resposta = lScanner.nextInt();
            switch (resposta) {

                case 1:
                    System.out.println("\u001B[32m O seu saldo atual é de "+saldo+" reais!\uu001B[0m");
                    break;

                case 2:
                    System.out.println("Para sacar dinheiro preciso da quantidade que será sacada\nQuanto será sacado?");
                    DinheiroSacado = lScanner.nextFloat();

                    if (saldo<DinheiroSacado) {
                        System.out.println("\uu001B[31mVocê não tem saldo o suficiente para sacar essa quantia!\uu001B[0m");
                        
                    }else{
                    saldo -= DinheiroSacado;
                    System.out.println("\uu001B[32mVocê sacou "+DinheiroSacado+" reais!");
                    System.out.println("O seu saldo atual agora é "+saldo+" reais!\uu001B[0m");
                    }
                    break;

                case 3:
                    System.out.println("Para depositar dinheiro na sua conta, primeiro preciso saber quanto será depositado\nQuanto será depositado?");
                    DinheiroDepositado = lScanner.nextFloat();
                    saldo +=DinheiroDepositado;
                    System.out.println("\uu001B[32mVocê depositou "+DinheiroDepositado+" reais na sua conta!");
                    System.out.println("Agora seu saldo atual é de "+saldo+" reais!\uu001B[0m");
                    break;

                case 4:
                    break;

            }
            
        }
        System.out.println("O programa terminou!");
        lScanner.close();



    }
}
