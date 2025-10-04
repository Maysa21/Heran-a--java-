public class Main {
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[3];

        veiculos[0] = new Carro("Jeep", "Comander", 4);
        veiculos[1] = new Moto("Honda", "CG 160 Titan", 162);
        veiculos[2] = new Carro("Chevrolet", "Onix", 2);

        for (Veiculo v : veiculos) {
            v.exibirInfo(); 
        }
    }
}