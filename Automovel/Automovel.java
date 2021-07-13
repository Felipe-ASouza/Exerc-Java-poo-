public class Automovel {
    String placa;
    String cor;
    int numeroDePortas;
    String combustivel;
    long quilometragem;
    String renavam;
    String chassi;
    int numeroDeMarchas;
    boolean ligado;
    int velocidade;

    public Automovel(String placa, String cor, int numeroDePortas, String combustivel, long quilometragem, String renavam, String chassi, int numeroDeMarchas, boolean ligado, int velocidade) {
        this.placa = placa;
        this.cor = cor;
        this.numeroDePortas = numeroDePortas;
        this.combustivel = combustivel;
        this.quilometragem = quilometragem;
        this.renavam = renavam;
        this.chassi = chassi;
        this.numeroDeMarchas = numeroDeMarchas;
        this.ligado = ligado;
        this.velocidade = velocidade;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public long getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(long quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getNumeroDeMarchas() {
        return numeroDeMarchas;
    }

    public void setNumeroDeMarchas(int numeroDeMarchas) {
        this.numeroDeMarchas = numeroDeMarchas;
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public void ligar(){
        this.ligado = true;
    }
    public void desligar(){
        this.ligado = false;
    }
}
