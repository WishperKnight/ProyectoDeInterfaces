package org.example.src.controlador;

import org.example.src.vista.VistaRegister;

import org.example.src.vista.VistaInicio;
import org.example.src.vista.VistaLogin;

public class ControladorVistaInicio {

	
	VistaInicio inicio;
	
	//Constructor donde pasamos la vista inicio
	public ControladorVistaInicio(VistaInicio inicio) {
		
		this.inicio=inicio;
		
	}
	

	//Metodo para dirigirnos a la ventana de inicio de sesion
	public void iniciarSesion(){
		
		//Aqui lo que hacemos es mostrar la ventana login y cerrar la ventana actual en la que estamos 
		VistaLogin login = new VistaLogin();
		login.setLocationRelativeTo(null);
		login.setVisible(true);
		inicio.dispose();
		
	}
	
	//Metodo para dirigirnos a la ventana de creacion de cuenta
	public void crearCuenta(){
		
		//Aqui lo que hacemos es mostrar la ventana register y cerrar la ventana actual en la que estamos 
		VistaRegister register = new VistaRegister();
		register.setLocationRelativeTo(null);
		register.setVisible(true);
		inicio.dispose();
		
	}
	
	
}
