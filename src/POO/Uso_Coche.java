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
public class Uso_Coche {
    
    public static void main(String [] args){
        
        Coche micoche=new Coche();//* Instanciar una clase */
        
        /** Pasar Parametros mediante JOptionPane */
        String color=JOptionPane.showInputDialog("Indica un color");
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
     
        
        
       /** System.out.println("El numero de las ruedas del coche es : "+Renault + " ruedas");*/
    }
    
}
