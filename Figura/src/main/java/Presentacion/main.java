/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import co.edu.unicauca.figura.negocio.Circulo;
import co.edu.unicauca.figura.negocio.Cuadrado;
import co.edu.unicauca.figura.negocio.Figura;
import co.edu.unicauca.figura.negocio.Rectangulo;

/**
 *
 * @author Personal
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura figura;
        figura = new Circulo(3);        //circulo de radio 5
        System.out.println(figura.getClass());
        System.out.println("Area: "+figura.CalcularArea());
        figura = new Cuadrado(3);       //cuadrado de lado 3
        System.out.println(figura.getClass());
        System.out.println("Area: "+figura.CalcularArea());
        figura = new Rectangulo(5,4);   //rectangulo de alto 5 y ancho 4
        System.out.println(figura.getClass());
        System.out.println("Area: "+figura.CalcularArea());
        
    }
    
}
