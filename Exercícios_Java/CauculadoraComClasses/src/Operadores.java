public class Operadores {
    private int n1;
    private int n2;



    //OPERAÇÕES
    
    public int caucularSoma(){
        int res = n1 + n2;
        return res;
    }
    public int caucularSubtração(){
        int res = n1 - n2;
        return res;
    }
    public int caucularMultiplicação(){
        int res = n1 * n2;
        return res;
    }
    public int caucularDivisão(){
        int res = n1 / n2;
        return res;
    }





    //METODOS ACESSORES
    public void setN1(int n1){
        this.n1 = n1;
    }
    public int getN1(){
        return n1;
    }
    public void setN2(int n2){
        this.n2 = n2;
    }
    public int getN2(){
        return n2;
    }
}
