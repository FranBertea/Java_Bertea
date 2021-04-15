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
public class While2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada= new Scanner (System.in);
        int a;
        int b;
        System.out.println("Ingrese dos numeros distintos:");
        a=entrada.nextInt();
        b=entrada.nextInt();
        
        while(a==b){
            System.out.println("¡¡Ingrese dos numeros distintos!!");
        a=entrada.nextInt();
        b=entrada.nextInt();  
        }
        
        if(a<b){
           System.out.println("El numero mas grande es: "+b);
           System.out.println("El numero mas chico es: "+a);
         }else{ 
          System.out.println("El numero mas grande es: "+a);
          System.out.println("El numero mas chico es: "+b);
        }
            
    }
    
}
