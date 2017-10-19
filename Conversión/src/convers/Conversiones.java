/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convers;

/**
 *
 * @author user
 */
public class Conversiones {
    
    public static void main(String[] args){
        ConversorC miConversor = new ConversorC();
        
        miConversor.dato=80.24;
        
        System.out.println("De Farenheit a Kelvin: "+miConversor.farenheit2kelvin());
        System.out.println("De Grado a Radian: "+miConversor.grado2radian());
        
        
        
        ConversorI miInt=new ConversorI();
        miInt.valor=38.58;
        System.out.println("De Grado a Radian: "+miInt.grado2radian());
        System.out.println("De Kelvin a Celsius:"+miInt.kelvin2celsius());
    }
}
