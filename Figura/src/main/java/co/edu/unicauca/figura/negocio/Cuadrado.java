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
public class Cuadrado extends Figura{

    public Cuadrado(float parLado) {
        super(parLado);
    }

    @Override
    public float CalcularArea() {
        return (float) Math.pow(this.x, 2);
    }
    
}
