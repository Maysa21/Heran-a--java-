public class Pessoa {
    protected String nome;
    private int idade;
    private String sexo;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Pessoa() {
        
    }

    public void fazerAniv() {
        this.idade++;
        System.out.println(nome + " você fez aniversário! Agora você tem " + idade + " anos.");
    }
}