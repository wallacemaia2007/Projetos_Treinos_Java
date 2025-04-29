public class Contacorrente {

    //ATRIBUTOS
   private int numeroConta;
   private String nome;
   private float saldo;
   private float deposito;
   private float saque;
   
    

   //MÉTODO CONSTRUTOR
   public Contacorrente(int numeroConta, String nome, float saldo){
        this.setNumeroConta(numeroConta);
        this.setNome(nome);
        this.setSaldo(saldo);
        this.setDeposito(deposito);
        this.setSaque(saque);
   }

   //MÉTODOS
   public static String AlterarNome(String nome){
        return nome;
   }

   
   public static float Depositar(float deposito){

   }

   public static float Sacar(float saldo, float saque){
    saldo = saldo - saque;
    return saldo;
   }


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
