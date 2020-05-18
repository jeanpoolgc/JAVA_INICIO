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
public class Ejercicio9_2 {
    
    
    public static void main(String[]args){
        
    /** MATRICES BIDIMENSIONALES */
    
    int [][] matrix=new int[4][5];
    
    matrix[0][0]=14;
    matrix[0][1]=15;
    matrix[0][2]=15;
    matrix[0][3]=18;
    matrix[0][4]=20;
    
    matrix[1][0]=89;
    matrix[1][1]=17;
    matrix[1][2]=30;
    matrix[1][3]=31;
    matrix[1][4]=10;
    
    matrix[2][0]=18;
    matrix[2][1]=25;
    matrix[2][2]=22;
    matrix[2][3]=87;
    matrix[2][4]=9;
    
    matrix[3][0]=7;
    matrix[3][1]=2;
    matrix[3][2]=3;
    matrix[3][3]=11;
    matrix[3][4]=15;
    
    for(int i=0;i<4;i++){
        System.out.println("Bucle "+i);
        for(int j=0;j<5;j++){
            System.out.println("la matrix "+"["+i+"]"+"["+j+"] es: "+matrix[i][j]);
        }
        
    }
            
            
    
      

    
        
    }
}
