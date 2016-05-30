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
public class Mostrar extends VentanaPadre {

	
	public Mostrar() {
		setModal(true);	
		setTitle("Mostrar");
		
		rdbtnMusica.setEnabled(false);
		rdbtnPelicula.setEnabled(false);
		rdbtnLibro.setEnabled(false);
		comboBoxEditorial.setEnabled(false);
		comboBoxGenero.setEnabled(false);
		textFieldAnio.setEditable(false);
		textFieldIdentificador.setEditable(false);
		textFieldDuracion.setEditable(false);
		textFieldAutorInterpreteDirector.setEditable(false);
		textFieldTitulo.setEditable(false);
				
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
