package org.example.src.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorLogin;
import utiles.Utiles;

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class VistaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField tfUsuario;
	private JPasswordField pfContrasenia;
	private JLabel lbError;
	private ControladorLogin controlador = new ControladorLogin(this);

	/**
	 * Create the frame.
	 */
	public VistaLogin() {
		setTitle("Iniciar sesion");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VistaLogin.class.getResource("/imagenes/logoMercadona.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 339, 366);
		contentPane = new JPanel();
		contentPane.setBackground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//textfield para insertar el usuario
		tfUsuario = new JTextField();
		tfUsuario.setBounds(38, 102, 235, 25);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		
		//jlabel usuario para el textfield usuario
		JLabel lbUsuario = new JLabel("Usuario");
		lbUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lbUsuario.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		lbUsuario.setBounds(38, 77, 59, 14);
		contentPane.add(lbUsuario);
		
		//jlabel contrasenia para el passwordField contrasenia
		JLabel lbContrasenia = new JLabel("Contrasenia");
		lbContrasenia.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lbContrasenia.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		lbContrasenia.setBounds(38, 171, 112, 14);
		contentPane.add(lbContrasenia);
		
		//Etiqueta que al principio sera invisible, pero en caso de error a la hora de insertar las credenciales mostrara un mensaje
		lbError = new JLabel("");
		lbError.setForeground(Utiles.convertirColorJava(Utiles.COLOR_ROJO));
		lbError.setFont(new Font("Verdana", Font.PLAIN, 13));
		lbError.setBounds(10, 232, 313, 25);
		contentPane.add(lbError);
		
		//jlabel Login
		JLabel lbTitulo = new JLabel("Sign in");
		lbTitulo.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		lbTitulo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
		lbTitulo.setBounds(122, 11, 80, 40);
		contentPane.add(lbTitulo);
		
		//Boton iniciar sesion
		JButton btnIniciarSesion = new JButton("");
		btnIniciarSesion.setIcon(new ImageIcon(VistaLogin.class.getResource("/imagenes/iniciarSesionImagenBoton.png")));
		btnIniciarSesion.setBackground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		btnIniciarSesion.setForeground(new Color(255, 255, 255));
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				
				
				
			}
		});
		btnIniciarSesion.setBounds(110, 268, 112, 48);
		contentPane.add(btnIniciarSesion);
		
		//Boton para reproducir el audio de ayuda
		JButton btnAudio = new JButton("");
		btnAudio.setBackground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		btnAudio.setIcon(new ImageIcon(VistaLogin.class.getResource("/imagenes/IconoBotonAudio.png")));
		btnAudio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Llamamos al metodo reproducirAudio
				reproducirAudio();
				
			}
		});
		btnAudio.setBounds(271, 23, 42, 32);
		contentPane.add(btnAudio);
		
		
		//PasswordField pfContrasenia donde insertare la contraseña de inicio de sesion
		pfContrasenia = new JPasswordField();
		pfContrasenia.setBounds(38, 196, 235, 25);
		contentPane.add(pfContrasenia);
		
		
		//JPopupMenu menuContextual que contendra los JMenuItem menuItemIniciarSesion, menuItemVolverAtras y menuItemReproducirAudio los cuales podremos acceder haciendo click derecho
		JPopupMenu menuContextual = new JPopupMenu();
		
		//JMenuItem menuItemIniciarSesion con el que podremos iniciar sesion
		JMenuItem menuItemIniciarSesion = new JMenuItem("Iniciar sesion");
		menuItemIniciarSesion.setForeground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuItemIniciarSesion.setBackground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		menuItemIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				
			}
		});
		
		JMenuItem menuItemVolverAtras = new JMenuItem("Volver hacia atras");
		menuItemVolverAtras.setForeground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuItemVolverAtras.setBackground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		menuItemVolverAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				volverAtras();
				
			}
		});
		
		JMenuItem menuItemReproducirAudio = new JMenuItem("Reproducir audio de ayuda");
		menuItemReproducirAudio.setForeground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuItemReproducirAudio.setBackground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		menuItemReproducirAudio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				reproducirAudio();
				
			}
		});
		
		menuContextual.add(menuItemReproducirAudio);
		menuContextual.add(menuItemVolverAtras);
		menuContextual.add(menuItemIniciarSesion);
		contentPane.setComponentPopupMenu(menuContextual);
		

		JButton btnAtras = new JButton("");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				volverAtras();
				
			}
		});
		btnAtras.setIcon(new ImageIcon(VistaLogin.class.getResource("/imagenes/IconoBotonAtras.png")));
		btnAtras.setBackground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		btnAtras.setBounds(10, 23, 42, 32);
		
		contentPane.add(btnAtras);
		
		//Aniado ToolTips mediante el metodo de la clase Utiles
		Utiles.toolTip(tfUsuario, "Inserta el nombre de usuario");
		Utiles.toolTip(btnIniciarSesion, "Iniciar sesion");
		Utiles.toolTip(pfContrasenia, "Inserta la contraseña");
		Utiles.toolTip(btnAudio, "Reproducir audio que explica el funcionamiento de esta ventana");
		Utiles.toolTip(btnAtras, "Volver a la anterior ventana");
		
	}
	
	//Metodo para iniciar sesion
	public void iniciarSesion() {
		
	}
	
	//Metodo para volver hacia atras
	public void volverAtras() {
		
		controlador.volverAtras();
		
	}
	
	//Metodo para reproducir audio de ayuda
	public void reproducirAudio() {
		
		//Llamamos al metodo reproducirAudio del controlador
		controlador.reproducirAudio();
		
	}
	
}
