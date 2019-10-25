
package laboratorio3_josezuniga_carlosfortin;

import java.util.ArrayList;

/**
 *
 * @author Carlos Fortin
 */
public class Ejecutor extends Soldado{
    
    private Arma arma;
    private ArrayList<Arma> bombas=new ArrayList();

    public Ejecutor() {
        super();
    }

    public Ejecutor(Arma arma, String nombre, String lugar, int edad, String sexo, int x, int y) {
        super(nombre, lugar, edad, sexo, x, y);
        this.arma = arma;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public ArrayList<Arma> getBombas() {
        return bombas;
    }

    public void setBombas(ArrayList<Arma> bombas) {
        this.bombas = bombas;
    }
    
    public Arma getBomba(int pos){
        return bombas.get(pos);
    }
    
    public void setBomba(Arma bomba){
        this.bombas.add(bomba);
    }

    @Override
    public String toString() {
        return "Ejecutor{" + "arma=" + arma + ", bomba=" + bombas + '}';
    }
    
    
    
}
