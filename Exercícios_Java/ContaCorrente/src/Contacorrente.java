public class Contacorrente {

    //ATRIBUTOS
   private int numeroConta;
   private String nome;
   private float saldo;
   private float deposito;
   private float saque;
   
    

   //MÉTODO CONSTRUTOR
   


   //MÉTODOS ACESSORES
   public int getNumeroConta(){
    return numeroConta;
   }
   public void setNumeroConta(int numeroConta){
    this.numeroConta = numeroConta;
   }

   public String getNone(){
    return nome;
   }
   public void setNome(String nome){
    this.nome = nome;
   }

   public Float getDeposito(){
    return deposito;
   }
   public void setDeposito(float deposito){
    this.deposito = deposito;
   }

   public Float getSaldo(){
    return saldo;
   }
   public void setSaldo(float saldo){
    this.saldo = saldo;
   }

   public Float getSaque(){
    return saque;
   }
   public void setSaque(float saque){
    this.saque = saque;
   }


}
