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
public class Ejercicio4 {
    
    public static void main (String [] args){
        
        /**
         * OTROS CALCULOS NUMERICOS Y CLASE MATH
         *  CLASE JAVA
         * -PROPIAS: es un clase que creamos y tiene un unico metodo
         * -PREDEFINIDAS: son clases construidas dentro de la programcion en JAVA, y la utuilizaremos cuando las necesitemos
         * API JAVA:biblioteca de todas las apis de java
         * URL:https://www.pildorasinformaticas.es/unit/java-estructuras-principales-i-video-4/?id=3836
         *Math.sqrt --> RAIZ CUADRADA
         * Math.pow(BASE,EXPONENTE) -->EXPONENTE
         * Math.sin(ANGULO)
         * Math.round()-> refundiciones int raiz = (int)Math.round(num1)
         * Math.PI
         */
        double raiz= Math.sqrt(9);
       
        double num1=5.85;
        int resultado=(int)Math.round(num1);
        
        double base=5;
        double exponente=3;
        int resultado2=(int)Math.pow(base,exponente);
     
        
        System.out.println(raiz);
        System.out.println(resultado);
        System.out.println("El resultado de "+base+" elevado a "+exponente+" es "+resultado2);
        
        
        
    }
    
}
