package org.example.src.controlador;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

import org.example.src.vista.Vestibulo;
import org.example.src.vista.VistaInicio;
import org.example.src.vista.VistaLogin;
import org.example.src.modelo.UserAccountDAO;
import org.example.src.utiles.Utiles;

public class ControladorLogin {

	VistaLogin login;

	/**
	 * Cosntructor donse pasamos por parametros la vista con la que tranajamos 
	 * @param login la interfaz grafica del login
	 */
	public ControladorLogin(VistaLogin login) {

		this.login = login;

	}

	/**
	 * Metodo para iniciar sesion
	 */
	public void iniciarSesion() {
	    Vestibulo vest = new Vestibulo();

	    UserAccountDAO accountDAO = new UserAccountDAO();

	    // Obtener texto de los campos de texto y contraseña
	    String usuario = login.tfUsuario.getText().toLowerCase().trim();
	    char[] contraseniaCharArray = login.pfContrasenia.getPassword();
	    String contrasenia = new String(contraseniaCharArray).trim();

	    System.out.println(usuario + " " + contrasenia);

	    if (accountDAO.validarUser(usuario, contrasenia)) {
	        vest.setVisible(true);
	    } else {
	        login.lbError.setText("Credenciales incorrectas");
	        Utiles.showErrorDialog(login, "Error en las credenciales", "Contraseña o usuario incorrectos");
	    }
	}


	/**
	 * Metodo para volver a la pestaña anterior
	 */
	public void volverAtras() {

		// Aqui lo que hacemos es mostrar la ventana anterior a la de login (osea,
		// mostramos la ventana de inicio) y
		// posteriormente cerramos la ventana actual en la que estamos
		VistaInicio inicio = new VistaInicio();
		inicio.setLocationRelativeTo(null);
		login.dispose();
		inicio.setVisible(true);

	}

	/**
	 * Metodo para reproducir audio de ayuda
	 */
	public void reproducirAudio() {

		// Almacenamos el archivo de audio en una variable File
		File archivoAudio = new File("src/main/java/assets/audios/audioLogin.wav");

		try {
			// Almacenamos el audio en un objeto AudioInputStream
			AudioInputStream audio = AudioSystem.getAudioInputStream(archivoAudio);
			// Obtenemos un clip con el que podremos reproducir el sonido
			Clip clip = AudioSystem.getClip();
			// Abrimos el flujo de audio
			clip.open(audio);
			// Reproduzco el audio
			clip.start();

		} catch (Exception exception) {
			// TODO Auto-generated catch block
			exception.printStackTrace();
		}

	}

}
