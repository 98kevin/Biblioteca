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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class Bienvenida extends JFrame {
	
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bienvenida frame = new Bienvenida();
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
	public Bienvenida() {
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1110, 476);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton botonAlumno = new JButton("Alumnos");
		botonAlumno.setBounds(71, 107, 179, 41);
		botonAlumno.setForeground(new Color(255, 255, 255));
		botonAlumno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new RegistroEstudiantes().setVisible(true);
			}
		});
		contentPane.setLayout(null);
		botonAlumno.setBackground(new Color(0, 0, 0));
		botonAlumno.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(botonAlumno);
		
		
		JButton botonLibros = new JButton("Libros");
		botonLibros.setBounds(71, 158, 179, 41);
		botonLibros.setForeground(new Color(255, 255, 255));
		botonLibros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new RegistroLibros().setVisible(true);
			}
		});
		botonLibros.setBackground(new Color(0, 0, 0));
		botonLibros.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(botonLibros);
		
		JButton botonReportes = new JButton("Reportes");
		botonReportes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new VentanaReportes().setVisible(true);
			}
		});
		botonReportes.setBounds(71, 311, 179, 41);
		botonReportes.setForeground(new Color(255, 255, 255));
		botonReportes.setBackground(new Color(0, 0, 0));
		botonReportes.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(botonReportes);
		
		JButton botonRecepcion = new JButton("Recepcion");
		botonRecepcion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new RecepcionLibros().setVisible (true);
			
			}
		});
		botonRecepcion.setBounds(71, 362, 179, 41);
		botonRecepcion.setForeground(new Color(255, 255, 255));
		botonRecepcion.setBackground(new Color(0, 0, 0));
		botonRecepcion.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(botonRecepcion);
		
		JButton botonExit = new JButton("Exit");
		botonExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		botonExit.setBounds(881, 374, 179, 41);
		botonExit.setForeground(new Color(255, 255, 255));
		botonExit.setBackground(new Color(0, 0, 0));
		botonExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(botonExit);
		
		JButton botonPrestamo = new JButton("Prestamos");
		botonPrestamo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new FormularioPrestamo().setVisible(true); 
				
			}
		});
		botonPrestamo.setBounds(71, 209, 179, 41);
		botonPrestamo.setForeground(new Color(255, 255, 255));
		botonPrestamo.setBackground(new Color(0, 0, 0));
		botonPrestamo.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(botonPrestamo);
		
		JButton botonArchivoDeEntrada = new JButton("Archivo de Entrada");
		botonArchivoDeEntrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Existente().setVisible(true);
			}
		});
		botonArchivoDeEntrada.setBounds(71, 260, 179, 41);
		botonArchivoDeEntrada.setForeground(new Color(255, 255, 255));
		botonArchivoDeEntrada.setBackground(new Color(0, 0, 0));
		botonArchivoDeEntrada.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(botonArchivoDeEntrada);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1096, 80);
		panel.setBackground(SystemColor.textHighlight);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Biblioteca CUNOC");
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\luedu\\git\\Biblioteca\\src\\image\\libros (2).jpg"));
		label.setBounds(260, -205, 611, 661);
		contentPane.add(label);
	}
}