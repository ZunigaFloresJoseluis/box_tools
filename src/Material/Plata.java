package Material;

public class Plata extends  Aleacion {
    Material material;
    public  Plata(Material material){
        this.material=material;
    }

    @Override
    public String Aleacion() {
        return material.Aleacion()+", Plata";
    }

    @Override
    public int totalValor() {
        return material.totalValor()+35;
    }
}
