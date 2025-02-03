package AvanceDeProyecto;

public class Estudiante extends Usuario{
    
    public Estudiante(String ID, String nombre, String correo) {
        super(ID, nombre, correo);
    }
    
    public String solicitarLibro(Libro libro){
        if (libro.isDisponible()) {
            return "Solicitud de libro '" + libro.getTitulo() + "' realizada.";
        } else {
            return "El libro '" + libro.getTitulo() + "' no está disponible.";
        }
    }
    
    public String solicitarTablet(Tablet tablet) {
        if (tablet.isEstado()) {
            return "Solicitud de tablet '" + tablet.getModelo() + "' realizada.";
        } else {
            return "La tablet '" + tablet.getModelo() + "' no está disponible.";
        }
    }
}
