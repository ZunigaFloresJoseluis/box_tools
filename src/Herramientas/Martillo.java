package Herramientas;

import Material.Madera;
import Material.Material;
import Material.Oro;

public class Martillo extends Herramientas {

    public  Martillo(){
        material=new Madera();
        material=new Oro(material);
        vida_util=material.totalValor();
        nombre="martillo";
        descripcion="martillo";
        vida_usada=0;

    }


    @Override
    public void usar() {
        if(vida_util>0){
            vida_util-=5;
            vida_usada+=5;
            System.out.println("Se ha usado "+descripcion+", la vida util es ="+vida_util);
        }
        else{
            System.out.println("El "+descripcion+" ya no es util");
        }

    }

}
