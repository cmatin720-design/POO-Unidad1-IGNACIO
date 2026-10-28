
package unidad1;

public class Main {

    public static void main(String[] args) {

        // Crear actores y una película
        Actor actor1 = new Actor("Tom Hanks", "Estadounidense");
        Actor actor2 = new Actor("Robin Wright", "Estadounidense");

        Pelicula pelicula = new Pelicula(
            "Forrest Gump", 142, "Drama", "Paramount Pictures"
        );

        pelicula.agregarActor(actor1);
        pelicula.agregarActor(actor2);
        pelicula.mostrarDetalles();

        // Crear una serie y sus temporadas
        SerieDeTV serie = new SerieDeTV(
            "Stranger Things", 50, "Ciencia ficción", 4
        );

        serie.agregarTemporada(new Temporada(1, 8));
        serie.agregarTemporada(new Temporada(2, 9));
        serie.mostrarDetalles();

        // Crear un documental y asignarle un investigador
        Documental documental = new Documental(
            "El océano", 60, "Naturaleza", "Vida marina"
        );

        Investigador investigador = new Investigador(
            "Jacques Cousteau", "Biología marina"
        );

        documental.setInvestigador(investigador);
        documental.mostrarDetalles();

        // Crear y mostrar los nuevos tipos audiovisuales
        VideoYouTube video = new VideoYouTube(
            "Aprende Java", 15, "Educación",
            "Programación Fácil", "https://youtube.com/"
        );

        video.mostrarDetalles();

        Cortometraje corto = new Cortometraje(
            "El viaje", 12, "Drama", "Ana Pérez", "Festival de Quito"
        );

        corto.mostrarDetalles();
    }
}
