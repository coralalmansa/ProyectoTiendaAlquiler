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
public class Baja extends VentanaPadre {


	public Baja() {
		
		setModal(true);
		setTitle("Baja");
		
		btnEliminar.setBounds(244, 376, 84, 23);
		rdbtnMusica.setEnabled(false);
		rdbtnPelicula.setEnabled(false);
		rdbtnLibro.setEnabled(false);
		comboBoxEditorial.setEnabled(false);
		textFieldAnio.setEditable(false);
		comboBoxGenero.setEnabled(false);
		textFieldDuracion.setEditable(false);
		textFieldAutorInterpreteDirector.setEditable(false);
		textFieldTitulo.setEditable(false);
				
		lblFechaAlquiler.setVisible(false);
		lblFechaDevolucion.setVisible(false);
		textFieldFechaAlquiler.setVisible(false);
		textFieldFechaDevolucion.setVisible(false);
		btnDevolver.setVisible(false);
		btnRecibo.setVisible(false);
		btnAnterior.setVisible(false);
		btnSiguiente.setVisible(false);
		btnAniadir.setVisible(false);
		btnAlquilar.setVisible(false);
		panel_1.setVisible(false);
	}

}
