package Programacion.Java.AdvinadorMagico;

public class JocEndevinaNumero extends Joc implements IJugable {

    int vidas;

    public JocEndevinaNumero(int vidas) {
        super(vidas);
        this.vidas = vidas;
    }

    @Override
    public void jugar() {
        for(int i = 0; i < 5; i++){
            mostrarVidasRestantes();
        }
        vidas == vidas - 1;
    }
}
