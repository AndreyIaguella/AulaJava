public class Ingresso  {
    private double valor;

    Ingresso(double valor){
        this.valor = valor;
    }

    public Ingresso(){

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    @Override
    public String toString(){
        return "Ingresso{Normal = " + valor + "}";
    }
}
