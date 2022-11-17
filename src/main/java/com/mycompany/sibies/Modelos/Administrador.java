
package com.mycompany.sibies.Modelos;


public class Administrador {
    
    private String identificacion;
    private String contraseña;

    public Administrador() {
    }

    public Administrador(String identificacion, String contraseña) {
        this.identificacion = identificacion;
        this.contraseña = contraseña;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
    
    
    
}
