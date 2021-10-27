package Poo_ejercicios.Ejercicio_Modelo_Primer_Parcial;

public class Main {
    public static void main(String[] args) {


        Jugador arquero = new Jugador("Franco", "Armani", 35, "Arquero");
        Jugador defensa = new Jugador("Roberto", "Ayala", 50, "Defensor");
        Jugador medio = new Jugador("Franco", "asdf", 40, "Mediocampista");
        Jugador delantero = new Jugador("Carlos", "Tevez", 38, "Delantero");

        Liga liga1 = new Liga("Super Liga", "Futbol");

        Equipo equipo1 = new Equipo("River Plate");

        equipo1.agregarJugador(arquero);
        equipo1.agregarJugador(defensa);
        equipo1.agregarJugador(medio);
        equipo1.agregarJugador(delantero);

        equipo1.imprimirJugador();

        liga1.agregarEquipo(equipo1);

        System.out.println(arquero.toString());
        equipo1.eliminarJugador(medio);
        System.out.println(equipo1.jugadores);

        liga1.imprimirEquipos();
    }
}
