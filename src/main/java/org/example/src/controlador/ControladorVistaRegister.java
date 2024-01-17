package org.example.src.controlador;


import org.example.src.vista.VistaRegister;

import org.example.src.vista.VistaInicio;

public class ControladorVistaRegister {
	
	VistaRegister register;
	
	//Constructor donde pasamos la vista register
	public ControladorVistaRegister(VistaRegister register) {
		
		this.register=register;
		
	}
	
	//Metodo para volver hacia atras
	public void volverAtras() {
		
		//Aqui lo que hacemos es mostrar la ventana anterior a la de register (osea, mostramos la ventana de inicio) y 
		//posteriormente cerramos la ventana actual en la que estamos
		VistaInicio inicio = new VistaInicio();
		inicio.setLocationRelativeTo(null);
		register.dispose();
		inicio.setVisible(true);
		
		
		
	}

}
