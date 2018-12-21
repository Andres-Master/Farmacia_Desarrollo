/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.entities.mappers;


import com.farmacia.join_entidades.FaltantesCabeceraDetalles;
import com.farmacia.join_entidades.ListarJoinProveedor;
import com.farmacia.join_entidades.ListarNotas;

import com.farmacia.join_entidades.joinProductoDetallesFaltantes;
import com.farmacia.join_entidades.listarJoinProductosCompras;
import com.farmacia.entities1.Clientes;
import com.farmacia.entities1.Correo;
import com.farmacia.entities1.Correo_Cliente;
import com.farmacia.entities1.EnvaseProducto;
import com.farmacia.entities1.Laboratorio;
import com.farmacia.entities1.MedidaProducto;
import com.farmacia.entities1.Productos;
import com.farmacia.entities1.MarcaProducto;
import com.farmacia.entities1.Telefono;
import com.farmacia.entities1.Telefono_Cliente;
import com.farmacia.entities1.TipoProducto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josel
 */
public class EntidadesMappers {

    public static Productos getProductosFromResultSet(ResultSet rs) {
        Productos obj = new Productos();
        try {
            obj.setId_productos(rs.getLong("ID_PRODUCTOS"));
            obj.setId_tipo(rs.getLong("ID_TIPO"));
            obj.setId_marcas(rs.getLong("ID_MARCAS"));
            obj.setId_medidas(rs.getLong("MEDIDAS"));
            obj.setId_envase(rs.getLong("ID_ENVASE"));
            obj.setNombre(rs.getString("NOMBRE"));
            obj.setDescripcion(rs.getString("DESCRIPCION"));
            obj.setPeso(rs.getDouble("PESO"));
            obj.setFecha_registro(rs.getDate("FECHA_REGISTRO"));
         
        } catch (SQLException ex) {
            Logger.getLogger(EntidadesMappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
    public static FaltantesCabeceraDetalles getJoinProductosFromResultSet(ResultSet rs) {
        FaltantesCabeceraDetalles obj = new FaltantesCabeceraDetalles();
        try {
            obj.setId_detalle_faltantes(rs.getLong("ID_DETALLE_FALTANTES"));
            obj.setFecha_registro(rs.getDate("FECHA_REGISTRO"));
            obj.setCantidad(rs.getInt("CANTIDAD"));
            obj.setEstado(rs.getString("ESTADO"));
            obj.setId_marcas(rs.getLong("ID_MARCAS"));
            obj.setMarca(rs.getString("MARCA"));
            obj.setId_productos(rs.getLong("ID_PRODUCTOS"));
            obj.setNombre(rs.getString("NOMBRE"));
            obj.setDescripcion(rs.getString("DESCRIPCION"));
       
         
        } catch (SQLException ex) {
            Logger.getLogger(EntidadesMappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
    public static joinProductoDetallesFaltantes getJoinDetallesFaltantesFromResultSet(ResultSet rs) {
        joinProductoDetallesFaltantes obj = new joinProductoDetallesFaltantes();
        try {
            obj.setId_detalle_faltantes(rs.getLong("ID_DETALLE_FALTANTES"));            
            obj.setId_producto(rs.getLong("ID_PRODUCTO"));
            obj.setNombre_producto(rs.getString("PRODUCTO"));
            obj.setId_marcas(rs.getLong("ID_MARCAS"));
            obj.setMarca(rs.getString("MARCA"));
            obj.setId_tipo(rs.getLong("ID_TIPO"));
            obj.setNombre_tipo(rs.getString("TIPO"));
            obj.setCantidad(rs.getInt("CANTIDAD"));
            obj.setEstado(rs.getString("ESTADO"));
            
         
        } catch (SQLException ex) {
            Logger.getLogger(EntidadesMappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
    public static listarJoinProductosCompras getJoinTodosProductosFromResultSet(ResultSet rs) {
        listarJoinProductosCompras obj = new listarJoinProductosCompras();
        try {
            obj.setId_productos(rs.getLong("ID_PRODUCTOS"));
            obj.setNombreProductos(rs.getString("NOMBRE"));
            obj.setDescripcion(rs.getString("DESCRIPCION"));
            obj.setFecha_registro(rs.getDate("FECHA_REGISTRO"));
            obj.setPeso(rs.getDouble("peso"));
            obj.setId_tipo(rs.getLong("ID_TIPO"));
            obj.setNombreTipo(rs.getString("TIPO"));
            obj.setId_medida(rs.getLong("ID_MEDIDAS"));
            obj.setNombreMedida(rs.getString("MEDIDA"));
            obj.setId_envase(rs.getLong("ID_ENVASE"));
            obj.setNombreEnvase(rs.getString("ENVASE"));
            obj.setId_marca(rs.getLong("ID_MARCAS"));
            obj.setNombreMarca(rs.getString("MARCA"));
            obj.setId_usuario(rs.getLong("ID_USUARIO"));
            obj.setIva(rs.getString("IVA"));
            obj.setCantidad_minima(rs.getLong("CANTIDAD_MINIMA"));
         
        } catch (SQLException ex) {
            Logger.getLogger(EntidadesMappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    public static TipoProducto getTipoProductoFromResultSet(ResultSet rs) {
        TipoProducto obj = new TipoProducto();
        try {
            obj.setId_tipo(rs.getLong("ID_TIPO"));
            obj.setNombreTipo(rs.getString("NOMBRE"));
            
         
        } catch (SQLException ex) {
            Logger.getLogger(EntidadesMappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    public static MedidaProducto getMedidaProductoFromResultSet(ResultSet rs) {
        MedidaProducto obj = new MedidaProducto();
        try {
            obj.setId_medidas(rs.getLong("ID_MEDIDAS"));
            obj.setNombre_medida(rs.getString("NOMBRE_MEDIDA"));
            
         
        } catch (SQLException ex) {
            Logger.getLogger(EntidadesMappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    public static EnvaseProducto getEnvaseProductoFromResultSet(ResultSet rs) {
        EnvaseProducto obj = new EnvaseProducto();
        try {
            obj.setId_envase(rs.getLong("ID_ENVASE"));
            obj.setNombreEnvase(rs.getString("NOMBRE"));
            
         
        } catch (SQLException ex) {
            Logger.getLogger(EntidadesMappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    public static MarcaProducto getMarcaProductoFromResultSet(ResultSet rs) {
        MarcaProducto obj = new MarcaProducto();
        try {
            obj.setId_Marcas(rs.getLong("ID_MARCAS"));
            obj.setNombreMarca(rs.getString("NOMBRE"));
        } catch (SQLException ex) {
            Logger.getLogger(EntidadesMappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    public static ListarJoinProveedor getListarJoinProveedorFromResultSet(ResultSet rs) {
        ListarJoinProveedor obj = new ListarJoinProveedor();
        try {
            obj.setId_proveedor(rs.getLong("ID_PROVEEDOR"));
            obj.setId_proveedor_clase(rs.getLong("ID_PROVEEDOR_CLASE"));
            obj.setClase(rs.getString("CLASE"));
            obj.setCedula_ruc(rs.getString("CEDULA_RUC"));
            obj.setEntidad(rs.getString("ENTIDAD"));
            obj.setRepresentante(rs.getString("REPRESENTANTE"));
            obj.setDireccion(rs.getString("DIRECCION"));
            obj.setFecha_registro(rs.getDate("FECHA_REGISTRO"));
            obj.setEstado(rs.getString("ESTADO"));
         //   obj.set//Id_tipo_telefono(rs.getLong("ID_TIPO_TELEFONO"));
            obj.setTelefono(rs.getString("TELEFONO"));
           // obj.setTipo_telefon(rs.getString("TIPO_TELEFON"));
          //  obj.setId_tipo_correo(rs.getLong("ID_TIPO_CORREO"));
            obj.setMail(rs.getString("CORREO"));
           // obj.setTipo_correo(rs.getString("TIPO_CORREO"));
           // obj.setTelefono(telefono);
            
         
        } catch (SQLException ex) {
            Logger.getLogger(EntidadesMappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public static ListarNotas getListarNotasFromResultSet(ResultSet rs) {
        ListarNotas obj = new ListarNotas();
        try {
            obj.setId_cabecera_nota_pedidos(rs.getLong("ID_CABECERA_NOTA_PEDIDOS"));
            obj.setNumero_nota(rs.getString("NUMERO_NOTA"));
            obj.setId_proveedor(rs.getLong("CODIGO"));
            obj.setNombre(rs.getString("NOMBRE"));
            obj.setRepresentante(rs.getString("REPRESENTANTE"));
            obj.setFecha_creacion(rs.getDate("FECHA_CREACION"));
            obj.setHora(rs.getTime("HORA"));
            obj.setEstado(rs.getString("ESTADO"));
         
        } catch (SQLException ex) {
            Logger.getLogger(EntidadesMappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    public static Correo getCorreoFromResultSet(ResultSet rs){
        Correo obj = new Correo();   
        try {                     
            obj.setId_correo(rs.getLong("ID_PROMAIL"));
          //  obj.setId_proveedor(rs.getLong("ID_PROVEEDOR"));
            obj.setId_tipo_correo(rs.getInt("ID_TIPO_CORREO"));
            obj.setCorreo(rs.getString("MAIL"));                        
            obj.setTipo_correo(rs.getString("TIPO_CORREO"));  
            obj.setCedula_ruc(rs.getString("CEDULA_RUC"));
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(EntidadesMappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
    
//    public static Proveedor getProveedorFromResultSet (ResultSet rs){
//    Proveedor obj = new Proveedor();   
//        try {
//            obj.setId_proveedor(rs.getLong("id_proveedor"));
//            obj.setCedula_ruc(rs.getString("cedula_ruc"));
//            obj.setNombre(rs.getString("entidad"));
//            obj.setContacto_re(rs.getString("contacto"));
//            obj.setDireccion(rs.getString("direccion"));
//            obj.setFecha_registro(rs.getDate("fecha_registro"));    
//            obj.setStr_telefono(rs.getString("str_telefono"));
//            obj.setStr_correo(rs.getString("str_correo"));
//        } catch (SQLException ex) {
//            java.util.logging.Logger.getLogger(EntidadesMappers.class.getName()).log(Level.SEVERE, null, ex);
//        }
//      return obj;
//    }
    
    public static Telefono getTelefonoFromResultSet (ResultSet rs){
    Telefono obj = new Telefono();   
        try {
            obj.setId_telefono(rs.getLong("id_protelefono"));
            //obj.setId_proveedor(rs.getLong("ID_PROVEEDOR"));
            obj.setId_tipo_telefono(rs.getInt("ID_TIPO_TELEFONO"));
            obj.setTelefono(rs.getString("telefono"));
            obj.setTipoTelefono(rs.getString("TIPO_TELEFONO"));
            obj.setCedula_ruc(rs.getString("CEDULA_RUC"));
            
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(EntidadesMappers.class.getName()).log(Level.SEVERE, null, ex);
        }
   return obj;
}
    public static FaltantesCabeceraDetalles getJoinTodosProductosFaltantesFromResultSet(ResultSet rs) {//piguiFaltantes
        FaltantesCabeceraDetalles obj = new FaltantesCabeceraDetalles();
        try {
            obj.setId_productos(rs.getLong("ID_PRODUCTOS"));
            obj.setMarca(rs.getString("MARCA"));;
            obj.setNombre(rs.getString("NOMBRE"));
            obj.setDescripcion(rs.getString("DESCRIPCION"));
            obj.setCantidad(rs.getInt("CANTIDAD"));
            obj.setEstado(rs.getString("ESTADO"));

        } catch (SQLException ex) {
            Logger.getLogger(EntidadesMappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    public static Laboratorio getLaboratorioFromResultSet(ResultSet rs) {//KELLY LABORATORIO
        Laboratorio obj = new Laboratorio();
        try {
            obj.setId_Laboratorio(rs.getLong("id_Laboratorio"));
            obj.setRUC(rs.getString("RUC"));
            obj.setNombre(rs.getString("Nombre"));
            obj.setDireccion(rs.getString("Direccion"));
            obj.setTelefono(rs.getString("Telefono"));
            obj.setFecha(rs.getDate("Fecha"));
            obj.setImagen(rs.getString("Imagen"));
            obj.setCorreo(rs.getString("Correo"));
        } catch (SQLException ex) {
            Logger.getLogger(EntidadesMappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    public static Correo_Cliente getCorreoClientesFromResultSet(ResultSet rs) {//kelly cliente
        Correo_Cliente obj = new Correo_Cliente();
        try {
            obj.setId_Correo(rs.getLong("id_Correo"));
            obj.setCorreo(rs.getString("Correo"));
            obj.setCedula(rs.getString("Cedula"));
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(EntidadesMappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    public static Clientes getClienteFromResultSet(ResultSet rs) {
        Clientes obj = new Clientes();
        try {
            obj.setId_Clientes(rs.getLong("id_Clientes"));
            obj.setCedula(rs.getString("Cedula"));
            obj.setNombre(rs.getString("Nombre"));
            obj.setApellido(rs.getString("Apellido"));
            obj.setDireccion(rs.getString("Direccion"));
            obj.setFecha_reg(rs.getDate("Fecha_reg"));
            obj.setStr_telefono(rs.getString("str_telefono"));
            obj.setStr_correo(rs.getString("str_correo"));
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(EntidadesMappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }

    public static Telefono_Cliente getTelefonoClienteFromResultSet(ResultSet rs) {
        Telefono_Cliente obj = new Telefono_Cliente();
        try {
            obj.setId_Telefono(rs.getLong("id_Telefono"));
            obj.setId_tipo_Telefono(rs.getLong("id_Tipo_Telefono"));
            obj.setNumero(rs.getString("Numero"));
            obj.setCedula(rs.getString("Cedula"));

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(EntidadesMappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
}
