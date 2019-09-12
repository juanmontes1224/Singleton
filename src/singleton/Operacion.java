/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author estudiantes
 */
public class Operacion {
    
	private static Operacion instancia;
	
	private Operacion() {			//Constructor privado, permite no crear mas instancias adicionales
		
	}
	
	
	public static Operacion getInstancia() {			//Metodo para acceder a la instancia, unicamente mediante este
		if(instancia == null) {
			instancia = new Operacion();
		}
		return instancia;
	}
	
	//Metodos de prueba
	public void Sumar(int x, int y) {
		System.out.println(x+y);
	}
	
	public void Restar(int x, int y) {
		System.out.println(x-y);
	}
}
