package tp5_grupo18;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class VentanaAgregar extends JFrame {

    private static int contadorId = 1;
    private static List<Pelicula> listaPeliculas = new ArrayList<>();

    public VentanaAgregar() {
        setTitle("Agregar Película");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

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

        JComboBox<String> comboGenero = new JComboBox<>();
        comboGenero.addItem("Seleccione un género");
        comboGenero.addItem("Terror");
        comboGenero.addItem("Acción");
        comboGenero.addItem("Suspenso");
        comboGenero.addItem("Romántica");
        comboGenero.setBounds(150, 100, 200, 20);
        add(comboGenero);

        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(150, 140, 100, 30);
        add(btnAceptar);

   
    }

   
    public static List<Pelicula> getPeliculas() {
        return listaPeliculas;
    }
}
