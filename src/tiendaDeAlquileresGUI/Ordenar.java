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
public class Ordenar extends VentanaPadre {
	
	public Ordenar() {
		rdbtnMusica.setEnabled(false);
		rdbtnPelicula.setEnabled(false);
		rdbtnLibro.setEnabled(false);
		comboBoxEditorial.setEnabled(false);
		comboBoxGenero.setEnabled(false);
		textFieldDescripcion.setEditable(false);
		textFieldAnio.setEditable(false);
		textFieldDuracion.setEditable(false);
		textFieldAutorInterpreteDirector.setEditable(false);
		textFieldIdentificador.setEditable(false);
		textFieldTitulo.setEditable(false);
		setModal(true);
		setTitle("Ordenar");
		
		lblFechaAlquiler.setVisible(false);
		lblFechaDevolucion.setVisible(false);
		textFieldFechaAlquiler.setVisible(false);
		textFieldFechaDevolucion.setVisible(false);
		btnDevolver.setVisible(false);
		btnEliminar.setVisible(false);
		btnRecibo.setVisible(false);
		panel_1.setVisible(false);
		btnAlquilar.setVisible(false);
		btnAniadir.setVisible(false);
		
	}

}
