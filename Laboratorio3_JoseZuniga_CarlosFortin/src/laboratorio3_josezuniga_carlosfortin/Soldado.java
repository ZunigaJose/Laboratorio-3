
package laboratorio3_josezuniga_carlosfortin;

/**
 *
 * @author Carlos Fortin
 */
public class Soldado {
    
    private String nombre;
    private int[] lugar;
    private int edad;
    private String sexo;

    public Soldado() {
    }

    public Soldado(String nombre, int[] lugar, int edad, String sexo) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Soldado(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getLugar() {
        return lugar;
    }

    public void setLugar(int[] lugar) {
        this.lugar = lugar;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Soldado{" + "nombre=" + nombre + ", lugar=" + lugar + ", edad=" + edad + ", sexo=" + sexo + '}';
    }
}
