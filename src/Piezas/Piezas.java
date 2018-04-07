package Piezas;

public abstract  class Piezas {
    String nombre;
    double tamaño;

    public double getTamaño() {
        return tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return "nombre= "+nombre+" tamaño= "+tamaño;
    }
}
