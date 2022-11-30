
package com.mycompany.sibies.DAO;

import com.mycompany.sibies.Modelos.Estudiantes;
import com.mycompany.sibies.Vistas.Jfmatriculado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class DaoEstudiantes extends Conexion {
    
    public boolean registrar(Estudiantes estudiantes){
    
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sqlRegistrar="INSERT INTO "+Constantes.T_ESTUDIANTES+"("+
                    Constantes.TE_NOMBRE+","+
                    Constantes.TE_APELLIDO+","+
                    Constantes.TE_PERIODOMATRICULA+","+
                    Constantes.TE_CARRERA+","+
                    Constantes.TE_DOCUMENTO+","+
                    Constantes.TE_TELEFONO+","+
                    Constantes.TE_CORREO+","+
                    Constantes.TE_OBSERVACION+","+
                    Constantes.TE_SEXO+") VALUES(?,?,?,?,?,?,?,?,?)";
        
        try {
            ps=con.prepareStatement(sqlRegistrar);
            
            ps.setString(1, estudiantes.getNombres());
            ps.setString(2, estudiantes.getApellidos());
            ps.setString(3, estudiantes.getPeriodoMatricula());
            ps.setString(4, estudiantes.getCarrera());
            ps.setString(5, estudiantes.getNumeroIdentificacion());
            ps.setString(6, estudiantes.getTelefono());
            ps.setString(7, estudiantes.getCorreo());
            ps.setString(8, estudiantes.getObservacion());
            ps.setString(9, estudiantes.getSexo());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(DaoEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
        } return false;
        
        
    }
    
    public boolean modificarDatos(Estudiantes est){
       PreparedStatement ps = null;
        Connection con = getConexion();
        Jfmatriculado jfmatri = new Jfmatriculado();
        
        String sql = "UPDATE "+Constantes.T_ESTUDIANTES+" SET "+Constantes.TE_NOMBRE+" = ?,"
                                                                +Constantes.TE_APELLIDO+" = ?,"
                                                                +Constantes.TE_PERIODOMATRICULA+" = ?,"
                                                                +Constantes.TE_CARRERA+" = ?,"
                                                                +Constantes.TE_OBSERVACION+" = ?,"
                                                                +Constantes.TE_TELEFONO+" = ?,"
                                                                +Constantes.TE_CORREO+" = ?,"
                                                                +Constantes.TE_SEXO+" = ? WHERE "
                                                                +Constantes.TE_DOCUMENTO+" = ?";
        try {
            ps=con.prepareStatement(sql);
            
            ps.setString(1, est.getNombres());
            ps.setString(2, est.getApellidos());
            ps.setString(3, est.getPeriodoMatricula());
            ps.setString(4, est.getCarrera());
            ps.setString(5, est.getObservacion());
            ps.setString(6, est.getTelefono());
            ps.setString(7, est.getCorreo());
            ps.setString(8, est.getSexo());
            ps.setString(9, est.getNumeroIdentificacion());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Estudiante modificado");
            return true;
            
            
            
            
        } catch (SQLException e) {
JOptionPane.showMessageDialog(null, "Error al modificar al estudiante");
            return false;
        }
        
    
}
    /*
    public boolean existeestudiante(String estudiante){
    
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sqlValidarDocumento="SELECT"+Constantes.TE_DOCUMENTO+"FROM"+Constantes.T_ESTUDIANTES+ "WHERE"+Constantes.TE_DOCUMENTO+"= ? ";
        
        try {
            ps=con.prepareStatement(sqlValidarDocumento);
            ps.setString(1, estudiante);
            rs= ps.executeQuery();
           
            if(rs.next()){
                return true;
            }
            
            return false;
            
        } catch (SQLException ex) {
            Logger.getLogger(DaoEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
        } return false;
        
        
    } */
    
    
    public boolean esEmail (String correo){
        
        Pattern pattern= Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[fesc]+(\\.[edu]+)*(\\.[co]{2,})$");
        
        Matcher matcher = pattern.matcher(correo);
                
                return matcher.find();
 
    }
    
    
  
    
    
    
    
    
    
    
    
    
    
    
    
}
