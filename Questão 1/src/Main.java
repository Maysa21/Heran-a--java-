public class Main {
    public static void main(String[] args) throws Exception {
        Professor prof = new Professor("Maria", 28, "F", "Geografia", 3000);
        Aluno aluno = new Aluno("Maysa", 20, "F", 4183376, "ADS");
        Funcionario func = new Funcionario("Larissa", 23, "F", "TI", false);

        prof.receberAum(1000);
        aluno.cancelarMatr();
        aluno.fazerAniv();
        func.mudarTrabalho("RH");

    }
}
