package com.frontend;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.backend.Estudiante;
import com.backend.Libro;
import com.backend.ReadFiles;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;


public class RegistroEstudiantes extends JFrame {

    private JPanel contentPane;
    private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    RegistroEstudiantes frame = new RegistroEstudiantes();
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
    public RegistroEstudiantes() {
    	setResizable(false);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 851, 562);
	contentPane = new JPanel();
	contentPane.setBackground(new Color(135, 206, 235));
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JLabel lblEstudiantesRegistrados = new JLabel("Estudiantes Registrados");
	lblEstudiantesRegistrados.setFont(new Font("Tahoma", Font.BOLD, 22));
	lblEstudiantesRegistrados.setBounds(268, 45, 307, 41);
	contentPane.add(lblEstudiantesRegistrados);
	
	JButton botonNuevo = new JButton("Nuevo");
	botonNuevo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	botonNuevo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    setVisible(false);
			new NuevoEstudiante().setVisible(true);
		}
	});
	botonNuevo.setBounds(686, 72, 105, 27);
	contentPane.add(botonNuevo);
	
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(35, 129, 756, 332);
	contentPane.add(scrollPane);
	
	table = new JTable();
	ReadFiles<Estudiante> archivos = new ReadFiles<Estudiante>(new Estudiante());
	ArrayList <Estudiante> estudiantes =archivos.getFiles("Estudiantes/");
	Estudiante st = new Estudiante();
	Object [][] filas = st.returnRows(estudiantes);
	String [] columnas = {"Carnet", "Nombre","Id Carrera", "Carrera", "Fecha de Nacimiento", "Cantidad de libros en prestamo"};
	DefaultTableModel dtm = new DefaultTableModel(filas, columnas);
	table = new JTable(dtm);
	scrollPane.setViewportView(table);
	JButton botonAceptar = new JButton("Aceptar");
	botonAceptar.setFont(new Font("Tahoma", Font.PLAIN, 15));
	botonAceptar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    setVisible(false);
		    new Bienvenida().setVisible(true);
		}
	});
	botonAceptar.setBounds(686, 487, 105, 27);
	contentPane.add(botonAceptar);
    }
    
    
}
