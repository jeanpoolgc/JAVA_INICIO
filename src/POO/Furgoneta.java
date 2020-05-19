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
public class Furgoneta extends Coche{
    
   /** Java no admite herencia multiple*/
    
    private int capacidad_carga;
    private int plazas_extras;
    
    
    public Furgoneta(int capacidad_carga,int plazas_extras){
    super();/* llama al constructor de la clase padre */
    this.capacidad_carga=capacidad_carga;
    this.plazas_extras=plazas_extras;           
    }
    
    /********* getter *********/
    
    public String dimeDatosFurgoneta(){
        return"La capacidad de carga es: "+capacidad_carga +" Y las plazas son: "+plazas_extras;
    }
    /***************/
    
    
    
}
