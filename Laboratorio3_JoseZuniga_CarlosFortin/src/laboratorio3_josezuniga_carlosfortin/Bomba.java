package laboratorio3_josezuniga_carlosfortin;

public class Bomba extends Arma {
    private String material;
    private int alcance;

    public Bomba() {
    }

    public Bomba(String material, int alcance, String nombre, double precio) {
        super(nombre, precio);
        this.material = material;
        this.alcance = alcance;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }
}
