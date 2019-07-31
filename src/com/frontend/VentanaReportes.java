package com.frontend;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import com.backend.Prestamo;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.backend.ReadFiles;

public class VentanaReportes extends JFrame {
	
	
	private JPanel contentPane;
	private JTable tabla;
	ReadFiles<Prestamo> archivos;
	ArrayList<Prestamo> prestamos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaReportes frame = new VentanaReportes();
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
	public VentanaReportes() {
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1110, 575);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(284, 99, 777, 418);
		contentPane.add(scrollPane);
		
		tabla = new JTable();
		scrollPane.setViewportView(tabla);
		
		JButton botonEntregaHoy = new JButton("Entrega Hoy");
		botonEntregaHoy.setBounds(43, 99, 179, 41);
		botonEntregaHoy.setForeground(new Color(255, 255, 255));
		botonEntregaHoy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    archivos = new ReadFiles<Prestamo>(new Prestamo());
			    prestamos= archivos.getFiles("Prestamos/");
			    ArrayList<Prestamo> entregaHoy= new ArrayList<Prestamo>();
			    for (int i = 0; i < prestamos.size(); i++) {
				System.out.println(prestamos.get(i).calcularDiasEnPrestamo(prestamos.get(i).getFecha()));
				if (prestamos.get(i).calcularDiasEnPrestamo(prestamos.get(i).getFecha())==4) {
				    entregaHoy.add(prestamos.get(i));
				}
			    }
			    Object [][] filas = new Prestamo().getRows(entregaHoy);
			    String columnas []= {"Codigo Libro","Carnet del Estudiante","Fecha de inicio del prestamo"};
			    tabla.setModel(new DefaultTableModel(filas,columnas));
			}
		});
		contentPane.setLayout(null);
		botonEntregaHoy.setBackground(new Color(0, 0, 0));
		botonEntregaHoy.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(botonEntregaHoy);
		
		
		JButton botonEnMora = new JButton("En Mora");
		botonEnMora.setBounds(43, 163, 179, 41);
		botonEnMora.setForeground(new Color(255, 255, 255));
		botonEnMora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    archivos = new ReadFiles<Prestamo>(new Prestamo());
			    prestamos= archivos.getFiles("Prestamos/");
			    ArrayList<Prestamo> enMora= new ArrayList<Prestamo>();
			    for (int i = 0; i < prestamos.size(); i++) {
				System.out.println(prestamos.get(i).calcularDiasEnPrestamo(prestamos.get(i).getFecha()));
				if (prestamos.get(i).calcularDiasEnPrestamo(prestamos.get(i).getFecha())>4) {
				    enMora.add(prestamos.get(i));
				}
			    }
			    Object [][] filas = new Prestamo().getRows(enMora);
			    String columnas []= {"Codigo Libro","Carnet del Estudiante","Fecha de inicio del prestamo"};
			    tabla.setModel(new DefaultTableModel(filas,columnas));
			}
		});
		botonEnMora.setBackground(new Color(0, 0, 0));
		botonEnMora.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(botonEnMora);
		
		JButton botonHistorial = new JButton("Historial");
		botonHistorial.setBounds(43, 349, 179, 41);
		botonHistorial.setForeground(new Color(255, 255, 255));
		botonHistorial.setBackground(new Color(0, 0, 0));
		botonHistorial.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(botonHistorial);
		
		JButton botonRecaudacion = new JButton("Recaudacion");
		botonRecaudacion.setBounds(43, 412, 179, 41);
		botonRecaudacion.setForeground(new Color(255, 255, 255));
		botonRecaudacion.setBackground(new Color(0, 0, 0));
		botonRecaudacion.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(botonRecaudacion);
		
		JButton botonBack = new JButton("Back");
		botonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    setVisible(false);
			    new Bienvenida().setVisible(true);
			}
		});
		botonBack.setBounds(43, 476, 179, 41);
		botonBack.setForeground(new Color(255, 255, 255));
		botonBack.setBackground(new Color(0, 0, 0));
		botonBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(botonBack);
		
		JButton botonPorEstudiante = new JButton("Por Estudiante");
		botonPorEstudiante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		botonPorEstudiante.setBounds(43, 222, 179, 41);
		botonPorEstudiante.setForeground(new Color(255, 255, 255));
		botonPorEstudiante.setBackground(new Color(0, 0, 0));
		botonPorEstudiante.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(botonPorEstudiante);
		
		JButton botonPorCarrera = new JButton("Por Carrera");
		botonPorCarrera.setBounds(43, 286, 179, 41);
		botonPorCarrera.setForeground(new Color(255, 255, 255));
		botonPorCarrera.setBackground(new Color(0, 0, 0));
		botonPorCarrera.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(botonPorCarrera);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1096, 80);
		panel.setBackground(SystemColor.textHighlight);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Prestamos CUNOC");
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		
	}
}