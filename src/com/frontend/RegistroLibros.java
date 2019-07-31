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
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JLabel lblRegistroDeNuevos = new JLabel("Registro de Nuevos Libros");
	lblRegistroDeNuevos.setBounds(364, 12, 188, 17);
	contentPane.add(lblRegistroDeNuevos);
	
	JButton btnNuevo = new JButton("Nuevo");
	btnNuevo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    setVisible(false);
		    new NuevoLibro().setVisible(true);
		    
		}
	});
	btnNuevo.setBounds(633, 56, 105, 59);
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
	JButton btnEditarCopias = new JButton("Editar Copias");
	btnEditarCopias.setBounds(762, 56, 131, 59);
	contentPane.add(btnEditarCopias);
	
	JButton btnAceptar = new JButton("Aceptar");
	btnAceptar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    setVisible(false);
		}
	});
	btnAceptar.setBounds(762, 427, 105, 27);
	contentPane.add(btnAceptar);
    }
}
