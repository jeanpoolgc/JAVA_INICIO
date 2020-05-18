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
public class Ejercicio8_7_1 {
    
    public static void main (String[] args){
        
        /**
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de la tabla de multplicar"));
        for(int i=0;i<13;i++){
            int mutiplicador = i*numero;
            System.out.println(i+" * "+numero+" : "+mutiplicador);
        }
        * */
        
        for(int i=0;i<13;i++){
            System.out.println("La tabla del "+i);
            for(int j=0;j<13;j++){
                int resultado=i*j;
                System.out.println(i +"*"+ j +":"+resultado);
            }
            
        }
        
        
        
        
    }
    
}
