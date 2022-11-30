/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sibies.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class DaoAdministrador extends Conexion {
    
    public boolean ingresar(String admin,String pass){
        Connection con = getConexion();
        PreparedStatement ps=null;
        ResultSet rs;
        
        String sql = "SELECT "+Constantes.TA_IDENTIFICACION+","+Constantes.TA_CONTRASEÑA+" FROM "+ Constantes.T_ADMINISTRADOR+" WHERE "+Constantes.TA_IDENTIFICACION+"='"+admin+"' AND "+Constantes.TA_CONTRASEÑA+" = '"+pass+"'";
        
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }else {
                return false;
            }
        } catch (SQLException ex) {
            System.err.println(ex);
            return false;
        }
        
        
    }
/*
    public boolean login(Administrador admin) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        

        String sqlValidarLogin = "SELECT" + Constantes.TA_IDENTIFICACION + "," + Constantes.TA_CONTRASEÑA + "FROM" + Constantes.T_ADMINISTRADOR + "WHERE" + Constantes.TA_IDENTIFICACION + "= ? ";

        try {
            ps = con.prepareStatement(sqlValidarLogin);
            ps.setString(1, admin.getIdentificacion());
            rs = ps.executeQuery();

            if (rs.next()) {
                if (admin.getContraseña().equals(rs.getString(2))) {

                    admin.setIdentificacion(rs.getString(1));
                    admin.setContraseña(rs.getString(2));
                    return true;

                } else {
                    return false; 
                }
            }

            return false;

        } catch (SQLException ex) {
            Logger.getLogger(DaoEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
*/
}
