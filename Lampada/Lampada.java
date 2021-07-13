public class Lampada {
    boolean estado;

    public void ligar(){
        estado = true;

    }
    public void desligar(){
        estado = false;
    }
    public void mostrarEstado(){
        if(estado){
            System.out.println("A lampada está ligada.");
            return;
        }
        System.out.println("A lampada está desligada.");
    }
}
