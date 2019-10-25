package laboratorio3_josezuniga_carlosfortin;

public class ArmaBlanca extends Arma {
    private String material;

    public ArmaBlanca() {
    }

    public ArmaBlanca(String material, String nombre, double precio) {
        super(nombre, precio);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
}
