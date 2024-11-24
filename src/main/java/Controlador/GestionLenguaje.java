package controlador;

import Modelo.LenguajeProgramacion;

public class GestionLenguaje {
    
    private final int FACTOR_CRECIMIENTO = 2;
    private LenguajeProgramacion[] arregloLenguajes = new LenguajeProgramacion[FACTOR_CRECIMIENTO];
    private int contadorLenguajes = 0;


    // Métodos
    public void agregarLenguaje(int anioCreacion, String caracteristicaPrincipal, String nombre, String utilizacion) {
        if (contadorLenguajes == arregloLenguajes.length) {
            redimensionarArreglo();
        }
        arregloLenguajes[contadorLenguajes++] = new LenguajeProgramacion(anioCreacion, caracteristicaPrincipal, nombre, utilizacion);
    }

    private void redimensionarArreglo() {
        LenguajeProgramacion[] nuevoArreglo = new LenguajeProgramacion[arregloLenguajes.length + FACTOR_CRECIMIENTO];
        System.arraycopy(arregloLenguajes, 0, nuevoArreglo, 0, arregloLenguajes.length);
        arregloLenguajes = nuevoArreglo;
    }

    public LenguajeProgramacion buscarLenguaje(String nombre) {
        for (int i = 0; i < contadorLenguajes; i++) {
            if (arregloLenguajes[i].getNombre().equalsIgnoreCase(nombre)) {
                return arregloLenguajes[i];
            }
        }
        return null;
    }

    public boolean eliminarLenguaje(String nombre) {
        for (int i = 0; i < contadorLenguajes; i++) {
            if (arregloLenguajes[i].getNombre().equalsIgnoreCase(nombre)) {
                for (int j = i; j < contadorLenguajes - 1; j++) {
                    arregloLenguajes[j] = arregloLenguajes[j + 1];
                }
                arregloLenguajes[--contadorLenguajes] = null;
                return true;
            }
        }
        return false;
    }

    public LenguajeProgramacion[] getArregloLenguajes() {
        return arregloLenguajes;
    }

    public void imprimirLenguajes() {
        for (int i = 0; i < contadorLenguajes; i++) {
            System.out.println(arregloLenguajes[i]);
        }
    }
}