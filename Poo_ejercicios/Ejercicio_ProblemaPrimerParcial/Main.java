package Poo_ejercicios.Ejercicio_ProblemaPrimerParcial;

public class Main {
    public static void main(String[] args) {
        Pais pais1 = new Pais("Argentina");
        Pais pais2 = new Pais("Brasil");
        Pais pais3 = new Pais("Chile");

        Provincia provincia1 = new Provincia("Ushuaia");
        Provincia provincia2 = new Provincia("Santa fe");
        Provincia provincia3 = new Provincia("Neuquen");

        Ciudad ciudad1 = new Ciudad("Tierra del fuego", 1000000);
        Ciudad ciudad2 = new Ciudad("rosario", 50000);
        Ciudad ciudad3 = new Ciudad("bariloche", 30000);


        System.out.println(provincia1.nombre);
        System.out.println(provincia2.nombre);
        System.out.println(provincia3.nombre);

        System.out.println("\n"+ciudad1.nombre);
        System.out.println(ciudad2.nombre);
        System.out.println(ciudad3.nombre);


    }
}
