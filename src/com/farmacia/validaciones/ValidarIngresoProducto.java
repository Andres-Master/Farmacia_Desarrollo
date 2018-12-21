/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.validaciones;



import com.farmacia.dao.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ValidarIngresoProducto {
      Connection conect = null;
    java.sql.Statement st = null;
    ResultSet rs = null;
    Conexion con = new Conexion();
    
    public String validarTipoProducto(String nombre) {
        String valor =null;
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = conect.prepareCall(""
            + "{ CALL insertarTipoProducto(?,?) }");// que solo x eso?asi es jajajaj toda la madrugada jajaj
            prcProcedimientoAlmacenado.setString(1, nombre);
            prcProcedimientoAlmacenado.registerOutParameter("valor1", Types.VARCHAR);
            prcProcedimientoAlmacenado.executeUpdate();
            valor = prcProcedimientoAlmacenado.getString("valor1");//voy revisar mi codigo
            System.out.println(valor);
            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(ValidarIngresoProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(ValidarIngresoProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return valor;
    }
    
    public String validarMedidaProducto(String nombre) {
        String valor =null;
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = conect.prepareCall(""
            + "{ CALL insertarMedidaProducto(?,?) }");// que solo x eso?asi es jajajaj toda la madrugada jajaj
            prcProcedimientoAlmacenado.setString(1, nombre);
            prcProcedimientoAlmacenado.registerOutParameter("valor1", Types.VARCHAR);
            prcProcedimientoAlmacenado.executeUpdate();
            valor = prcProcedimientoAlmacenado.getString("valor1");//voy revisar mi codigo
            System.out.println(valor);
            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(ValidarIngresoProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(ValidarIngresoProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return valor;
    }
    
    public String validarEnvaseProducto(String nombre) {
        String valor =null;
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = conect.prepareCall(""
            + "{ CALL insertarEnvaseProducto(?,?) }");// que solo x eso?asi es jajajaj toda la madrugada jajaj
            prcProcedimientoAlmacenado.setString(1, nombre);
            prcProcedimientoAlmacenado.registerOutParameter("valor1", Types.VARCHAR);
            prcProcedimientoAlmacenado.executeUpdate();
            valor = prcProcedimientoAlmacenado.getString("valor1");//voy revisar mi codigo
            System.out.println(valor);
            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(ValidarIngresoProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(ValidarIngresoProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return valor;
    }
    
    public String validarMarcaProducto(String nombre) {
        String valor =null;
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = conect.prepareCall(""
            + "{ CALL insertarMarcaProducto(?,?) }");// que solo x eso?asi es jajajaj toda la madrugada jajaj
            prcProcedimientoAlmacenado.setString(1, nombre);
            prcProcedimientoAlmacenado.registerOutParameter("valor1", Types.VARCHAR);
            prcProcedimientoAlmacenado.executeUpdate();
            valor = prcProcedimientoAlmacenado.getString("valor1");//voy revisar mi codigo
            System.out.println(valor);
            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(ValidarIngresoProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(ValidarIngresoProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return valor;
    }
}
