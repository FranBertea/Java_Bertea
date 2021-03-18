/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso_de_java;

import java.util.Scanner;
/**
 *
 * @author pc06
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner (System.in);
        
        String nombre;
        double a;
        double b;
        double c;
        double d;
        
         System.out.println("Ingrese nombre del trabajador: ");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese costo por horas trabajadas: ");
        a = entrada.nextDouble();
        
        System.out.println("Ingrese hs que va a trabajar en el mes: ");
        b = entrada.nextDouble();
        
        c = a*b;
        d = c*12;
        
        System.out.println("El salario de "+nombre+  "será de: " + c);
        System.out.println("El ingreso anual de " +nombre+ "será de: " + d);
        
    }
    
}
