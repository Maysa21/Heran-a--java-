public class Aluno extends Pessoa {
    private int matr;
    private String curso;

    public Aluno(String nome, int idade, String sexo, int matr, String curso) {
        super(nome, idade, sexo);
        this.matr = matr;
        this.curso = curso;
    }

    public void cancelarMatr() {
        System.out.println("A matrícula do(a) aluno(a) " + nome + " foi cancelada");
    }
    
}
