package org.example.src.vista;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;

import controlador.ControladorVistaInicio;
import utiles.Utiles;

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class VistaInicio extends JFrame {

	private JPanel contentPane;
	private ControladorVistaInicio controlador = new ControladorVistaInicio(this);

	/**
	 * Create the frame.
	 */
	public VistaInicio() {
		setTitle("Ventana Inicio");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(VistaInicio.class.getResource("/imagenes/logoMercadona.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbImagen = new JLabel("");
		lbImagen.setIcon(new ImageIcon(VistaInicio.class.getResource("/imagenes/mercadona.png")));
		lbImagen.setBounds(85, 24, 418, 76);
		contentPane.add(lbImagen);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(270, 186, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnIniciarSesion = new JButton("Iniciar sesion");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				dirigirnosVentanaIniciarSesion();
				
			}
		});
		btnIniciarSesion.setBounds(22, 308, 168, 23);
		btnIniciarSesion.setBackground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		btnIniciarSesion.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		contentPane.add(btnIniciarSesion);
		
		JButton btnCrearCuenta = new JButton("Crear cuenta");
		btnCrearCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dirigirnosVentanaCrearCuenta();
				
				
			}
		});
		btnCrearCuenta.setBounds(402, 308, 168, 23);
		btnCrearCuenta.setBackground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		btnCrearCuenta.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		contentPane.add(btnCrearCuenta);
		
				JPopupMenu menuContextual = new JPopupMenu();
				
				JMenuItem menuItemIniciarSesion = new JMenuItem("Iniciar sesion");
				menuItemIniciarSesion.setForeground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
				menuItemIniciarSesion.setBackground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
				menuItemIniciarSesion.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						dirigirnosVentanaIniciarSesion();
						
					}
				});
				
				JMenuItem menuItemCrearCuenta = new JMenuItem("Crear cuenta");
				menuItemCrearCuenta.setForeground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
				menuItemCrearCuenta.setBackground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
				menuItemCrearCuenta.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						dirigirnosVentanaCrearCuenta();
						
					}
				});
				
				JMenuItem menuItemUsuarioInvitado = new JMenuItem("Acceder como invitado");
				menuItemUsuarioInvitado.setForeground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
				menuItemUsuarioInvitado.setBackground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
				menuItemUsuarioInvitado.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
	
						
					}
				});
				
				menuContextual.add(menuItemUsuarioInvitado);
				menuContextual.add(menuItemCrearCuenta);
				menuContextual.add(menuItemIniciarSesion);
				contentPane.setComponentPopupMenu(menuContextual);
		
		JButton btnUsuarioInvitado = new JButton("Acceder como invitado");
		btnUsuarioInvitado.setForeground(new Color(63, 134, 113));
		btnUsuarioInvitado.setBackground(new Color(214, 234, 226));
		btnUsuarioInvitado.setBounds(212, 308, 168, 23);
		contentPane.add(btnUsuarioInvitado);
		
		//Aniado ToolTips mediante el metodo de la clase Utiles
		Utiles.toolTip(btnIniciarSesion, "Inicia sesion con una cuenta existente");
		Utiles.toolTip(btnUsuarioInvitado, "Accede como usuario invitado, aqui no hace falta tener una cuenta creada");
		Utiles.toolTip(btnCrearCuenta, "Crea una nueva cuenta de usuario");
		Utiles.toolTip(menuItemIniciarSesion, "Inicia sesion con una cuenta existente");
		Utiles.toolTip(menuItemUsuarioInvitado, "Accede como usuario invitado, aqui no hace falta tener una cuenta creada");
		Utiles.toolTip(menuItemCrearCuenta, "Crea una nueva cuenta de usuario");
		
		
		
	}
	
	public void dirigirnosVentanaIniciarSesion() {
		
		controlador.dirigirnosVentanaIniciarSesion();
		
	}
	
	public void dirigirnosVentanaCrearCuenta() {
		
		controlador.dirigirnosVentanaCrearCuenta();
		
	}

}
