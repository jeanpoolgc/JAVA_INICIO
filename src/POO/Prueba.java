/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import javax.swing.JOptionPane;

/**
 *
 * @author Lourdes
 */
public class Prueba {
    
    
    
    public static void main (String[] args){
        
        
        Empleados empleados1=new Empleados("Paco");
        Empleados empleados2=new Empleados("Ana");
        Empleados empleados3=new Empleados("Jeanpool");
        System.out.println(empleados1.devuelveDatos());
        System.out.println(empleados2.devuelveDatos());
        System.out.println(empleados3.devuelveDatos());
        
        
        
    }
    
}


class Empleados{
    
    
    public Empleados(String nom){
        nombre=nom;
        seccion="Administracion";
        Id=IdSiguiente;
        IdSiguiente++;
        
    }
    
    
    private final String nombre;
    private String seccion;
    private int Id;
    private static int IdSiguiente=1;
    /** varibale en la cada obejto tiene cada uno su copia */
    
    /** setters*/
    
    public void cambiaSeccion(String seccion){
        this.seccion=seccion;    
    }
    
    
    
    
    
    /** getters*/
    
    public String devuelveDatos(){
        
        return "El nombre es :"+ nombre + " y la seccion es: "+seccion + " y el Id :"+Id;
    }
    
}