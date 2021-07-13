public class Pontuacao {
    int pontosGanhos = 0;


     public void ganharPartida(){
         pontosGanhos += 3;

     }
     public void empatarPartida(){
         pontosGanhos += 3;

     }
     public void perderPartida(){
         pontosGanhos = 0;
     }
}
