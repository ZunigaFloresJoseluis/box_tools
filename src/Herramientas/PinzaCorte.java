package Herramientas;

import Material.Material;
import Material.Piedra;
import Material.Plata;

public class PinzaCorte extends Pinza {


    public  PinzaCorte(){
        material=new Piedra();
        material=new Plata(material);
        vida_util=material.totalValor();
        nombre="Piza";
        descripcion="Pinza de Corte";
        vida_usada=0;
    }
    @Override
    public void usar() {
        if(vida_util>0){
            vida_util-=2;
            vida_usada+=2;
            System.out.println("Se ha usado "+descripcion+" la vida util  es ="+vida_util);
        }
        else{
            System.out.println("La "+descripcion+" ya no es util");
        }

    }
}
