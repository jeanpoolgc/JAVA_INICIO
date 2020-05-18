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
public class Ejercicio8_4 {
    
    public static void main(String [] args){
    /** CONDICIONALES Y BUCLES IV  */
    int aleatorio=(int)(Math.random()*100);
    Scanner sc=new Scanner (System.in);
    int numero=0;
    int intentos=0;
    while(numero!=aleatorio){
        intentos++;
        System.out.println("Introduce un numero");
        numero=sc.nextInt();
        if(aleatorio < numero){
            System.out.println("Mas bajo");
        }else if(aleatorio > numero){
            System.out.println("Mas alto");
            
        }
        
    }
    System.out.println("Correcto, lo has conseguido en "+intentos +" intentos");
            
    }
    
}
