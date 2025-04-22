public class Combustivel {

    float combustivelGasto, km;

    public float getCombustivelGasto() {
        return combustivelGasto;
    }

    public void setCombustivelGasto(float combustivelGasto) {
        this.combustivelGasto = combustivelGasto;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    double calcularMedia(){
        return(combustivelGasto / km);
    }
}
