import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        var list1 = new ArrayList<Integer>();

        list1.add(3);
        list1.add(2);
        list1.add(3);
        list1.add(2);

        list1.remove(2);

        System.out.println("Size: " + list1.size());

        var Elemento = obterPrimeirosElementos();
        System.out.println();
        list1.forEach(value -> {
            System.out.println(value);

        });

        private static <T> T

        }
}
