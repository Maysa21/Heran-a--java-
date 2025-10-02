public class Professor extends Pessoa {
    private  String especialidade;
    private double salario;

    public Professor(String nome, int idade, String sexo, String especialidade, double salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void receberAum(double aumento) {
        this.salario += aumento;
        System.out.println( nome + " você recebeu um aumento! Seu novo salário é: R$ " + salario);
    }
}
