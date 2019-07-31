package com.frontend;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.backend.Libro;
import com.backend.ReadFiles;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class RegistroLibros extends JFrame {

    private JPanel contentPane;
    private JTable tablaDeLibros;
    private JTable table_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    RegistroLibros frame = new RegistroLibros();
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
    public RegistroLibros() {
    	setResizable(false);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 913, 504);
	contentPane = new JPanel();
	contentPane.setBackground(new Color(135, 206, 235));
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JLabel lblRegistroDeNuevos = new JLabel("Registro de Nuevos Libros");
	lblRegistroDeNuevos.setFont(new Font("Tahoma", Font.BOLD, 20));
	lblRegistroDeNuevos.setBounds(314, 28, 279, 55);
	contentPane.add(lblRegistroDeNuevos);
	
	JButton btnNuevo = new JButton("Nuevo");
	btnNuevo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	btnNuevo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    setVisible(false);
		    new NuevoLibro().setVisible(true);
		    
		}
	});
	btnNuevo.setBounds(762, 67, 105, 45);
	contentPane.add(btnNuevo);
	
	tablaDeLibros = new JTable();
	tablaDeLibros.setBounds(22, 180, 1, 1);
	contentPane.add(tablaDeLibros);
	
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(22, 137, 871, 278);
	contentPane.add(scrollPane);
	
	table_1 = new JTable();
	String [] columnas = {"Codigo","Titulo", "Autor", "Cantidad de copias", "Fecha de Publicacion", "Editorial"};
	ReadFiles< Libro> libros = new ReadFiles<Libro>(new Libro());
	ArrayList<Libro> books =libros.getFiles( "Libros/");
	Object [][] filas= new Libro().returnRows(books);
	table_1.setModel( new DefaultTableModel(filas, columnas));
	scrollPane.setViewportView(table_1);
	
	JButton btnAceptar = new JButton("Aceptar");
	btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 15));
	btnAceptar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    setVisible(false);
		    new Bienvenida().setVisible(true);
		}
	});
	btnAceptar.setBounds(762, 427, 105, 27);
	contentPane.add(btnAceptar);
    }
}
