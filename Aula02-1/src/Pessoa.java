public class Pessoa {

    private String nome;
    private Integer idade;

    public Pessoa(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome){
        this(nome, 0);
    }

    public Pessoa(){}

    public Integer getIdade() {
        return idade;
    }
    public String getNome() {
        if(nome.length() < 10)
            return nome;
        return null;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
