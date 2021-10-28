package primerParcial_ejercicio1;

public class Main {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Martin", "Sassano", "Argentina", 1980);
        Actor actor2 = new Actor("Francisco", "Sassano", "Argentina", 1980);
        Actor actor3 = new Actor("Tincho", "Sassano", "Argentina", 1980);
        Actor actor4 = new Actor("Fran", "Sassano", "Argentina", 1980);

        Pelicula pelicula1 = new Pelicula("Titanic", 120, 2000, "Romance");
        Pelicula pelicula2 = new Pelicula("El Rey León", 120, 2000, "Infantil");

        Cine nuevoCine = new Cine("NuevoCine", "Buenos Aires");

        pelicula1.agregarActor(actor1);
        pelicula1.agregarActor(actor2);
        pelicula2.agregarActor(actor3);
        pelicula2.agregarActor(actor4);

        nuevoCine.agregarPelicula(pelicula1);
        nuevoCine.agregarPelicula(pelicula2);

        pelicula1.mostrarActores();
        pelicula2.mostrarActores();

        nuevoCine.mostrarPeliculas();

    }
}
