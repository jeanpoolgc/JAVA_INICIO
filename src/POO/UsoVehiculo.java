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
public class UsoVehiculo {
    
    public static void main(String [] args){
        
        Coche micoche1=new Coche();//* Instanciar una clase */
        micoche1.establece_color("Rojo");
        Furgoneta mifurgoneta1=new Furgoneta(580,7);
        mifurgoneta1.establece_color("Azul");
        mifurgoneta1.configura_asiento("Si");
        mifurgoneta1.configura_climatizador("Si");
        System.out.println(micoche1.dime_datos_generales() + " "+micoche1.dime_color());
        System.out.println(mifurgoneta1.dime_datos_generales() + " "+ mifurgoneta1.dimeDatosFurgoneta() );
        
        
        
        
        /** Pasar Parametros mediante JOptionPane */
        /**String color=JOptionPane.showInputDialog("Indica un color");
        micoche.establece_color(color);
        String asiento=JOptionPane.showInputDialog("¿Tiene asientos cueros?");
        micoche.configura_asiento(asiento);
        
        String climatizador=JOptionPane.showInputDialog("¿Tiene climatizador?");
        micoche.configura_climatizador(climatizador);
        
        
        System.out.println(micoche.dime_datos_generales());
        System.out.println(micoche.dime_color());
        System.out.println(micoche.dime_asiento());
        System.out.println(micoche.dime_climatizador());
        System.out.println(micoche.dime_peso_coche());
        System.out.println("El precio final del coche "+micoche.precio_coche());
        */
       /** System.out.println("El numero de las ruedas del coche es : "+Renault + " ruedas");*/
    
    
    
    }
    
}
