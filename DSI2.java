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
public class DSI2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner MESES= new Scanner (System.in);
        String NOMMES;
        System.out.println("Ingrese un número para saber que día es: ");
        int MES = MESES.nextInt();
        switch (MES){
            case 1: NOMMES = "ENERO";
             break;
            case 2: NOMMES = "FEBRERO";
             break; 
            case 3: NOMMES = "MARZO";
             break;
            case 4: NOMMES = "ABRIL";
             break; 
            case 5: NOMMES = "MAYO";
             break;
            case 6: NOMMES = "JUNIO";
             break;
            case 7: NOMMES = "JULIO";
             break;
            case 8: NOMMES = "AGOSTO";
             break;
            case 9: NOMMES = "SEPTIEMBRE";
             break;
            case 10: NOMMES = "OCTUBRE";
             break;
            case 11: NOMMES = "NOVIEMBRE";
             break;
            case 12: NOMMES = "DICIEMBRE";
             break;
            default: NOMMES = "Mes Invalido";
             break;             
  
    } 
       System.out.println (NOMMES); 
    }
    
}
