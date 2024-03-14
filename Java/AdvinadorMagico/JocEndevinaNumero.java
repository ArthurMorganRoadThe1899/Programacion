package Programacion.Java.AdvinadorMagico;

public class JocEndevinaNumero extends Joc implements IJugable {

    protected int vidas;

    public JocEndevinaNumero(int vidas) {
        super(vidas);
        this.vidas = vidas;
    }

    @Override
    public void jugar() {
        vidas = 5;
        for(int i = 0; i < 5; i++){
            mostrarVidasRestantes();
        }
        vidas = vidas - 1;
    }

    @Override
    public String mostrarNombre(String nombre) {
        nombre = "EL VERDADERO ADIVINADOR";
        return "BIENVENIDO A " + nombre;
    }

    @Override
    public String descripcion(){
        return descripcion();
    }
}
