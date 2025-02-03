package AvanceDeProyecto;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaV {
    
    private List<Libro> ListaDeLibros;
    private List<Tablet> ListaDeTablets;

    public BibliotecaV() {
        this.ListaDeLibros = new ArrayList<>();
        this.ListaDeTablets = new ArrayList<>();
    }

    public List<Libro> getListaDeLibros() {
        return ListaDeLibros;
    }

    public List<Tablet> getListaDeTablets() {
        return ListaDeTablets;
    }

    public List<Libro> verLibrosDisponibles() {
        List<Libro> disponibles = new ArrayList<>();
        for (Libro libro : ListaDeLibros) {
            if (libro.isDisponible()) {
                disponibles.add(libro);
            }
        }
        return disponibles;
    }

    public List<Tablet> verTabletsDisponibles() {
        List<Tablet> disponibles = new ArrayList<>();
        for (Tablet tablet : ListaDeTablets) {
            if (tablet.isEstado()) {
                disponibles.add(tablet);
            }
        }
        return disponibles;
    }
}
