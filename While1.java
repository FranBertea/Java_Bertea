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
public class While1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner (System.in);
        int b;
        System.out.println("Ingrese un numero del 1 al 100: ");
        b = entrada.nextInt();
         while(b<=100){
            System.out.println(b);
                    b++;
        }
    }
    
}
