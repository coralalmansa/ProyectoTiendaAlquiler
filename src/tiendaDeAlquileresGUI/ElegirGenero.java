package tiendaDeAlquileresGUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class ElegirGenero extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ElegirGenero dialog = new ElegirGenero();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ElegirGenero() {
		setTitle("Elegir G\u00E9nero");
		setBounds(100, 100, 372, 221);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Productos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(31, 22, 109, 111);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnPelcula = new JRadioButton("Pel\u00EDcula");
		rdbtnPelcula.setBounds(6, 18, 97, 23);
		panel.add(rdbtnPelcula);
		buttonGroup.add(rdbtnPelcula);
		
		JRadioButton rdbtnLibro = new JRadioButton("Libro");
		rdbtnLibro.setBounds(6, 44, 97, 23);
		panel.add(rdbtnLibro);
		buttonGroup.add(rdbtnLibro);
		
		JRadioButton rdbtnMsica = new JRadioButton("M\u00FAsica");
		rdbtnMsica.setBounds(6, 70, 97, 23);
		panel.add(rdbtnMsica);
		buttonGroup.add(rdbtnMsica);
		
		JLabel lblGenero = new JLabel("G\u00E9nero");
		lblGenero.setBounds(157, 56, 46, 14);
		contentPanel.add(lblGenero);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(185, 78, 149, 20);
		contentPanel.add(comboBox);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton aceptarButton = new JButton("Aceptar");
				aceptarButton.setActionCommand("OK");
				buttonPane.add(aceptarButton);
				getRootPane().setDefaultButton(aceptarButton);
			}
			{
				JButton cancelarButton = new JButton("Cancelar");
				cancelarButton.setActionCommand("Cancel");
				buttonPane.add(cancelarButton);
			}
		}
	}
}
