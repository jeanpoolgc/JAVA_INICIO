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
public class Ejercicio9 {
    
    public static void main(String[] args){
        
        /** 
         MATRIZ: estructura de datos que contiene una coleccion de valores
         * del mismo tipo
         *Sintaxis: int[] mi_matriz=new int[10]; 
         * 
         * 
         * 
         */
       /** int [] mi_matriz=new int[5];
        mi_matriz[0]=5;
        mi_matriz[1]=51;
        mi_matriz[2]=52;
        mi_matriz[3]=53;
        mi_matriz[4]=54;
        
        for(int i=0;i<5;i++){
            System.out.println("El valor del indice "+ i +" = "+ mi_matriz[i]);
        }
        */
       
       int [] mi_matriz={5,51,52,53,54,14,25,78,88,12,78,50,12,74};
       for(int i=0;i<mi_matriz.length;i++){
            System.out.println("El valor del indice "+ i +" = "+ mi_matriz[i]);
        }
      
    }
    
}
