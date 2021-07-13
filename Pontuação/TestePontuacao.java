public class TestePontuacao {
    public static void main(String[] args) {
        Pontuacao pontos = new Pontuacao();
        pontos.ganharPartida();
        System.out.println("Você ganhou 3 pontos.");
        pontos.perderPartida();
        System.out.println("Voce ganhou 0 pontos.");


    }
}
