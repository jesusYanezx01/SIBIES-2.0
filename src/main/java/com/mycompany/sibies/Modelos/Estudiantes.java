
package com.mycompany.sibies.Modelos;


public class Estudiantes {
    
    private String nombres; 
    private String apellidos; 
    private String periodoMatricula;
    private String carrera; 
    private String numeroIdentificacion;
    private String telefono;
    private String correo;
    private String observacion;
    private String sexo;

    public Estudiantes() {
    }

    public Estudiantes(String nombres, String apellidos, String periodoMatricula, String carrera, String numeroIdentificacion, String telefono, String correo, String observacion, String sexo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.periodoMatricula = periodoMatricula;
        this.carrera = carrera;
        this.numeroIdentificacion = numeroIdentificacion;
        this.telefono = telefono;
        this.correo = correo;
        this.observacion = observacion;
        this.sexo = sexo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPeriodoMatricula() {
        return periodoMatricula;
    }

    public void setPeriodoMatricula(String periodoMatricula) {
        this.periodoMatricula = periodoMatricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
          
}
