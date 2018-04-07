package Herramientas;

import Material.*;

public class PinzaPunta extends Pinza {

    public  PinzaPunta(){
        material=new Piedra();
        material=new Plata(material);
        vida_util=material.totalValor();
        nombre="Piza";
        descripcion="Pinza de punta";
        vida_usada=0;
    }
    @Override
    public void usar() {
        if(vida_util>0){
            vida_util-=3;
            vida_usada+=3;
            System.out.println("Se ha usado "+descripcion+" la vida util es ="+vida_util);
        }
        else{
            System.out.println("La "+descripcion+" ya no es util");
        }
    }
}
