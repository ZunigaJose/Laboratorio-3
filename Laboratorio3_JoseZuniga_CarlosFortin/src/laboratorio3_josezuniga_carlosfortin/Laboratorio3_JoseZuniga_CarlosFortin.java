package laboratorio3_josezuniga_carlosfortin;

import java.util.ArrayList;
import java.util.Scanner;
public class Laboratorio3_JoseZuniga_CarlosFortin {
    public static Scanner leer=new Scanner(System.in);
    public static void main(String[] args) {
        
        ArrayList<Ejercito> ejercitos = new ArrayList();
        int opcion=0;
        while(opcion!=11)
        {
            System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s", "Ingrese una opcion: ","1. Agregar ejercito", "2. Modificar ejercito", "3. Listar ejercitos", "4. Eliminar un ejercito", "5. Agregar soldados", "6. Listar soldados", "7. Eliminar un soldado", "8. Agregar armas", "9. Listar armas", "10. Eliminar un arma", "11. Salir", "Opcion Ingresada: ");
            opcion=leer.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.print("Ingrese el nombre del ejercito: ");
                    String nombre=leer.next();
                    System.out.print("Ingrese el nombre de la region: ");
                    String region=leer.next();
                    System.out.print("Ingrese la cantidad de victorias: ");
                    int victorias=leer.nextInt();
                    System.out.println("Ingrese la cantidad de dinero disponible: ");
                    double dinero=leer.nextDouble();
                    ejercitos.add(new Ejercito(nombre,region,victorias,dinero));
                    break;
                    
                case 2:
                    System.out.print("Ingrese la posicion del ejercito que desea modificar: ");
                    int pos=leer.nextInt();
                    break;
            }
        }//fin while
    }//fin main
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static ArrayList<Ejercito> predefinido(){
        ArrayList<Ejercito> pre = new ArrayList<>();
        pre.add(new Ejercito("Rojo", "Zocovia", 0, 500));
        pre.get(0).getSoldados().add(new General(1, "Juan P.", 23, "Masculino"));
        pre.get(0).getSoldados().add(new Soldado("Ernesto C.", 31, "Masculino"));
        pre.get(0).getSoldados().add(new Soldado("Maria A.", 19, "Femenino"));
        pre.get(0).getSoldados().add(new Soldado("Enrique M.", 22, "Masculino"));
        pre.get(0).getSoldados().add(new Soldado("Marlon N.", 20, "Masculino"));
        pre.add(new Ejercito("Azul", "Checkoslovakia", 0, 750));
        return pre;
    }

    public static ArrayList<Arma> Armas(){
        ArrayList<Arma> pre = new ArrayList<>();
        pre.add(new Bomba("", 4, "Granada/Bomba", 100));
        pre.add(new Rifle(true, 15, 1, "Mp5", 55));
        pre.add(new ArmaBlanca("Plata", "Cuchillo oxidado", 5));
        pre.add(new Rifle(true, 40, 7, "Ak47", 78));
        return pre;
    }
    
}
