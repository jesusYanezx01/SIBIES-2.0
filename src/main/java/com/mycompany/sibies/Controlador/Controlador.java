package com.mycompany.sibies.Controlador;

import com.mycompany.sibies.Modelos.Administrador;
import com.mycompany.sibies.Modelos.Estudiantes;
import com.mycompany.sibies.Vistas.Jflogin;

public class Controlador {

    private Jflogin jflogin;

    private Estudiantes estudiantes;
    private Administrador administrador;

    public Controlador(Jflogin jflogin) {
        this.jflogin = jflogin;
        this.estudiantes = estudiantes;
        this.administrador = administrador;
    }

    public void inicio() {

        jflogin.setVisible(true);

    }

}
