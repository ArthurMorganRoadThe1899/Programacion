package Programacion.Java.Biblioteca;

public abstract class Publicacion {
    private final int code;
    private final String titulo;
    private final String añoPublicacion;

    public Publicacion(int code, String titulo, String añoPublicacion){
        this.code = code;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }

    public String toString(){
        return "\nCódigo: "+code+"\nTitulo: "+titulo+"\nañoPublicacion: "+añoPublicacion;
    }

}
