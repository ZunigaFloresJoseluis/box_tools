package Herramientas;


import Material.Material;

public abstract class Herramientas {
    String nombre;
    String descripcion;
    int vida_util;
    int vida_usada;
    Material material;


    public abstract void usar();

    public String getNombre() {
        return nombre;
    }

    public int getVida_util() {
        return vida_util;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String toString(){
        return "nombre= "+nombre+" descripcion= "+descripcion +" vida util= "+vida_util+ " material"+material.Aleacion();
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }
}
