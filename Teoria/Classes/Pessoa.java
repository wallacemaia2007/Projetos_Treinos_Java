package Teoria.Classes;

public class Pessoa {

    private float peso;
    private float altura;

    
    //MÉTODO
    public float caucularIMC(){
        float imc = peso/ (altura*altura);
        return imc;
    }
    
    //MÉTODOS ACESSORES
    public void setPeso(float peso){
        this.peso = peso;
    }
    public float getPeso(){
        return peso;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public float getAltura(){
        return altura;
    }

    // MÉTODO CONSTRUTOR
    // QUANDO O MÉTODO MAIN É CRIADO O MÉTODO CONSTRUTOR É PUXADO
    public Pessoa(float peso,float altura){
        this.peso = peso;
        this.altura = altura;
    }
}
