/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.validaciones;

import com.farmacia.entities1.Clientes;
import com.farmacia.entities1.Correo_Cliente;
import com.farmacia.entities1.Laboratorio;
import com.farmacia.entities1.Telefono_Cliente;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Validacion {
    public static boolean validarRUC(ArrayList<Laboratorio> lista, String ruc) {
        boolean valor = false;
        if (ruc.length() < 10) {
            valor = false;
        } else {
            boolean valor1 = Validacion.buscarRUC(lista, ruc);
            if (valor1 == true) {
                JOptionPane.showMessageDialog(null, "RUC ya existente");
                valor = false;
            } else {
                valor = true;
            }
        }
        return valor;
    }

    public static boolean buscarRUC(ArrayList<Laboratorio> lista, String ruc) {
        boolean valor = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getRUC().equals(ruc)) {
                valor = true;
                break;
            } else {
                valor = false;
            }
        }
        return valor;
    }
    
    public static boolean Telefono(String cel) {
        boolean Cel;
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher matcher = pattern.matcher(cel);
        if (matcher.matches()) {
            Cel = true;
        } else {
            Cel = false;
        }
        return Cel;
    }
    
    public static boolean validarVariables(String valor){
        int conta=0;
         for(int i=0;i<valor.length();i++){
             if(valor.charAt(i)==' '){
                 conta++;
             }
         }
         if(conta>0){
            return false; 
         }else{
             return true;
         }
    }
    
    
      public static boolean Cedula(String cedula) {
        boolean cedulaCorrecta = false;
        try {
            if (cedula.length() == 10)
            {
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) {
                    int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int verificador = Integer.parseInt(cedula.substring(9, 10));
                    int suma = 0;
                    int digito = 0;
                    for (int i = 0; i < (cedula.length() - 1); i++) {
                        digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }

                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                    } else if ((10 - (suma % 10)) == verificador) {
                        cedulaCorrecta = true;
                    } else {
                        cedulaCorrecta = false;
                    }
                } else {
                    cedulaCorrecta = false;
                }
            } else {
                cedulaCorrecta = false;
            }
        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (Exception err) {
            cedulaCorrecta = false;
        }
        if (!cedulaCorrecta) {
        }
        return cedulaCorrecta;
    }
 

    public static boolean Email(String Mail) {
        Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
        Matcher m = p.matcher(Mail);
        boolean matchFound = m.matches();
        if (matchFound) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean validarCedula(ArrayList<Clientes> lista, String cedula) {
        boolean valor = false;
        if (cedula.length() <10) {
            valor = false;
        } else {
            boolean valor1 = buscarCedula(lista, cedula);
            if (valor1 == true) {
                JOptionPane.showMessageDialog(null, "Cedula ya existente");
                valor = false;
            } else {
                valor = true;
            }
        }
        return valor;
    }

    
    
    public static boolean buscarCedula(ArrayList<Clientes> lista, String cedula) {
        boolean valor = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCedula().equals(cedula)) {
                valor = true;
                break;
            } else {
                valor = false;
            }
        }
        return valor;
    }

    public static boolean buscarTelefono(ArrayList<Telefono_Cliente> lista, String tel) {
        boolean valor = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNumero().equals(tel)) {
                valor = true;
                break;
            } else {
                valor = false;
            }
        }
        return valor;
    }
    
    public static boolean buscarCorreo(ArrayList<Correo_Cliente> lista, String cor) {
        boolean valor = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCorreo().equals(cor)) {
                valor = true;
                break;
            } else {
                valor = false;
            }
        }
        return valor;
    }
}
