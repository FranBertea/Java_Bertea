/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Repaso_2;

import java.util.Scanner;

/**
 *
 * @author franb
 */
public class Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        float radio;
        float longitud;
        float area;
        
        System.out.println("Ingrese el radio de una circunferencia: ");
        radio=teclado.nextFloat(); 
        
        longitud=(float)(2*Math.PI*radio);
        area=(float)(Math.PI*(Math.pow(radio,2)));
        
        System.out.println("El area de la circunferencia es: "+area);
        System.out.println("La longitud de la circunferencia es: "+longitud);
       
    }
    
}
