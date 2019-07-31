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

public class IngresoNuevosEstudiantes extends JFrame {

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
		    IngresoNuevosEstudiantes frame = new IngresoNuevosEstudiantes();
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
    public IngresoNuevosEstudiantes() {
    	setResizable(false);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 797, 570);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JLabel lblIngresoNuevosEstudiantes = new JLabel("Ingreso Nuevos Estudiantes");
	lblIngresoNuevosEstudiantes.setBounds(241, 26, 242, 38);
	contentPane.add(lblIngresoNuevosEstudiantes);
	
	cajaCarnet = new JTextField();
	cajaCarnet.setBounds(112, 112, 114, 21);
	contentPane.add(cajaCarnet);
	cajaCarnet.setColumns(10);
	
	JLabel lblCarnet = new JLabel("Carnet");
	lblCarnet.setBounds(12, 114, 60, 17);
	contentPane.add(lblCarnet);
	
	JLabel lblNombre = new JLabel("Nombre");
	lblNombre.setBounds(12, 166, 60, 17);
	contentPane.add(lblNombre);
	
	cajaNombre = new JTextField();
	cajaNombre.setBounds(130, 164, 273, 21);
	contentPane.add(cajaNombre);
	cajaNombre.setColumns(10);
	
	JLabel lblCarrera = new JLabel("Carrera");
	lblCarrera.setBounds(12, 221, 60, 17);
	contentPane.add(lblCarrera);
	
	JComboBox <String>cajaCarrera = new JComboBox<String>();
	cajaCarrera.addItem("Ingenieria");
	cajaCarrera.addItem("Medicina");
	cajaCarrera.addItem("Derecho");
	cajaCarrera.addItem("Arquitectura");
	cajaCarrera.addItem("Administracion");
	cajaCarrera.setBounds(130, 216, 273, 26);
	contentPane.add(cajaCarrera);
	
	JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento");
	lblFechaDeNacimiento.setBounds(12, 278, 164, 17);
	contentPane.add(lblFechaDeNacimiento);
	
	JLabel lblDia = new JLabel("dia");
	lblDia.setBounds(166, 307, 60, 17);
	contentPane.add(lblDia);
	
	JLabel lblMes = new JLabel("mes");
	lblMes.setBounds(241, 307, 60, 17);
	contentPane.add(lblMes);
	
	JLabel lblA = new JLabel("año");
	lblA.setBounds(349, 307, 60, 17);
	contentPane.add(lblA);
	
	cajaDia = new JTextField();
	cajaDia.setBounds(170, 276, 45, 21);
	contentPane.add(cajaDia);
	cajaDia.setColumns(10);
	
	cajaMes = new JTextField();
	cajaMes.setBounds(227, 276, 80, 21);
	contentPane.add(cajaMes);
	cajaMes.setColumns(10);
	
	cajaAnio = new JTextField();
	cajaAnio.setBounds(326, 276, 114, 21);
	contentPane.add(cajaAnio);
	cajaAnio.setColumns(10);
	
	JButton botonCancelar = new JButton("Cancelar");
	botonCancelar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    setVisible(false);
		}
	});
	botonCancelar.setBounds(112, 396, 105, 27);
	contentPane.add(botonCancelar);
	
	JButton botonAceptar = new JButton("Aceptar");
	botonAceptar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		       if (tieneCamposLlenos(cajaCarnet, cajaNombre, cajaCarrera)) {
			   Estudiante st = new Estudiante();
			   st.ingresarDatos(cajaCarnet, cajaNombre, cajaCarrera, cajaDia, cajaMes, cajaAnio);
			   setVisible(false);
			   new Registro().setVisible(true);
		       }else {
			JOptionPane.showMessageDialog(null, "Falta datos por ingresar", "Campos obligatorios faltantes", JOptionPane.INFORMATION_MESSAGE);
		    }
		       setVisible(false);
		}
	});
	botonAceptar.setBounds(298, 396, 105, 27);
	contentPane.add(botonAceptar);
    }
    
    private boolean tieneCamposLlenos(JTextField campo1, JTextField campo2, JComboBox<String> campo3) {
	return (campo1.getText()!="" & campo2.getText()!="" & campo3.getSelectedIndex()>=0);
    }
    
}
