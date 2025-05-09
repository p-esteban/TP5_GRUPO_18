package tp5_grupo18;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;

public class MenuPrincipal extends JFrame {

	 private JPanel contentPanel;

	    public MenuPrincipal() {
	        setTitle("Programa");
	        setSize(400, 300);
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new BorderLayout()); 

	   
	        contentPanel = new JPanel();
	        add(contentPanel, BorderLayout.CENTER);

	        // Menú
	        JMenuBar menuBar = new JMenuBar();
	        JMenu menuPeliculas = new JMenu("Películas");
	        JMenuItem itemAgregar = new JMenuItem("Agregar");
	        JMenuItem itemListar = new JMenuItem("Listar");

	        itemAgregar.addActionListener(e -> {
	            setContentPanel(new VentanaAgregar());
	        });

	        itemListar.addActionListener(e -> {
	            setContentPanel(new VentanaListar());
	        });

	        menuPeliculas.add(itemAgregar);
	        menuPeliculas.add(itemListar);
	        menuBar.add(menuPeliculas);
	        setJMenuBar(menuBar);
	    }

	    private void setContentPanel(JPanel panel) {
	        getContentPane().remove(contentPanel);
	        contentPanel = panel;
	        getContentPane().add(contentPanel, BorderLayout.CENTER);
	        revalidate();
	        repaint();
	    }
}
