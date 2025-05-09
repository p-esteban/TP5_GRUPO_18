package tp5_grupo18;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;


public class VentanaListar extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public VentanaListar() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		
		contentPane.setLayout(null);
		
		JList<String> list = new JList<String>();
	
		
		
		list.setBounds(10, 36, 414, 214);
		contentPane.add(list);
		
		DefaultListModel<String> modelo = new DefaultListModel<>();
		List<Pelicula> peliculasOrdenadas = new ArrayList<>(VentanaAgregar.getPeliculas());
		peliculasOrdenadas.sort(Comparator.comparing(Pelicula::getNombre));
		for (Pelicula p : peliculasOrdenadas) {
		    modelo.addElement(p.getNombre() + " - " + p.getCategoria().getNombre());
		}
		list.setModel(modelo);

		
		JLabel lblNewLabel = new JLabel("Listar Peliculas:");
		lblNewLabel.setBounds(10, 11, 126, 14);
		contentPane.add(lblNewLabel);
		
	}
}
