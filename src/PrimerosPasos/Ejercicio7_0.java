/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimerosPasos;

import java.util.Scanner;

/**
 *
 * @author Lourdes
 */
public class Ejercicio7_0 {
    
    
    public static void main(String [] args){
        /**
         * Entrada y salida de datos
         * Formato de resultados
         * 
         * IGU: INTERFAZ GRAFICA DE USUARIO
         * LOS METODOS QUE NO SON ESTATICOS IMPLICA QUE TIENES QUE CREAR UN OBJETO PARA UTILIZAR EL METODO
         * Constructor es un metodo
         */
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce tu nombre");
        String nombre_usuario=entrada.nextLine();
        System.out.println("Introduce tu edad");
        int edad=entrada.nextInt();
        System.out.println("Hola " + nombre_usuario + " el año que viene tendras "+ (edad+1) +" años");
        
        
        
        
    }
    
}
