import java.util.Scanner;
public class Automovel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Combustivel automovel = new Combustivel();

        System.out.print("Digite quanto combustivel o carro gastou: ");
        automovel.setCombustivelGasto(scanner.nextFloat());
        System.out.print("\nDigite o quantos km foram percorridos: ");
        automovel.setKm(scanner.nextFloat());

        System.out.print("\nMédia por litro: " + automovel.calcularMedia());

    }
}
