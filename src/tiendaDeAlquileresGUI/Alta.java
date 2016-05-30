package tiendaDeAlquileresGUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
/**
 * Proyecto final - Programación.
 * 
 * @author Coral Almansa Dominguez
 * @version 1.0
 */
public class Alta extends VentanaPadre {
	
	public Alta() {
		setModal(true);
		setTitle("Alta");
		
		lblFechaAlquiler.setVisible(false);
		lblFechaDevolucion.setVisible(false);
		textFieldFechaAlquiler.setVisible(false);
		textFieldFechaDevolucion.setVisible(false);
		btnDevolver.setVisible(false);
		btnEliminar.setVisible(false);
		btnRecibo.setVisible(false);
		btnAnterior.setVisible(false);
		btnSiguiente.setVisible(false);
		panel_1.setVisible(false);
		btnAlquilar.setVisible(false);
	}

}
