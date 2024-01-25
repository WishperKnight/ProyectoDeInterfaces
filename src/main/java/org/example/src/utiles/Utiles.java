package org.example.src.utiles;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * La clase Utiles proporciona metodos utiles relacionados con la interfaz de usuario y colores.
 */
public class Utiles {

    // Colores en formato hexadecimal
    public static String COLOR_AZUL = "339999";
    public static String COLOR_CLARO = "D6EAE2";
    public static String COLOR_VERDE = "3F8671";
    public static String COLOR_ROJO = "FF0000";

    // COLORES PARA LA CONSOLA
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    /**
     * Convierte un color en formato hexadecimal a un objeto Color de Java.
     *
     * @param color El color en formato hexadecimal.
     * @return Un objeto Color de Java.
     */
    public static Color convertirColorJava(String color) {
        // Convertir el color hexadecimal a decimal
        int colorDecimal = Integer.parseInt(color, 16);

        // Convertir el color decimal a String
        String colorDecimalString = String.valueOf(colorDecimal);

        // Utilizar el m�todo decode para obtener un objeto Color de Java
        Color colorJava = Color.decode(colorDecimalString);

        // Devolver el objeto Color
        return colorJava;
    }

    /**
     * Anniaade un Tooltip a un componente especifico.
     *
     * @param componente El componente al que se anniadirs el Tooltip.
     * @param mensaje    El mensaje del Tooltip.
     */
    public static void toolTip(JComponent componente, String mensaje) {
        // Aniadir el Tooltip al componente
        componente.setToolTipText("<html><p>" + mensaje + "</p></html>");
    }

    /**
     * Muestra un cuadro de dialogo de error con un mensaje y un titulo especificos.
     *
     * @param parentFrame El JFrame padre al que estara asociado el cuadro de dialogo.
     * @param titulo      El titulo del cuadro de dialogo.
     * @param mensaje     El mensaje de error a mostrar.
     */
    public static void showErrorDialog(JFrame parentFrame, String titulo, String mensaje) {
        JDialog dialog = new JDialog(parentFrame, titulo, true);
        JPanel panel = new JPanel(new BorderLayout());

        JLabel label = new JLabel(mensaje);
        panel.add(label, BorderLayout.CENTER);

        dialog.add(panel);
        dialog.setSize(300, 150);
        dialog.setLocationRelativeTo(parentFrame);
        dialog.setVisible(true);
    }
}
