package com.backend;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Date;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ArchivoDeEntrada extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ArchivoDeEntrada () {
		leerArchivo(seleccionarArchivo());
	}
	
	
	public void leerArchivo(String path) {	
		Scanner lector = null;
		File file=null;
		try {
			file= new File(path);
			lector= new Scanner(file);
			analizarTipoInstruccion(lector);
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
	
	private void analizarTipoInstruccion(Scanner lector) {
		while(lector.hasNextLine()) {
			String cabecera =lector.nextLine();
			if(cabecera.startsWith("ESTUDIANTE")) {
				analizarEstudiante(lector);
			}
			if(cabecera.startsWith("LIBRO")) {
				analizarLibro(lector);
			}
					
			if(cabecera.startsWith("PRESTAMO")) {
				analizarPrestamo(lector);
			}	
		}
		JOptionPane.showMessageDialog(null, "Archivo de entrada ingresado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void analizarEstudiante(Scanner lector) {
		int carnet = 0;
		String nombre = null;
		int carrera = 0;
		int indice=0;
		String instruccion[]=new String [3];
		for (int i = 0; i < instruccion.length; i++) {
			instruccion[i]=lector.nextLine();
			if(!instruccionFundamental(instruccion[i],lector)){
				String token[] =instruccion[i].split(":");
				if(i==0&&token[0].contains("CARNET"))
					carnet=Integer.parseInt(token[1].replace(" ", ""));  //quitamos espacios si los ubiera antes de los numeros
				if(i==1&&token[0].contains("NOMBRE"))
					nombre=token[1];
				if(i==2&&token[0].contains("CARRERA"))
					carrera=Integer.parseInt(token[1].replace(" ", "")); 	
			}
		}
		new Estudiante(carnet,nombre,carrera);
	}
	
	private void analizarLibro(Scanner lector) {
		String titulo=null;
		String autor=null;
		String codigo=null;
		int cantidad=0;
		String instruccion[]=new String [4];
		for (int i = 0; i < instruccion.length; i++) {
			instruccion[i]=lector.nextLine();
			if(!instruccionFundamental(instruccion[i],lector)){
				String token[] =instruccion[i].split(":");
				if(i==0&&token[0].contains("CARNET"))
					titulo=token[1];
				if(i==1&&token[0].contains("AUTOR"))
					autor=token[1];
				if(i==2&&token[0].contains("CODIGO"))
					codigo=token[1];
				if(i==3&&token[0].contains("CANTIDAD"))
					cantidad=Integer.parseInt(token[1].replace(" ", ""));  //quitamos espacios innecesarios
			}
		}
		new Libro(codigo,autor,titulo,cantidad);
	}
	
	private void analizarPrestamo(Scanner lector) {
		String codigoLibro=null;
		int carnet = 0;
		Date fecha=null;
		String instruccion[]=new String [3];
		for (int i = 0; i < instruccion.length; i++) {
			instruccion[i]=lector.nextLine();
			if(!instruccionFundamental(instruccion[i],lector)){
				String token[] =instruccion[i].split(":");
				if(i==0&&token[0].contains("CODIGOLIBRO"))
					codigoLibro=token[1];
				if(i==1&&token[0].contains("CANTIDAD"))
					carnet=Integer.parseInt(token[1].replace(" ", ""));
				if(i==2&&token[0].contains("CANTIDAD"))
					fecha=leerFecha(token[1]);
			}
		}
		new Prestamo(codigoLibro, carnet, fecha);
	}
	
	private Date leerFecha(String string) {
		String parte[]=string.split("-");
		int anio =Integer.parseInt(parte[0]);
		int mes =Integer.parseInt(parte[1]);
		int dia =Integer.parseInt(parte[2]);
		return new Date(anio,mes,dia);
	}


	private boolean instruccionFundamental(String instruccion,Scanner lector) {
		if(instruccion.startsWith("ESTUDIANTE")) {
			
			return true;
		}if(instruccion.startsWith("LIBRO")) {
			
			return true;
		}
		if(instruccion.startsWith("PRESTAMO")) {
			
			return true;
		}	
		else {
			return false;
		}
			
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
	
	private void analizarInstruccion() {
		
	}
}