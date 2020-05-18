/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimerosPasos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Lourdes
 */
public class Ejercicio8_3 {
    
    
    public static void main(String[]args){
        
        /** Condicionales y Bucles III */
        
        /** Ejemmplo WHILE */
        
        
        String clave="Jeanpool";
        String pass="";
        while(clave.equals(pass) == false){
           pass=JOptionPane.showInputDialog("Introduce la contraseña , porfavor");
           if(clave.equals(pass)==false){
              System.out.println("Contraseña incorrecta");
           }
        }
        System.out.println("Contraseña correcta. Acceso permitido");
        
        
    }
    
}
