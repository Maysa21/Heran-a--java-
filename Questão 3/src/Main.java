public class Main {
    public static void main(String[] args) throws Exception {
         Fornecedor fornecedor1 = new Fornecedor(
            "Maysa Barros",
            "Av.arterial 5-A",
            "94535-4584",
            5000.0,
            1200.0
        );

        System.out.println("=== Dados do Fornecedor ===");
        System.out.println(fornecedor1);

        
        fornecedor1.setTelefone("97839-7463");
        System.out.println("Telefone atualizado: " + fornecedor1.getTelefone());

        System.out.println("Saldo disponível: " + fornecedor1.obterSaldo());
    
    }
}
