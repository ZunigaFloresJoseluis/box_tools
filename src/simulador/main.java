package simulador;

import Caja_Herramientas.Box_tools;
import Herramientas.*;
import Material.Material;
import Piezas.Clavos;
import Piezas.Piezas;
import Piezas.Tachuelas;
import Piezas.Tornillos;


public class main {
    public static void main(String[] args){
        //Creando Herramientas
      Herramientas desarmador_cruz=new DesarmadorCruz();
      Herramientas desarmador_plano=new DesarmadorPlano();
      Herramientas martillo=new Martillo();
      Herramientas pinza_corte=new PinzaCorte();
      Herramientas pinza_punta=new PinzaPunta();
        //fin
       Piezas clavo1=new Clavos();
       Piezas clavo2=new Clavos();
       Piezas tachuela1=new Tachuelas();
       Piezas tachuela2=new Tachuelas();
       Piezas tornillo1=new Tornillos();
       Piezas tornillo2=new Tornillos();

        Box_tools caja=new Box_tools();
       //Agregando a la caja;
       caja.agregarHerramienta(desarmador_cruz);
        caja.agregarHerramienta(desarmador_plano);
        caja.agregarHerramienta(martillo);
        caja.agregarHerramienta(pinza_corte);
        caja.agregarHerramienta(pinza_punta);
        caja.agregarPieza(clavo1);
        caja.agregarPieza(clavo2);
        caja.agregarPieza(tachuela1);
        caja.agregarPieza(tachuela2);
        caja.agregarPieza(tornillo1);
        caja.agregarPieza(tornillo2);
    // ver estado de la  caja
        Herramientas tomada=caja.tomar_herramienta("Desarmador Cruz");
        tomada.usar();

    }
}
