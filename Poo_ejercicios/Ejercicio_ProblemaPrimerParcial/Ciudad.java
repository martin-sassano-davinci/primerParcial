package Poo_ejercicios.Ejercicio_ProblemaPrimerParcial;

public class Ciudad {
    String nombre;
    int poblacion;

    public Ciudad(String nombre, int poblacion) {
        this.nombre = nombre;
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                ", poblacion=" + poblacion +
                '}';
    }
}
