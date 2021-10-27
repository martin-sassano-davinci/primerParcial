package Poo_ejercicios.Ejercicio_ProblemaPrimerParcial;

import java.util.ArrayList;

public class Provincia {
    String nombre;
    String capital;
    String idioma;
    int poblacion;
    ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();

    public Provincia(String nombre, String capital, String idioma, int poblacion) {
        this.nombre = nombre;
        this.capital = capital;
        this.idioma = idioma;
        this.poblacion = poblacion;
    }

    public Provincia(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCiudades(Ciudad ciudades){
        this.ciudades.add(ciudades);

    }
    public void eliminarCiudades(Ciudad ciudades){
        this.ciudades.remove(ciudades);
    }
}
