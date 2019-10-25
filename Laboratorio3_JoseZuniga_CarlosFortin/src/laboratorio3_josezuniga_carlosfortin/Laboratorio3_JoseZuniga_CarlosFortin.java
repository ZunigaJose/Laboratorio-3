package laboratorio3_josezuniga_carlosfortin;

import java.util.ArrayList;
import java.util.Scanner;
public class Laboratorio3_JoseZuniga_CarlosFortin {
    public static Scanner leer=new Scanner(System.in);
    public static void main(String[] args) {
        
        ArrayList<Ejercito> ejercitos = new ArrayList();
        int opcion=0;
        while(opcion!=9)
        {
            System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s", "Ingrese una opcion: ","1. Agregar ejercito", "2. Modificar ejercito", "3. Listar ejercitos", "4. Eliminar un ejercito", "5. Listar soldados", "6. Eliminar un soldado", "7. Listar armas", "8. Eliminar un arma", "9. Salir", "Opcion Ingresada: ");
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
                    if(pos>ejercitos.size()-1)
                        System.out.println("La posicion ingresada no es valida");
                    else
                    {
                        System.out.printf("%s\n%s\n%s\n%s\n%s\n%s", "Ingrese que desea modificar: ", "1. El nombre del ejercito", "2. La region", "3. La cantidad de victorias", "4. Dinero disponible", "5. Regresar");
                        int op2=leer.nextInt();
                        switch(op2)
                        {
                            case 1:
                                System.out.print("Ingrese el nuevo nombre: ");
                                nombre=leer.next();
                                ejercitos.get(pos).setNombre(nombre);
                                break;
                                
                            case 2:
                                System.out.print("Ingrese la nueva region: ");
                                region=leer.next();
                                ejercitos.get(pos).setRegion(region);
                                break;
                                
                            case 3:
                                System.out.print("Ingrese la nueva cantidad de victorias: ");
                                victorias=leer.nextInt();
                                ejercitos.get(pos).setVictorias(victorias);
                                break;
                                
                            case 4:
                                System.out.print("Ingrese la nueva cantidad de dinero disponible: ");
                                dinero=leer.nextDouble();
                                ejercitos.get(pos).setDinero(dinero);
                                break;
                                
                            case 5:
                                break;
                                
                            case 6:
                                System.out.println("La opcion ingresada no es valida");
                                break;
                        }
                    }
                    break;
            }
        }//fin while
    }//fin main
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ArrayList<Ejercito> predefinido(){
        ArrayList<Ejercito> pre = new ArrayList<>();
        pre.add(new Ejercito("Rojo", "Zocovia", 0, 500));
        pre.get(0).getSoldados().add(new Soldado("", 23, ""));
        pre.add(new Ejercito("Azul", "Checkoslovakia", 0, 750));
        return pre;
    }


    
}
