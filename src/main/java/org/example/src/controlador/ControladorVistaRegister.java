package org.example.src.controlador;

import org.example.src.vista.VistaRegister;

import java.io.File;
import java.sql.SQLException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JTextField;

import org.example.src.modelo.UserAccount;
import org.example.src.modelo.UserAccountDAO;
import org.example.src.utiles.*;

import org.example.src.vista.VistaInicio;

/**
 * Contrlador de la vista encargada de registrar el usuario en la bbdd
 */
public class ControladorVistaRegister {
	VistaInicio inicio = new VistaInicio();
	VistaRegister register;
	
	

	// Constructor donde pasamos la vista register
	public ControladorVistaRegister(VistaRegister register) {

		this.register = register;

	}

	/**
	 * Registra un usuario en la base de datos.
	 * 
	 * Este método utiliza los campos del formulario de registro para crear un
	 * objeto UserAccount y lo inserta en la base de datos a través de la clase
	 * UserAccountDAO. Antes de realizar la inserción, valida los campos y verifica
	 * si la contraseña es segura.
	 * 
	 * @throws SQLException Si ocurre un error durante la inserción en la base de
	 *                      datos.
	 */
	public void registrarUsuarioEnLaBBDD() {
		// Crear instancias necesarias
		UserAccount userAccount;
		UserAccountDAO userAccountDAO = new UserAccountDAO();
		int cont = 0;
		System.out.println("nombre: "+register.tfNombreR.getText());
		// Crear un objeto UserAccount con los datos del formulario de registro
		userAccount = new UserAccount(register.tfNombreR.getText(), register.tfApellidos.getText(),
				createUserName(register.tfNombreR.getText(), register.tfApellidos.getText()),
				register.tfContrasenia.getText().trim(), register.tfDireccionEnvio.getText(),
				register.tfNumeroTelefono.getText(), register.tfCorreo.getText());
		// Validar los campos y verificar la seguridad de la contraseña
		if (validateFields() == true && contrasenaSegura(register.tfContrasenia.getText().toString()) == true) {
			try {
				do {
					cont++;

					if (userAccountDAO.comprobarUser(userAccount.getName()) != true) {
						// Intentar insertar el usuario en la base de datos
						userAccountDAO.insertarUser(userAccount);
						this.inicio.setVisible(true);
                        this.inicio.setLocationRelativeTo(null);
						register.dispose();

					} else {
						Utiles.showErrorDialog(register, "Error: Usuario ya existente",
								"El nombre de usuario ya se encuentra en uso");
					}

				} while (userAccountDAO.comprobarUser(userAccount.getName()) != true);

			} catch (SQLException e) {
				// controlamos los errores que puedan surgir
				e.printStackTrace();
			}
		} else if (validateFields() == true) {
			Utiles.showErrorDialog(register, "Contraseña no validia",
					"La contraseña debe contern 8 caracteres entre los cuales debe incluir, unamayuscula, una minuscula, un numero y un carater especial");
			System.err.println("constraseña no valida: no se han cumplido los requisitos");
		} else {
			System.err.println("campos esenciales vacios: no se han cumplido los requisitos");

		}
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
	 * Metdod que valida si una contraseña es segura o no
	 * 
	 * @param contrasena
	 * @return
	 */
	public boolean contrasenaSegura(String contrasena) {
		// Verificar la longitud de la contraseña
		if (contrasena.length() < 8) {
			return false;
		}

		boolean contieneMayuscula = false;
		boolean contieneNumero = false;
		boolean contieneMinuscula = false;
		boolean contieneSimboloEspecial = false;

		for (char caracter : contrasena.toCharArray()) {
			if (Character.isUpperCase(caracter)) {
				contieneMayuscula = true;
			} else if (Character.isDigit(caracter)) {
				contieneNumero = true;
			} else if (Character.isLowerCase(caracter)) {
				contieneMinuscula = true;
			} else {
				String caracteresEspeciales = "!@#$%^&*()-_=+[]{}|;:'\",.<>/?";
				if (caracteresEspeciales.contains(String.valueOf(caracter))) {
					contieneSimboloEspecial = true;
				}
			}
		}

		// Verificar si todos los criterios están cumplidos
		return contieneMayuscula && contieneNumero && contieneMinuscula && contieneSimboloEspecial;
	}

	/**
	 * Metodo para settear el userName en la vista de registro para que el usuario
	 * lo vea
	 */

	public void setUsername() {
		Utiles.showErrorDialog(register, "Nombre de Usuario: ",
				createUserName(register.tfNombreR.getText(), register.tfApellidos.getText()));
		register.tfUsuario.setText(createUserName(register.tfNombreR.getText(), register.tfApellidos.getText()));

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
		String segundoApellido = null;
		String primerApellido = null;

		if (nombre.isEmpty()) {

			System.err.println("Error, debe insertar un nombre");

		} else {

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

				if (nombre.length() < 3 || primerApellido.length() < 3 || segundoApellido.length() < 3) {

					System.err.println("Error, nombre y/o apellidos demasiado" + " cortos");

				} else {

					// forma el userName concatenando los tres primeros caracteres del nombre, y
					// primer y segundo apellido
					userName = nombre.substring(0, 3).concat(primerApellido.substring(0, 3))
							.concat(segundoApellido.substring(0, 3)).toLowerCase().trim();
					System.out.println(userName);

				}

			} else {
				System.err.print("Error, debe introducir dos apellidos");

			}

		}

		return userName;

	}

	/**
	 * Método para validar que los campos obligatorios han sido rellenados.
	 * 
	 * @return true si todos los campos están completos, false de lo contrario.
	 */
	private boolean validateFields() {
		if (campoVacio(register.tfNombreR.getText()) || campoVacio(register.tfApellidos.getText())
				|| campoVacio(register.tfContrasenia.getText()) || campoVacio(register.tfDireccionEnvio.getText())
				|| campoVacio(register.tfCorreo.getText())) {
			return false;
		}
		return true;
	}

	/**
	 * Verifica si un campo está vacío y muestra un mensaje de error si es
	 * necesario.
	 * 
	 * @param campo  El campo a verificar.
	 * @param nombre El nombre del campo (para el mensaje de error).
	 * @return true si el campo está vacío, false si no.
	 */
	private boolean campoVacio(String campo) {
		if (campo.isEmpty()) {
			Utiles.showErrorDialog(register, "Campos esenciales vacios", "Por favor rellene los campos marcados con *");
			System.err.println("El campo debe estar completo");
			return true;
		}
		return false;
	}

	/**
	 * Metodo para reproducir un audio de ayuda
	 */
	public void reproducirAudio() {

		// Almacenamos el archivo de audio en una variable File
		File archivoAudio = new File("src/main/java/assets/audios/audioRegister.wav");

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
