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
public class Precios {
    private int id_precio;
    private String precio_compra;
    private double precio_venta;

    public Precios() {
    }

    public Precios(int id_precio, String precio_compra, double precio_venta) {
        this.id_precio = id_precio;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
    }

    public int getId_precio() {
        return id_precio;
    }

    public void setId_precio(int id_precio) {
        this.id_precio = id_precio;
    }

    public String getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(String precio_compra) {
        this.precio_compra = precio_compra;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    
    
    
}
