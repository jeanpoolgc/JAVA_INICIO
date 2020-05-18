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
public class Ejercicio9_1_1 {
    
    public static void main(String[]args){
        
        int cantidad=Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de paises"));
        for(int i=0;i<cantidad;i++){
            /**String []paises=new String[cantidad];
            paises[i]=JOptionPane.showInputDialog("Introduce el pais "+(i+1));
            System.out.println(paises[i]);
            * */
            
            String pais=JOptionPane.showInputDialog("Introduce el pais: "+ (i+1));
            System.out.println(pais);
            }      
        }
        
        
    }
    

