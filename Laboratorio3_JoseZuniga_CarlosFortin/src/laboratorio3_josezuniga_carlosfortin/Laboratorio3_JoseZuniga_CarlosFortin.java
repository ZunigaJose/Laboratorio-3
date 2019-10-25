package laboratorio3_josezuniga_carlosfortin;

import java.util.ArrayList;
import java.util.Scanner;
public class Laboratorio3_JoseZuniga_CarlosFortin {
    public static Scanner leer=new Scanner(System.in);
    public static void main(String[] args) {
        
        ArrayList<Ejercito> ejercitos=new ArrayList();
        int opcion=0;
        while(opcion!=11)
        {
            System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s", "Ingrese una opcion: ","1. Agregar ejercito", "2. Modificar ejercito", "3. Listar ejercitos", "4. Eliminar un ejercito", "5. Agregar soldados", "6. Listar soldados", "7. Eliminar un soldado", "8. Agregar armas", "9. Listar armas", "10. Eliminar un arma", "11. Salir", "Opcion Ingresada: ");
            opcion=leer.nextInt();
            
            switch(opcion){
                case 1:
                    
                    break;
                    
                case 2:
                    
                    break;
            }
        }//fin while
    }//fin main
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ArrayList<Ejercito> predefinido(){
        ArrayList<Ejercito> pre = new ArrayList<>();
        pre.add(new Ejercito());
        return pre;
    }


    
}
