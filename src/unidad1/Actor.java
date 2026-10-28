
package unidad1;

public class Actor {

    private String nombre;
    private String nacionalidad;

    public Actor(String nombre, String nacionalidad) {

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "El nombre del actor no puede estar vacío."
            );
        }

        if (nacionalidad == null || nacionalidad.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "La nacionalidad no puede estar vacía."
            );
        }

        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
}
