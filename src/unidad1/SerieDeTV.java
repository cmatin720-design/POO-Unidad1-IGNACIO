
package unidad1;

import java.util.ArrayList;
import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual {

    private int temporadas;
    private List<Temporada> listaTemporadas = new ArrayList<>();

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void agregarTemporada(Temporada temporada) {
        listaTemporadas.add(temporada);
    }

    public List<Temporada> getListaTemporadas() {
        return listaTemporadas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie de televisión:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Número de temporadas: " + temporadas);
        System.out.println("Temporadas registradas:");

        for (Temporada temporada : listaTemporadas) {
            System.out.println("Temporada " + temporada.getNumero()
                    + " - Episodios: " + temporada.getCantidadEpisodios());
        }

        System.out.println();
    }
}

