public class Carro {
    double velocidade = 0.0;

    public void acelerar(){
        velocidade = 10.0;
    }
    public void freiar(){
        velocidade -= 10.0;
    }
    public void mostrarResultado(){
        System.out.println(velocidade);

    }

}
