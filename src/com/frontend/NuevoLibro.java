package com.frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.backend.Libro;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class NuevoLibro extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1005L;
    private JPanel contentPane;
    private JTextField titulo;
    private JTextField cajaDia;
    private JTextField cajaMes;
    private JTextField cajaAnio;
    private JTextField autor;
    private JTextField codigoLibro;
    private JTextField copias;
    private JTextField editorial;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    NuevoLibro frame = new NuevoLibro();
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
    public NuevoLibro() {
    	setResizable(false);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 584, 570);
	contentPane = new JPanel();
	contentPane.setBackground(new Color(135, 206, 235));
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JLabel lblIngresoNuevosEstudiantes = new JLabel("Ingreso Nuevos Libros");
	lblIngresoNuevosEstudiantes.setFont(new Font("Tahoma", Font.BOLD, 20));
	lblIngresoNuevosEstudiantes.setBounds(163, 46, 242, 38);
	contentPane.add(lblIngresoNuevosEstudiantes);
	
	titulo = new JTextField();
	titulo.setBounds(195, 123, 286, 26);
	contentPane.add(titulo);
	titulo.setColumns(10);
	
	JLabel lblCarnet = new JLabel("Titulo:");
	lblCarnet.setFont(new Font("Tahoma", Font.PLAIN, 20));
	lblCarnet.setBounds(57, 118, 60, 26);
	contentPane.add(lblCarnet);
	
	JLabel lblDia = new JLabel("dia");
	lblDia.setBounds(250, 390, 60, 17);
	contentPane.add(lblDia);
	
	JLabel lblMes = new JLabel("mes");
	lblMes.setBounds(325, 390, 60, 17);
	contentPane.add(lblMes);
	
	JLabel lblA = new JLabel("a\u00F1o");
	lblA.setBounds(433, 390, 60, 17);
	contentPane.add(lblA);
	
	cajaDia = new JTextField();
	cajaDia.setBounds(240, 359, 56, 21);
	contentPane.add(cajaDia);
	cajaDia.setColumns(10);
	
	cajaMes = new JTextField();
	cajaMes.setBounds(311, 359, 60, 21);
	contentPane.add(cajaMes);
	cajaMes.setColumns(10);
	
	cajaAnio = new JTextField();
	cajaAnio.setBounds(381, 359, 100, 21);
	contentPane.add(cajaAnio);
	cajaAnio.setColumns(10);
	
	JLabel lblAutor = new JLabel("Autor: ");
	lblAutor.setFont(new Font("Tahoma", Font.PLAIN, 20));
	lblAutor.setBounds(55, 172, 126, 26);
	contentPane.add(lblAutor);
	
	JLabel lblCodigoLibro = new JLabel("Codigo Libro:");
	lblCodigoLibro.setFont(new Font("Tahoma", Font.PLAIN, 20));
	lblCodigoLibro.setBounds(57, 218, 126, 26);
	contentPane.add(lblCodigoLibro);
	
	JLabel lblCopias = new JLabel("Copias:");
	lblCopias.setFont(new Font("Tahoma", Font.PLAIN, 20));
	lblCopias.setBounds(55, 262, 126, 26);
	contentPane.add(lblCopias);
	
	JLabel lblEditorial = new JLabel("Editorial:");
	lblEditorial.setFont(new Font("Tahoma", Font.PLAIN, 20));
	lblEditorial.setBounds(57, 310, 126, 26);
	contentPane.add(lblEditorial);
	
	JLabel lblFechasDePublicacion = new JLabel("Fechas de Publicaci\u00F3n: ");
	lblFechasDePublicacion.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lblFechasDePublicacion.setBounds(57, 359, 228, 26);
	contentPane.add(lblFechasDePublicacion);
	
	autor = new JTextField();
	autor.setColumns(10);
	autor.setBounds(195, 172, 286, 26);
	contentPane.add(autor);
	
	codigoLibro = new JTextField();
	codigoLibro.setColumns(10);
	codigoLibro.setBounds(195, 218, 286, 26);
	contentPane.add(codigoLibro);
	
	copias = new JTextField();
	copias.setColumns(10);
	copias.setBounds(195, 262, 286, 26);
	contentPane.add(copias);
	
	editorial = new JTextField();
	editorial.setColumns(10);
	editorial.setBounds(195, 310, 286, 26);
	contentPane.add(editorial);
	
	JButton botonAceptar1 = new JButton("Aceptar");
	botonAceptar1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (tieneCamposLlenos(codigoLibro, titulo, autor,copias)) {
				   Libro li = new Libro();
				   li.ingresarDatos(codigoLibro,titulo , autor, copias, cajaAnio,cajaMes, cajaDia,editorial);
				   setVisible(false);
				   new RegistroLibros().setVisible(true);
			       }else {
				JOptionPane.showMessageDialog(null, "Falta datos por ingresar", "Campos obligatorios faltantes", JOptionPane.INFORMATION_MESSAGE);
			    }
			       setVisible(false);
		}
		
	});
	botonAceptar1.setFont(new Font("Tahoma", Font.PLAIN, 18));
	botonAceptar1.setBounds(353, 459, 102, 45);
	contentPane.add(botonAceptar1);
	
	JButton botonCancelar = new JButton("Cancelar");
	botonCancelar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
		    new RegistroLibros().setVisible(true);
		}
	});
	botonCancelar.setFont(new Font("Tahoma", Font.PLAIN, 18));
	botonCancelar.setBounds(111, 459, 102, 45);
	contentPane.add(botonCancelar);
    }
    
    private boolean tieneCamposLlenos(JTextField campo1, JTextField campo2, JTextField campo3, JTextField campo4) {
    	return (campo1.getText()!="" & campo2.getText()!="" & campo3.getText()!="" & campo4.getText()!="");
    }
}
