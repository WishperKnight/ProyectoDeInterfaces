package org.example.src.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.example.src.utiles.*;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Vestibulo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vestibulo frame = new Vestibulo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Vestibulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 922, 612);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));


		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\yeray\\OneDrive\\Documentos\\GitHub\\ProyectoDeInterfaces\\src\\main\\java\\org\\example\\src\\imagenes\\mercadona.png"));
		lblNewLabel.setBounds(0, 0, 400, 58);
		contentPane.add(lblNewLabel);
	}
}
