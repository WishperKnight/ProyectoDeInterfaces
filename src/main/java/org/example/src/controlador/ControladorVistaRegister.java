package org.example.src.controlador;


import org.example.src.vista.VistaInicio;
import org.example.src.vista.VistaRegister;

public class ControladorVistaRegister {
	
	VistaRegister register;
	
	public ControladorVistaRegister(VistaRegister register) {
		
		this.register=register;
		
	}
	
	//Metodo para volver hacia atras
	public void volverAtras() {
		
		VistaInicio inicio = new VistaInicio();
		inicio.setLocationRelativeTo(null);
		register.dispose();
		inicio.setVisible(true);
		
		
		
	}

}
