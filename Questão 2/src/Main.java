import questao.Pessoa;

public class Main {
    public static void main(String[] args) throws Exception {
       Pessoa p1 = new Pessoa();
       Pessoa p2 = new Pessoa("Maysa", "Arterial 5-A");
       Pessoa p3 = new Pessoa("Sabrina", "Barão do Rio Branco", "97633-7832");

        p1.setNome("Larissa");
        p1.setEndereco("Araguaia 157");
        p1.setTelefone("95643-8739");
        p2.setTelefone("98734-7483");

    
        System.out.println("Pessoa 1: " + p1.getNome() + ", " + p1.getEndereco() + ", " + p1.getTelefone());
        System.out.println("Pessoa 2: " + p2.getNome() + ", " + p2.getEndereco() + ", " + p2.getTelefone());
        System.out.println("Pessoa 3: " + p3.getNome() + ", " + p3.getEndereco() + ", " + p3.getTelefone());

    }


    
}
