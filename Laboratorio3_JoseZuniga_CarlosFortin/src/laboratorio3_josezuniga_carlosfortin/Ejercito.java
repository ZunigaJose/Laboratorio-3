package laboratorio3_josezuniga_carlosfortin;

import java.util.ArrayList;

public class Ejercito {
    private String nombre, region;
    private int victorias;
    private double dinero;
    private ArrayList<Soldado> soldados = new ArrayList<>();

    public Ejercito() {
    }
    
    public Ejercito(String nombre, String region, int victorias, double dinero) {
        this.nombre = nombre;
        this.region = region;
        this.victorias = victorias;
        this.dinero = dinero;
    }

    public ArrayList<Soldado> getSoldados() {
        return soldados;
    }

    public void setSoldados(ArrayList<Soldado> soldados) {
        this.soldados = soldados;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    
    
}
