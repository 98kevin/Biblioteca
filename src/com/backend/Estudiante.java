/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backend;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author kevin
 */
public class Estudiante implements Serializable{
    
    private static final long serialVersionUID=1001L;
    
    private int carnet;
    private String nombre;
    private int idCarrera;
    private String carrera;
    private Date fechaDeNacimiento;
    private int cantidadDeLibrosEnPrestamo;

    public final int INGENIERIA=1;
    public final int MEDICINA=2;
    public final int DERECHO=3;
    public final int ARQUITECTURA=4;
    public final int ADMINISTRACION=5;
    
    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getCarrera() {
        return this.carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getCantidadDeLibrosEnPrestamo() {
        return cantidadDeLibrosEnPrestamo;
    }

    public void setCantidadDeLibrosEnPrestamo(int cantidadDeLibrosEnPrestamo) {
        this.cantidadDeLibrosEnPrestamo = cantidadDeLibrosEnPrestamo;
    }
    
    /**
     * Crea un nuevo estudiante vacio. 
     */
    public Estudiante() {}
    
    public Estudiante(int carnet, String nombre, int idCarrera){
        this(carnet,nombre,idCarrera,null);
    }
    
    public Estudiante(int carnet, String nombre, int idCarrera, Date fechaDeNacimiento) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.idCarrera = idCarrera;
        this.carrera = getNombreCarrera(this.idCarrera);
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.cantidadDeLibrosEnPrestamo = 0;
        Archivo.escribirArchivoBinario(getPathOfFile(carnet), this);
    }
    
    private String getNombreCarrera(int idCarrera){
            switch(idCarrera){
                case INGENIERIA:
                    return "Ingenieria";
                case MEDICINA:
                    return "Medicina";
                case DERECHO:
                    return "Derecho";
                case ARQUITECTURA:
                    return "Arquitectura";
                case ADMINISTRACION:
                    return "Administracion";
                default:
                    return null;
            }
    }
    
    public static  String getPathOfFile(int carnet){
        return "Estudiantes/"+String.valueOf(carnet)+".std";
    }
    
    /**
     * Validacion de la instruccion de nombre para estudiante
     * @param instruccion La instruccion que se est� manejando 
     * @param cajaDeTexto La caja de texto de impresion de errores
     * @param posicion La cantidad de l�neas que se han evaluado
     * @return un booleano que indica si la instruccion es valida
     */
    public boolean isNombre(String instruccion,JTextArea cajaDeTexto, int posicion) {
    	String token[]=instruccion.split(":");
    	if(token[0].equals("NOMBRE")) {
    		return true;
    	}
    	else {
    		cajaDeTexto.append("Error al evaluar nombre en la linea "+posicion+", error de sintaxis. \n "+instruccion +"\n\n");
    		return false;
    	}
    }
    
    public String leerNombre(String instruccion) {
    	String token[]=instruccion.split(":");
    	return token[1];
    }
    
    public boolean isCarnet(String instruccion,JTextArea cajaDeTexto, int posicion) {
    	String token[]=instruccion.split(":");
    	boolean result=false;
    	try {
        	if(token[0].equals("CARNET")&&token[1].length()==9) {
        		Integer.parseInt(token[1]);
        		result = true;
        	}	
        	else {
        		cajaDeTexto.append("Error al evaluar carnet en la linea "+posicion+", error de sintaxis. \n "+ instruccion +"\n\n");
        		result= false;
        	}
		} catch (NumberFormatException e) {
			cajaDeTexto.append("Error en la l�nea "+posicion+", por formato de numero del carnet \n "+ instruccion +"\n\n");
		}
		return result;
    }
    
    public int leerCarnet(String instruccion) {
        	String token[]=instruccion.split(":");
        	return Integer.parseInt(token[1]);
    }
    
        public boolean isCarrera (String instruccion,JTextArea cajaDeTexto, int posicion) {
        	String token []= instruccion.split(":");
        	boolean result = false;
        	try {
    			if (token[0].equals("CARRERA")) {
    				int codCarrera= Integer.parseInt(token[1]);
    				if(codCarrera>=1 &&codCarrera<=5)
    					result = true;
    				else
    					cajaDeTexto.append("Error en la l�nea "+posicion+" el codigo no era un valor entre 1 y 5\n "+ instruccion +"\n\n");
    			}else 
    				result =false;
    		} catch (NumberFormatException e) {
    			cajaDeTexto.append("Error en la l�nea "+posicion+", codigo de carrera no aceptado\n "+ instruccion +"\n\n");
    		}
        	return result;
        }
    
        public void ingresarDatos(JTextField cajaCarnet, JTextField cajaNombre, JComboBox<String> cajaCarrera, JTextField cajaDia,JTextField cajaMes,JTextField cajaAnio) {
            Prestamo p = new Prestamo();
            Date fecha=p.leerFecha(cajaAnio.getText(), cajaMes.getText(), cajaDia.getText());
            try {
        	new Estudiante(Integer.parseInt(cajaCarnet.getText()),cajaNombre.getText(), cajaCarrera.getSelectedIndex()+1,fecha);
	    } catch (NumberFormatException e) {
		  JOptionPane.showConfirmDialog(null, "Tipos de datos invalidos, revise el carnet o el codigo de  carrera", "Error ", JOptionPane.ERROR_MESSAGE);
	    }
        }
        
        public int leerCarrera(String instruccion) {
        	String token[]=instruccion.split(":");
        	return Integer.parseInt(token[1]);
        }
	
	public static Comparator<Estudiante> sortCarnetStudent= new Comparator<Estudiante>() {
	public int compare(Estudiante s1, Estudiante s2) {
	   String carnet1 = s1.getNombre().toUpperCase();
	   String carnet2 = s2.getNombre().toUpperCase();
	   //Asendiente
	   return carnet1.compareTo(carnet2);
	}};
	
	    public Object [][] returnRows(ArrayList<Estudiante> lista){
		Collections.sort(lista, sortCarnetStudent);
		Object [][] registros = new Object[lista.size()][6];
		for (int i = 0; i < lista.size(); i++) {
		    registros[i][0]=lista.get(i).getCarnet();
		    registros[i][1]=lista.get(i).getNombre();
		    registros[i][2]=lista.get(i).getIdCarrera();
		    registros[i][3]=lista.get(i).getCarrera();
		    registros[i][4]=lista.get(i).getFechaDeNacimiento();
		    registros[i][5]=lista.get(i).getCantidadDeLibrosEnPrestamo();
		}
		return registros;
	    }
	
}