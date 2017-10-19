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
        //miConversor.dato=80.24;
        
        System.out.println(miConversor.farenheit2kelvin());
        System.out.println(miConversor.grado2radian());
        
        ConversorI miInt=new ConversorI();
        System.out.println(miInt.grado2radian());
        System.out.println(miInt.kelvin2celsius());
    }
}
