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
public class Ejercicio8_2 {
    
    
    
    public static void main (String[] args){
       
        /**FLUJO DE CONTROL CONDICIONAL Y BUCLES II */
        Scanner sc=new Scanner (System.in);
        System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Trian gulo \n4: Circulo ");
        int figura=sc.nextInt();
        switch(figura){
            case 1: 
                
                int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
                int area_cuadrado=lado*lado;
                double area_c=(int)Math.pow(lado, 2);
                System.out.println("El area del cuadrado es: "+area_cuadrado);
                System.out.println("El area del cuadrado es: "+area_c);
                
            break;
            
            case 2:
                
                int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("El area del rectangulo es: "+base*altura);
                
            break;
            
            
            case 3:
                 base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                 altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                 System.out.println("El area del triangulo es: "+(base*altura)/2);
            break;
            
            
            case 4:
                int radio =Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
                System.out.println("El area del circulo es: ");
                System.out.printf("%1.2f", Math.PI*(Math.pow(radio,2)));
                
             break;
             
            default:
                System.out.println("La opcion no es correcta");
        
    }
    
}
}
