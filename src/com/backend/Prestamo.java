/*
 * T
o change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backend;

import java.io.File;
import java.io.Serializable;
import java.sql.Date;
import java.util.Calendar;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author kevin
 */
public class Prestamo implements Serializable{
    
    private final static long serialVersionUID=1002L;
    
    private String codigoLibro;
    private int carnet;
    private int idCarrera;
    private Date fecha;
    private int diasEnMora;
    private double total;
    private double totalDeMora;
    private boolean cancelado;

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getDiasEnMora() {
        return diasEnMora;
    }

    public void setDiasEnMora(int diasEnMora) {
        this.diasEnMora = diasEnMora;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotalDeMora() {
        return totalDeMora;
    }

    public void setTotalDeMora(double totalDeMora) {
        this.totalDeMora = totalDeMora;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }
    /**
     * Crea un nuevo prestamo en base al formulario de ingreso
     * @param codigoLibro Codigo del libro que se desea prestar
     * @param carnet El carnet del estudiante que solicita el prestamo
     */
    public Prestamo(String codigoLibro, int carnet) {
        this(codigoLibro,carnet,null);
    }
    
    public Prestamo() {}
    /**
     * Devuleve la fecha actual
     * @return Una fecha del paquete sql.date
     */
    private Date getFechaActual(){
        Calendar tiempoEnMillis = Calendar.getInstance();
        Date fechaActual = new Date(tiempoEnMillis.getTimeInMillis());
        return fechaActual;
    }
    
    /**
     * Crea un nuevo prestamo en base al archivo de entrada
     * @param codigoLibro codigo del libro en prestamo
     * @param carnet El carnet del estudiante en prestamo
     * @param fecha La fecha inicial del prestamo
     */
    public Prestamo(String codigoLibro, int carnet, Date fecha) {
        this.codigoLibro = codigoLibro;
        this.carnet = carnet;
        this.fecha = (fecha==null)?getFechaActual():fecha;
        Archivo.escribirArchivoBinario(getPathOfFile(this), this);
    }
    
    /**
     * Analiza la cantidad de libros que tiene un estudiante y verifica si puede prestar mas libros
     * @param carnet El carnet del estudiante solicitante
     * @return Verdadero si tiene dos libros o menos
     */
    public boolean validacionDePrestamo(int carnet, String codigoLibro){
	boolean result=true;
        String pathStudent= Estudiante.getPathOfFile(carnet);
        Estudiante student = (Estudiante) Archivo.leerArchivo(pathStudent);
        String pathBook=Libro.getPathOfFile(codigoLibro);
        Libro book = (Libro) Archivo.leerArchivo(pathBook);
        if (new File(pathStudent).exists() & new File(pathBook).exists()) { //Si existe el libro y existe el estudiante se procede analizar el prestamo
            if(student.getCantidadDeLibrosEnPrestamo() >=3 || book.getCantidadDeCopias()<=0)
        	result=false;
	}else {
	    JOptionPane.showMessageDialog(null, "No existe el libro o estudiante para efectuar el prestamo", "Error", JOptionPane.INFORMATION_MESSAGE);
	}
        return result;
    }
    
    public int calcularDiasEnPrestamo(String codigoLibro, int carnet, Date fechaInicial){
        Date fechaActual= new Date(Calendar.getInstance().getTimeInMillis());
        boolean tieneDias=true;
        while (!tieneDias) {
            
        }
        return 1;
    }
    
    private String getPathOfFile(Prestamo p){
        return "Prestamos/"+p.getCarnet()+"-"+p.getCodigoLibro()+"-"+p.getFecha()+".ptm";
    }
    
    public boolean isFecha(String instruccion, JTextArea cajaDeTexto, int posicion){
    	String token [] = instruccion.split(":");
    	boolean result = false;
    	try {
    			if (token[0].equals("FECHA")){
    				String datos []=token[1].split("-");
    				int anio=Integer.parseInt(datos[0]);
    				int mes=Integer.parseInt(datos[1]);
    				int dia=Integer.parseInt(datos[2]);
    				if (anio>2000 & anio<2050 &
    					mes >=0 & mes<=12&
    					dia>=0 & dia<=31) {
    					result =true;
    				}else {
    					cajaDeTexto.append("Error en la linea"+posicion+" rangos de fecha no validos\n "+ instruccion +"\n\n");
    				}
			}else {
				cajaDeTexto.append("Error en la linea"+posicion+" no se entinde el tipo de instruccion\n "+ instruccion +"\n\n");
			}
		} catch (Exception e) {
			cajaDeTexto.append("Error en la linea"+posicion+" numeros de la fecha incorrectos\n "+ instruccion +"\n\n");
		}
    	return result;
    }
    
    public Date leerFechaDeInstruccion(String instruccion) {
    	String token[]=instruccion.split(":");
    	String datos [] = token[1].split("-");
    	Date fecha = leerFecha(datos[0], datos[1], datos[2]);
    	return fecha;
    }
    
    public Date leerFecha(String textoAnio, String textoMes, String textoDia) {
	int anio=0;
	int mes=0;
	int dia=0;
	try {
	    anio = Integer.parseInt(textoAnio)-1900;
	    mes = Integer.parseInt(textoMes)-1;
	    dia = Integer.parseInt(textoDia);
	} catch (NumberFormatException  e) {
	    JOptionPane.showMessageDialog(null, "Formatos de numeros incorrectos, verifique la fecha","Error de tipo de datos", JOptionPane.ERROR_MESSAGE);
	}
	return new Date(anio,mes,dia);
    }
    
}
