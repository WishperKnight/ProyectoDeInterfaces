package org.example.src.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.example.src.utiles.*;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.JMenu;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * La clase Vestibulo representa la interfaz gr�fica principal de la aplicaci�n.
 */
public class Vestibulo extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Constructor de la clase que crea el frame del Vest�bulo.
     */
    public Vestibulo() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 922, 612);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(255, 255, 255));
        setJMenuBar(menuBar);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setForeground(new Color(0, 150, 96));
        menuBar.add(lblNewLabel);
        lblNewLabel.setIcon(new ImageIcon(Vestibulo.class.getResource("/org/example/src/imagenes/mercadona.png")));

        JMenu mnNewMenu_1 = new JMenu("Opciones");
        mnNewMenu_1.setForeground(new Color(0, 147, 94));
        mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
        menuBar.add(mnNewMenu_1);

        JMenuItem mntmNewMenuItem = new JMenuItem("Inicio");
        mnNewMenu_1.add(mntmNewMenuItem);

        JMenuItem mntmNewMenuItem_2 = new JMenuItem("Cuenta");
        mnNewMenu_1.add(mntmNewMenuItem_2);

        JMenuItem mntmNewMenuItem_1 = new JMenuItem("Cerrar Sesi�n");
        mnNewMenu_1.add(mntmNewMenuItem_1);

        JMenuItem mntmNewMenuItem_9 = new JMenuItem("Salir");
        mnNewMenu_1.add(mntmNewMenuItem_9);

        JMenu mnNewMenu = new JMenu("Categor�as");
        mnNewMenu.setForeground(new Color(0, 147, 94));
        mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 20));
        menuBar.add(mnNewMenu);

        JMenuItem mntmNewMenuItem_3 = new JMenuItem("B�sico");
        mnNewMenu.add(mntmNewMenuItem_3);

        JMenuItem mntmNewMenuItem_4 = new JMenuItem("Carnes y pescados");
        mnNewMenu.add(mntmNewMenuItem_4);

        JMenuItem mntmNewMenuItem_5 = new JMenuItem("Vegetales");
        mnNewMenu.add(mntmNewMenuItem_5);

        JMenuItem mntmNewMenuItem_6 = new JMenuItem("Frutas");
        mnNewMenu.add(mntmNewMenuItem_6);

        JMenuItem mntmNewMenuItem_7 = new JMenuItem("Bebidas");
        mnNewMenu.add(mntmNewMenuItem_7);

        JMenuItem mntmNewMenuItem_8 = new JMenuItem("Snacks");
        mnNewMenu.add(mntmNewMenuItem_8);

        contentPane = new JPanel();
        contentPane.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Acciones al hacer clic en el contenido
            }
        });
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(new Color(255, 255, 255));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Secci�n para mostrar productos
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Ruta\\A\\Tus\\Im�genes\\Aqu�\\productos.png"));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 33));
        lblNewLabel_1.setBounds(39, 39, 162, 184);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Nombre del Producto");
        lblNewLabel_2.setForeground(new Color(0, 147, 94));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_2.setBounds(40, 218, 160, 25);
        contentPane.add(lblNewLabel_2);

        // Secci�n para mostrar otro tipo de productos
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setBounds(0, 0, 908, 501);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel_1_1 = new JLabel("Nombre del Producto");
        lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Ruta\\A\\Tus\\Im�genes\\Aqu�\\otroproducto.png"));
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 33));
        lblNewLabel_1_1.setBounds(350, 39, 162, 184);
        panel.add(lblNewLabel_1_1);

        JLabel lblNewLabel_2_1 = new JLabel("Otro Tipo de Producto");
        lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1.setForeground(new Color(0, 147, 94));
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_2_1.setBounds(350, 218, 160, 25);
        panel.add(lblNewLabel_2_1);

        // Secci�n para mostrar m�s productos
        JLabel lblNewLabel_1_2 = new JLabel("");
        lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Ruta\\A\\Tus\\Im�genes\\Aqu�\\masproductos.png"));
        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 33));
        lblNewLabel_1_2.setBounds(658, 39, 162, 184);
        panel.add(lblNewLabel_1_2);

        JLabel lblNewLabel_2_2 = new JLabel("M�s Productos");
        lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_2.setForeground(new Color(0, 147, 94));
        lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_2_2.setBounds(658, 218, 160, 25);
        panel.add(lblNewLabel_2_2);
    }
}
