/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.dao;

import com.farmacia.entities.mappers.EntidadesMappers;
import com.farmacia.join_entidades.FaltantesCabeceraDetalles;
import com.farmacia.join_entidades.ListarJoinProveedor;
import com.farmacia.join_entidades.ListarNotas;
//
import com.farmacia.join_entidades.joinProductoDetallesFaltantes;
import com.farmacia.join_entidades.listarJoinProductosCompras;
import com.farmacia.entities1.Correo;
import com.farmacia.entities1.EnvaseProducto;
import com.farmacia.entities1.Laboratorio;
import com.farmacia.entities1.MedidaProducto;
import com.farmacia.entities1.Productos;
import com.farmacia.entities1.MarcaProducto;
import com.farmacia.entities1.Obcx;
import com.farmacia.entities1.Telefono;
import com.farmacia.entities1.TipoProducto;
import com.farmacia.validaciones.ValidarIngresoProducto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CRUD {

    Connection conect = null;
    java.sql.Statement st = null;
    ResultSet rs = null;
    Conexion con = new Conexion();

    String query;

    public void insertarListaFaltantes(ArrayList<String> queryL) {
        try {
            conect = con.conectar();
            for (int i = 0; i < queryL.size(); i++) {
                java.sql.Statement st = conect.createStatement();
                st.executeUpdate(queryL.get(i));
            }
            conect.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void insertarCabeceraCompras(String queryL) {
        try {
            conect = con.conectar();
            java.sql.Statement st = conect.createStatement();
            st.executeUpdate(queryL);

            conect.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String buscarIDCabecera(String queryL) {
        String id = "";
        try {
            conect = con.conectar();

            java.sql.Statement st = conect.createStatement();
            rs = st.executeQuery(queryL);
            rs.next();
            id = rs.getString("id_cabecera_compra");
            conect.close();
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;

    }

    public void insertarDetallesCompra(ArrayList<String> queryL) {
        try {
            conect = con.conectar();
            for (int i = 0; i < queryL.size(); i++) {
                java.sql.Statement st = conect.createStatement();
                st.executeUpdate(queryL.get(i));
            }
            conect.close();
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void insertarBitacoraFaltantes(ArrayList<String> queryL) {
        try {
            conect = con.conectar();
            for (int i = 0; i < queryL.size(); i++) {
                java.sql.Statement st = conect.createStatement();
                st.executeUpdate(queryL.get(i));
            }
            conect.close();
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<Productos> listarProductos(String Query) {
        ArrayList<Productos> lista = new ArrayList<Productos>();

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = conect.prepareCall(
                    "{ call listarProductos() }");
            prcProcedimientoAlmacenado.execute();
            rs = prcProcedimientoAlmacenado.getResultSet();
            while (rs.next()) {
                Productos obj = EntidadesMappers.getProductosFromResultSet(rs);
                lista.add(obj);
            }
            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

    public ArrayList<FaltantesCabeceraDetalles> listarJoinProductos(int op) {
        ArrayList<FaltantesCabeceraDetalles> lista = new ArrayList<FaltantesCabeceraDetalles>();

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = conect.prepareCall(
                    "{ call listarJoinProductos(?) }");
            prcProcedimientoAlmacenado.setInt(1, op);
            prcProcedimientoAlmacenado.execute();
            rs = prcProcedimientoAlmacenado.getResultSet();
            while (rs.next()) {
                FaltantesCabeceraDetalles obj = EntidadesMappers.getJoinProductosFromResultSet(rs);
                lista.add(obj);
            }
            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

    public ArrayList<joinProductoDetallesFaltantes> listarFaltantesDetalles(int op) {
        ArrayList<joinProductoDetallesFaltantes> lista = new ArrayList<joinProductoDetallesFaltantes>();

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = conect.prepareCall(
                    "{ call listarfaltantesEnNota(?) }");
            prcProcedimientoAlmacenado.setInt(1, op);
            prcProcedimientoAlmacenado.execute();
            rs = prcProcedimientoAlmacenado.getResultSet();
            while (rs.next()) {
                joinProductoDetallesFaltantes obj = EntidadesMappers.getJoinDetallesFaltantesFromResultSet(rs);
                lista.add(obj);
            }
            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

    public ArrayList<listarJoinProductosCompras> listarTodoJoinProductos(int op) {
        ArrayList<listarJoinProductosCompras> lista = new ArrayList<listarJoinProductosCompras>();

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = conect.prepareCall(
                    "{ call listarPoductosCompras(?) }");
            prcProcedimientoAlmacenado.setInt(1, op);
            prcProcedimientoAlmacenado.execute();
            rs = prcProcedimientoAlmacenado.getResultSet();
            while (rs.next()) {
                listarJoinProductosCompras obj = EntidadesMappers.getJoinTodosProductosFromResultSet(rs);
                lista.add(obj);
            }
            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

    public ArrayList<TipoProducto> listarTodoTipoProductos1() {
        ArrayList<TipoProducto> lista = new ArrayList<TipoProducto>();

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = conect.prepareCall(
                    "{ call listarComboTipoPro }");
            //   prcProcedimientoAlmacenado.setInt(1, op);
            prcProcedimientoAlmacenado.execute();
            rs = prcProcedimientoAlmacenado.getResultSet();
            while (rs.next()) {
                TipoProducto obj = EntidadesMappers.getTipoProductoFromResultSet(rs);
                lista.add(obj);
            }

            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

    public ArrayList<MedidaProducto> listarTodoMedidasProductos() {
        ArrayList<MedidaProducto> lista = new ArrayList<MedidaProducto>();

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = conect.prepareCall(
                    "{ call listarComboMedidaPro }");
            //   prcProcedimientoAlmacenado.setInt(1, op);
            prcProcedimientoAlmacenado.execute();
            rs = prcProcedimientoAlmacenado.getResultSet();
            while (rs.next()) {
                MedidaProducto obj = EntidadesMappers.getMedidaProductoFromResultSet(rs);
                lista.add(obj);
            }

            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

    public ArrayList<EnvaseProducto> listarTodoEnvaseProductos() {
        ArrayList<EnvaseProducto> lista = new ArrayList<EnvaseProducto>();

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = conect.prepareCall(
                    "{ call listarComboEnvasePro }");
            //   prcProcedimientoAlmacenado.setInt(1, op);
            prcProcedimientoAlmacenado.execute();
            rs = prcProcedimientoAlmacenado.getResultSet();
            while (rs.next()) {
                EnvaseProducto obj = EntidadesMappers.getEnvaseProductoFromResultSet(rs);
                lista.add(obj);
            }

            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

    public ArrayList<MarcaProducto> listarTodoMarcaProductos() {
        ArrayList<MarcaProducto> lista = new ArrayList<MarcaProducto>();

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = conect.prepareCall(
                    "{ call listarComboMarcaPro }");
            //   prcProcedimientoAlmacenado.setInt(1, op);
            prcProcedimientoAlmacenado.execute();
            rs = prcProcedimientoAlmacenado.getResultSet();
            while (rs.next()) {
                MarcaProducto obj = EntidadesMappers.getMarcaProductoFromResultSet(rs);
                lista.add(obj);
            }

            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

    public String insertarProductoNuevo(Productos obj) {
        //ArrayList<Productos> lista = new ArrayList<Productos>();
        String valor = "";
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prodProAlm = conect.prepareCall(
                    "{ call ingresarProducto(?,?,?,?,?,?,?,?,?,?,?,?) }");
            prodProAlm.setString(1, obj.getNombre());
            prodProAlm.setString(2, obj.getDescripcion());
            prodProAlm.setDate(3, obj.getFecha_registro());
            prodProAlm.setDouble(4, obj.getPeso());
            prodProAlm.setLong(5, obj.getId_tipo());
            prodProAlm.setLong(6, obj.getId_medidas());
            prodProAlm.setLong(7, obj.getId_envase());
            prodProAlm.setLong(8, obj.getId_marcas());
            prodProAlm.setLong(9, obj.getId_usuario());
            prodProAlm.setString(10, obj.getIva());
            prodProAlm.setLong(11, obj.getCantidad_minima());
            prodProAlm.registerOutParameter("valor1", Types.VARCHAR);
            prodProAlm.executeUpdate();
            valor = prodProAlm.getString("valor1");
            //  rs = prodProAlm.getResultSet();
//            while (rs.next()) {
//                MarcaProducto obj = EntidadesMappers.getMarcaProductoFromResultSet(rs);
//                lista.add(obj);
//            }

            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return valor;
    }

    public ArrayList<ListarJoinProveedor> listarProveedores(Long op) {
        ArrayList<ListarJoinProveedor> lista = new ArrayList<ListarJoinProveedor>();

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prodProAlm = conect.prepareCall(
                    "{ call ListarProveedor(?) }");
            prodProAlm.setLong(1, op);
            prodProAlm.execute();
            rs = prodProAlm.getResultSet();
            while (rs.next()) {
                ListarJoinProveedor obj = EntidadesMappers.getListarJoinProveedorFromResultSet(rs);
                lista.add(obj);
            }
            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }
    //////////////////////////////////////////////////////////////////////////////////////////

    public ArrayList<ListarNotas> listarNotas(int op) {
        ArrayList<ListarNotas> lista = new ArrayList<ListarNotas>();

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = conect.prepareCall(
                    "{ call ListarRegistroDeNotas(?)}");
            prcProcedimientoAlmacenado.setInt(1, op);
            prcProcedimientoAlmacenado.execute();
            rs = prcProcedimientoAlmacenado.getResultSet();
            while (rs.next()) {
                ListarNotas obj = EntidadesMappers.getListarNotasFromResultSet(rs);
                lista.add(obj);
            }
            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

    public ArrayList<listarJoinProductosCompras> filtroBusquedaProducto(String query) {
        ArrayList<listarJoinProductosCompras> lista = new ArrayList<listarJoinProductosCompras>();

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = conect.prepareCall(
                    "{ call filtroProducto(?) }");
            prcProcedimientoAlmacenado.setString(1, query);
            prcProcedimientoAlmacenado.execute();
            rs = prcProcedimientoAlmacenado.getResultSet();
            while (rs.next()) {
                listarJoinProductosCompras obj = EntidadesMappers.getJoinTodosProductosFromResultSet(rs);
                lista.add(obj);
            }
            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

    public String getNombreComboProducto(Long op, Long id) {
        //ArrayList<Productos> lista = new ArrayList<Productos>();
        String valor = "";
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prodProAlm = conect.prepareCall(
                    "{ call getNombreComboProducto(?,?,?) }");
            prodProAlm.setLong(1, op);
            prodProAlm.setLong(2, id);
            prodProAlm.registerOutParameter("valor", Types.VARCHAR);
            prodProAlm.executeUpdate();
            valor = prodProAlm.getString("valor");
            //  rs = prodProAlm.getResultSet();
//            while (rs.next()) {
//                MarcaProducto obj = EntidadesMappers.getMarcaProductoFromResultSet(rs);
//                lista.add(obj);
//            }

            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return valor;
    }

    public String modificarProductos(Productos obj) {
        //ArrayList<Productos> lista = new ArrayList<Productos>();
        String valor = "";
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prodProAlm = conect.prepareCall(
                    "{ call modificarProductos(?,?,?,?,?,?,?,?,?,?,?,?) }");
            prodProAlm.setString(1, obj.getNombre());
            prodProAlm.setString(2, obj.getDescripcion());
            prodProAlm.setDouble(3, obj.getPeso());
            prodProAlm.setLong(4, obj.getId_tipo());
            prodProAlm.setLong(5, obj.getId_medidas());
            prodProAlm.setLong(6, obj.getId_envase());
            prodProAlm.setLong(7, obj.getId_marcas());
            prodProAlm.setLong(8, obj.getId_productos());
            prodProAlm.setLong(9, obj.getId_usuario());
            prodProAlm.setString(10, obj.getIva());
            prodProAlm.setLong(11, obj.getCantidad_minima());
            prodProAlm.registerOutParameter("valor", Types.VARCHAR);
            prodProAlm.execute();
            valor = prodProAlm.getString("valor");
            //  rs = prodProAlm.getResultSet();
//            while (rs.next()) {
//                MarcaProducto obj = EntidadesMappers.getMarcaProductoFromResultSet(rs);
//                lista.add(obj);
//            }

            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return valor;
    }

    public String eliminarProducto(Long id) {
        //ArrayList<Productos> lista = new ArrayList<Productos>();
        String valor = "";
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prodProAlm = conect.prepareCall(
                    "{ call eliminarProducto(?,?) }");
            prodProAlm.setLong(1, id);
            prodProAlm.registerOutParameter("valor", Types.VARCHAR);
            prodProAlm.execute();
            valor = prodProAlm.getString("valor");
            //  rs = prodProAlm.getResultSet();
//            while (rs.next()) {
//                MarcaProducto obj = EntidadesMappers.getMarcaProductoFromResultSet(rs);
//                lista.add(obj);
//            }

            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return valor;
    }

    public ArrayList<Correo> listarCorreo(String query) {
        ArrayList<Correo> lista = new ArrayList();
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = conect.prepareCall(
                    "{ call filtroProducto(?) }");
            prcProcedimientoAlmacenado.setString(1, query);
            prcProcedimientoAlmacenado.execute();
            rs = prcProcedimientoAlmacenado.getResultSet();
            while (rs.next()) {
                Correo obj = EntidadesMappers.getCorreoFromResultSet(rs);
                lista.add(obj);
            }
            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

    public ArrayList<Telefono> listarTelefono(String query) {
        ArrayList<Telefono> lista = new ArrayList();
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = conect.prepareCall(
                    "{ call filtroProducto(?) }");
            prcProcedimientoAlmacenado.setString(1, query);
            prcProcedimientoAlmacenado.execute();
            rs = prcProcedimientoAlmacenado.getResultSet();
            while (rs.next()) {
                Telefono obj = EntidadesMappers.getTelefonoFromResultSet(rs);
                lista.add(obj);
            }
            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

    public String insertarProveedor(ListarJoinProveedor obj) {
        ArrayList<ListarJoinProveedor> lista = new ArrayList<ListarJoinProveedor>();
        String valor = "";
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prodProAlm = conect.prepareCall(
                    "{ call editarProveedor(?,?,?,?,?,?,?,?,?,?) }");
            prodProAlm.setLong(1, obj.getId_proveedor_clase());
            prodProAlm.setString(2, obj.getEntidad());
            prodProAlm.setString(3, obj.getRepresentante());
            prodProAlm.setString(4, obj.getDireccion());
            prodProAlm.setDate(5, obj.getFecha_registro());
            prodProAlm.setString(6, obj.getEstado());
            prodProAlm.setString(7, obj.getTelefono());
            prodProAlm.setString(8, obj.getMail());
            prodProAlm.setString(9, obj.getCedula_ruc());
            prodProAlm.registerOutParameter("valor", Types.VARCHAR);
            prodProAlm.execute();
            valor = prodProAlm.getString("valor");
            //  rs = prodProAlm.getResultSet();
//            while (rs.next()) {
//                MarcaProducto obj = EntidadesMappers.getMarcaProductoFromResultSet(rs);
//                lista.add(obj);
//            }

            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return valor;
    }

    public String eliminarProveedor(Long op, Long id) {
        //ArrayList<ListarJoinProveedor> lista = new ArrayList<ListarJoinProveedor>();
        String valor = "";
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prodProAlm = conect.prepareCall(
                    "{ call eliminarProveedor(?,?,?) }");
            prodProAlm.setLong(1, op);
            prodProAlm.setLong(2, id);
            prodProAlm.registerOutParameter("valor", Types.VARCHAR);
            prodProAlm.execute();
            valor = prodProAlm.getString("valor");

            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return valor;

    }

    public void insertarTelefono(ArrayList<Obcx> lis, String cedu) {
        for (int i = 0; i < lis.size(); i++) {
            try {
                conect = con.conectar();
                conect.setAutoCommit(false);
                CallableStatement prodProAlm = conect.prepareCall(""
                        + "{ call insertarTelefono(?,?,?) }");
                prodProAlm.setLong(1, lis.get(i).getTipos());
                prodProAlm.setString(2, lis.get(i).getTcd());
                prodProAlm.setString(3, cedu);
                //prcProcedimientoAlmacenado.registerOutParameter("mst", Types.VARCHAR);
                prodProAlm.executeUpdate();
                //mensaje = prcProcedimientoAlmacenado.getString("mst");
                conect.commit();

            } catch (Exception ex) {
                try {
                    conect.rollback();

                } catch (SQLException ex1) {
                    Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex1);
                }
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            conect.close();
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertarCorreo(ArrayList<Obcx> lis, String cedu) {
        for (int i = 0; i < lis.size(); i++) {
            try {
                conect = con.conectar();
                conect.setAutoCommit(false);
                CallableStatement prodProAlm = conect.prepareCall(""
                        + "{ call insertarCorreo(?,?,?) }");
                prodProAlm.setLong(1, lis.get(i).getTipos());
                prodProAlm.setString(2, lis.get(i).getTcd());
                prodProAlm.setString(3, cedu);
                //prcProcedimientoAlmacenado.registerOutParameter("mst", Types.VARCHAR);
                prodProAlm.executeUpdate();
                //mensaje = prcProcedimientoAlmacenado.getString("mst");
                conect.commit();

            } catch (Exception ex) {
                try {
                    conect.rollback();

                } catch (SQLException ex1) {
                    Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex1);
                }
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            conect.close();
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String insertarNuevoProveedor(ListarJoinProveedor obj) {
        ArrayList<ListarJoinProveedor> lista = new ArrayList<ListarJoinProveedor>();
        String valor = "";
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prodProAlm = conect.prepareCall(
                    "{ call insertarProveedor(?,?,?,?,?,?,?,?,?) }");
            prodProAlm.setLong(1, obj.getId_proveedor_clase());
            prodProAlm.setString(2, obj.getCedula_ruc());
            prodProAlm.setString(3, obj.getEntidad());
            prodProAlm.setString(4, obj.getRepresentante());
            prodProAlm.setString(5, obj.getDireccion());
            prodProAlm.setDate(6, obj.getFecha_registro());
            prodProAlm.setString(7, obj.getTelefono());
            prodProAlm.setString(8, obj.getMail());
            prodProAlm.registerOutParameter("valor", Types.VARCHAR);
            prodProAlm.execute();
            valor = prodProAlm.getString("valor");
            //  rs = prodProAlm.getResultSet();
//            while (rs.next()) {
//                MarcaProducto obj = EntidadesMappers.getMarcaProductoFromResultSet(rs);
//                lista.add(obj);
//            }

            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (Exception ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return valor;
    }

    public ArrayList<FaltantesCabeceraDetalles> listarJoinProductosFaltantes(int op) {//piguiFaltantes
        ArrayList<FaltantesCabeceraDetalles> lista = new ArrayList<FaltantesCabeceraDetalles>();

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = conect.prepareCall(
                    "{ call listarJoinProductosFaltantes(?) }");
            prcProcedimientoAlmacenado.setInt(1, op);
            prcProcedimientoAlmacenado.execute();
            rs = prcProcedimientoAlmacenado.getResultSet();
            while (rs.next()) {
                FaltantesCabeceraDetalles obj = EntidadesMappers.getJoinProductosFromResultSet(rs);
                lista.add(obj);
            }
            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

    public ArrayList<FaltantesCabeceraDetalles> filtroBusqueda(String query) {//piguiFaltantes
        ArrayList<FaltantesCabeceraDetalles> lista = new ArrayList<FaltantesCabeceraDetalles>();

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = conect.prepareCall(
                    "{ call filtroProducto(?) }");
            prcProcedimientoAlmacenado.setString(1, query);
            prcProcedimientoAlmacenado.execute();
            rs = prcProcedimientoAlmacenado.getResultSet();
            while (rs.next()) {
                FaltantesCabeceraDetalles obj = EntidadesMappers.getJoinTodosProductosFaltantesFromResultSet(rs);
                lista.add(obj);
            }
            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

    public ArrayList<Laboratorio> ListarLab() {//KELLY LABORATORIO
        ArrayList<Laboratorio> lista = new ArrayList<Laboratorio>();

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement pro = conect.prepareCall(
                    "{ call listarLaboratorio()}");
            pro.executeUpdate();
            rs = pro.getResultSet();
            while (rs.next()) {
                Laboratorio obj = EntidadesMappers.getLaboratorioFromResultSet(rs);
                lista.add(obj);
                conect.commit();

            }
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

    public ArrayList<Laboratorio> ListarLabBtn(String query) {//kelly laboratorio
        ArrayList<Laboratorio> lista = new ArrayList<Laboratorio>();

        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement pro = conect.prepareCall(
                    "{ call libreTransaccion(?)}");
            pro.setString(1, query);
            pro.executeUpdate();
            rs = pro.getResultSet();
            while (rs.next()) {
                Laboratorio obj = EntidadesMappers.getLaboratorioFromResultSet(rs);
                lista.add(obj);
                conect.commit();

            }
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

    public String Eliminar(Laboratorio lab) { //KELLY LABORATORIO OJO CAMBIAR DELETE POR UPDATE ESTADO 
        String dato = null;
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement pro = conect.prepareCall(
                    "{ call eliminar(?,?)}");
            pro.setLong(1, lab.getId_Laboratorio());
            pro.registerOutParameter("valor", Types.VARCHAR);
            pro.executeUpdate();
            //pro.execute();
            dato = pro.getString("valor");
            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return dato;

    }

    public String Actualizar(Laboratorio lab) {
        String valor = null;
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement pro = conect.prepareCall(
                    "{ call actualizar(?,?,?,?,?,?,?,?,?)}");
            // System.err.println("Error "+lab.getId_Laboratorio());
            pro.setLong(1, lab.getId_Laboratorio());
            pro.setString(2, lab.getRUC());
            pro.setString(3, lab.getNombre());
            pro.setString(4, lab.getDireccion());
            pro.setString(5, lab.getTelefono());
            pro.setDate(6, lab.getFecha());
            pro.setString(7, lab.getImagen());
            pro.setString(8, lab.getCorreo());
            pro.registerOutParameter("valor", Types.VARCHAR);
            pro.executeUpdate();
            //pro.execute();
            valor = pro.getString("valor");
            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return valor;
    }

    public String insertarLab(Laboratorio lab) {
        String valor = null;
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement pro = conect.prepareCall(
                    "{ call insertarLab(?,?,?,?,?,?,?,?)}");
            pro.setString(1, lab.getRUC());
            pro.setString(2, lab.getNombre());
            pro.setString(3, lab.getDireccion());
            pro.setString(4, lab.getTelefono());
            pro.setDate(5, lab.getFecha());
            pro.setString(6, lab.getImagen());
            pro.setString(7, lab.getCorreo());
            pro.registerOutParameter("valor", Types.VARCHAR);
            pro.executeUpdate();
            //pro.execute();
            valor = pro.getString("valor");
            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return valor;
    }

    public String insertarClientes(String cedula1, String nombre1,
            String apellido1, String direccion1, String cbx1, String cbx2) {
        String valor = null;
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement pro = conect.prepareCall(
                    "{ call insertarClientes(?,?,?,?,?,?,?)}");
            pro.setString(1, cedula1);
            pro.setString(2, nombre1);
            pro.setString(3, apellido1);
            pro.setString(4, direccion1);
            pro.setString(5, cbx1);
            pro.setString(6, cbx2);
            pro.registerOutParameter("msg", Types.VARCHAR);
            pro.executeUpdate();
            //pro.execute();
            valor = pro.getString("msg");
            conect.commit();
        } catch (Exception e) {
            try {
                conect.rollback();
                e.printStackTrace();
            } catch (SQLException exception) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, exception);
            }
        } finally {
            try {
                conect.close();
            } catch (SQLException exception) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, exception);
            }
        }
        return valor;
    }

    public void insertarTelefonoCliente(ArrayList<Obcx> lis, String cedula1) {
        String valor = null;
        for (int i = 0; i < lis.size(); i++) {
            try {
//            connn = con.Conexion("Modulo_Cliente");
                conect = con.conectar();
                conect.setAutoCommit(false);
                CallableStatement pro = conect.prepareCall(
                        "{ call insertarTelefono(?,?,?,?)}");
                pro.setString(1, cedula1);
                pro.setInt(2, lis.get(i).getTipos());
                pro.setString(3, lis.get(i).getTcd());
                pro.registerOutParameter("msg", Types.VARCHAR);
                pro.executeUpdate();
                //pro.execute();
                valor = pro.getString("msg");
                conect.commit();
            } catch (Exception ex) {
                try {
                    conect.rollback();

                } catch (Exception ex1) {
                    Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex1);
                }
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            conect.close();
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertarCorreoCliente(ArrayList<Obcx> lis, String cedula1) {
        for (int i = 0; i < lis.size(); i++) {
            try {
//                connn = con.Conexion("Modulo_Cliente");
                conect = con.conectar();
                conect.setAutoCommit(false);
                CallableStatement prc = conect.prepareCall(""
                        + "{ call insertarCorreo(?,?,?) }");
                prc.setString(1, cedula1);
                prc.setString(2, lis.get(i).getTcd());
                //prcProcedimientoAlmacenado.setLong(3, lis.get(i).getTipo());
                prc.registerOutParameter("msg", Types.VARCHAR);
                prc.executeUpdate();
                //mensaje = prcProcedimientoAlmacenado.getString("mst");
                conect.commit();

            } catch (Exception ex) {
                try {
                    conect.rollback();

                } catch (SQLException ex1) {
                    Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex1);
                }
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            conect.close();
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String editarCliente(String cedula, String nombre, String apellido, String direccion,
            String cbx1, String cbx2) {
        String mensaje = null;

        try {
//            connn = con.Conexion("Modulo_Cliente");
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prc = conect.prepareCall(""
                    + "{ call actualizarCliente(?,?,?,?,?,?,?) }");
            prc.setString(1, cedula);
            prc.setString(2, nombre);
            prc.setString(3, apellido);
            prc.setString(4, direccion);
            prc.setString(5, cbx1);
            prc.setString(6, cbx2);
            prc.registerOutParameter("msg", Types.VARCHAR);
            prc.executeUpdate();
            mensaje = prc.getString("msg");
            conect.commit();

        } catch (Exception ex) {
            try {
                conect.rollback();

            } catch (Exception ex1) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conect.close();
        } catch (Exception ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mensaje;

    }

    public String eliminarCliente(String cedula) {
        String mensaje = null;
        //int por1 = Integer.valueOf(por);
        try {
//            connn = con.Conexion("Modulo_Cliente");
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prc = conect.prepareCall(""
                    + "{ call estadoCliente(?,?) }");
            prc.setString(1, cedula);
            prc.registerOutParameter("msg", Types.VARCHAR);
            prc.executeUpdate();
            mensaje = prc.getString("msg");
            conect.commit();

        } catch (Exception ex) {
            try {
                conect.rollback();

            } catch (SQLException ex1) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conect.close();
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mensaje;

    }

    public String activarCliente(String cedula) {
        String mensaje = null;
        //int por1 = Integer.valueOf(por);
        try {
//            connn = con.Conexion("Modulo_Cliente");
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prc = conect.prepareCall("{ call estadoCliente2(?,?) }");
            prc.setString(1, cedula);
            prc.registerOutParameter("mst", Types.VARCHAR);
            prc.executeUpdate();
            mensaje = prc.getString("mst");
            conect.commit();

        } catch (Exception ex) {
            try {
                conect.rollback();

            } catch (Exception ex1) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conect.close();
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mensaje;

    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    // tipo Producto 
    public ArrayList<TipoProducto> MostrarTipo() {
        ArrayList<TipoProducto> tp = new ArrayList<>();

        try {
            conect = con.conectar();
            CallableStatement prcProAl = conect.prepareCall(
                    "{ call Tipo_producto() }");
            prcProAl.executeQuery();
            rs = prcProAl.getResultSet();
            while (rs.next()) {
                TipoProducto tpp = new TipoProducto(rs.getLong("id_tipo"),
                        rs.getString("nombre"));
                tp.add(tpp);
            }
            rs.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tp;
    }

    public void InsertarTipo(String valor) {
        String msg;
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement cs = conect.prepareCall(
                    "{ call Insertar_Tipo(?,?) }");
            cs.setString(1, valor);
            cs.registerOutParameter("salida", Types.VARCHAR);
            cs.executeUpdate();
            msg = cs.getString("salida");
            JOptionPane.showMessageDialog(null, msg);
            conect.commit();
        } catch (SQLException e) {
            try {
                conect.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ActualizarTipo(TipoProducto to, String valor) {
        String msg;
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement cs = conect.prepareCall(
                    "{ call Actualizar_Tipo(?,?,?) }");
            cs.setString(1, valor);
            cs.setLong(2, to.getId_tipo());
            cs.registerOutParameter("salida", Types.VARCHAR);
            cs.executeUpdate();
            msg = cs.getString("salida");
            JOptionPane.showMessageDialog(null, msg);
            conect.commit();
        } catch (SQLException e) {
            try {
                conect.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void EliminarTipo(TipoProducto to) {
        String msg;
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement cs = conect.prepareCall(
                    "{ call Eliminar_Tipo(?,?) }");
            cs.setLong(1, to.getId_tipo());
            cs.registerOutParameter("salida", Types.VARCHAR);
            cs.executeUpdate();
            msg = cs.getString("salida");
            JOptionPane.showMessageDialog(null, msg);
            conect.commit();
        } catch (SQLException e) {
            try {
                conect.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //tipo Envase
    public ArrayList<EnvaseProducto> MostrarEnvase() {
        ArrayList<EnvaseProducto> tp = new ArrayList<>();

        try {
            conect = con.conectar();
            CallableStatement prcProAl = conect.prepareCall(
                    "{ call Envase_Producto() }");
            prcProAl.executeQuery();
            rs = prcProAl.getResultSet();
            while (rs.next()) {
                EnvaseProducto tpp = new EnvaseProducto(rs.getLong("id_envase"),
                        rs.getString("nombre"));
                tp.add(tpp);
            }
            rs.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tp;
    }

    public void InsertarEnvase(String valor) {
        String msg;
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement cs = conect.prepareCall(
                    "{ call Insertar_Envase(?,?) }");
            cs.setString(1, valor);
            cs.registerOutParameter("salida", Types.VARCHAR);
            cs.executeUpdate();
            msg = cs.getString("salida");
            JOptionPane.showMessageDialog(null, msg);
            conect.commit();
        } catch (SQLException e) {
            try {
                conect.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ActualizarEnvase(EnvaseProducto en, String valor) {
        String msg;
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement cs = conect.prepareCall(
                    "{ call Actualizar_Envase(?,?,?) }");
            cs.setString(1, valor);
            cs.setLong(2, en.getId_envase());
            cs.registerOutParameter("salida", Types.VARCHAR);
            cs.executeUpdate();
            msg = cs.getString("salida");
            JOptionPane.showMessageDialog(null, msg);
            conect.commit();
        } catch (SQLException e) {
            try {
                conect.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void EliminarEnvase(EnvaseProducto en) {
        String msg;
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement cs = conect.prepareCall(
                    "{ call Eliminar_Envase(?,?) }");
            cs.setLong(1, en.getId_envase());
            cs.registerOutParameter("salida", Types.VARCHAR);
            cs.executeUpdate();
            msg = cs.getString("salida");
            JOptionPane.showMessageDialog(null, msg);
            conect.commit();
        } catch (SQLException e) {
            try {
                conect.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //medida
    public String validarMedidaProducto(String nombre) {
        String valor = null;
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

    public String eliminarMedidaProducto(MedidaProducto mdp) {
        String valor = null;
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = conect.prepareCall(""
                    + "{ CALL eliminarMedidaProducto(?,?) }");// que solo x eso?asi es jajajaj toda la madrugada jajaj
            prcProcedimientoAlmacenado.setLong(1, mdp.getId_medidas());
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
    
    public String editarMedidaProducto(String nombre, Long id) {
        String valor = null;
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = conect.prepareCall(""
                    + "{ CALL editarMedidaProducto(?,?,?) }");// que solo x eso?asi es jajajaj toda la madrugada jajaj
            prcProcedimientoAlmacenado.setString(1, nombre);
            prcProcedimientoAlmacenado.setLong(2, id);
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

    // marca
    
    public String editarMarcaProducto(String nombre, Long id) {
        String valor = null;
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = conect.prepareCall(""
                    + "{ CALL editarMarcaProducto(?,?,?) }");// que solo x eso?asi es jajajaj toda la madrugada jajaj
            prcProcedimientoAlmacenado.setString(1, nombre);
            prcProcedimientoAlmacenado.setLong(2, id);
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

    public String eliminarMarcaProducto(MarcaProducto mdp) {
        String valor = null;
        try {
            conect = con.conectar();
            conect.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = conect.prepareCall(""
                    + "{ CALL eliminarMarcaProducto(?,?) }");// que solo x eso?asi es jajajaj toda la madrugada jajaj
            prcProcedimientoAlmacenado.setLong(1, mdp.getId_Marcas());
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
