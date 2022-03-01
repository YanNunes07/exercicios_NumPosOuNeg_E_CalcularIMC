package model;



public class Numero {
   public int valor;



    public String testarValor(){
        if (this.valor > 0){
            return "valor é possitivo";
        }else if (this.valor<0){
            return "valor negativo";
        }else {
            return "valor nulo";
        }
    }

    @Override
    public String toString() {
        return "\nO valor digitado: "+this.valor+
                "\nResultado:" + this.testarValor();
    }
}
