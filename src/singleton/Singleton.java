/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

public class Singleton {

    public static void main(String[] args) {
        int x = 2;
		int y = 2;
		Operacion c = Operacion.getInstancia();
                Operacion d = Operacion.getInstancia();
		c.Sumar(x,y);
		d.Restar(x,y);
	
		
		
    }
    
}
