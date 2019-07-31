package com.frontend;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class Principal1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal1 frame = new Principal1();
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
	public Principal1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 476);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Biblioteca CUNOC");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(194, 26, 228, 65);
		contentPane.add(lblNewLabel);
		
		JButton botonAlumno = new JButton("Registro Alumno");
		botonAlumno.setBackground(Color.GREEN);
		botonAlumno.setFont(new Font("Tahoma", Font.BOLD, 15));
		botonAlumno.setBounds(83, 119, 179, 41);
		contentPane.add(botonAlumno);
		
		JButton botonLibros = new JButton("Registrar Libro");
		botonLibros.setBackground(Color.GREEN);
		botonLibros.setFont(new Font("Tahoma", Font.BOLD, 15));
		botonLibros.setBounds(83, 192, 179, 41);
		contentPane.add(botonLibros);
		
		JButton botonAlumnos = new JButton("Alumnos");
		botonAlumnos.setBackground(Color.GREEN);
		botonAlumnos.setFont(new Font("Tahoma", Font.BOLD, 15));
		botonAlumnos.setBounds(361, 119, 179, 41);
		contentPane.add(botonAlumnos);
		
		JButton botonReportes = new JButton("Reportes");
		botonReportes.setBackground(Color.GREEN);
		botonReportes.setFont(new Font("Tahoma", Font.BOLD, 15));
		botonReportes.setBounds(361, 192, 179, 41);
		contentPane.add(botonReportes);
		
		JButton botonRecepcion = new JButton("Recepcion");
		botonRecepcion.setBackground(Color.GREEN);
		botonRecepcion.setFont(new Font("Tahoma", Font.BOLD, 15));
		botonRecepcion.setBounds(361, 263, 179, 41);
		contentPane.add(botonRecepcion);
		
		JButton botonExit = new JButton("Exit");
		botonExit.setBackground(Color.GREEN);
		botonExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		botonExit.setBounds(361, 333, 179, 41);
		contentPane.add(botonExit);
		
		JButton botonPrestamo = new JButton("Registrar Prestamo");
		botonPrestamo.setBackground(Color.GREEN);
		botonPrestamo.setFont(new Font("Tahoma", Font.BOLD, 15));
		botonPrestamo.setBounds(83, 263, 179, 41);
		contentPane.add(botonPrestamo);
		
		JButton botonArchivoDeEntrada = new JButton("Archivo de Entrada");
		botonArchivoDeEntrada.setBackground(Color.GREEN);
		botonArchivoDeEntrada.setFont(new Font("Tahoma", Font.BOLD, 15));
		botonArchivoDeEntrada.setBounds(83, 333, 179, 41);
		contentPane.add(botonArchivoDeEntrada);
	}
}
