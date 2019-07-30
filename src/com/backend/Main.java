/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backend;

import com.frontend.Principal;

/**
 *
 * @author kevin
 */
public class Main {
    public static void main(String [] args){
        Archivo.createDirectory("Estudiantes");
        Archivo.createDirectory("Libros");
        Archivo.createDirectory("Prestamos");
        new Principal().setVisible(true);
    }
    
    
    
}
