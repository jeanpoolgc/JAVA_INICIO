/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimerosPasos;

import javax.swing.JOptionPane;

/**
 *
 * @author Lourdes
 */
public class Ejercicio8_6 {
    
    public static void main(String[] args){
        
        /** BUCLES Y CONDICIONALES V 
         BUCLE FOR
         */
        int arroba=0;
        boolean punto=false;
        String email=JOptionPane.showInputDialog("Introduce tu email");
        for(int i=0;i<email.length();i++){
           if(email.charAt(i)=='@'){
               arroba++;
           }
           if(email.charAt(i)=='.'){
               punto=true;
           }
           
        }
        if(arroba==1 && punto==true){
            System.out.println("Es correcto");
        }else{
            System.out.println("No es correcto");
        }
        
    }
    
}
