package laboratorio3_josezuniga_carlosfortin;

public class Rifle extends Arma {
    private boolean automatica;
    private int alcanceMax, alcanceMin;

    public Rifle() {
    }

    public Rifle(boolean automatica, int alcanceMax, int alcanceMin, String nombre, double precio) {
        super(nombre, precio);
        this.automatica = automatica;
        this.alcanceMax = alcanceMax;
        this.alcanceMin = alcanceMin;
    }

    public boolean isAutomatica() {
        return automatica;
    }

    public void setAutomatica(boolean automatica) {
        this.automatica = automatica;
    }

    public int getAlcanceMax() {
        return alcanceMax;
    }

    public void setAlcanceMax(int alcanceMax) {
        this.alcanceMax = alcanceMax;
    }

    public int getAlcanceMin() {
        return alcanceMin;
    }

    public void setAlcanceMin(int alcanceMin) {
        this.alcanceMin = alcanceMin;
    }
}
