package Programacion.Java.Biblioteca;

public class Libro extends Publicacion{
    private final int code;
    private final String titulo;
    private final String añoPublicacion;
    public Libro(int code, String titulo, String añoPublicacion){
        super(code, titulo, añoPublicacion);
        this.code = code;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }

    @Override
    public String toString(){
        return "\nCódigo: "+code+"\nTitulo: "+titulo+"\nañoPublicacion: "+añoPublicacion;
    }
}
