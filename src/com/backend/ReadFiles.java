package com.backend;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;

public class ReadFiles <O>{
    private O objeto;
    
    public ReadFiles (O objeto) {
	this.objeto=objeto;
    }
    public ArrayList<O> getFiles( String pathLectura){
	        File carpeta = new File(pathLectura);
	            File[] files = carpeta.listFiles();
	            ArrayList<O> lista = new ArrayList<O>();
	            for (File file : files) { //para todos los archivos leemos los objetos en ellos. 
	                lista.add((O)Archivo.leerArchivo(file.getAbsolutePath()));
	            }
	            return lista;
	    }
    }



	

