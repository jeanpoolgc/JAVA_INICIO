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
public class Ejercicio9_1 {
    
    
    public static void main (String[]args){
        /**BUCLE ARRAY 2 */
        
        /**String [] paises=new String[8];
        paises[0]="España";
        paises[1]="Mexico";
        paises[2]="Colombia";
        paises[3]="Peru";
        paises[4]="Chile";
        paises[5]="Argentina";
        paises[6]="Bolivia";
        paises[7]="Venezuela";
        */
       /** for(int i=0;i<paises.length;i++){
            System.out.println(" Pais "+(i+1)+" " +paises[i]);
            
        }
        */
      /** String[]paises={"España","Mexico","Colombia","Peru","Chile","Venezuela","Bolivia"};*/
      /** String [] paises=new String[8];
       for(int i=0;i<8;i++){
           paises[i]=JOptionPane.showInputDialog("Introduce el pais " + (i+1));
       }
      
       for(String elemento: paises){
           System.out.println("Pais "+elemento);
       }
        */
      
      int [] matriz_aleatorio=new int[150];
      for(int i=0;i<matriz_aleatorio.length;i++){
          matriz_aleatorio[i]=(int)Math.round(Math.random()*100);
      }
      for(int numero:matriz_aleatorio){
          System.out.print(numero + " ");
          
      }
        
        
        
        
    }
    
}
