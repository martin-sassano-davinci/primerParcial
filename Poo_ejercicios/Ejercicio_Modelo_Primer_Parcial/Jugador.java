package Poo_ejercicios.Ejercicio_Modelo_Primer_Parcial;

public class Jugador {

    String nombreJugador;
    String apellidoJugador;
    int edad;
    String posicion;

    public Jugador(String nombreJugador, String apellidoJugador, int edad, String posicion) {
        this.nombreJugador = nombreJugador;
        this.apellidoJugador = apellidoJugador;
        this.edad = edad;
        this.posicion = posicion;
    }

    public Jugador(String nombreJugador, String apellidoJugador, int edad) {
        this.nombreJugador = nombreJugador;
        this.apellidoJugador = apellidoJugador;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre jugador: "+this.nombreJugador+ " Apellido: "+this.apellidoJugador+"("+this.edad+")";
    }
}
