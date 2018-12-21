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
public class MedidaProducto {
    private Long id_medidas;
    private String nombre_medida;

    public MedidaProducto() {
    }

    public MedidaProducto(Long id_medidas, String nombre_medida) {
        this.id_medidas = id_medidas;
        this.nombre_medida = nombre_medida;
    }

    public Long getId_medidas() {
        return id_medidas;
    }

    public void setId_medidas(Long id_medidas) {
        this.id_medidas = id_medidas;
    }

    public String getNombre_medida() {
        return nombre_medida;
    }

    public void setNombre_medida(String nombre_medida) {
        this.nombre_medida = nombre_medida;
    }
    
    
}
