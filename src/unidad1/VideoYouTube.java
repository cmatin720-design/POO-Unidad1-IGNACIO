
package unidad1;

public class VideoYouTube extends ContenidoAudiovisual {

    private String canal;
    private String url;

    public VideoYouTube(String titulo, int duracionEnMinutos, String genero,
                        String canal, String url) {
        super(titulo, duracionEnMinutos, genero);
        this.canal = canal;
        this.url = url;
    }

    public String getCanal() {
        return canal;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del video de YouTube:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Canal: " + canal);
        System.out.println("URL: " + url);
        System.out.println();
    }
}
