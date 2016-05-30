package tiendaDeAlquileresGUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

import java.awt.Color;
/**
 * Proyecto final - Programación.
 * 
 * @author Coral Almansa Dominguez
 * @version 1.0
 */
public class VentanaPadre extends JDialog {

	protected final JPanel contentPanel = new JPanel();
	protected JTextField textFieldTitulo;
	protected JTextField textFieldAutorInterpreteDirector;
	protected JTextField textFieldDuracion;
	protected JTextField textFieldIdentificador;
	protected JTextField textFieldAnio;
	protected JTextField textFieldFechaAlquiler;
	protected JTextField textFieldFechaDevolucion;
	protected JTextField textFieldDescripcion;
	
	protected JPanel panel_1;
	protected JPanel panel;
	
	protected JLabel lblTitulo;
	protected JLabel lblAutor;
	protected JLabel lblDirector;
	protected JLabel lblInterprete;
	protected JLabel lblEditorial;
	protected JLabel lblNumeroPaginas;
	protected JLabel lblDuracion;
	protected JLabel lblNumeroCanciones;
	protected JLabel lblGenero;
	protected JLabel lblIdentificador;
	protected JLabel lblFechaAlquiler;
	protected JLabel lblFechaDevolucion;
	protected JLabel lblDescripcion;
	protected JLabel lblAnio;
	
	protected JButton btnSalir;
	protected JButton btnAniadir;
	protected JButton btnEliminar;
	protected JButton btnSiguiente;
	protected JButton btnAnterior;
	protected JButton btnRecibo;
	protected JButton btnDevolver;
	protected JButton btnAlquilar;
	protected final ButtonGroup buttonGroup = new ButtonGroup();
	protected final ButtonGroup buttonGroup_1 = new ButtonGroup();
	
	protected JRadioButton rdbtnBestseller;
	protected JRadioButton rdbtnGrammy;
	protected JRadioButton rdbtnNormal;
	protected JRadioButton rdbtnEstreno;	
	protected JRadioButton rdbtnLibro;
	protected JRadioButton rdbtnPelicula;
	protected JRadioButton rdbtnMusica;

	protected JComboBox comboBoxEditorial;
	protected JComboBox comboBoxGenero;
	

