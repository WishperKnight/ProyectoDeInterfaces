package org.example.src.controlador;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

import org.example.src.vista.VistaInicio;
import org.example.src.vista.VistaLogin;

import org.example.src.utiles.Utiles;

public class ControladorLogin {
	
	VistaLogin login;
	
	//Constructor donde pasamos la vista Login
	public ControladorLogin(VistaLogin login) {
		
		this.login=login;
		
	}
	
	//Metodo para iniciar sesion
	public void iniciarSesion() {
		
		
		
		
	}
	
	//Metodo para volver hacia atras
	public void volverAtras() {
		
		VistaInicio inicio = new VistaInicio();
		inicio.setLocationRelativeTo(null);
		login.dispose();
		inicio.setVisible(true);
		
		
		
	}
	
	//Metodo para reproducir audio de ayuda
	public void reproducirAudio() {
		
		
		
		//Almacenamos el archivo de audio en una variable File
		File archivoAudio = new File("/assets/audios/audioLogin.wav");
		
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
