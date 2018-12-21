/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.conponentes;

//import com.objetos.domain.Laboratorio;
//import com.objetos.fecha.Fecha;
import com.farmacia.join_entidades.FaltantesCabeceraDetalles;
import com.farmacia.join_entidades.ListarJoinProveedor;
import com.farmacia.join_entidades.ListarNotas;
import com.farmacia.join_entidades.joinProductoDetallesFaltantes;
import com.farmacia.join_entidades.listarJoinProductosCompras;
import com.farmacia.entities1.Clientes;
import com.farmacia.entities1.EnvaseProducto;
import com.farmacia.entities1.Laboratorio;
import com.farmacia.entities1.MarcaProducto;
import com.farmacia.entities1.MedidaProducto;
import com.farmacia.entities1.TipoProducto;
import com.farmacia.fecha.Fecha;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author alumno
 */
public class Tablas {

    
    static DefaultTableModel model;

    public static DefaultTableModel VaciarTabla(JTable tabla) {
        DefaultTableModel lab
                = (DefaultTableModel) tabla.getModel();
        while (lab.getRowCount() > 0) {
            lab.removeRow(0);
        }
        return lab;

    }

    public static void listarLab(ArrayList<Laboratorio> lista, JTable Tabla) {
        int[] a = {15, 30, 30, 10, 15};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tcr1.setHorizontalAlignment(SwingConstants.RIGHT);
        model = Tablas.VaciarTabla(Tabla);
        String[] Co = {"RUC" , "Nombre", "Direccion", "Telefono", "Fecha"};
     //   Date[] Ca = {Date.valueOf("Fecha")};
        String[] Filas = new String[5];
      //  Date[] Fila = new Date [1];
        model = new DefaultTableModel(null, Co);
      //  laboratorio = new DefaultTableModel(null, Ca);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = lista.get(i).getRUC();
            Filas[1] = lista.get(i).getNombre();
            Filas[2] = lista.get(i).getDireccion();
            Filas[3] = lista.get(i).getTelefono();
            Filas[4] = Fecha.getStringFecha(lista.get(i).getFecha());
            model.addRow(Filas);
       //     laboratorio.addRow(Fila);
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            Tabla.getColumnModel().getColumn(1).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(a[2]);
            Tabla.getColumnModel().getColumn(2).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(3).setPreferredWidth(a[3]);
            Tabla.getColumnModel().getColumn(3).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(4).setPreferredWidth(a[4]);
            Tabla.getColumnModel().getColumn(4).setCellRenderer(tcr);
        }

    }
    /// 17/11/2018 jefferson Anchundia modulo Faltantes 15:15:00  



   
    public static void cargarJoinProducto(JTable Tabla,ArrayList<FaltantesCabeceraDetalles> lista) {
       
        int[] a = {10, 30, 32, 52,15,30};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tcr1.setHorizontalAlignment(SwingConstants.RIGHT);
        model = Tablas.VaciarTabla(Tabla);
        String[] Co = {"CODIGO", "MARCA", "PRODUCTO","DESCRIPCION","CANTIDAD","ESTADO"};
        String[] Filas = new String[6];
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = "" + lista.get(i).getId_productos().toString();
            Filas[1] = lista.get(i).getMarca();
            Filas[2] = lista.get(i).getNombre();
            Filas[3] = lista.get(i).getDescripcion();
            Filas[4] = lista.get(i).getCantidad().toString();
            Filas[5] = lista.get(i).getEstado();
            
            model.addRow(Filas);
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            Tabla.getColumnModel().getColumn(1).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(a[2]);
            Tabla.getColumnModel().getColumn(2).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(3).setPreferredWidth(a[3]);
            Tabla.getColumnModel().getColumn(3).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(4).setPreferredWidth(a[4]);
            Tabla.getColumnModel().getColumn(4).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(5).setPreferredWidth(a[5]);
            Tabla.getColumnModel().getColumn(5).setCellRenderer(tcr);
        } 

    }
