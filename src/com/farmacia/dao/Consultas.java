/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.dao;

import com.farmacia.entities.mappers.EntidadesMappers;
import com.farmacia.entities1.Clientes;
import com.farmacia.entities1.Correo_Cliente;
import com.farmacia.entities1.Laboratorio;
import com.farmacia.entities1.Telefono_Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Consultas {

   // Conectar con = new Conectar();
    Connection conect = null;
    java.sql.Statement st = null;
    ResultSet rs = null;
    String query;
    java.sql.Statement jss = null;
    Conexion con = new Conexion();
    public ArrayList<Laboratorio> listarLabo(String Query) {
        ArrayList<Laboratorio> lista = new ArrayList<Laboratorio>();
        //conect=con.conectar(base);
        try {
            conect = con.conectar();
            st = conect.createStatement();
            rs = st.executeQuery(Query);
            while (rs.next()) {
                Laboratorio objeto = new Laboratorio(Long.valueOf(rs.getLong("id_Laboratorio")),
                        rs.getString("RUC"),
                        rs.getString("Nombre"),
                        rs.getString("Direccion"),
                        rs.getString("Telefono"),
                        rs.getDate("Fecha"),
                        rs.getString("Imagen"),
                        rs.getString("Correo"));
                lista.add(objeto);
            }
            conect.close();
        } catch (Exception ex) {
        }
        return lista;
    }
    
    public  ArrayList<Clientes> listarClientes(String query) {
        ArrayList<Clientes> lista = new ArrayList();
        try {
            conect = con.conectar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            
            jss = conect.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            rs = jss.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            while (rs.next()) {
                
                Clientes objeto = EntidadesMappers.getClienteFromResultSet(rs);
                lista.add(objeto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            conect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }
    public ArrayList<Telefono_Cliente> listarTelefonoCliente( String query){
        ArrayList<Telefono_Cliente> telf = new ArrayList();
        try {
            conect = con.conectar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            jss = conect.createStatement();
                    } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs = jss.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while(rs.next()){
                Telefono_Cliente objeto = EntidadesMappers.getTelefonoClienteFromResultSet(rs);    
                telf.add(objeto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    return telf;
    }
    public ArrayList<Correo_Cliente> listarCorreoCliente(String query){
        ArrayList<Correo_Cliente> cor = new ArrayList();
        try {
            conect = con.conectar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            jss = conect.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs = jss.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while(rs.next()){
                Correo_Cliente coo = EntidadesMappers.getCorreoClientesFromResultSet(rs);
                cor.add(coo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    return cor;
    }
    
}
