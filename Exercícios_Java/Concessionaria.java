package Exercícios_Java;
import java.util.Scanner;

/*A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça 
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O 
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O 
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. 
Informar total de carros com ano até 2000 e total geral; */

public class Concessionaria {
    public static void main(String[] args) {
        
        
        Scanner leitor = new Scanner(System.in);
        int AnoDoveiculo;
        char resposta;
        float desconto,ValorDoCarro;
        int CarrosMenor2000 = 0,TotalDeCarros = 0;
      
        while (true) {

            System.out.println("Qual o valor do carro que você gostaria? ");
            ValorDoCarro = leitor.nextFloat();

            while (true) {
                
                System.out.println("Qual o ano do carro você gostaria?");
                AnoDoveiculo = leitor.nextInt();
                if (AnoDoveiculo > 2000 && AnoDoveiculo <= 2025) {
                    desconto = 7f/100;
                    break;
                }else if (AnoDoveiculo>1980 && AnoDoveiculo<=2000) {
                    desconto = 12f/100;
                    CarrosMenor2000 += 1;
                    break;
                }else{
                    System.out.println("Não possuimos carro para esse ano!");
                }
            }

            Float ValorFinal = ValorDoCarro - (ValorDoCarro*desconto);

            System.err.println("O descoonto no seu veículo sairá por "+desconto+ " reais");
            System.out.println("O carro do ano "+AnoDoveiculo+" aqui na concessionária CARANGO VELHO sairá por "+ ValorFinal+" reais com o desconto!");
            TotalDeCarros  += 1;

            System.out.println("Deseja pesquisar por mais carros?");
            resposta = leitor.next().charAt(0);
            if (resposta == 'N' || resposta == 'n') {
                break;
            }
        }
        System.err.println("Total de carros informados: "+ TotalDeCarros);
        System.out.println("Total de carros do ano menor que 2000 informados: "+ CarrosMenor2000);
        leitor.close();
        System.err.println("FIM DO PROGRAMA!");

    }
}