/////////////////////////////////////////
    public static void cargarJoinProductoDetallesFaltantes(JTable Tabla,ArrayList<joinProductoDetallesFaltantes> lista) {
       
        int[] a = {10, 30, 32, 52,15,15};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tcr1.setHorizontalAlignment(SwingConstants.RIGHT);
        model = Tablas.VaciarTabla(Tabla);
        String[] Co = {"CODIGO", "MARCA","TIPO", "PRODUCTO","CANTIDAD","ESTADO"};
        String[] Filas = new String[6];
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = "" + lista.get(i).getId_producto().toString();
            Filas[1] = lista.get(i).getMarca();
            Filas[2] = lista.get(i).getNombre_tipo();
            Filas[3] = lista.get(i).getNombre_producto();
            Filas[4] = lista.get(i).getCantidad().toString();
            Filas[5] = lista.get(i).getEstado();
            model.addRow(Filas);
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            Tabla.getColumnModel().getColumn(1).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(a[2]);
            Tabla.getColumnModel().getColumn(2).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(3).setPreferredWidth(a[3]);
            Tabla.getColumnModel().getColumn(3).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(4).setPreferredWidth(a[4]);
            Tabla.getColumnModel().getColumn(4).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(5).setPreferredWidth(a[5]);
            Tabla.getColumnModel().getColumn(5).setCellRenderer(tcr);
        } 

    }
