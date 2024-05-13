/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_interface;

/**
 *
 * @author Martin Vargas
 */
public class Cuadrado extends PoligonoRegular {
	
        public Cuadrado(double lado) { 
		super(4,lado);
	}


        @Override
        public double area() { 
		return lado * lado;
	}

    
 }

