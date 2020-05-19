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
public class UsoEmpleado {    
    public static void main (String [] args){
        
    /**Empleado empleado1=new Empleado("Paco Gomez",85000,1990,12,17);
    Empleado empleado2=new Empleado("Ana Lopez",95000,1995,06,02);
    Empleado empleado3=new Empleado("Maria Martin",105000,2002,03,15);
    
    empleado1.subeSueldo(5);
    empleado2.subeSueldo(5);
    empleado3.subeSueldo(5);
    
    System.out.println("Nombre :"+empleado1.dimeNombre() + " Sueldo: "+empleado1.dimeSueldo()+" Fecha Alta: "+empleado1.dameFechaContrato());
    System.out.println("Nombre :"+empleado2.dimeNombre() + " Sueldo: "+empleado2.dimeSueldo()+" Fecha Alta: "+empleado2.dameFechaContrato());
    System.out.println("Nombre :"+empleado3.dimeNombre() + " Sueldo: "+empleado3.dimeSueldo()+" Fecha Alta: "+empleado3.dameFechaContrato());
    */
    Jefatura jefe_RR=new Jefatura("Jeanpool",55000,2006,9,25);
    jefe_RR.estableceIncentivo(2570);
    Empleado [] misEmpleados=new Empleado[6];
    misEmpleados[0]=new Empleado("Paco Gomez",85000,1990,12,17);
    misEmpleados[1]=new Empleado("Ana Lopez",95000,1995,06,02);
    misEmpleados[2]=new Empleado("Maria Martin",105000,2002,03,15);
    misEmpleados[3]=new Empleado("Jeanpool Guerrero");
    misEmpleados[4]=jefe_RR;/**--Polimorfismo: Prinicipio de sustitucion*/
    misEmpleados[5]=new Jefatura("Maria",95000,1999,5,26);
    Jefatura jefa_Finanzas=(Jefatura)misEmpleados[5];/** CASTING CONVERTIR UN OBJETO A otro */
    jefa_Finanzas.estableceIncentivo(55000);
    
    
     
    /** for(int i=0;i<3; i++){
        misEmpleados[i].subeSueldo(5);
        
    }
    
    for(int i=0;i<3;i++){
        System.out.println("Nombre "+misEmpleados[i].dimeNombre() + "Sueldo: "+misEmpleados[i].dimeSueldo()+ "Fecha Alta: "+misEmpleados[i].dameFechaContrato());
    }
    */

    for(Empleado elementos:misEmpleados){
        
     elementos.subeSueldo(5);
     
    }
    
    for(Empleado elementos:misEmpleados){
        System.out.println("Nombre: "+elementos.dimeNombre()+ " Sueldo: "+elementos.dimeSueldo()+ " Alta Contrato: "+elementos.dameFechaContrato());
    }
    
    }  
}

/** UNA CLASE DENTRO DE UNA CLASE PRINCIPAL*/
class Empleado{  
/** Constructor  */
public Empleado(String nom,double sue,int año, int mes, int dia){
    
nombre=nom;
sueldo=sue;
GregorianCalendar calendario=new GregorianCalendar(año,mes-1,dia);
altacontrato=calendario.getTime();


}
/** Sobrecarga de constructores  */
public Empleado(String nom){    
    this(nom,30000,2000,01,01);
    
}

/**GETTER */

public String dimeNombre(){
    return nombre;
    
}

public double dimeSueldo(){
    
    return sueldo;
}

public Date dameFechaContrato(){
    
    return altacontrato;
}

/** SETTER */


public void subeSueldo( double porcentaje){
    double aumento=sueldo*porcentaje/100;
    sueldo+=aumento;
}


private String nombre;
private double sueldo;
private Date altacontrato;



  
}



class Jefatura extends Empleado{    /** FINAL NO PODRA UTILIZAR NINGUN METODO  */
   
    public Jefatura(String nom,double sue, int agno,int mes,int dia){
        
    super(nom,sue,agno,mes,dia);    
        
    }
    /** setter */
    public void estableceIncentivo(double b){
        incentivo=b;
    } 
    /**********/
    /** getter */
    public double dimeSueldo(){
        double sueldoJefe=super.dimeSueldo();
        return sueldoJefe + incentivo;
    } 
    /***********/  
    private double incentivo;
   
}
