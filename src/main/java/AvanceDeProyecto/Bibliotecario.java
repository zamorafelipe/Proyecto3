package AvanceDeProyecto;

public class Bibliotecario extends Usuario{
    
    public Bibliotecario(String ID, String nombre, String correo) {
        super(ID, nombre, correo);
    }
    
     public String gestionarEntregaLibro(Estudiante estudiante, Libro libro) {
        if (libro.isDisponible()) {
            libro.setDisponible(false);
            return "Libro '" + libro.getTitulo() + "' entregado a " + estudiante.getNombre() + ".";
        } else {
            return "El libro '" + libro.getTitulo() + "' no está disponible.";
        }
    }

    public String gestionarDevolucionLibro(Estudiante estudiante, Libro libro) {
        libro.setDisponible(true);
        return "Libro '" + libro.getTitulo() + "' devuelto por " + estudiante.getNombre() + ".";
    }

    public String gestionarEntregaTablet(Estudiante estudiante, Tablet tablet) {
        if (tablet.isEstado()) {
            tablet.asignarTablet();
            return "Tablet '" + tablet.getModelo() + "' entregada a " + estudiante.getNombre() + ".";
        } else {
            return "La tablet '" + tablet.getModelo() + "' no está disponible.";
        }
    }

    public String gestionarDevolucionTablet(Estudiante estudiante, Tablet tablet) {
        tablet.devolverTablet();
        return "Tablet '" + tablet.getModelo() + "' devuelta por " + estudiante.getNombre() + ".";
    }
}
