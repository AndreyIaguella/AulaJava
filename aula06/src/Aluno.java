import java.util.Scanner;
public class Aluno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Notas aluno = new Notas();

        System.out.print("Digite o nome do aluno: ");
        aluno.setNome(scanner.nextLine());

        System.out.print("\nDigite a primeira nota: ");
        aluno.setNota1(scanner.nextDouble());

        System.out.print("\nDigite a segunda nota: ");
        aluno.setNota2(scanner.nextDouble());

        System.out.print("\nDigite a terceira nota: ");
        aluno.setNota3(scanner.nextDouble());

        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Notas: " + aluno.getNota1() + "," + aluno.getNota2() + "," + aluno.getNota3() + "." );
        System.out.println("Média: " + aluno.calcularMedia());

        scanner.close();

    }

}
