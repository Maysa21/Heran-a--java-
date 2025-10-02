public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public Funcionario(String nome, int idade, String sexo, String setor, boolean trabalhando) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = false;
    }

    public void mudarTrabalho(String novoSetor) {
        this.setor = novoSetor;
        System.out.println( nome + " mudou para o setor: " + setor);
    }
}
