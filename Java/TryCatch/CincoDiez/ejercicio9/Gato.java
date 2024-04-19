package Programacion.Java.TryCatch.CincoDiez.ejercicio9;

public class Gato {
    public String nombre;
    public int edad;

    // DATOS PUBLICOS //
/*
    public Gato(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
*/
    // GETTERS Y SETTER DE NOMBRE Y EDAD DEL GATO //
    public String getName(){
        return nombre;
    }

    public String setName(String nNombre){
        return nombre = nNombre;
    }

    public int getEdad(){
        return edad;
    }

    public int setEdad(int nEdad){
        if(nEdad < 0){
            throw new NumberFormatException("No puedes tener un gato con edad negativa");
        }
        return edad = nEdad;
    }

    // MOSTRAR DATOS DEL GATITO //
    public String toString(){
        return "Nombre: " + nombre + "\nEdad: " + edad;
    }

}
