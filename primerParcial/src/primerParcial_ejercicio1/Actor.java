package primerParcial_ejercicio1;

public class Actor {
    // Atributos

    String nombre;
    String apellido;
    String pais;
    int anioNacimiento;

    // Constructor

    public Actor(String nombre, String apellido, String pais, int anioNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.anioNacimiento = anioNacimiento;
    }

    // Metodos

    public int calcularEdad (int anioActual){
        int res;
         res = this.anioNacimiento - anioActual;
         return res;
    }

    @Override
    public String toString() {
        return "Actor: "+nombre+" "+apellido+" ("+ pais+ ") ";
    }
}
