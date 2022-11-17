/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sibies;

import com.mycompany.sibies.Controlador.Controlador;
import com.mycompany.sibies.Vistas.Jflogin;


public class App {
    
    public static void main(String[] args) {
        
        Jflogin jflogin = new Jflogin();
        
        Controlador controlador = new Controlador(jflogin);
        controlador.inicio();
        
        jflogin.setVisible(true);
    }
}
