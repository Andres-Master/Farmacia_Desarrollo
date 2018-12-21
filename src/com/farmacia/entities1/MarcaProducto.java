/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.entities1;

/**
 *
 * @author User
 */
public class MarcaProducto {
    private Long id_Marcas;
    private String nombreMarca;

    public MarcaProducto() {
    }
    
    public MarcaProducto(Long id_Marcas, String nombreMarca) {
        this.id_Marcas = id_Marcas;
        this.nombreMarca = nombreMarca;
    }

    public Long getId_Marcas() {
        return id_Marcas;
    }

    public void setId_Marcas(Long id_Marcas) {
        this.id_Marcas = id_Marcas;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }
    
    
}
