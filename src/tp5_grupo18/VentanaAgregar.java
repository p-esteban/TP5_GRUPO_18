package tp5_grupo18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class VentanaAgregar extends JPanel {

    private static int contadorId=1;
    private static List<Pelicula> listaPeliculas = new ArrayList<>();

    public VentanaAgregar() {
     
        setSize(400, 250);
        setLayout(null);

        JLabel lblId = new JLabel("ID");
        lblId.setBounds(30, 20, 100, 20);
        add(lblId);

        JTextField txtId = new JTextField(String.valueOf(contadorId));
        txtId.setEditable(false);
        txtId.setBounds(150, 20, 200, 20);
        add(txtId);

        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(30, 60, 100, 20);
        add(lblNombre);

        JTextField txtNombre = new JTextField();
        txtNombre.setBounds(150, 60, 200, 20);
        add(txtNombre);

        JLabel lblGenero = new JLabel("Género");
        lblGenero.setBounds(30, 100, 100, 20);
        add(lblGenero);

        JComboBox<Categoria> comboGenero = new JComboBox<>();
        comboGenero.addItem(new Categoria("Seleccione un género"));
        comboGenero.addItem(new Categoria("Terror"));
        comboGenero.addItem(new Categoria("Acción"));
        comboGenero.addItem(new Categoria("Suspenso")); 
        comboGenero.addItem(new Categoria("Romántica"));
        comboGenero.setBounds(150, 100, 200, 20);
        add(comboGenero);

        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(150, 140, 100, 30);
        add(btnAceptar);

        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombrePelicula = txtNombre.getText().trim();
                Categoria generoSeleccionado = (Categoria) comboGenero.getSelectedItem();

                if (!nombrePelicula.isEmpty()) {
                    if (comboGenero.getSelectedIndex() != 0) {
                        Pelicula peli = new Pelicula();
                        peli.setId(contadorId);
                        peli.setNombre(nombrePelicula);
                        peli.setCategoria(generoSeleccionado);
                        
                        JOptionPane.showMessageDialog(null, "Película guardada correctamente.");
                        listaPeliculas.add(peli);
                        contadorId++;
                        txtId.setText(String.valueOf(contadorId));
                        
                        txtNombre.setText("");
                        comboGenero.setSelectedIndex(0);
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe seleccionar un género válido.", "Error", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un nombre.", "Error", JOptionPane.WARNING_MESSAGE);
                }

            }
        });
   
    }

   
    public static List<Pelicula> getPeliculas() {
        return listaPeliculas;
    }
}
