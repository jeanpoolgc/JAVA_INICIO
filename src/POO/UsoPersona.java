/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Lourdes
 */
public class UsoPersona {
    
    
    public static void main(String [] args){
        
        Persona [] lasPersonas=new Persona[2];
        lasPersonas[0]=new Empleado2("Luis Conde",2000,2009,02,25);
        lasPersonas[1]=new Alumno("Pedro","Administracion");
        
        for(Persona p:lasPersonas){
            
            System.out.println(p.DameNombre() + " , " + p.DameDescripcion());
            
        }
    } 
}

abstract class Persona{
    
    public Persona(String nom){
        nombre=nom;
        
    }
    
    public String DameNombre(){
        
        return nombre;
    }
    
    public abstract String DameDescripcion();
    
    private String nombre;
     
}

/** UNA CLASE DENTRO DE UNA CLASE PRINCIPAL*/
class Empleado2 extends Persona{  
/** Constructor  */
public Empleado2(String nom,double sue,int año, int mes, int dia){
    
super(nom);
sueldo=sue;
GregorianCalendar calendario=new GregorianCalendar(año,mes-1,dia);
altacontrato=calendario.getTime();
Id=IdSiguiente;
IdSiguiente++;


}
/**GETTER */

public double dimeSueldo(){
    
    return sueldo;
}

public Date dameFechaContrato(){
    
    return altacontrato;
}

public String DameDescripcion(){
    return "Este empleado tiene un ID: " +Id + " y con un sueldo " +sueldo;
    
}

/** SETTER */


public void subeSueldo( double porcentaje){
    double aumento=sueldo*porcentaje/100;
    sueldo+=aumento;
}

private double sueldo;
private Date altacontrato;
private int Id;
private static int IdSiguiente=1;

  
}

class Alumno extends Persona{
public Alumno(String nom,String car){    
    super(nom);
    carrera=car;

}

/**getter */

public String DameDescripcion(){    
return "Este alumno esta estudiando la carrera de " + carrera;
}

/*********/

private String carrera;

}







