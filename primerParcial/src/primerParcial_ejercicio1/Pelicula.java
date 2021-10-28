package primerParcial_ejercicio1;

import java.util.ArrayList;

public class Pelicula {
    // Atributos

    String titulo;
    int duracion;
    int anio;
    String categoria;
    ArrayList<Actor> actores = new ArrayList<Actor>();

    // Constructor

    public Pelicula(String titulo, int duracion, int anio, String categoria) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.anio = anio;
        this.categoria = categoria;
    }

    public Pelicula(String titulo) {
        this.titulo = titulo;
    }

    // Metodos

    public void agregarActor(Actor actores){
        this.actores.add(actores);
    }

    public void eliminarActor(Actor actores){
        this.actores.remove(actores);
    }

    public void mostrarActores(){
        for (int i = 0; i < this.actores.size(); i++) {
            System.out.println("Actores de la pelicula: "+this.titulo+" "+ actores.get(i));
        }
    }

    @Override
    public String toString() {
        return "Pelicula: "+ titulo+ " ("+anio+")";
    }
}
