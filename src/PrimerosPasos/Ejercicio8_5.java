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
public class Ejercicio8_5 {
    
    
    public static void main(String[] args){
        /** CONDICIONALES Y BUCLES V*/
    /**int aleatorio=(int)(Math.random()*100);
    Scanner sc=new Scanner (System.in);
    int numero=0;
    int intentos=0;
    do{
        intentos++;
        System.out.println("Introduce un numero");
        numero=sc.nextInt();
        if(aleatorio < numero){
            System.out.println("Mas bajo");
        }else if(aleatorio > numero){
            System.out.println("Mas alto");
            
        }
        
     }while(numero!=aleatorio);
     System.out.println("Correcto, lo has conseguido en "+intentos +" intentos");
             
    }*/
      
    String genero="";
    do{
        genero=JOptionPane.showInputDialog("Introduce tu genero (H/M)");      
    }while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
    
    int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
    int pesoideal=0;
    if(genero.equalsIgnoreCase("H")){
        pesoideal=altura-110;
    }else if(genero.equalsIgnoreCase("M")){
        pesoideal=altura-120;
    }
    
    System.out.println("Tu peso ideal es :"+pesoideal +"kilos");
    
    
    
    }
}
    