/////////////////////////////// cargar productos en ordencompra
    public static void cargarJoinProductosMCompra(JTable Tabla,ArrayList<listarJoinProductosCompras> lista) {
       
        int[] a = {10, 30, 32, 52,15,30};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tcr1.setHorizontalAlignment(SwingConstants.RIGHT);
        model = Tablas.VaciarTabla(Tabla);
        String[] Co = {"CODIGO", "PRODUCTO", "TIPO", "MEDIDA","ENVASE","MARCA"};
        String[] Filas = new String[6];
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = "" + lista.get(i).getId_productos().toString();
            Filas[1] = lista.get(i).getNombreProductos();
            Filas[2] = lista.get(i).getNombreTipo();
            Filas[3] = lista.get(i).getNombreMedida();
            Filas[4] = lista.get(i).getNombreEnvase();
            Filas[5] = lista.get(i).getNombreMarca();
            model.addRow(Filas);
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            Tabla.getColumnModel().getColumn(1).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(a[2]);
            Tabla.getColumnModel().getColumn(2).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(3).setPreferredWidth(a[3]);
            Tabla.getColumnModel().getColumn(3).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(4).setPreferredWidth(a[4]);
            Tabla.getColumnModel().getColumn(4).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(5).setPreferredWidth(a[5]);
            Tabla.getColumnModel().getColumn(5).setCellRenderer(tcr);
        } 

    }
    public static void cargarJoinProductoIngresoCompras(JTable Tabla,ArrayList<joinProductoDetallesFaltantes> lista) {
       
        int[] a = {10, 30, 32, 52,15,30};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tcr1.setHorizontalAlignment(SwingConstants.RIGHT);
        model = Tablas.VaciarTabla(Tabla);
        String[] Co = {"CODIGO","PRODUCTO", "MARCA","TIPO","MEDIDA" ,"CANTIDAD"};
        String[] Filas = new String[6];
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = "" + lista.get(i).getId_producto().toString();
            Filas[1] = lista.get(i).getNombre_producto();
            Filas[2] = lista.get(i).getMarca();
            Filas[3] = lista.get(i).getNombre_tipo();
            Filas[4] = lista.get(i).getMedida();
            Filas[5] = lista.get(i).getCantidad().toString();
            model.addRow(Filas);
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            Tabla.getColumnModel().getColumn(1).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(a[2]);
            Tabla.getColumnModel().getColumn(2).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(3).setPreferredWidth(a[3]);
            Tabla.getColumnModel().getColumn(3).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(4).setPreferredWidth(a[4]);
            Tabla.getColumnModel().getColumn(4).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(5).setPreferredWidth(a[5]);
            Tabla.getColumnModel().getColumn(5).setCellRenderer(tcr);
        } 

    }
    public static void cargarFaltantes(JTable Tabla,ArrayList<joinProductoDetallesFaltantes> lista) {
//        for (int i = 0; i < lista.size(); i++) {
//             System.out.println("tabla  "+lista.get(i).getCantidad().toString());
//        }
//        
        //DefaultTableModel model1;
        int[] a = {10, 30, 32, 52,15};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tcr1.setHorizontalAlignment(SwingConstants.RIGHT);
        model = Tablas.VaciarTabla(Tabla);
        String[] Co = {"CODIGO", "TIPO", "MARCA", "PRODUCTO","CANTIDAD"};
        String[] Filas = new String[5];
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = "" + lista.get(i).getId_producto().toString();
            Filas[1] = lista.get(i).getNombre_tipo();
            Filas[2] = lista.get(i).getMarca();
            Filas[3] = lista.get(i).getNombre_producto();
            Filas[4] = lista.get(i).getCantidad().toString();
             
            model.addRow(Filas);
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            Tabla.getColumnModel().getColumn(1).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(a[2]);
            Tabla.getColumnModel().getColumn(2).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(3).setPreferredWidth(a[3]);
            Tabla.getColumnModel().getColumn(3).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(4).setPreferredWidth(a[4]);
            Tabla.getColumnModel().getColumn(4).setCellRenderer(tcr);
        } 

    }
    public static void CargarJoinProveedores(JTable Tabla,ArrayList<ListarJoinProveedor> lista) {
       
        int[] a = {30, 20, 55, 52, 52, 52, 52, 15};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tcr1.setHorizontalAlignment(SwingConstants.RIGHT);
        model = Tablas.VaciarTabla(Tabla);
        String[] Co = {"CODIGO","RUC", "NOMBRE", "REPRESENTANTE", "DIRECCION","TELEFONO","MAIL","CLASE"};
        String[] Filas = new String[8];
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = "" + lista.get(i).getId_proveedor().toString();
            Filas[1] = lista.get(i).getCedula_ruc();
            Filas[2] = lista.get(i).getEntidad();
            Filas[3] = lista.get(i).getRepresentante();
            Filas[4] = lista.get(i).getDireccion();
            Filas[5] = lista.get(i).getTelefono();
            Filas[6] = lista.get(i).getMail();
            Filas[7] = lista.get(i).getClase();
            model.addRow(Filas);
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            Tabla.getColumnModel().getColumn(1).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(a[2]);
            Tabla.getColumnModel().getColumn(2).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(3).setPreferredWidth(a[3]);
            Tabla.getColumnModel().getColumn(3).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(4).setPreferredWidth(a[4]);
            Tabla.getColumnModel().getColumn(4).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(5).setPreferredWidth(a[5]);
            Tabla.getColumnModel().getColumn(5).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(6).setPreferredWidth(a[6]);
            Tabla.getColumnModel().getColumn(6).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(6).setPreferredWidth(a[7]);
            Tabla.getColumnModel().getColumn(6).setCellRenderer(tcr);
        } 

    }
    public static void CargarJoinRegistrosdeNota(JTable Tabla,ArrayList<ListarNotas> lista) {
       
        int[] a = {10, 55, 52, 52, 52, 52, 15};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tcr1.setHorizontalAlignment(SwingConstants.RIGHT);
        model = Tablas.VaciarTabla(Tabla);
        String[] Co = {"N#", "CODIGO DE PROVEEDOR", "NOMBRE", "REPRESENTANTE","FECHA DE CREACION","HORA","ESTADO"};
        String[] Filas = new String[7];
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = "" + lista.get(i).getId_cabecera_nota_pedidos().toString();
            Filas[1] = lista.get(i).getId_proveedor().toString();
            Filas[2] = lista.get(i).getNombre();
            Filas[3] = lista.get(i).getRepresentante();
            Filas[4] = lista.get(i).getFecha_creacion().toString();
            Filas[5] = lista.get(i).getHora().toString();
            Filas[6] = lista.get(i).getEstado();
          
            model.addRow(Filas);
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            Tabla.getColumnModel().getColumn(1).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(a[2]);
            Tabla.getColumnModel().getColumn(2).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(3).setPreferredWidth(a[3]);
            Tabla.getColumnModel().getColumn(3).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(4).setPreferredWidth(a[4]);
            Tabla.getColumnModel().getColumn(4).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(5).setPreferredWidth(a[5]);
            Tabla.getColumnModel().getColumn(5).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(6).setPreferredWidth(a[6]);
            Tabla.getColumnModel().getColumn(6).setCellRenderer(tcr);
        } 

    }
    
    public static void cargarFiltroProductos(JTable Tabla,ArrayList<listarJoinProductosCompras> lista) {
       
        int[] a = {10, 30, 32, 52,15,30};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tcr1.setHorizontalAlignment(SwingConstants.RIGHT);
        model = Tablas.VaciarTabla(Tabla);
        String[] Co = {"CODIGO", "PRODUCTO", "TIPO", "MEDIDA","ENVASE","MARCA"};
        String[] Filas = new String[6];
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = "" + lista.get(i).getId_productos().toString();
            Filas[1] = lista.get(i).getNombreProductos();
            Filas[2] = lista.get(i).getNombreTipo();
            Filas[3] = lista.get(i).getNombreMedida();
            Filas[4] = lista.get(i).getNombreEnvase();
            Filas[5] = lista.get(i).getNombreMarca();
            model.addRow(Filas);
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            Tabla.getColumnModel().getColumn(1).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(a[2]);
            Tabla.getColumnModel().getColumn(2).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(3).setPreferredWidth(a[3]);
            Tabla.getColumnModel().getColumn(3).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(4).setPreferredWidth(a[4]);
            Tabla.getColumnModel().getColumn(4).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(5).setPreferredWidth(a[5]);
            Tabla.getColumnModel().getColumn(5).setCellRenderer(tcr);
        } 

    }
    ///////////maquilon proveedor
    public static void listarProveedor(ArrayList<ListarJoinProveedor> lista, JTable Tabla) {
        int[] a = {10, 30, 32, 52};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tcr1.setHorizontalAlignment(SwingConstants.RIGHT);
        model = Tablas.VaciarTabla(Tabla);
        String[] Co = {"Cedula_Ruc", "Entidad", "Contacto", "Fecha de Ingreso"};
        String[] Filas = new String[4];
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = lista.get(i).getCedula_ruc();
            Filas[1] = lista.get(i).getEntidad();
            Filas[2] = lista.get(i).getRepresentante();
            Filas[3] = (lista.get(i).getFecha_registro()).toString();
            model.addRow(Filas);
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            Tabla.getColumnModel().getColumn(1).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(a[2]);
            Tabla.getColumnModel().getColumn(2).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(3).setPreferredWidth(a[3]);
            Tabla.getColumnModel().getColumn(3).setCellRenderer(tcr);
        }

    }
    public static void cargarJoinProductosFaltantes(JTable Tabla,ArrayList<FaltantesCabeceraDetalles> lista) {//piguiFaltantes
       
        int[] a = {10, 30, 32, 52,15,30};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tcr1.setHorizontalAlignment(SwingConstants.RIGHT);
        model = Tablas.VaciarTabla(Tabla);
        String[] Co = {"CODIGO", "MARCA", "PRODUCTO","DESCRIPCION","CANTIDAD","ESTADO"};
        String[] Filas = new String[6];
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = "" + lista.get(i).getId_productos().toString();
            Filas[1] = lista.get(i).getMarca();
            Filas[2] = lista.get(i).getNombre();
            Filas[3] = lista.get(i).getDescripcion();
            Filas[4] = lista.get(i).getCantidad().toString();
            Filas[5] = lista.get(i).getEstado();
            
            model.addRow(Filas);
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            Tabla.getColumnModel().getColumn(1).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(a[2]);
            Tabla.getColumnModel().getColumn(2).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(3).setPreferredWidth(a[3]);
            Tabla.getColumnModel().getColumn(3).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(4).setPreferredWidth(a[4]);
            Tabla.getColumnModel().getColumn(4).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(5).setPreferredWidth(a[5]);
            Tabla.getColumnModel().getColumn(5).setCellRenderer(tcr);
        } 

    }
    public static void listarClientes(ArrayList<Clientes> lista, JTable Tabla) {
        int[] a = {10, 30, 30, 30, 15};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr1.setHorizontalAlignment(SwingConstants.CENTER);
        tcr.setHorizontalAlignment(SwingConstants.RIGHT);
        model = Tablas.VaciarTabla(Tabla);
        String[] Co = {"Cedula", "Nombre", "Apellido", "Direccion", "Fecha_reg"};
        String[] Filas = new String[5];
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = lista.get(i).getCedula();
            Filas[1] = lista.get(i).getNombre();
            Filas[2] = lista.get(i).getApellido();
            Filas[3] = lista.get(i).getDireccion();
            Filas[4] = Fecha.getStringFecha(lista.get(i).getFecha_reg());
            model.addRow(Filas);
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr1);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            Tabla.getColumnModel().getColumn(1).setCellRenderer(tcr1);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(a[2]);
            Tabla.getColumnModel().getColumn(2).setCellRenderer(tcr1);
            Tabla.getColumnModel().getColumn(3).setPreferredWidth(a[3]);
            Tabla.getColumnModel().getColumn(3).setCellRenderer(tcr1);
            Tabla.getColumnModel().getColumn(4).setPreferredWidth(a[4]);
            Tabla.getColumnModel().getColumn(4).setCellRenderer(tcr1);
        }

    }
    public static void filtro(String valor, JTable Tabla) {
        TableRowSorter<DefaultTableModel> tr = new 
        TableRowSorter<>(model);
        Tabla.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + valor));
    }
    
    public static void listarTipoProducto(ArrayList<TipoProducto> lista, JTable Tabla) {
        int[] a = {10, 30, 32, 52,};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tcr1.setHorizontalAlignment(SwingConstants.RIGHT);
        model = Tablas.VaciarTabla(Tabla);
        String[] Co = {"ID", "Tipo"};
        String[] Filas = new String[2];
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = String.valueOf(lista.get(i).getId_tipo());
            Filas[1] = lista.get(i).getNombreTipo();
            model.addRow(Filas);
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            Tabla.getColumnModel().getColumn(1).setCellRenderer(tcr);
        }
        
    }

    public static void listarEnvase(ArrayList<EnvaseProducto> lista, JTable Tabla) {
        int[] a = {10, 30, 32, 52,};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tcr1.setHorizontalAlignment(SwingConstants.RIGHT);
        model = Tablas.VaciarTabla(Tabla);
        String[] Co = {"ID", "Tipo"};
        String[] Filas = new String[2];
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = String.valueOf(lista.get(i).getId_envase());
            Filas[1] = lista.get(i).getNombreEnvase();
            model.addRow(Filas);
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            Tabla.getColumnModel().getColumn(1).setCellRenderer(tcr);
        }

    }
    
    public static void listarMedidas(ArrayList<MedidaProducto> lista, JTable Tabla) {
        int[] a = {15, 30};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tcr1.setHorizontalAlignment(SwingConstants.RIGHT);
        model = VaciarTabla(Tabla);
        String[] Co = {"#", "Medidas"};
        //   Date[] Ca = {Date.valueOf("Fecha")};
        String[] Filas = new String[5];
        //  Date[] Fila = new Date [1];
        model = new DefaultTableModel(null, Co);
        //  laboratorio = new DefaultTableModel(null, Ca);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = lista.get(i).getId_medidas().toString();
            Filas[1] = lista.get(i).getNombre_medida();

            model.addRow(Filas);
            //     laboratorio.addRow(Fila);
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            Tabla.getColumnModel().getColumn(1).setCellRenderer(tcr);

        }

    }
    
    public static void listarMarcas(ArrayList<MarcaProducto> lista, JTable Tabla) {
        int[] a = {15, 30};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tcr1.setHorizontalAlignment(SwingConstants.RIGHT);
        model = VaciarTabla(Tabla);
        String[] Co = {"ID", "Marcas"};
        //   Date[] Ca = {Date.valueOf("Fecha")};
        String[] Filas = new String[5];
        //  Date[] Fila = new Date [1];
        model = new DefaultTableModel(null, Co);
        //  laboratorio = new DefaultTableModel(null, Ca);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = lista.get(i).getId_Marcas().toString();
            Filas[1] = lista.get(i).getNombreMarca();
            model.addRow(Filas);
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            Tabla.getColumnModel().getColumn(1).setCellRenderer(tcr);

        }

    }
}
