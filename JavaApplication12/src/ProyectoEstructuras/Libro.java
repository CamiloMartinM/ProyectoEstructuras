
package ProyectoEstructuras;


public class Libro {
    private String nombre;
    private String autor;
    private int precio;
    private String categoria;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Libro(String nombre, String autor, int precio, String categoria) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.categoria = categoria;
    }
    
}
