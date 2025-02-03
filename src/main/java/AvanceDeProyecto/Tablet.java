package AvanceDeProyecto;

public class Tablet {
    
    private String ID;
    private String Modelo;
    private boolean Estado;

    public Tablet(String id, String modelo, boolean estado) {
        this.ID = id;
        this.Modelo = modelo;
        this.Estado = estado;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean estado) {
        this.Estado = estado;
    }

    public void asignarTablet() {
        this.Estado = false;
    }

    public void devolverTablet() {
        this.Estado = true;
    }

    boolean isDisponible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setDisponible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
