package com.frontend;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class RecepcionLibros extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnCalcular;
	private JButton botonRegresar;
	private JButton botonAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecepcionLibros frame = new RecepcionLibros();
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
	public RecepcionLibros() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 580);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegistroPrestamos = new JLabel("Recepcion Libros");
		lblRegistroPrestamos.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblRegistroPrestamos.setBounds(153, 21, 298, 54);
		contentPane.add(lblRegistroPrestamos);
		
		JLabel lblCodigoLibro = new JLabel("Fecha Inicial:");
		lblCodigoLibro.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCodigoLibro.setBounds(32, 214, 124, 27);
		contentPane.add(lblCodigoLibro);
		
		JLabel lblCodigoLibro_2 = new JLabel("Codigo Libro:");
		lblCodigoLibro_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCodigoLibro_2.setBounds(32, 96, 124, 27);
		contentPane.add(lblCodigoLibro_2);
		
		textField = new JTextField();
		textField.setBounds(204, 101, 206, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(204, 151, 206, 27);
		contentPane.add(textField_1);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(453, 148, 95, 27);
		contentPane.add(btnCalcular);
		
		botonRegresar = new JButton("Back");
		botonRegresar.setBounds(105, 466, 102, 45);
		contentPane.add(botonRegresar);
		
		botonAceptar = new JButton("Pagar");
		botonAceptar.setBounds(401, 466, 102, 45);
		contentPane.add(botonAceptar);
		
		JLabel label = new JLabel("Carnet:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(32, 153, 124, 25);
		contentPane.add(label);
		
		JLabel fechaInicial = new JLabel("");
		fechaInicial.setBackground(new Color(255, 255, 255));
		fechaInicial.setForeground(new Color(255, 255, 255));
		fechaInicial.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fechaInicial.setBounds(161, 214, 124, 27);
		contentPane.add(fechaInicial);
		
		JLabel lblFechaActual = new JLabel("Fecha Actual:");
		lblFechaActual.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFechaActual.setBounds(316, 214, 124, 27);
		contentPane.add(lblFechaActual);
		
		JLabel fechaActual = new JLabel("");
		fechaActual.setForeground(new Color(255, 255, 255));
		fechaActual.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fechaActual.setBounds(454, 214, 124, 27);
		contentPane.add(fechaActual);
		
		JLabel lblSubtotal = new JLabel("Subtotal:");
		lblSubtotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSubtotal.setBounds(92, 282, 124, 27);
		contentPane.add(lblSubtotal);
		
		JLabel label_2 = new JLabel("");
		label_2.setForeground(new Color(255, 255, 255));
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setBounds(232, 282, 124, 27);
		contentPane.add(label_2);
		
		JLabel lblMora = new JLabel("Mora:");
		lblMora.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMora.setBounds(92, 331, 124, 27);
		contentPane.add(lblMora);
		
		JLabel label_4 = new JLabel("");
		label_4.setForeground(new Color(255, 255, 255));
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_4.setBounds(232, 331, 124, 27);
		contentPane.add(label_4);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTotal.setBounds(92, 387, 124, 27);
		contentPane.add(lblTotal);
		
		JLabel label_6 = new JLabel("");
		label_6.setForeground(new Color(255, 255, 255));
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_6.setBounds(232, 387, 124, 27);
		contentPane.add(label_6);
	}
}
