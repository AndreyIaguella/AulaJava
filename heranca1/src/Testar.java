public class Testar {
        public static void main(String[] args) {

            Ingresso  testar = new Ingresso(5.60);

            IngressoVip testar2 = new IngressoVip(testar.getValor(), 3);
            System.out.println(testar2.toString());


    }
}
