package com.frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.backend.Estudiante;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class NuevoEstudiante extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1005L;
    private JPanel contentPane;
    private JTextField cajaCarnet;
    private JTextField cajaNombre;
    private JTextField cajaDia;
    private JTextField cajaMes;
    private JTextField cajaAnio;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    NuevoEstudiante frame = new NuevoEstudiante();
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
    public NuevoEstudiante() {
    	setBackground(new Color(135, 206, 235));
    	setResizable(false);
	setBounds(100, 100, 515, 570);
	contentPane = new JPanel();
	contentPane.setBackground(new Color(135, 206, 235));
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JLabel lblIngresoNuevosEstudiantes = new JLabel("Ingreso Nuevos Estudiantes");
	lblIngresoNuevosEstudiantes.setFont(new Font("Tahoma", Font.BOLD, 20));
	lblIngresoNuevosEstudiantes.setBounds(98, 38, 292, 38);
	contentPane.add(lblIngresoNuevosEstudiantes);
	
	cajaCarnet = new JTextField();
	cajaCarnet.setBounds(149, 131, 305, 28);
	contentPane.add(cajaCarnet);
	cajaCarnet.setColumns(10);
	
	JLabel lblCarnet = new JLabel("Carnet:");
	lblCarnet.setFont(new Font("Tahoma", Font.PLAIN, 20));
	lblCarnet.setBounds(28, 127, 75, 26);
	contentPane.add(lblCarnet);
	
	JLabel lblNombre = new JLabel("Nombre:");
	lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
	lblNombre.setBounds(28, 179, 86, 26);
	contentPane.add(lblNombre);
	
	cajaNombre = new JTextField();
	cajaNombre.setBounds(149, 184, 305, 25);
	contentPane.add(cajaNombre);
	cajaNombre.setColumns(10);
	
	JLabel lblCarrera = new JLabel("Carrera:");
	lblCarrera.setFont(new Font("Tahoma", Font.PLAIN, 20));
	lblCarrera.setBounds(28, 234, 86, 26);
	contentPane.add(lblCarrera);
	
	JComboBox <String>cajaCarrera = new JComboBox<String>();
	cajaCarrera.addItem("Ingenieria");
	cajaCarrera.addItem("Medicina");
	cajaCarrera.addItem("Derecho");
	cajaCarrera.addItem("Arquitectura");
	cajaCarrera.addItem("Administracion");
	cajaCarrera.setBounds(149, 238, 305, 26);
	contentPane.add(cajaCarrera);
	
	JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento:");
	lblFechaDeNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lblFechaDeNacimiento.setBounds(28, 293, 198, 32);
	contentPane.add(lblFechaDeNacimiento);
	
	JLabel lblDia = new JLabel("dia");
	lblDia.setBounds(239, 331, 60, 17);
	contentPane.add(lblDia);
	
	JLabel lblMes = new JLabel("mes");
	lblMes.setBounds(309, 331, 60, 17);
	contentPane.add(lblMes);
	
	JLabel lblA = new JLabel("a\u00F1o");
	lblA.setBounds(394, 332, 60, 17);
	contentPane.add(lblA);
	
	cajaDia = new JTextField();
	cajaDia.setBounds(229, 303, 46, 21);
	contentPane.add(cajaDia);
	cajaDia.setColumns(10);
	
	cajaMes = new JTextField();
	cajaMes.setBounds(285, 303, 60, 21);
	contentPane.add(cajaMes);
	cajaMes.setColumns(10);
	
	cajaAnio = new JTextField();
	cajaAnio.setBounds(355, 303, 85, 21);
	contentPane.add(cajaAnio);
	cajaAnio.setColumns(10);
	
	JButton botonCancelar = new JButton("Cancelar");
	botonCancelar.setFont(new Font("Tahoma", Font.PLAIN, 18));
	botonCancelar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    new RegistroEstudiantes().setVisible(true);
		    setVisible(false);
		}
	});
	botonCancelar.setBounds(66, 433, 127, 47);
	contentPane.add(botonCancelar);
	
	JButton botonAceptar = new JButton("Aceptar");
	botonAceptar.setFont(new Font("Tahoma", Font.PLAIN, 18));
	botonAceptar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		       if (tieneCamposLlenos(cajaCarnet, cajaNombre, cajaCarrera)) {
			   Estudiante st = new Estudiante();
			   st.ingresarDatos(cajaCarnet, cajaNombre, cajaCarrera, cajaDia, cajaMes, cajaAnio);
			   setVisible(false);
			   new RegistroEstudiantes().setVisible(true);
		       }else {
			JOptionPane.showMessageDialog(null, "Falta datos por ingresar", "Campos obligatorios faltantes", JOptionPane.INFORMATION_MESSAGE);
		    }
		       setVisible(false);
		}
	});
	botonAceptar.setBounds(280, 433, 128, 47);
	contentPane.add(botonAceptar);
    }
    
    private boolean tieneCamposLlenos(JTextField campo1, JTextField campo2, JComboBox<String> campo3) {
	return (campo1.getText()!="" & campo2.getText()!="" & campo3.getSelectedIndex()>=0);
    }
    
}
