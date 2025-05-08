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


public class VentanaListar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaListar frame = new VentanaListar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public VentanaListar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
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
