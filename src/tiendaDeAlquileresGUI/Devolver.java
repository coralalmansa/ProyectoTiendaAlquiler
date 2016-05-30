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
public class Devolver extends VentanaPadre {
	
	public Devolver() {
		setModal(true);
		setTitle("Devolver producto");
		
		textFieldTitulo.setEditable(false);
		textFieldAutorInterpreteDirector.setEditable(false);
		textFieldDuracion.setEditable(false);
		textFieldAnio.setEditable(false);
		rdbtnMusica.setEnabled(false);
		rdbtnPelicula.setEnabled(false);
		rdbtnLibro.setEnabled(false);
				
		lblDescripcion.setVisible(false);
		textFieldDescripcion.setVisible(false);
		btnAniadir.setVisible(false);
		btnEliminar.setVisible(false);
		btnAnterior.setVisible(false);
		btnSiguiente.setVisible(false);	
		btnAlquilar.setVisible(false);
		btnRecibo.setVisible(false);
		
	}

}
