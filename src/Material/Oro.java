package Material;

public class Oro extends  Aleacion{
    Material material;
    public Oro(Material material){
        this.material=material;
    }
    @Override
    public String Aleacion() {
        return material.Aleacion()+", oro";
    }

    @Override
    public int totalValor() {
        return material.totalValor()+40;
    }
}
