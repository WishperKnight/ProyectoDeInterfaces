package org.example.src.controlador;

import vistas.VistaInicio;
import vistas.VistaLogin;
import vistas.VistaRegister;

public class ControladorVistaInicio {

	
	VistaInicio inicio;
	
	public ControladorVistaInicio(VistaInicio inicio) {
		
		this.inicio=inicio;
		
	}
	
	/**
	 * 
	 */
	public void dirigirnosVentanaIniciarSesion(){
		
		VistaLogin login = new VistaLogin();
		login.setLocationRelativeTo(null);
		login.setVisible(true);
		inicio.dispose();
		
	}
	
	public void dirigirnosVentanaCrearCuenta(){
		
		VistaRegister register = new VistaRegister();
		register.setLocationRelativeTo(null);
		register.setVisible(true);
		inicio.dispose();
		
	}
	
	
}
