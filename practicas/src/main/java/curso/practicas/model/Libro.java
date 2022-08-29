package curso.practicas.model;

public class Libro {
    private int id;
    private String nombre;
    private String autor;
    private String editorial;
    private int añoLanzamiento;

    public Libro() {
    }

    public Libro(int id, String nombre, String autor, String editorial, int añoLanzamiento) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.añoLanzamiento = añoLanzamiento;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return this.editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAñoLanzamiento() {
        return this.añoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }

}