	/**
	 * Create the dialog.
	 */
	public VentanaPadre() {
		setResizable(false);
		setBounds(100, 100, 433, 436);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblTitulo = new JLabel("T\u00EDtulo");
		lblTitulo.setBounds(130, 51, 46, 14);
		contentPanel.add(lblTitulo);
		
		textFieldTitulo = new JTextField();
		textFieldTitulo.setBounds(226, 51, 187, 20);
		contentPanel.add(textFieldTitulo);
		textFieldTitulo.setColumns(10);
		
		lblAutor = new JLabel("Autor");
		lblAutor.setBounds(130, 86, 46, 14);
		contentPanel.add(lblAutor);
		
		textFieldAutorInterpreteDirector = new JTextField();
		textFieldAutorInterpreteDirector.setBounds(226, 86, 187, 20);
		contentPanel.add(textFieldAutorInterpreteDirector);
		textFieldAutorInterpreteDirector.setColumns(10);
		
		lblDirector = new JLabel("Director");
		lblDirector.setBounds(130, 86, 46, 14);
		contentPanel.add(lblDirector);
		
		lblInterprete = new JLabel("Int\u00E9rprete");
		lblInterprete.setBounds(130, 86, 75, 14);
		contentPanel.add(lblInterprete);
		
		lblEditorial = new JLabel("Editorial");
		lblEditorial.setBounds(41, 210, 46, 14);
		contentPanel.add(lblEditorial);
		
		lblNumeroPaginas = new JLabel("N\u00BA de p\u00E1ginas");
		lblNumeroPaginas.setBounds(130, 120, 86, 14);
		contentPanel.add(lblNumeroPaginas);
		
		textFieldDuracion = new JTextField();
		textFieldDuracion.setBounds(226, 117, 86, 20);
		contentPanel.add(textFieldDuracion);
		textFieldDuracion.setColumns(10);
		
		lblDuracion = new JLabel("Duraci\u00F3n");
		lblDuracion.setBounds(130, 120, 46, 14);
		contentPanel.add(lblDuracion);
		
		lblNumeroCanciones = new JLabel("N\u00BA de canciones");
		lblNumeroCanciones.setBounds(130, 120, 121, 14);
		contentPanel.add(lblNumeroCanciones);
		
		lblGenero = new JLabel("G\u00E9nero");
		lblGenero.setBounds(130, 151, 46, 14);
		contentPanel.add(lblGenero);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnSalir.setBounds(338, 376, 75, 23);
		contentPanel.add(btnSalir);
		
		btnAniadir = new JButton("A\u00F1adir");
		btnAniadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAniadir.setBounds(253, 376, 75, 23);
		contentPanel.add(btnAniadir);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(244, 376, 75, 23);
		contentPanel.add(btnEliminar);
		
		btnSiguiente = new JButton(">>");
		btnSiguiente.setBounds(253, 376, 58, 23);
		contentPanel.add(btnSiguiente);
		
		btnAnterior = new JButton("<<");
		btnAnterior.setBounds(193, 376, 58, 23);
		contentPanel.add(btnAnterior);
		
		lblIdentificador = new JLabel("Identificador");
		lblIdentificador.setBounds(234, 14, 95, 14);
		contentPanel.add(lblIdentificador);
		
		textFieldIdentificador = new JTextField();
		textFieldIdentificador.setBounds(327, 11, 86, 20);
		contentPanel.add(textFieldIdentificador);
		textFieldIdentificador.setColumns(10);
		
		comboBoxGenero = new JComboBox();
		comboBoxGenero.setBounds(226, 148, 187, 20);
		contentPanel.add(comboBoxGenero);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Producto", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 14, 95, 104);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		rdbtnLibro = new JRadioButton("Libro");
		rdbtnLibro.setBounds(6, 16, 83, 23);
		panel.add(rdbtnLibro);
		buttonGroup.add(rdbtnLibro);
		
		rdbtnPelicula = new JRadioButton("Pel\u00EDcula");
		rdbtnPelicula.setBounds(6, 42, 83, 23);
		panel.add(rdbtnPelicula);
		buttonGroup.add(rdbtnPelicula);
		
		rdbtnMusica = new JRadioButton("M\u00FAsica");
		rdbtnMusica.setBounds(6, 68, 83, 23);
		panel.add(rdbtnMusica);
		buttonGroup.add(rdbtnMusica);
		
		lblAnio = new JLabel("A\u00F1o");
		lblAnio.setBounds(41, 145, 46, 14);
		contentPanel.add(lblAnio);
		
		textFieldAnio = new JTextField();
		textFieldAnio.setBounds(10, 164, 86, 20);
		contentPanel.add(textFieldAnio);
		textFieldAnio.setColumns(10);
		
		comboBoxEditorial = new JComboBox();
		comboBoxEditorial.setBounds(10, 235, 113, 20);
		contentPanel.add(comboBoxEditorial);
		
		lblFechaAlquiler = new JLabel("Fecha Alquiler");
		lblFechaAlquiler.setBounds(207, 190, 102, 14);
		contentPanel.add(lblFechaAlquiler);
		
		lblFechaDevolucion = new JLabel("Fecha Devoluci\u00F3n");
		lblFechaDevolucion.setBounds(207, 219, 102, 14);
		contentPanel.add(lblFechaDevolucion);
		
		textFieldFechaAlquiler = new JTextField();
		textFieldFechaAlquiler.setBounds(327, 190, 86, 20);
		contentPanel.add(textFieldFechaAlquiler);
		textFieldFechaAlquiler.setColumns(10);
		
		textFieldFechaDevolucion = new JTextField();
		textFieldFechaDevolucion.setBounds(327, 218, 86, 20);
		contentPanel.add(textFieldFechaDevolucion);
		textFieldFechaDevolucion.setColumns(10);
		
		textFieldDescripcion = new JTextField();
		textFieldDescripcion.setBounds(10, 302, 403, 63);
		contentPanel.add(textFieldDescripcion);
		textFieldDescripcion.setColumns(10);
		
		lblDescripcion = new JLabel("Descripci\u00F3n");
		lblDescripcion.setBounds(26, 277, 79, 14);
		contentPanel.add(lblDescripcion);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tipo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(183, 249, 230, 73);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		rdbtnBestseller = new JRadioButton("Bestseller");
		buttonGroup_1.add(rdbtnBestseller);
		rdbtnBestseller.setBounds(26, 41, 97, 23);
		panel_1.add(rdbtnBestseller);
		
		rdbtnGrammy = new JRadioButton("Grammy");
		buttonGroup_1.add(rdbtnGrammy);
		rdbtnGrammy.setBounds(125, 41, 80, 23);
		panel_1.add(rdbtnGrammy);
		
		rdbtnNormal = new JRadioButton("Normal");
		buttonGroup_1.add(rdbtnNormal);
		rdbtnNormal.setBounds(26, 15, 88, 23);
		panel_1.add(rdbtnNormal);
		
		rdbtnEstreno = new JRadioButton("Estreno");
		buttonGroup_1.add(rdbtnEstreno);
		rdbtnEstreno.setBounds(126, 15, 71, 23);
		panel_1.add(rdbtnEstreno);
		
		btnRecibo = new JButton("Recibo");
		btnRecibo.setBounds(145, 376, 89, 23);
		contentPanel.add(btnRecibo);
		
		btnDevolver = new JButton("Devolver");
		btnDevolver.setBounds(242, 376, 86, 23);
		contentPanel.add(btnDevolver);
		
		btnAlquilar = new JButton("Alquilar");
		btnAlquilar.setBounds(239, 376, 89, 23);
		contentPanel.add(btnAlquilar);
	}
}
