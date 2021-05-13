/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsi;

import java.util.Scanner;

/**
 *
 * @author pc06
 */
public class DSI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dias= new Scanner (System.in);
        String nomdia;
        System.out.println("Ingrese un número para saber que día es: ");
        int día = dias.nextInt();
        switch (día){
            case 1: nomdia = "LUNES";
             break;
            case 2: nomdia = "MARTES";
             break; 
            case 3: nomdia = "MIERCOLES";
             break;
            case 4: nomdia = "JUEVES";
             break; 
            case 5: nomdia = "VIERNES";
             break;
            case 6: nomdia = "SABADO";
             break;
            case 7: nomdia = "DOMINGO";
             break;
            default: nomdia = "Dia Invalido";
             break;
  
    } 
       System.out.println (nomdia); 
    }
    
}
