package biblioteca.simple.modelo;

public class Libro extends Producto{

    private String ISBN;
    private String autor;

    public Libro(int id, String titulo, String anho, Formato formato, String ISBN, String autor) {
        super(id, titulo, anho, formato);
        this.ISBN = ISBN;
        this.autor = autor;
    }

    public Libro(String titulo, String anho, Formato formato, String ISBN, String autor) {
        super(titulo, anho, formato);
        this.ISBN = ISBN;
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN='" + ISBN + '\'' +
                ", autor='" + autor + '\'' +
                ", id=" + id +
                ", titulo='" + titulo + '\'' +
                ", anho='" + anho + '\'' +
                ", formato=" + formato +
                '}';
    }
}
