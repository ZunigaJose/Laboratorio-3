package laboratorio3_josezuniga_carlosfortin;

import java.util.ArrayList;
import java.util.Scanner;
public class Laboratorio3_JoseZuniga_CarlosFortin {
    public static Scanner leer=new Scanner(System.in);
    public static void main(String[] args) {
        String [][] tablero = new String[10][10];
        ArrayList<Ejercito> list = new ArrayList<>();
        list = predefinido();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        ArrayList<Ejercito> ejercitos = new ArrayList();
        int opcion=0;
        while(opcion!=9)
        {
            System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s", "Ingrese una opcion: ","1. Agregar ejercito", "2. Modificar ejercito", "3. Listar ejercitos", "4. Eliminar un ejercito", "5. Listar soldados", "6. Eliminar un soldado", "7. Listar armas", "8. Eliminar un arma", "9. Salir", "Opcion Ingresada: ");
            opcion=leer.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.print("Ingrese el nombre del ejercito: ");
                    leer.nextLine();
                    String nombre=leer.nextLine();
                    System.out.print("Ingrese el nombre de la region: ");
                    String region=leer.nextLine();
                    System.out.print("Ingrese la cantidad de victorias: ");
                    int victorias=leer.nextInt();
                    System.out.println("Ingrese la cantidad de dinero disponible: ");
                    double dinero=leer.nextDouble();
                    ejercitos.add(new Ejercito(nombre,region,victorias,dinero));
                    while(ejercitos.get(ejercitos.size()-1).getSoldados().size()<5){
                        System.out.print("Ingrese el nombre del soldado: ");
                        leer.nextLine();
                        nombre=leer.nextLine();
                        System.out.print("Ingrese la edad del soldado: ");
                        int edad=leer.nextInt();
                        System.out.print("Ingrese el sexo del soldado: ");
                        leer.nextLine();
                        String sexo=leer.nextLine();
                        System.out.printf("%s\n%s\n%s\n%s", "Ingrese el tipo de soldado: ", "1. General", "2. Caballero", "3. Ejecutor");
                        int tipo=leer.nextInt();
                        
                        switch(tipo){
                            case 1:
                                System.out.println("Ingrese el numero de años al mando: ");
                                int años=leer.nextInt();
                                System.out.printf("%s\n%s\n%s", "Ingrese el tipo de arma: ", "1. Rifle", "2. Arma blanca");
                                int selecArma=leer.nextInt();
                                switch(selecArma){
                                    case 1:
                                        System.out.print("Ingrese el nombre: ");
                                        leer.nextLine();
                                        String nomArma=leer.nextLine();
                                        System.out.println("Ingrese el precio del arma: ");
                                        double precioArma=leer.nextDouble();
                                        System.out.print("Ingrese el alcance maximo: ");
                                        int max=leer.nextInt();
                                        System.out.print("Ingrese el alcance minimo: ");
                                        int min=leer.nextInt();
                                        System.out.print("Es el arma automatica? [s/n]: ");
                                        char aut=leer.next().charAt(0);
                                        boolean au=false;
                                        if(aut=='s' || aut=='S')
                                            au=true;
                                        else if(aut=='n' || aut=='N')
                                            au=false;
                                        ejercitos.get(ejercitos.size()-1).getSoldados().add(new General(años,new Rifle(au,max,min,nomArma,precioArma),nombre,edad,sexo));
                                        break;
                                        
                                    case 2:
                                        System.out.print("Ingrese el nombre: ");
                                        leer.nextLine();
                                        nomArma=leer.nextLine();
                                        System.out.println("Ingrese el precio del arma: ");
                                        precioArma=leer.nextDouble();
                                        System.out.print("Ingrese el material");
                                        leer.nextLine();
                                        String material=leer.nextLine();
                                        ejercitos.get(ejercitos.size()-1).getSoldados().add(new General(años,new ArmaBlanca(material,nomArma,precioArma),nombre,edad,sexo));
                                        break;
                                        
                                    default:
                                        System.out.println("La opcion elegida no es valida");
                                        break;
                                }//fin switch arma
                                break;
                                
                            case 2:
                                System.out.printf("%s\n%s\n%s", "Ingrese el tipo de arma: ", "1. Rifle", "2. Arma blanca");
                                selecArma=leer.nextInt();
                                switch(selecArma){
                                    case 1:
                                        System.out.print("Ingrese el nombre: ");
                                        leer.nextLine();
                                        String nomArma=leer.nextLine();
                                        System.out.println("Ingrese el precio del arma: ");
                                        double precioArma=leer.nextDouble();
                                        System.out.print("Ingrese el alcance maximo: ");
                                        int max=leer.nextInt();
                                        System.out.print("Ingrese el alcance minimo: ");
                                        int min=leer.nextInt();
                                        System.out.print("Es el arma automatica? [s/n]: ");
                                        char aut=leer.next().charAt(0);
                                        boolean au=false;
                                        if(aut=='s' || aut=='S')
                                            au=true;
                                        else if(aut=='n' || aut=='N')
                                            au=false;
                                        ejercitos.get(ejercitos.size()-1).getSoldados().add(new Caballero(new Rifle(au,max,min,nomArma,precioArma),nombre,edad,sexo));
                                        break;
                                        
                                    case 2:
                                        System.out.print("Ingrese el nombre: ");
                                        leer.nextLine();
                                        nomArma=leer.nextLine();
                                        System.out.println("Ingrese el precio del arma: ");
                                        precioArma=leer.nextDouble();
                                        System.out.print("Ingrese el material");
                                        leer.nextLine();
                                        String material=leer.nextLine();
                                        ejercitos.get(ejercitos.size()-1).getSoldados().add(new Caballero(new ArmaBlanca(material,nomArma,precioArma),nombre,edad,sexo));
                                        break;
                                        
                                    default:
                                        System.out.println("La opcion elegida no es valida");
                                        break;
                                }//fin switch arma
                                break;
                                
                            case 3:
                                System.out.printf("%s\n%s\n%s", "Ingrese el tipo de arma: ", "1. Rifle", "2. Arma blanca");
                                selecArma=leer.nextInt();
                                switch(selecArma){
                                    case 1:
                                        System.out.print("Ingrese el nombre: ");
                                        leer.nextLine();
                                        String nomArma=leer.nextLine();
                                        System.out.println("Ingrese el precio del arma: ");
                                        double precioArma=leer.nextDouble();
                                        System.out.print("Ingrese el alcance maximo: ");
                                        int max=leer.nextInt();
                                        System.out.print("Ingrese el alcance minimo: ");
                                        int min=leer.nextInt();
                                        System.out.print("Es el arma automatica? [s/n]: ");
                                        char aut=leer.next().charAt(0);
                                        boolean au=false;
                                        if(aut=='s' || aut=='S')
                                            au=true;
                                        else if(aut=='n' || aut=='N')
                                            au=false;
                                        ejercitos.get(ejercitos.size()-1).getSoldados().add(new Ejecutor(new Rifle(au,max,min,nomArma,precioArma),nombre,edad,sexo));
                                        break;
                                        
                                    case 2:
                                        System.out.print("Ingrese el nombre: ");
                                        leer.nextLine();
                                        nomArma=leer.nextLine();
                                        System.out.println("Ingrese el precio del arma: ");
                                        precioArma=leer.nextDouble();
                                        System.out.print("Ingrese el material");
                                        leer.nextLine();
                                        String material=leer.next();
                                        ejercitos.get(ejercitos.size()-1).getSoldados().add(new Ejecutor(new ArmaBlanca(material,nomArma,precioArma),nombre,edad,sexo));
                                        break;
                                        
                                    default:
                                        System.out.println("La opcion elegida no es valida");
                                        break;
                                }//fin switch arma
                                break;
                        }//fin switch tipo
                    }//fin while
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
                    
                case 3:
                    String salida="";
                    for (Ejercito e : ejercitos) {
                        salida+=ejercitos.indexOf(e)+"- "+e+"\n";
                    }
                    System.out.println(salida);
                    break;
            }
        }//fin while
    }//fin main
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static ArrayList<Ejercito> predefinido(){
        ArrayList<Ejercito> pre = new ArrayList<>();
        ArrayList<Arma> preArmas = new ArrayList<>();
        preArmas = Armas();
        pre.add(new Ejercito("Rojo", "Zocovia", 0, 500));
        pre.get(0).getSoldados().add(new General(2, preArmas.get(1),"Juan P.", 23, "Masculino"));
        pre.get(0).getSoldados().add(new Caballero(preArmas.get(2), "Ernesto C.", 31, "Masculino"));
        pre.get(0).getSoldados().add(new Ejecutor(preArmas.get(3), "Maria A.", 19, "Femenino"));
        ((Ejecutor)pre.get(0).getSoldados().get(2)).getBombas().add(preArmas.get(0));
        pre.get(0).getSoldados().add(new Caballero(preArmas.get(4),"Enrique M.", 22, "Masculino"));
        pre.get(0).getSoldados().add(new Soldado("Marlon N.", 20, "Masculino"));
        pre.add(new Ejercito("Azul", "Checkoslovakia", 0, 750));
        return pre;
    }

    public static ArrayList<Arma> Armas(){
        ArrayList<Arma> pre = new ArrayList<>();
        pre.add(new Bomba("", 4, "Granada/Mini Bomba", 100));
        pre.add(new Rifle(true, 15, 1, "Mp5", 55));
        pre.add(new ArmaBlanca("Plata", "Cuchillo oxidado", 5));
        pre.add(new Rifle(true, 40, 7, "Ak47", 78));
        pre.add(new Rifle(true, 50, 10, "Asimov", 90));
        pre.add(new ArmaBlanca("Metal", "Navaja Filosa", 15));
        return pre;
    }
    
    public static boolean haySoldado(ArrayList<Ejercito> list, int [] pos){
        for (Ejercito e : list) {
            for (int i = 0; i < e.getSoldados().size(); i++) {
                if (e.getSoldados().get(i).getLugar() == pos) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static int [] posicionesIngreso (){
        System.out.print("Ingrese x:" );
        int x = leer.nextInt();
        leer.nextLine();
        while (x < 0 || x > 9) {
            System.out.print("Error Ingreso Incorrecto!!!\nVuelva a Intentar:");
            leer.nextInt();
            leer.nextLine();
        }
        System.out.print("Ingrese y:" );
        int y = leer.nextInt();
        leer.nextLine();
        while (y < 0 || y > 9) {
            System.out.print("Error Ingreso Incorrecto!!!\nVuelva a Intentar:");
            leer.nextInt();
            leer.nextLine();
        }
        int [] arr = new int[2];
        arr[0] = x;
        arr[1] = y;
        return arr;
    }
    
    public static int [] posiciones(ArrayList<Ejercito> list){
        int [] arr = new int[2];
        int x,y;
        while (true) {  
            x= (int)(0 + Math.random() * 9);
            y = (int)(0 + Math.random() * 9);
            arr[0] = x;
            arr[1] = y;
            if (!haySoldado(list, arr)) {
                break;
            }
        }
        return arr;
    }
    
    public static String[][] tablero(ArrayList<Ejercito> list){
        String[][] tablero = new String[10][10];
        int[] arr = new int[2];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablero[i][j] = " ";
            }
        }
        for (Ejercito e : list) {
            for (int i = 0; i < e.getSoldados().size(); i++) {
                arr = e.getSoldados().get(i).getLugar();
                tablero[arr[0]][arr[1]] = "*";
            }
        }
        return tablero;
    }
}
