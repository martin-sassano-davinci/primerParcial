package primerParcial_ejercicio1;

import java.util.ArrayList;

public class Cine {
    // Atributos

    String nombre;
    String ciudad;
    ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();

    // Constructor

    public Cine(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public Cine(String nombre) {
        this.nombre = nombre;
    }

    // Metodos

    public void agregarPelicula(Pelicula peliculas){
        this.peliculas.add(peliculas);
    }

    public void eliminarPelicula(Pelicula peliculas){
        this.peliculas.remove(peliculas);
    }

    public void mostrarPeliculas(){
        for (int i = 0; i < peliculas.size(); i++) {
            System.out.println("Peliculas de la cartelera en "+this.nombre+ " "+ this.peliculas.get(i));
        }
    }

    @Override
    public String toString() {
        return "Bienvenidos al cine: "+nombre;
    }
}
