package com.frontend;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import com.backend.Archivo;
import com.backend.Prestamo;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RecepcionLibros extends JFrame {

	private JPanel contentPane;
	private JTextField cajaCodigoLibro;
	private JTextField cajaCarnet;
	private JButton botonCalcular;
	private JButton botonRegresar;
	private JButton botonAceptar;
	
	double costo[];
	Prestamo p;

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
		
		cajaCodigoLibro = new JTextField();
		cajaCodigoLibro.setBounds(204, 101, 206, 25);
		contentPane.add(cajaCodigoLibro);
		cajaCodigoLibro.setColumns(10);
		
		cajaCarnet = new JTextField();
		cajaCarnet.setColumns(10);
		cajaCarnet.setBounds(204, 151, 206, 27);
		contentPane.add(cajaCarnet);
		
		JLabel labelFechaInicial = new JLabel("");
		labelFechaInicial.setBackground(new Color(255, 255, 255));
		labelFechaInicial.setForeground(new Color(255, 255, 255));
		labelFechaInicial.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelFechaInicial.setBounds(161, 214, 124, 27);
		contentPane.add(labelFechaInicial);
		
		JLabel lblFechaActual = new JLabel("Fecha Actual:");
		lblFechaActual.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFechaActual.setBounds(316, 214, 124, 27);
		contentPane.add(lblFechaActual);
		
		JLabel labelFechaActual = new JLabel("");
		labelFechaActual.setForeground(new Color(255, 255, 255));
		labelFechaActual.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelFechaActual.setBounds(454, 214, 124, 27);
		contentPane.add(labelFechaActual);
		
		JLabel lblSubtotal = new JLabel("Subtotal:");
		lblSubtotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSubtotal.setBounds(92, 282, 124, 27);
		contentPane.add(lblSubtotal);
		
		JLabel labelSubtotal = new JLabel("");
		labelSubtotal.setForeground(new Color(255, 255, 255));
		labelSubtotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelSubtotal.setBounds(232, 282, 124, 27);
		contentPane.add(labelSubtotal);
		
		JLabel lblMora = new JLabel("Mora:");
		lblMora.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMora.setBounds(92, 331, 124, 27);
		contentPane.add(lblMora);
		
		JLabel labelMora = new JLabel("");
		labelMora.setForeground(new Color(255, 255, 255));
		labelMora.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelMora.setBounds(232, 331, 124, 27);
		contentPane.add(labelMora);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTotal.setBounds(92, 387, 124, 27);
		contentPane.add(lblTotal);
		
		JLabel labelTotal = new JLabel("");
		labelTotal.setForeground(new Color(255, 255, 255));
		labelTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelTotal.setBounds(232, 387, 124, 27);
		contentPane.add(labelTotal);
		
		botonCalcular = new JButton("Calcular");
		botonCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    p = (Prestamo) Archivo.leerArchivo("Prestamos/"+cajaCarnet.getText()+"-"+cajaCodigoLibro.getText()+".ptm");			    
			    int dias = p.calcularDiasEnPrestamo(p.getFecha());
			    costo =p.getCosto(dias);
			    labelFechaInicial.setText(p.getFecha().toString());
			    labelFechaActual.setText(p.getFechaActual().toString());
			    labelSubtotal.setText(String.valueOf(costo[0]));
			    labelMora.setText(String.valueOf(costo[1]));
			    double total = costo[0]+costo[1];
			    labelTotal.setText(String.valueOf(total));
			}
		});
		botonCalcular.setBounds(453, 148, 95, 27);
		contentPane.add(botonCalcular);
		
		botonRegresar = new JButton("Back");
		botonRegresar.setBounds(105, 466, 102, 45);
		contentPane.add(botonRegresar);
		
		botonAceptar = new JButton("Pagar");
		botonAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    p.setTotal(costo[0]+costo[1]);
			    p.setTotalDeMora(costo[1]);
			    p.setCancelado(true);
			    p.setFechaDePago(p.getFechaActual());
			    Archivo.escribirArchivoBinario("Prestamos/"+p.getCarnet()+"-"+p.getCodigoLibro()+".ptm", p);
			    p.actualizarDatos(p.getCodigoLibro(), p.getCarnet(), Prestamo.EGRESO);
			    JOptionPane.showMessageDialog(null, "Pagado");
			}
		});
		botonAceptar.setBounds(401, 466, 102, 45);
		contentPane.add(botonAceptar);
		
		JLabel label = new JLabel("Carnet:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(32, 153, 124, 25);
		contentPane.add(label);
		
	}
}
