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
class  Gato extends Animal{ 
      
    @Override
    public void habla(){
        System.out.println("¡Miau!");
      } 

    @Override
    public void respirar() {
       System.out.println("inhalo, exhalo");  //To change body of generated methods, choose Tools | Templates.
    }
}

