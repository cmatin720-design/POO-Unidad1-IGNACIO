
package unidad1;

public class Cortometraje extends ContenidoAudiovisual {

    private String director;
    private String festival;

    public Cortometraje(String titulo, int duracionEnMinutos, String genero,
                         String director, String festival) {
        super(titulo, duracionEnMinutos, genero);
        this.director = director;
        this.festival = festival;
    }

    public String getDirector() {
        return director;
    }

    public String getFestival() {
        return festival;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del cortometraje:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Director: " + director);
        System.out.println("Festival: " + festival);
        System.out.println();
    }
}
