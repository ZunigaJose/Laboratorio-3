
package laboratorio3_josezuniga_carlosfortin;

/**
 *
 * @author Carlos Fortin
 */
public class Ejecutor extends Soldado{
    
    private Arma arma;
    private Arma bomba;

    public Ejecutor() {
        super();
    }

    public Ejecutor(Arma arma, Arma bomba, String nombre, String lugar, int edad, String sexo) {
        super(nombre, lugar, edad, sexo);
        this.arma = arma;
        this.bomba = bomba;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Arma getBomba() {
        return bomba;
    }

    public void setBomba(Arma bomba) {
        this.bomba = bomba;
    }

    @Override
    public String toString() {
        return "Ejecutor{" + "arma=" + arma + ", bomba=" + bomba + '}';
    }
    
    
    
}
