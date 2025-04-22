import java.util.Scanner;
public class Exibir {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Vendedor exibir = new Vendedor();

        System.out.print("Digite o nome do vendedor: ");
        exibir.setNome(scanner.nextLine());
        System.out.print("\nDigite o valor de R$ de vendas: ");
        exibir.setValorDeVendas(scanner.nextDouble());
        System.out.print("\nDigite o salario fixo: ");
        exibir.setSalarioFixo(scanner.nextDouble());

        System.out.println("----Dados do Vendedor-----");
        System.out.println("Nome: " + exibir.getNome());
        System.out.printf("Salario fixo: %.2f\n", exibir.getSalarioFixo());
        System.out.println("Valor de vendas: " + exibir.calculo());
        System.out.println("Valor da comissão: " + exibir.calculo2());

    }
}