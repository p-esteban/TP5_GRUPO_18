package tp5_grupo18;

import javax.swing.*;
import java.awt.event.*;

public class MenuPrincipal extends JFrame {

    public MenuPrincipal() {
        setTitle("Programa");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuPeliculas = new JMenu("Películas");
        JMenuItem itemAgregar = new JMenuItem("Agregar");
        JMenuItem itemListar = new JMenuItem("Listar");

        itemAgregar.addActionListener(e -> {
            VentanaAgregar ventana = new VentanaAgregar();
            ventana.setVisible(true);
        });

   
        itemListar.addActionListener(e -> {
            VentanaListar ventana = new VentanaListar();
            ventana.setVisible(true);
        });

        menuPeliculas.add(itemAgregar);
        menuPeliculas.add(itemListar);
        menuBar.add(menuPeliculas);
        setJMenuBar(menuBar);
    }
}
