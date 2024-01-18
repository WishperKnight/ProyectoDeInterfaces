package org.example.src.controlador;

import org.example.src.vista.VistaRegister;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import org.example.src.utiles.*;

import org.example.src.vista.VistaInicio;

/**
 * 
 */
public class ControladorVistaRegister {

	static VistaRegister register;

	// Constructor donde pasamos la vista register
	public ControladorVistaRegister(VistaRegister register) {

		this.register = register;

	}

	/**
	 * Metodo para volver a hacia la vista anterior
	 */
	public void volverAtras() {

		// Aqui lo que hacemos es mostrar la ventana anterior a la de register (osea,
		// mostramos la ventana de inicio) y
		// posteriormente cerramos la ventana actual en la que estamos
		VistaInicio inicio = new VistaInicio();
		inicio.setLocationRelativeTo(null);
		register.dispose();
		inicio.setVisible(true);

	}

	/**
	 * Metodo para settear el userName en la vista de registro para que el usuario
	 * lo vea
	 */
	
	public void setUsername() {
		register.getTfUsuario().setText(createUserName(register.getTfNombre().getText().toString(),
				register.getTfApellidos().getText().toString()));

	}

	/**
	 * Metodo para crear el username desde los datos de nombre y apllido usando las
	 * tres primeras letras del nombre, las tres primeras del primer apellido y las
	 * tres primeras del segundo apellido
	 * 
	 * @param nombre    nombre del usuario
	 * @param apellidos apellidos del usuario
	 * @return userName Nombre del usuario autogenerado
	 */
	private static String createUserName(String nombre, String apellidos) {


			String userName = null;
			
			String primerApellido = null;
			String segundoApellido = null;
			
			if (nombre.isEmpty()) {
				
				System.err.println("Error, debe insertar un nombre");
				Utiles.showErrorDialog(register , "Error", "Se debe de insertar un nombre");
				
			}else {
				
				if (apellidos.contains(" ") == true) {// Comprueba si son dos apellidos buscando el espacio
					/*
					 * separa el primer apellido en un substring desde el primer
					 * 
					 * caracter hasta el espacio
					 */
					primerApellido = apellidos.substring(0, apellidos.indexOf(" "));
					/*
					 * separa el segundo apellidos desde el espacio hasta el ultimo caracter
					 */
					
					
					segundoApellido = apellidos.substring(primerApellido.length(), apellidos.length()).trim();
					
					if (nombre.length()<3 || primerApellido.length()<3 || segundoApellido.length()<3) {
						
						
						System.err.println("Error, nombre y/o apellidos demasiado"
								+ " cortos");
						Utiles.showErrorDialog(register , "Error", "Nombres y/o apellidos demasiado cortos");

						
					}else {
						
						// forma el userName concatenando los tres primeros caracteres del nombre, y
						// primer y segundo apellido
						userName = nombre.substring(0, 3).concat(primerApellido.substring(0, 3))
								.concat(segundoApellido.substring(0, 3)).toLowerCase().trim();
						System.out.println(userName);
						
					}
					
					
					
				} else {
					System.err.print("Error, debe introducir dos apellidos");
					Utiles.showErrorDialog(register , "Error", "Se debe de introducir dos apellidos");

				}


				
			}
			
			return userName;


	}
	
	//Metodo para reproducir audio de ayuda
	public void reproducirAudio() {
		
		
		
		//Almacenamos el archivo de audio en una variable File
		File archivoAudio = new File("src/main/java/assets/audios/audioRegister.wav");
		
		try {
			//Almacenamos el audio en un objeto AudioInputStream
			AudioInputStream audio = AudioSystem.getAudioInputStream(archivoAudio);
			//Obtenemos un clip con el que podremos reproducir el sonido
			Clip clip = AudioSystem.getClip();
			//Abrimos el flujo de audio
			clip.open(audio);
			//Reproduzco el audio
			clip.start();
		
		} catch (Exception exception) {
			// TODO Auto-generated catch block
			exception.printStackTrace();
		}

		
		
	}

}
