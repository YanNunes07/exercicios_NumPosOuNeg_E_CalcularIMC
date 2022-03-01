package model;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso, altura;

    public Pessoa(){
    }

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularImc(){
        return this.peso/(Math.pow(altura,2));
    }

    public String verificarIdade(){
        if(this.idade >= 18){
            return "Voce é maior de idade.";
        }else{
            return "Voce precisa de um titular para fazer o cadastro.";
        }
    }

    @Override
    public String toString() {
        return "\nNome:"+this.nome+
                "\nIdade: "+this.idade+
                "\nPeso: "+this.peso+
                "\nAltura: "+this.altura+
                "\nIMC: "+this.calcularImc()+
                "\nResultado "+verificarIdade();
    }

}
