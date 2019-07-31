package com.frontend;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.backend.Archivo;
import com.backend.Libro;
import com.backend.Prestamo;

public class FormularioPrestamo extends JFrame {

	private JPanel contentPane;
	private JButton btnCalcular;
	private JButton botonRegresar;
	private JLabel label;
	private JTextField cajaCarnet;
	private JTextField cajaCodigoLibro;
	private JLabel label_3;
	private JTable tabla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioPrestamo frame = new FormularioPrestamo();
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
	public FormularioPrestamo() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegistroPrestamos = new JLabel("Formulario Prestamos");
		lblRegistroPrestamos.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblRegistroPrestamos.setBounds(129, 23, 335, 54);
		contentPane.add(lblRegistroPrestamos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 229, 536, 213);
		contentPane.add(scrollPane);
		tabla = new JTable();
		String columnas [] = {"Codigo Libro", "Libro"};
		scrollPane.setViewportView(tabla);
		Object [][] filas = new Object[3][3];
		btnCalcular = new JButton("Agregar");
		
		btnCalcular.addActionListener(new ActionListener() {
		    int index=0;
			public void actionPerformed(ActionEvent e) {
			    Prestamo p = new Prestamo();
			   if(p.validacionDePrestamo(Integer.parseInt(cajaCarnet.getText()), cajaCodigoLibro.getText())) {
			      filas [index][0]=cajaCodigoLibro.getText();
			      Libro l = (Libro)Archivo.leerArchivo("Libros/"+cajaCodigoLibro.getText()+".book");
			      filas[index][1]=l.getTitulo();
			      tabla.setModel(new DefaultTableModel(filas,columnas));
			      index=index+1;
			      Prestamo prestamo = new Prestamo(cajaCodigoLibro.getText(), Integer.parseInt(cajaCarnet.getText()));
			      JOptionPane.showMessageDialog(null, "Agregado con exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
			   }
			}
		});
		btnCalcular.setBounds(441, 167, 124, 26);
		contentPane.add(btnCalcular);
		
		botonRegresar = new JButton("Back");
		botonRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    	setVisible(false);
			}
		});
		botonRegresar.setBounds(29, 470, 102, 45);
		contentPane.add(botonRegresar);
		
		label = new JLabel("Carnet:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(32, 112, 124, 25);
		contentPane.add(label);
		
		cajaCarnet = new JTextField();
		cajaCarnet.setColumns(10);
		cajaCarnet.setBounds(204, 110, 206, 27);
		contentPane.add(cajaCarnet);
		
		cajaCodigoLibro = new JTextField();
		cajaCodigoLibro.setColumns(10);
		cajaCodigoLibro.setBounds(204, 167, 206, 25);
		contentPane.add(cajaCodigoLibro);
		
		label_3 = new JLabel("Codigo Libro:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_3.setBounds(32, 162, 124, 27);
		contentPane.add(label_3);
		
		
		
	}
}
