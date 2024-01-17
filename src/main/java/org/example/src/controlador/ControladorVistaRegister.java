package org.example.src.controlador;

import org.example.src.vista.VistaRegister;

import org.example.src.vista.VistaInicio;

/**
 * 
 */
public class ControladorVistaRegister {

	VistaRegister register;

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
		try {

			String primerApellidos = null;
			String segundoApellidos = null;

			if (apellidos.contains(" ") == true) {// Comprueba si son dos apellidos buscando el espacio
				/*
				 * separa el primer apellido en un substring desde el primer
				 * 
				 * caracter hasta el espacio
				 */
				primerApellidos = apellidos.substring(0, apellidos.indexOf(" "));
				/*
				 * separa el segundo apellidos desde el espacio hasta el ultimo caracter
				 */
				segundoApellidos = apellidos.substring(primerApellidos.length(), apellidos.length()).trim();
			} else {
				System.err.print("Debe introducir dos apellidos");
			}
			// forma el userName concatenando los tres primeros caracteres del nombre, y
			// primer y segundo apellido
			userName = nombre.substring(0, 3).concat(primerApellidos.substring(0, 3))
					.concat(segundoApellidos.substring(0, 3)).toLowerCase().trim();
			System.out.println(userName);
			return userName;
		} catch (Exception e) {
			System.err.println("Debe introducir dos apellidos");
		}
		return userName;

	}

}
