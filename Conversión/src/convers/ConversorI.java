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
public class ConversorI implements ITransformador{
    double valor;
    
    @Override
    public double grado2radian(){
        return (valor*Math.PI)/180;
    }
    
    @Override
    public double kelvin2celsius(){
        return (valor-273.15);
    }
}
