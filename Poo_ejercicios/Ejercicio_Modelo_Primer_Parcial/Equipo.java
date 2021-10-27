package Poo_ejercicios.Ejercicio_Modelo_Primer_Parcial;

import java.util.ArrayList;

public class Equipo {

    String nombreEquipo;
    int anioFundacion;
    String estadio;
    String dt;
    ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

    public Equipo(String nombreEquipo, int anioFundacion, String estadio, String dt) {
        this.nombreEquipo = nombreEquipo;
        this.anioFundacion = anioFundacion;
        this.estadio = estadio;
        this.dt = dt;
    }

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void imprimirJugador(){
        for (int i = 0; i < this.jugadores.size() ; i++) {
            System.out.println("Nombre: "+ this.jugadores.get(i).nombreJugador);
        }
    }
    public void agregarJugador(Jugador jugadores){
        this.jugadores.add(jugadores);
    }
    public void eliminarJugador(Jugador jugadores){

        this.jugadores.remove(jugadores);
    }

}
