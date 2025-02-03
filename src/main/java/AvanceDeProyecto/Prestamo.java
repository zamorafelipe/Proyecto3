package AvanceDeProyecto;

import java.util.Date;
import java.util.List;

class Prestamo {
    
    private String ID;
    private Date FechaInicio;
    private Date FechaFin;
    private List<Prestamo> ListaDeLibrosPrestados;
    private List<Prestamo> ListaDeTabletsPrestados;

    public Prestamo(String ID, Date FechaInicio, Date FechaFin, List<Prestamo> ListaDeLibrosPrestados, List<Prestamo> ListaDeTabletsPrestados) {
        this.ID = ID;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.ListaDeLibrosPrestados = ListaDeLibrosPrestados;
        this.ListaDeTabletsPrestados = ListaDeTabletsPrestados;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Date FechaFin) {
        this.FechaFin = FechaFin;
    }

    public List<Prestamo> getListaDeLibrosPrestados() {
        return ListaDeLibrosPrestados;
    }

    public void setListaDeLibrosPrestados(List<Prestamo> ListaDeLibrosPrestados) {
        this.ListaDeLibrosPrestados = ListaDeLibrosPrestados;
    }

    public List<Prestamo> getListaDeTabletsPrestados() {
        return ListaDeTabletsPrestados;
    }

    public void setListaDeTabletsPrestados(List<Prestamo> ListaDeTabletsPrestados) {
        this.ListaDeTabletsPrestados = ListaDeTabletsPrestados;
    }
    
}

