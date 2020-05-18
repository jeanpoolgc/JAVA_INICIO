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
public class Ejercicio7_1 {
    
    
    public static void main(String[] args){
       /** Entrada y salida de datos II 
     * FORMATO DE RESULTADOS II
     * Utilizacion de la clase JOptionPane
     * parseInt
     */
    
    String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre porfavor");
    
    String edad=JOptionPane.showInputDialog("Introduce tu edad");
    
    int edad_usuario=Integer.parseInt(edad);
    
    edad_usuario+=1;
    
    System.out.println("Hola "+ nombre_usuario + " el que año que viene tendras "+(edad_usuario));
    
        
    }
    
    
    
}
