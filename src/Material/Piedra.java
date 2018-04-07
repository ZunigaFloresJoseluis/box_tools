package Material;

public class Piedra extends Material {
    public  Piedra(){
        descripcion="Piedra";
    }
    @Override
    public int totalValor() {
        return 150;
    }
}
