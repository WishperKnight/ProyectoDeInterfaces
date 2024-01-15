package org.example.src.controlador;

import org.example.src.vista.VistaInicio;
import org.example.src.vista.VistaLogin;
import org.example.src.vista.VistaRegister;

public class ControladorVistaInicio {

	
	VistaInicio inicio;
	
	public ControladorVistaInicio(VistaInicio inicio) {
		
		this.inicio=inicio;
		
	}
	
	/**
	 * 
	 */
	public void iniciarSesion(){
		
		VistaLogin login = new VistaLogin();
		login.setLocationRelativeTo(null);
		login.setVisible(true);
		inicio.dispose();
		
	}
	
	public void crearCuenta(){
		
		VistaRegister register = new VistaRegister();
		register.setLocationRelativeTo(null);
		register.setVisible(true);
		inicio.dispose();
		
	}
	
	
}
