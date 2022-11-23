/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mecanismoreflexion;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;
import javax.naming.Name;

/**
 *
 * @author Kyle7
 */
public class MecanismoReflexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {

        String msg = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa nombre de clase (Ejemplo java.util.Scanner) : ");

        msg = sc.next();
        Class clase = Class.forName(msg);

        obtenComponentes(clase);
        System.out.println(clase);

    }

    private static void obtenComponentes(Class clase) {

        Constructor[] constructor = clase.getDeclaredConstructors();
        Field[] field = clase.getFields();
        Method[] method = clase.getMethods();



        System.out.println("Nombre de la clase: " + clase.getName());

        System.out.println("**************************************************************");

        System.out.println("Los constructores de la clase " + clase.getName() + " son: ");
        for (int i = 0; i < constructor.length; i++) {
            System.out.println(constructor[i]);
        }
        System.out.println("**************************************************************");

        System.out.println("Los fields de la clase : " + clase.getName() + " son: ");
        for (int i = 0; i < field.length; i++) {
            System.out.println(field[i]);
        }
        System.out.println("**************************************************************");
        
        
        System.out.println("Los metodos de la clase : " + clase.getName() + " son: ");
        for (int i = 0; i < method.length; i++) {
            System.out.println(method[i]);

        }
        System.out.println("**************************************************************");

    }

}
