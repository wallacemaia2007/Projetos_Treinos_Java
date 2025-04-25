import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        Pessoa objetPessoa = new Pessoa();
        
            System.out.println("Cadastrando Cliente!");
            System.out.println("Crie um usuário:");
            objetPessoa.setUsuario(lScanner.nextLine());
            System.out.println("Crie uma senha");
            objetPessoa.setSenha(lScanner.nextLine());


        do {
            System.out.println("Acesso do Cliente!");
            System.out.println("Usuário:");
            objetPessoa.setLoginUsuario(lScanner.nextLine());
            System.out.println("Senha:");
            objetPessoa.setLoginSenha(lScanner.nextLine());

            boolean resUsuário =  objetPessoa.compararLogin();
            boolean resSenha = objetPessoa.compararSenha();

            if (resUsuário == false && resSenha == false ) {
                System.out.println("Usuário e senha incorretas!");
            } else if (resUsuário == false) {
                System.out.println("Usuário incorreto");                         
            } else if (resSenha == false){
                System.out.println("Senha incorreta");
            }  
            
            
        } while (objetPessoa.compararLogin() == false || objetPessoa.compararSenha() == false );

        System.out.println("Acesso concedido!");
        lScanner.close();
        System.err.println("FIM DO PROGRAMA");
    }
    
}
