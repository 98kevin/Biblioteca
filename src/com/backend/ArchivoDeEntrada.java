package com.backend;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Date;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ArchivoDeEntrada extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numLinea=0;
	private JTextArea cajaDeTexto;
	private String instruccion;
	private Scanner lector;
	
	public ArchivoDeEntrada (JTextArea cajaDeTexto,String path) {
		this.cajaDeTexto=cajaDeTexto;
		leerArchivo(path);
	}
	
	public ArchivoDeEntrada () {}
	/**
	 * Metodo utilizado para analizar el archivo de entrada. 
	 * @param path La direccion del archivo que se desea leer
	 */
	public void leerArchivo(String path) {	
		File file=null;
		try {
			file= new File(path);
			lector= new Scanner(file);
			analizarTipoInstruccion(); 
		} catch (FileNotFoundException | NullPointerException e) {
			//no se muestra nada, si no se selecciona un archivo
		} finally {
			try {
				lector.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	private void analizarTipoInstruccion() {
		while(lector.hasNextLine()) {
			String cabecera =lector.nextLine();
			if(cabecera.contains("ESTUDIANTE")) {
				instruccionEstudiante();
			}
			if(cabecera.contains("LIBRO")) {
				instruccionLibro();
			}
					
			if(cabecera.contains("PRESTAMO")) {
				instruccionPrestamo();
			}	
		numLinea++;
		}
		JOptionPane.showMessageDialog(null, "Archivo de entrada ingresado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void instruccionEstudiante() {
		Estudiante st =new Estudiante();
		int carnet = 0;
		String nombre = null;
		int carrera = 0;
		instruccion=siguienteInstruccion(lector);
		if (st.isCarnet(instruccion, cajaDeTexto, numLinea)) {
			carnet=st.leerCarnet(instruccion);
			instruccion=siguienteInstruccion(lector);
			if (st.isNombre(instruccion, cajaDeTexto, numLinea)) {
				nombre=st.leerNombre(instruccion);
				instruccion=siguienteInstruccion(lector);
				if (st.isCarrera(instruccion, cajaDeTexto, numLinea)) {
					carrera=st.leerCarrera(instruccion);
					new Estudiante(carnet,nombre,carrera);
				}
			}
		}	
	}
	
	private String siguienteInstruccion(Scanner lector) {
		instruccion=lector.nextLine();
		numLinea++;
		return instruccion;
	}

	private void instruccionLibro() {
		Libro libro = new Libro();
		String titulo=null;
		String autor=null;
		String codigo=null;
		int cantidad=0;
		instruccion = siguienteInstruccion(lector);
		if(libro.isTitulo(instruccion, cajaDeTexto, numLinea)) {
			titulo=libro.leerTitulo(instruccion);
			instruccion = siguienteInstruccion(lector);
			if (libro.isAutor(instruccion, cajaDeTexto, numLinea)) {
				autor=libro.leerAutor(instruccion);
				instruccion = siguienteInstruccion(lector);
				if (libro.isCodigo(instruccion, cajaDeTexto, numLinea)) {
					codigo=libro.leerCodigo(instruccion);
					instruccion = siguienteInstruccion(lector);
					if (libro.isCantidad(instruccion, cajaDeTexto, numLinea)) {
						cantidad=libro.leerCantidad(instruccion);
						new Libro(codigo,autor,titulo,cantidad);
					}
				}
			}
		}
	}
	
	private void instruccionPrestamo() {
		Prestamo p = new Prestamo();
		Libro l= new Libro();
		Estudiante e = new Estudiante();
		String codigoLibro=null;
		int carnet = 0;
		Date fecha=null;
		instruccion = siguienteInstruccion(lector);
		if (l.isCodigo(instruccion, cajaDeTexto, numLinea)) {
			codigoLibro=l.leerCodigo(instruccion);
			instruccion = siguienteInstruccion(lector);
			if (e.isCarnet(instruccion, cajaDeTexto, numLinea)) {
				carnet=e.leerCarnet(instruccion);
				instruccion = siguienteInstruccion(lector);
				if (p.isFecha(instruccion, cajaDeTexto, numLinea)) {
					fecha=p.leerFechaDeInstruccion(instruccion);
					if(p.validacionDePrestamo(carnet, codigoLibro)) {// si el prestamo es valido procede a ingresarlo
					    new Prestamo(codigoLibro, carnet, fecha);
					}
				}
			}
		}	
	}
	
	@SuppressWarnings("deprecation")
	private Date leerFecha(String string) {
		String parte[]=string.split("-");
		int anio =Integer.parseInt(parte[0]);
		int mes =Integer.parseInt(parte[1]);
		int dia =Integer.parseInt(parte[2]);
		return new Date(anio,mes,dia);
	}

	public String seleccionarArchivo() {
		JFileChooser chooser = new JFileChooser();
	     FileNameExtensionFilter filter = new FileNameExtensionFilter(
	         "Only txt files", "txt");
	     chooser.setFileFilter(filter);
	     int returnVal = chooser.showOpenDialog(this);
	     if(returnVal==JFileChooser.APPROVE_OPTION)
	    	 return chooser.getSelectedFile().getAbsolutePath();
	     else
	    	 return null;
	}
	
}