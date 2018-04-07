package Caja_Herramientas;

import Herramientas.Herramientas;
import Piezas.Piezas;


import java.util.ArrayList;

public class Box_tools {
    ArrayList<Herramientas> herramientas=new ArrayList<>();
    ArrayList<Piezas> piezas=new ArrayList<>();

    public void agregarHerramienta(Herramientas herramienta){

        herramientas.add(herramienta);
    }
    public void  agregarPieza(Piezas pieza){
        piezas.add(pieza);
    }
    public void ver_etado_herramientas(){
        for (Herramientas h:herramientas ) {
            System.out.println(h.toString());
        }
    }

    public void ver_estado_piezas(){
        for (Piezas p:piezas ) {
            System.out.println(p.toString());
        }
    }

    public Herramientas sacar_herramienta(String descripcion){
        Herramientas aux=null;
        for (Herramientas h:herramientas) {
            if(h.getDescripcion().equals(descripcion)){
                aux=h;
            }
        }
        herramientas.remove(aux);
        return aux;
    }
    public Piezas sacar_pieza(String nombre,double tamaño){
        Piezas aux=null;
        for (Piezas p:piezas) {
            if(p.getNombre().equals(nombre)&& p.getTamaño()==tamaño){
                aux=p;
            }
        }
        piezas.remove(aux);
        return aux;
    }
    public  void estado_total_caja(){
        ver_etado_herramientas();
        ver_estado_piezas();
    }
    public Herramientas tomar_herramienta(String nombre){
        Herramientas actual=sacar_herramienta(nombre);
        System.out.println("Herramienta tomada");
        System.out.println(actual.toString());
        System.out.println("==================Estado de la caja===========================");
        System.out.println("========Herramientas========");
        ver_etado_herramientas();
        return  actual;
    }
    public Piezas tomar_pieza(String nombre,double tamaño){
        Piezas actual=sacar_pieza(nombre,tamaño);
        System.out.println("Pieza tomada");
        System.out.println(actual.toString());
        System.out.println("==================Estado de la caja===========================");
        System.out.println("========Piezas========");
        ver_estado_piezas();
        return  actual;
    }


}
