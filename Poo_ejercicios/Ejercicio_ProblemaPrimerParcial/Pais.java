package Poo_ejercicios.Ejercicio_ProblemaPrimerParcial;

import java.util.ArrayList;

public class Pais {
    String nombre;
    String capital;
    String idioma;
    String moneda;
    int poblacion;
    ArrayList<Provincia> provincias = new ArrayList<Provincia>();

    public Pais(String nombre, String capital, String idioma, String moneda, int poblacion) {
        this.nombre = nombre;
        this.capital = capital;
        this.idioma = idioma;
        this.moneda = moneda;
        this.poblacion = poblacion;
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProvincias(Provincia provincias){
        this.provincias.add(provincias);
    }

    public void eliminarProvincias(Provincia provincias){
        this.provincias.remove(provincias);
    }
}
