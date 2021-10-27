package Poo_ejercicios.Ejercicio_Modelo_Primer_Parcial;

import java.util.ArrayList;

public class Liga {

    String nombreLiga;
    String deporte;
    ArrayList<Equipo> equipos = new ArrayList<Equipo>();

    public Liga(String nombreLiga, String deporte) {
        this.nombreLiga = nombreLiga;
        this.deporte = deporte;
    }
    public void imprimirEquipos(){
        for (int i = 0; i < this.equipos.size(); i++) {
            System.out.println("Equipo "+(i+1)+" "+this.equipos.get(i).nombreEquipo);
        }
    }
    public void agregarEquipo(Equipo equipo){
        this.equipos.add(equipo);
    }
    public void eliminarEquipo(Equipo equipo){
        this.equipos.remove(equipo);
    }

}
