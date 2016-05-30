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
public class MostrarPorTitulo extends VentanaPadre {

	
	public MostrarPorTitulo() {
		textFieldDescripcion.setEditable(false);
		comboBoxEditorial.setEnabled(false);
		comboBoxGenero.setEnabled(false);
		textFieldDuracion.setEditable(false);
		textFieldAutorInterpreteDirector.setEditable(false);
		textFieldIdentificador.setEditable(false);
		textFieldAnio.setEditable(false);
		rdbtnMusica.setEnabled(false);
		rdbtnPelicula.setEnabled(false);
		rdbtnLibro.setEnabled(false);
		
		
		lblFechaAlquiler.setVisible(false);
		lblFechaDevolucion.setVisible(false);
		textFieldFechaAlquiler.setVisible(false);
		textFieldFechaDevolucion.setVisible(false);
		btnDevolver.setVisible(false);
		btnRecibo.setVisible(false);
		btnAniadir.setVisible(false);
		btnAniadir.setVisible(false);
		panel_1.setVisible(false);
		btnEliminar.setVisible(false);
	}

}
