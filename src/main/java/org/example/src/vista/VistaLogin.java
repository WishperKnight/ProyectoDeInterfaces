package org.example.src.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.example.src.controlador.ControladorLogin;
import org.example.src.utiles.Utiles;

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import java.awt.Font;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
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
import javax.swing.JMenuBar;
import javax.swing.JMenu;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(VistaLogin.class.getResource("/assets/imagenes/logoMercadona.png")));
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
		
		//jlabel Sign in
		JLabel lbTitulo = new JLabel("Sign in");
		lbTitulo.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		lbTitulo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
		lbTitulo.setBounds(122, 22, 80, 40);
		contentPane.add(lbTitulo);
		
		//Boton iniciar sesion
		JButton btnIniciarSesion = new JButton("");
		btnIniciarSesion.setIcon(new ImageIcon(VistaLogin.class.getResource("/assets/imagenes/iniciarSesionImagenBoton.png")));
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
		btnAudio.setIcon(new ImageIcon(VistaLogin.class.getResource("/assets/imagenes/IconoBotonAudio.png")));
		btnAudio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Llamamos al metodo reproducirAudio
				reproducirAudio();
				
			}
		});
		btnAudio.setBounds(271, 34, 42, 32);
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
		
		//JMenuItem menuItemVolverAtras con el que podremos volver a la ventana anterior
		JMenuItem menuItemVolverAtras = new JMenuItem("Volver hacia atras");
		menuItemVolverAtras.setForeground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuItemVolverAtras.setBackground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		menuItemVolverAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Llamamos al metodo volverAtras
				volverAtras();
				
			}
		});
		
		//JMenuItem menuItemReproducirAudio con el que podremos reproducir el audio de ayuda
		JMenuItem menuItemReproducirAudio = new JMenuItem("Reproducir audio de ayuda");
		menuItemReproducirAudio.setForeground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuItemReproducirAudio.setBackground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		menuItemReproducirAudio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Llamamos al metodo reproducirAudio
				reproducirAudio();
				
			}
		});
		
		menuContextual.add(menuItemReproducirAudio);
		menuContextual.add(menuItemVolverAtras);
		menuContextual.add(menuItemIniciarSesion);
		contentPane.setComponentPopupMenu(menuContextual);
		
		//Boton btnAtras para volver a la ventana anterior
		JButton btnAtras = new JButton("");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Llamamos al metodo volverAtras
				volverAtras();
				
			}
		});
		btnAtras.setIcon(new ImageIcon(VistaLogin.class.getResource("/assets/imagenes/IconoBotonAtras.png")));
		btnAtras.setBackground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		btnAtras.setBounds(10, 34, 42, 32);
		
		contentPane.add(btnAtras);
		
		//Aniado ToolTips mediante el metodo de la clase Utiles
		Utiles.toolTip(tfUsuario, "Inserta el nombre de usuario");
		Utiles.toolTip(btnIniciarSesion, "Iniciar sesion");
		Utiles.toolTip(pfContrasenia, "Inserta la contraseña");
		Utiles.toolTip(btnAudio, "Reproducir audio que explica el funcionamiento de esta ventana");
		Utiles.toolTip(btnAtras, "Volver a la anterior ventana");
		
		//MenuBar para el menu general
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 323, 22);
		menuBar.setBackground(Utiles.convertirColorJava(Utiles.COLOR_AZUL));
		contentPane.add(menuBar);
		
		//JMenu menuVolver que contendra el JMenuItem menuItemVolver
		JMenu menuVolver = new JMenu("Volver");
		menuVolver.setBackground(Utiles.convertirColorJava(Utiles.COLOR_AZUL));
		menuVolver.setForeground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuBar.add(menuVolver);
		
		//JMenuItem menuItemVolver con el que volveremos a la anterior ventana
		JMenuItem menuItemVolver = new JMenuItem("Volver a la anterior ventana");
		menuItemVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Llamamos al metodo volverAtras
				volverAtras();
				
			}
		});
		menuItemVolver.setBackground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuItemVolver.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		menuVolver.add(menuItemVolver);
		
		//JMenu menuSesion que contendra el JMenuItem menuItemSesionIniciar
		JMenu menuSesion = new JMenu("Sesion");
		menuSesion.setBackground(Utiles.convertirColorJava(Utiles.COLOR_AZUL));
		menuSesion.setForeground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuBar.add(menuSesion);
		
		//JMenuItem menuItemVolver con el que iniciaremos sesion con los datos introducidos
		JMenuItem menuItemSesionIniciar = new JMenuItem("Iniciar sesion");
		menuItemSesionIniciar.setBackground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuItemSesionIniciar.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		menuSesion.add(menuItemSesionIniciar);
		
		//JMenu menuAudio que contendra el JMenuItem menuItemAudioReproducir
		JMenu menuAudio = new JMenu("Audio");
		menuAudio.setBackground(Utiles.convertirColorJava(Utiles.COLOR_AZUL));
		menuAudio.setForeground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuBar.add(menuAudio);
		
		//JMenuItem menuItemAudioReproducir con el que reproduciremos el audio de ayuda
		JMenuItem menuItemAudioReproducir = new JMenuItem("Reproducir audio de ayuda");
		menuItemAudioReproducir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Llamamos al metodo reproducirAudio
				reproducirAudio();
				
			}
		});
		menuItemAudioReproducir.setBackground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuItemAudioReproducir.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		menuAudio.add(menuItemAudioReproducir);
		
		//Atajos de teclado
		menuItemVolver.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.CTRL_MASK));
		menuItemSesionIniciar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.CTRL_MASK));
		menuItemAudioReproducir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.CTRL_MASK));
		
	}
	
	//Metodo para iniciar sesion
	public void iniciarSesion() {
		
	}
	
	//Metodo para volver hacia atras
	public void volverAtras() {
		
		//Llamamos al metodo volverAtras del controlador
		controlador.volverAtras();
		
	}
	
	//Metodo para reproducir audio de ayuda
	public void reproducirAudio() {
		
		//Llamamos al metodo reproducirAudio del controlador
		controlador.reproducirAudio();
		
	}
	
}
