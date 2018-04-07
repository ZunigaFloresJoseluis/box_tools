package Herramientas;

import Material.Material;
import Material.*;
public class DesarmadorPlano extends  Desarmador {

    public  DesarmadorPlano(){
        material=new Piedra();
        material=new Plata(material);
        vida_util=material.totalValor();
        nombre="Desarmador";
        descripcion="Desarmador plano";
        vida_usada=0;
    }
    @Override
    public void usar() {
        if(vida_util>0){
            vida_util-=5;
            vida_usada+=5;
            System.out.println("Se ha usado "+descripcion+" la vida util  es ="+vida_util);
        }
        else{
            System.out.println("El "+descripcion+" ya no es util");
        }
    }
}
