/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backend;

import com.frontend.Principal;


//import com.frontend.Biblioteca_Cunoc;
//import com.frontend.Principal;
//import javax.swing.JOptionPane;
/**
 *
 * @author kevin
 */
public class Main {
    public static void main(String [] args){
        
        new Principal().setVisible(true);;
        
        Archivo.createDirectory("Contadores");
        Archivo.createDirectory("Estudiantes");
        Archivo.createDirectory("Libros");
        Archivo.createDirectory("Prestamos");
    }
    
}
