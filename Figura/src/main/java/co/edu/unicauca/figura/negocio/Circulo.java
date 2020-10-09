/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.figura.negocio;

/**
 *
 * @author Personal
 */
public class Circulo extends Figura {

    public Circulo(float parRadio) {
        super(parRadio);
    }
    
    @Override
    public float CalcularArea() {
        return (float)(Math.PI*Math.pow(this.x, 2));
    }
    
}
