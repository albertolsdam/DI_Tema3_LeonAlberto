package introspeccionreflexion;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IntrospeccionReflexion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nombreClase;
        Constructor constructores[];
        Method metodos[];
        Field campos[];
        
        System.out.println("Introduce el nombre de la clase");
        nombreClase=scan.nextLine();
        
        Class cl1;
        
        try {
            cl1=Class.forName(nombreClase);
            System.out.println("Nombre: "+cl1.getName()+"\n");
            constructores=cl1.getConstructors();
            metodos=cl1.getMethods();
            campos=cl1.getDeclaredFields();
            
            System.out.println("Los constructores son:");
            for(int i=0;i<constructores.length;i++)
            {
                System.out.println("Constructor "+(i+1)+": "+constructores[i].toString());
            }

            System.out.println("");
            
            System.out.println("Los metodos son:");
            for(int i=0;i<metodos.length;i++)
            {
                System.out.println("Metodo "+(i+1)+": "+metodos[i].toString());
            }
            
            System.out.println("");
            
            System.out.println("Los campos son:");
            for(int i=0;i<campos.length;i++)
            {
                System.out.println("Campo "+(i+1)+": "+campos[i].toString());
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IntrospeccionReflexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
