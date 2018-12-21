/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.conponentes;

import static com.farmacia.conponentes.Tablas.model;
import com.farmacia.entities1.EnvaseProducto;
import com.farmacia.entities1.Laboratorio;
import com.farmacia.entities1.MarcaProducto;
import com.farmacia.entities1.MedidaProducto;
import com.farmacia.entities1.TipoProducto;
import com.farmacia.fecha.Fecha;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Formulario {

    public static DefaultComboBoxModel listarComboTipoPro(ArrayList<TipoProducto> lista) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        Object[] arreglo = arreglo1(lista);
        System.out.println(lista.size() + " tam " + arreglo.length);
        for (int i = 0; i < arreglo.length; i++) {
            model.addElement(arreglo[i]);
        }
        return model;

    }

    private static Object[] arreglo1(ArrayList<TipoProducto> lista) {
        Object[] arreglo = new Object[lista.size() + 1];
        arreglo[0] = "Elija una opcion...";
        for (int i = 0; i < lista.size(); i++) {
            arreglo[(i + 1)] = lista.get(i).getNombreTipo();
        }
        return arreglo;

    }

    public static DefaultComboBoxModel listarComboMedidaPro(ArrayList<MedidaProducto> lista) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        Object[] arreglo = arreglo2(lista);
        System.out.println(lista.size() + " tam " + arreglo.length);
        for (int i = 0; i < arreglo.length; i++) {
            model.addElement(arreglo[i]);
        }
        return model;

    }

    private static Object[] arreglo2(ArrayList<MedidaProducto> lista) {
        Object[] arreglo = new Object[lista.size() + 1];
        arreglo[0] = "Elija una opcion...";
        for (int i = 0; i < lista.size(); i++) {
            arreglo[(i + 1)] = lista.get(i).getNombre_medida();
        }
        return arreglo;

    }

    public static DefaultComboBoxModel listarComboEnvasePro(ArrayList<EnvaseProducto> lista) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        Object[] arreglo = arreglo3(lista);
        System.out.println(lista.size() + " tam " + arreglo.length);
        for (int i = 0; i < arreglo.length; i++) {
            model.addElement(arreglo[i]);
        }
        return model;
    }

    private static Object[] arreglo3(ArrayList<EnvaseProducto> lista) {
        Object[] arreglo = new Object[lista.size() + 1];
        arreglo[0] = "Elija una opcion...";
        for (int i = 0; i < lista.size(); i++) {
            arreglo[(i + 1)] = lista.get(i).getNombreEnvase();
        }
        return arreglo;

    }

    public static DefaultComboBoxModel listarComboMarcaPro(ArrayList<MarcaProducto> lista) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        Object[] arreglo = arreglo4(lista);
        System.out.println(lista.size() + " tam " + arreglo.length);
        for (int i = 0; i < arreglo.length; i++) {
            model.addElement(arreglo[i]);
        }
        return model;
    }

    private static Object[] arreglo4(ArrayList<MarcaProducto> lista) {
        Object[] arreglo = new Object[lista.size() + 1];
        arreglo[0] = "Elija una opcion...";
        for (int i = 0; i < lista.size(); i++) {
            arreglo[(i + 1)] = lista.get(i).getNombreMarca();
        }
        return arreglo;

    }
}
