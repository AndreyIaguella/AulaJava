package poo;

public class TesteBicicleta {

    public static void main(String[] args){
        Bicicleta caloi = new Bicicleta();
        caloi.nome = "caloi";
        caloi.marcha = 5;
        caloi.modelo = "ABC 123";

        Bicicleta k = new Bicicleta();
        k.nome = "Fast caloi";
        k.modelo = "FAST";
        k.marcha = 3;

        caloi.imprimir();
        k.imprimir();
    }
}
