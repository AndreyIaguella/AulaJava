public class TestePessoa {

    public static void main(String[]args){
        Pessoa pessoa = new Pessoa("josé", 30);
        var filha = new Pessoa("joana");
        var b = new Pessoa();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(filha.getNome());
        System.out.println(filha.getIdade());
    }
}
