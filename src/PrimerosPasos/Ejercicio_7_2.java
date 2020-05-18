/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimerosPasos;

/**
 *
 * @author Lourdes
 */
import javax.swing.*;
public class Ejercicio_7_2 {
    
    
    public static void main( String[] args){
        
        /**%1.2f cuenta el numero de decimales 
        double x=10000.0;
        System.out.printf("%1.2f",x/3);*/
        String num=JOptionPane.showInputDialog("Introduce un numero");
        double num_c=Double.parseDouble(num);
        System.out.print("La raiz de "+num_c +" es ");
        System.out.printf("%1.2f", Math.sqrt(num_c));
       
        
        
    }
    
}
