package org.example.src.controlador;

import org.example.src.vista.VistaRegister;
import org.example.src.vista.Vestibulo;
import org.example.src.vista.VistaInicio;
import org.example.src.vista.VistaLogin;
/**
 * Vista donde tendremos las opciones principales de la aplicacion
 */
public class ControladorVistaInicio {

	
	VistaInicio inicio;
	
	/**
	 * Contructor de la clase donde le pasamos su vista asociada
	 * @param inicio vista asociada
	 */ 
	public ControladorVistaInicio(VistaInicio inicio) {
		
		this.inicio=inicio;
		
	}
	

	/**
	 * metodo que nos dirige a la ventana de inicio de sesion
	 */
	public void iniciarSesion(){
		
		//Aqui lo que hacemos es mostrar la ventana login y cerrar la ventana actual en la que estamos 
		VistaLogin login = new VistaLogin();
		login.setLocationRelativeTo(null);
		login.setVisible(true);
		inicio.dispose();
		
	}
	

	
	/**
	 * metodo que nos dirige a la ventana de creacion de cuenta
	 */
	public void crearCuenta(){
		
		//Aqui lo que hacemos es mostrar la ventana register y cerrar la ventana actual en la que estamos 
		VistaRegister register = new VistaRegister();
		register.setLocationRelativeTo(null);
		register.setVisible(true);
		inicio.dispose();
		
	}
	/**
	 * metodo que nos dirige a la ventana de vestibulo de la App
	 */
	public void goToLandingPage(){
		
		//Aqui lo que hacemos es mostrar la ventana vestibulo y cerrar la ventana actual en la que estamos 
		Vestibulo landing = new Vestibulo();
		landing.setLocationRelativeTo(null);
		landing.setVisible(true);
		inicio.dispose();
		
	}
	
}
