package tiendaDeAlquileresGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
/**
 * Proyecto final - Programación.
 * 
 * @author Coral Almansa Dominguez
 * @version 1.0
 */
public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		mnArchivo.setMnemonic('A');
		menuBar.add(mnArchivo);
		
		JMenuItem mntmNuevo = new JMenuItem("Nuevo");
		mntmNuevo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		mntmNuevo.setMnemonic('N');
		mnArchivo.add(mntmNuevo);
		
		JMenuItem mntmAbrir = new JMenuItem("Abrir");
		mntmAbrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		mntmAbrir.setMnemonic('A');
		mnArchivo.add(mntmAbrir);
		
		JSeparator separator_1 = new JSeparator();
		mnArchivo.add(separator_1);
		
		JMenuItem mntmGuardar = new JMenuItem("Guardar");
		mntmGuardar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_MASK));
		mntmGuardar.setMnemonic('G');
		mnArchivo.add(mntmGuardar);
		
		JMenuItem mntmGuardarComo = new JMenuItem("Guardar como...");
		mntmGuardarComo.setMnemonic('c');
		mnArchivo.add(mntmGuardarComo);
		
		JSeparator separator = new JSeparator();
		mnArchivo.add(separator);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mntmSalir.setMnemonic('S');
		mnArchivo.add(mntmSalir);
		
		JMenu mnProductos = new JMenu("Productos");
		mnProductos.setMnemonic('P');
		menuBar.add(mnProductos);
		
		JMenuItem mntmAnadir = new JMenuItem("A\u00F1adir");
		mntmAnadir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, InputEvent.CTRL_MASK));
		mntmAnadir.setMnemonic('A');
		mntmAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Alta alta = new Alta();
				alta.setVisible(true);
			}
		});
		mnProductos.add(mntmAnadir);
		
		JMenuItem mntmEliminar = new JMenuItem("Eliminar");
		mntmEliminar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, InputEvent.CTRL_MASK));
		mntmEliminar.setMnemonic('E');
		mntmEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Baja baja = new Baja();
				baja.setVisible(true);
			}
		});
		mnProductos.add(mntmEliminar);
		
		JMenuItem mntmMostrarVideoclub = new JMenuItem("Mostrar Videoclub");
		mntmMostrarVideoclub.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, InputEvent.CTRL_MASK));
		mntmMostrarVideoclub.setMnemonic('M');
		mntmMostrarVideoclub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mostrar mostrar = new Mostrar();
				mostrar.setVisible(true);
			}
		});
		mnProductos.add(mntmMostrarVideoclub);
		
		JMenuItem mntmOrdenar = new JMenuItem("Ordenar");
		mntmOrdenar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mntmOrdenar.setMnemonic('O');
		mntmOrdenar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ordenar ordenar = new Ordenar();
				ordenar.setVisible(true);
			}
		});
		mnProductos.add(mntmOrdenar);
		
		JMenu mnBuscar = new JMenu("Buscar");
		mnBuscar.setMnemonic('B');
		menuBar.add(mnBuscar);
		
		JMenuItem mntmPorTitulo = new JMenuItem("Por t\u00EDtulo");
		mntmPorTitulo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_MASK));
		mntmPorTitulo.setMnemonic('t');
		mntmPorTitulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MostrarPorTitulo mostrarPorTitulo = new MostrarPorTitulo();
				mostrarPorTitulo.setVisible(true);
			}
		});
		mnBuscar.add(mntmPorTitulo);
		
		JMenuItem mntmPorGenero = new JMenuItem("Por g\u00E9nero");
		mntmPorGenero.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
		mntmPorGenero.setMnemonic('g');
		mntmPorGenero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MostrarPorGenero mostrarPorGenero = new MostrarPorGenero();
				mostrarPorGenero.setVisible(true);
			}
		});
		mnBuscar.add(mntmPorGenero);
		
		JMenu mnAlquiler = new JMenu("Alquiler");
		mnAlquiler.setMnemonic('l');
		menuBar.add(mnAlquiler);
		
		JMenuItem mntmRegistraralquilar = new JMenuItem("Registrar Alquiler");
		mntmRegistraralquilar.setMnemonic('R');
		mntmRegistraralquilar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Alquilar alquilar = new Alquilar();
				alquilar.setVisible(true);
			}
		});
		mnAlquiler.add(mntmRegistraralquilar);
		
		JMenuItem mntmDevolverAlquiler = new JMenuItem("Devolver Alquiler");
		mntmDevolverAlquiler.setMnemonic('D');
		mntmDevolverAlquiler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Devolver devolver = new Devolver();
				devolver.setVisible(true);
			}
		});
		mnAlquiler.add(mntmDevolverAlquiler);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		mnAyuda.setMnemonic('y');
		menuBar.add(mnAyuda);
		
		JMenuItem mntmAyuda = new JMenuItem("Ver ayuda");
		mntmAyuda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK));
		mntmAyuda.setMnemonic('V');
		mntmAyuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ayuda ayuda = new Ayuda();
				ayuda.setVisible(true);
			}
		});
		mnAyuda.add(mntmAyuda);
		
		JMenuItem mntmAcercaDe = new JMenuItem("Acerca de");
		mntmAcercaDe.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		mntmAcercaDe.setMnemonic('A');
		mntmAcercaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AcercaDe acercaDe = new AcercaDe();
				acercaDe.setVisible(true);
			}
		});
		mnAyuda.add(mntmAcercaDe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
