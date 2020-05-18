/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author Lourdes
 */
public class Coche {
    
    private int ruedas; /**encapsular la propiedad de clase */
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma; 
    private int peso_total;
    private String color;
    private boolean asiento_cuero,climatizador;
    
    
    
    
/** METODO CONTRUCTOR: es un metodo que se encargar de dar un estado inical de un objeto*/

public Coche(){
    
    ruedas=4;
    largo=2000;
    ancho=300;
    motor=1600;
    peso_plataforma=500;
}
/** EJEMPLO DE UN METODO GETTERS*/
public String dime_datos_generales(){
return "La paltaforma del vehiculo tiene "+ ruedas +" ruedas " +
            " Mide "+ largo/100 +" metros con un ancho de " + ancho + 
            "cm y un peso de plataforma de "+ peso_plataforma + "kg";
            
}
public String dime_color(){
    return "El color del coche es: "+color;
}
public String dime_asiento(){
    
    if(asiento_cuero==true){
    return "Este coche tiene asientos de cuero";
    }else{
        return"Este coche tiene asientos de serie";
    }
    }

public String dime_climatizador(){
    if(climatizador==true){
        return"El coche tiene climatizador";
    }else{
        return"El coche lleva aire acondicionado";
    }
}

public int precio_coche(){
    int precio_final=10000;
    if(asiento_cuero== true){
        precio_final+=2000;
    }
    if(climatizador==true){
        precio_final+=1500;
    }
    return precio_final;
}

/** EJEMPLO DE UN METODO SETTERS */
public void establece_color(String color_coche){
    color=color_coche;
}

public void configura_asiento(String asiento_cuero){
    if(asiento_cuero.equalsIgnoreCase("si")){
        this.asiento_cuero=true;
    }else{
        this.asiento_cuero=false;
    }
    
    
}

public void configura_climatizador(String climatizador){
    if(climatizador.equalsIgnoreCase("si")){
       this.climatizador=true;
    }else{
        this.climatizador=false;
    }  
    
}

/** getter y setter combinacion */
public String dime_peso_coche(){
    int peso_carroceria=500;
    peso_total = peso_plataforma+peso_carroceria;
    if(asiento_cuero==true){
        peso_total=peso_total+50;
    }
    if(climatizador==true){
        peso_total=peso_total+20;
    }
    return "El peso del coche es: "+peso_total;
    
}





}

/**----setters definidores
 * Modifica el valor de las propieades de los objetos
 * Indica que el metodo no devuelve ningun valor
 * public void nombre_metodo(){}
 * ----getters captadores
 * devolver el valor de las propiedades del los objetos
 * sintaxis: public data_a_devolver nombre_metodo(){codigo +return}
*/

