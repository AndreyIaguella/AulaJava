public class IngressoVip extends Ingresso   {

    private double valorAdicional;

    public IngressoVip(double valor, double valorAdicional) {
        super.setValor(valor);
        this.valorAdicional = valorAdicional;
    }
    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String toString() {
        return "IngressoVip{" +
                "ValorAdicional=" + valorAdicional +
                ", Ingresso=  " + super.getValor() +
                ", Ingresso VIP= " + (valorAdicional + super.getValor()) +
                '}';
    }
}
