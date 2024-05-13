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
public class EjerAbstractaInterfaces060421 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
                
//                Cuadrado c = new Cuadrado(3.0); 
//		System.out.println(c.area()); 
//		System.out.println(c.perimetro());

            Gato gato=new Gato(); 
            hazleHablar(gato); 
    
            Perro perro = new Perro();
            hazleHablar(perro);
            
            Cucu cucu=new Cucu(); 
            hazleHablar(cucu); 

    }
    
    public static void hazleHablar(Parlanchin sujeto){ 
            sujeto.habla(); 
    } 

    
}
