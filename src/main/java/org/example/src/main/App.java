
package org.example.src.main;

import java.awt.EventQueue;

import org.example.src.controlador.ControladorLogin;
import org.example.src.controlador.ControladorVistaRegister;
import org.example.src.vista.VistaInicio;


public class App {

	public static void main(String[] args) {
		// Invoca la ejecución de la aplicación en el hilo de despacho de eventos de
				// Swing.
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							
							//Aqui lo que hago es iniciar la ventana principal de la aplicacion
							VistaInicio inicio = new VistaInicio();
							inicio.setLocationRelativeTo(null);
							inicio.setVisible(true);
							
						} catch (Exception e) {
							// Captura y muestra cualquier excepción que ocurra durante la ejecución.
							e.printStackTrace();
						}
					}
				});
		ControladorVistaRegister cl = new ControladorVistaRegister(null);
		
		

	}

}



