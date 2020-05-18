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
public class Ejercicio5 {
    
    public static void main(String[] args){
        /** CLASE STRING
         * 
         
         */
        String frase="Hoy es un estupendo dia para aprender a programar en Java";
        
        String frase_resume=frase.substring(1, 3);
        String frase_resume2=frase.substring(0, 29) + "para irnos a la yapla ..."+" y " + frase.substring(29, 57);
        
        String alumno1,alumno2;
        alumno1="David";
        alumno2="david";
        
        
        System.out.println(frase_resume);
        System.out.println(frase_resume2);
        System.out.println(alumno1.equals(alumno2)); 
        System.out.println(alumno1.equalsIgnoreCase(alumno2));
        
        
    }
    
}
