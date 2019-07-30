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
public class Libro implements Serializable{

    private static final long serialVersionUID=1000L;
    private String codigo;
    private String autor;
    private String titulo;
    private int cantidadDeCopias;
    private Date fechaDePublicacion;
    private String editorial;
    
    public final String PATH_COUNT="Contadores/ContadorDeLibros.cnt";

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCantidadDeCopias() {
        return cantidadDeCopias;
    }

    public void setCantidadDeCopias(int cantidadDeCopias) {
        this.cantidadDeCopias = cantidadDeCopias;
    }

    public Date getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(Date fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    /**
     * Constructor creado para la lectura del archivo de entrada
     * @param codigo Codigo del libro
     * @param autor Autor del libro
     * @param titulo Titulo del libro
     * @param cantidadDeCopias  Cantidad de copias iniciales del libro
     */
    public Libro(String codigo,String autor, String titulo,  int cantidadDeCopias) {
           this(codigo,autor,titulo,cantidadDeCopias,null,"");
    }
    
    public Libro() {}
    
    
    /**
     * Constructor creado para el formulario de nuevos libros, y escritura en archivos binarios
     * @param codigo Codigo del libro 
     * @param autor Autor del libro
     * @param titulo Titulo del libro
     * @param cantidadDeCopias Cantidad de copias a ingresar 
     * @param fechaDePublicacion Fecha de publicacion del libro
     * @param editorial La editorial encargada de la la publicacion
     */
    public Libro(String codigo, String autor, String titulo, int cantidadDeCopias, Date fechaDePublicacion, String editorial) {
           super();   
           this.codigo=codigo;
           this.autor=autor;
           this.titulo=titulo;
           this.cantidadDeCopias=cantidadDeCopias;
           this.fechaDePublicacion=fechaDePublicacion;
           this.editorial= editorial;
           Archivo.escribirArchivoBinario(getPathOfFile(codigo), this);
    }

    /**
     * Metodo encargado de retornar una direccion para libros en base a su codigo
     * @param codigo El codigo del libro
     * @return Una direccion relativa donde se guardara el libro
     */
    public static String getPathOfFile(String codigo){
        return "Libros/"+codigo+".book";
    }

    
    /**
     * Edita la cantidad de copias existentes de un libro
     * @param codigo El codigo de referencia del libro
     * @param cantidadDeNuevasCopias  La cantidad a agregar de copias
     */
    public void asingarNuevasCopias(String codigo,int cantidadDeNuevasCopias){
        Libro libro =(Libro) Archivo.leerArchivo(getPathOfFile(codigo));
        libro.setCantidadDeCopias(libro.getCantidadDeCopias()+cantidadDeNuevasCopias);
        Archivo.escribirArchivoBinario(getPathOfFile(codigo), libro);
    }
    
    public boolean isTitulo(String instruccion, JTextArea cajaDeTexto, int posicion) {
    	String token [] = instruccion.split(":");
    	if (token[0].equals("TITULO")) {
			return true;
		}else {
			cajaDeTexto.append("Error en la linea "+posicion+", no se pudo leer la sintaxis\n "+ instruccion +"\n\n");
			return false;
		}
    }
    
    public String leerTitulo(String instruccion) {
    	String token[]=instruccion.split(":");
    	return token[1];
    }
    
    public boolean isAutor(String instruccion, JTextArea cajaDeTexto, int posicion) {
    	String token [] = instruccion.split(":");
    	if (token[0].equals("AUTOR")) {
			return true;
    	}
		else {
			cajaDeTexto.append("Error en la linea "+posicion+", no se pudo leer la sintaxis\n "+ instruccion +"\n\n");
			return false;
		}
    }
    
    public String leerAutor(String instruccion) {
    	String token[]=instruccion.split(":");
    	return token[1];
    }
    
    public boolean isCodigo(String instruccion, JTextArea cajaDeTexto, int posicion) {
    	String token [] = instruccion.split(":");
    	boolean result = false;
    	try {
			if (token[0].equals("CODIGO")||token[0].equals("CODIGOLIBRO")) { //que sea una instruccion de codigo 
				String tokensCodigo[]=token[1].split("-"); //la dividimos en dos
				if (tokensCodigo[0].length()==3 & tokensCodigo[1].length()==3) { // evaluamos que tengan la longitud adecuada
					int number =Integer.parseInt(tokensCodigo[0]);
					result =true;
				}else {
					cajaDeTexto.append("Error en la linea "+posicion + " por longitud en el codigo del libro\n "+ instruccion +"\n\n");
				}
			}else {
				cajaDeTexto.append("Error en la linea "+posicion + ", no se entiende el tipo de instruccion\n "+ instruccion +"\n\n");
			}
		} catch (NumberFormatException e) {
			cajaDeTexto.append("Error en la linea "+posicion+", no cuenta con un codigo adecuado de libro\n "+ instruccion +"\n\n");
		}
    	return result;
    }
    
    public String leerCodigo(String instruccion) {
    	String token[]=instruccion.split(":");
    	return token[1];
    }
    
    public boolean isCantidad(String instruccion, JTextArea cajaDeTexto, int posicion) {
    	String token [] = instruccion.split(":");
    	boolean result = false;
    	try {
    		if (token[0].equals("CANTIDAD")) {
    			int cantidad=Integer.parseInt(token[1]);
    			if (cantidad>=0) {
					result =true;
				}else {
					cajaDeTexto.append("Erro en la linea "+ posicion+", no es un numero intero positivo\n "+ instruccion +"\n\n");
				}
    		}else {
				cajaDeTexto.append("Error en la linea "+ posicion +", no se entiende el tipo de instruccion\n "+ instruccion +"\n\n");
			}
		} catch (NumberFormatException e) {
			cajaDeTexto.append("Error en la linea "+posicion+", no se puede leer la cantidad\n "+ instruccion +"\n\n");
		}
    	return result;
    } 
    
    public int leerCantidad(String instruccion) {
    	String token[]=instruccion.split(":");
    	return Integer.parseInt(token[1]);
    }
    
}