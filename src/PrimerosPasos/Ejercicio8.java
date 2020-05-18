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
public class Ejercicio8 {
    
    public static void main(String[] args){
        /** FLUJO DE CONTROL CONDICIONALES Y BUCLES
 
         
        <----------Mediante consola---------->
        Scanner scanner=new Scanner (System.in);
        System.out.println("Introduce tu edad porfavor:");
        int edad=scanner.nextInt();
        if(edad >=18){
            System.out.println("usted es mayor de edad");
        }else{
            System.out.println("usted es menor de edad");
        }
        * -----------------------------------------------
        */
        
        
        String age=JOptionPane.showInputDialog("Introduce tu edad :");
        int age_p=Integer.parseInt(age);
        if(age_p < 18){
            
            System.out.println("Eres un adolescente");
            
        }else if(age_p <40){
            System.out.println("Eres joven");
            
        }else if(age_p <65){
            System.out.println("Eres maduro");
        }
        else{
            System.out.println("Cuidate");
        }
            
        
    }
     
        
        
    }
    

