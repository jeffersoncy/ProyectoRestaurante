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
public class Rectangulo extends Figura{
    
    private float Y;
    
    public Rectangulo(float parX, float parY) {
        super(parX);
        this.Y = parY;
    }

    @Override
    public float CalcularArea() {
        return this.x*this.Y; 
    }
}
