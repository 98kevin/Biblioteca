/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backend;

import java.io.Serializable;
import java.sql.Date;

import javax.swing.JTextArea;

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

    public final String PATH_COUNT="Contadores/ContadorDeEstudiantes.cnt";
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
        return carrera;
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
        this(carnet,nombre,idCarrera,"",null);
    }
    
    public Estudiante(int carnet, String nombre, int idCarrera, String carrera, Date fechaDeNacimiento) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.idCarrera = idCarrera;
        this.carrera = getNombreCarrera(idCarrera);
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.cantidadDeLibrosEnPrestamo = 0;
        Archivo.escribirArchivoBinario(getPathOfFile(carnet), this);
    }
    
    private String getNombreCarrera(int idCarrera){
            switch(idCarrera){
                case INGENIERIA:
                    return "Ingenieria";
                case MEDICINA:
                    return "Ingenieria";
                case DERECHO:
                    return "Ingenieria";
                case ARQUITECTURA:
                    return "Ingenieria";
                case ADMINISTRACION:
                    return "Ingenieria";
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
    
    public int leerCarrera(String instruccion) {
    	String token[]=instruccion.split(":");
    	return Integer.parseInt(token[1]);
    }
}
