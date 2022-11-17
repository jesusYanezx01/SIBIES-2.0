
package com.mycompany.sibies.DAO;


public class Constantes {
    
    //Datos de conexion
    public static final String URL="jdbc:mysql://localhost:3306/";
    public static final String DATABASE="sibies";
    public static final String USER="root";
    public static final String PASSWORD="";
    
    
    //Tabla Estudiantes
    public static final String T_ESTUDIANTES="estudiantes";
    public static final String TE_NOMBRE="nombres";
    public static final String TE_APELLIDO="apellidos";
    public static final String TE_PERIODOMATRICULA="periodoMatricula";
    public static final String TE_CARRERA="carrera";
    public static final String TE_DOCUMENTO="numeroIdentificación";
    public static final String TE_TELEFONO="telefono";
    public static final String TE_CORREO="correoElectronico";
    public static final String TE_OBSERVACION="observacion";
    public static final String TE_SEXO="sexo";
    
    
    //Tabla administrador
    public static final String T_ADMINISTRADOR="administrador";
    public static final String TA_IDENTIFICACION="identificacion";
    public static final String TA_CONTRASEÑA="contraseña";
    
}
