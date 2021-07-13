public class TesteAutomovel {
    public static void main(String[] args) {
        Automovel carro = new Automovel("FEL-2341","preto",4,"20L",
                20000,"São Paulo","preto",6,
                false,200);

        System.out.println("Placa do carro: " + carro.placa +"\n" + "Cor do carro: " + carro.cor
                + "\n" + "Número de portas: " + carro.numeroDePortas);
    }
}
