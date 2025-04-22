public class Vendedor {

    private String nome;
    private double salarioFixo, ValorDeVendas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getValorDeVendas() {
        return ValorDeVendas;
    }

    public void setValorDeVendas(double valorDeVendas) {
        ValorDeVendas = valorDeVendas;
    }

    double calculo(){
        return (0.15 * ValorDeVendas);
    }
    double calculo2(){
        return calculo() + salarioFixo;
    }
}
