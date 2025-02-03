package AvanceDeProyecto;

class Libro {
    
    private String ISBN;
    private String titulo;
    private String Autor;
    private boolean disponibilidad;

    public Libro(String ISBN, String titulo, String Autor, boolean disponibilidad) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.Autor = Autor;
        this.disponibilidad = disponibilidad;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    boolean isDisponible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void setDisponible(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
