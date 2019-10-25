
package laboratorio3_josezuniga_carlosfortin;

/**
 *
 * @author Carlos Fortin
 */
public class Caballero extends Soldado{
    
    private Arma arma;

    public Caballero() {
        super();
    }

    public Caballero(Arma arma, String nombre, String lugar, int edad, String sexo, int x, int y) {
        super(nombre, lugar, edad, sexo, x, y);
        this.arma = arma;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Caballero{" + "arma=" + arma + '}';
    }
    
    
    
}
