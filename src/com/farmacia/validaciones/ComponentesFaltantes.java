/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.validaciones;

import javax.swing.JTable;

/**
 *
 * @author alumno
 */
public class ComponentesFaltantes {

    public static String validarListaFaltantes(JTable tabla, String id_producto) {
 String o,msg=null;
        for (int i = 0; i < tabla.getRowCount(); i++) {
             o = (String) tabla.getValueAt(i, 0);
            if ( o.equals(id_producto)) {
              msg = "El producto ya fue Seleccionado!";
              break;
            }

        }

        return msg;
    }
    public static String validarListaCompras(JTable tabla, String id_producto) {
 String o,msg=null;
        for (int i = 0; i < tabla.getRowCount(); i++) {
             o = (String) tabla.getValueAt(i, 0);
             
             
             System.out.println((i+1)+" prueba "+o + "   "+ tabla.getRowCount());
            if ( o.equals(id_producto)) {
              msg = "El producto ya fue Seleccionado!";
              break;
            }

        }

        return msg;
    }

}
