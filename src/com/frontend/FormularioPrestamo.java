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

public class FormularioPrestamo extends JFrame {

	private JPanel contentPane;
	private JButton btnCalcular;
	private JButton botonRegresar;
	private JButton botonAceptar;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel label;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel label_3;

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
		
		btnCalcular = new JButton("Agregar");
		btnCalcular.setBounds(456, 166, 95, 27);
		contentPane.add(btnCalcular);
		
		botonRegresar = new JButton("Back");
		botonRegresar.setBounds(105, 466, 102, 45);
		contentPane.add(botonRegresar);
		
		botonAceptar = new JButton("Aceptar");
		botonAceptar.setBounds(401, 466, 102, 45);
		contentPane.add(botonAceptar);
		
		JLabel label_1 = new JLabel("Codigo Libro:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds(32, 219, 124, 27);
		contentPane.add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(204, 224, 206, 25);
		contentPane.add(textField_2);
		
		JLabel label_2 = new JLabel("Codigo Libro:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setBounds(32, 279, 124, 27);
		contentPane.add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(204, 284, 206, 25);
		contentPane.add(textField_3);
		
		label = new JLabel("Carnet:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(32, 112, 124, 25);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(204, 110, 206, 27);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(204, 167, 206, 25);
		contentPane.add(textField_1);
		
		label_3 = new JLabel("Codigo Libro:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_3.setBounds(32, 162, 124, 27);
		contentPane.add(label_3);
		
		JButton button = new JButton("Agregar");
		button.setBounds(456, 226, 95, 27);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Agregar");
		button_1.setBounds(456, 286, 95, 27);
		contentPane.add(button_1);
	}
}
