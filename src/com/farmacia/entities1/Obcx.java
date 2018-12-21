/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.entities1;

/**
 *
 * @author ANGEL JESUS
 */
public class Obcx {
    private String tcd;
    private int tipos;

    public Obcx() {
    }

    public Obcx(String tcd) {
        this.tcd = tcd;
    }
    
    public Obcx(String tcd, int tipos) {
        this.tcd = tcd;
        this.tipos = tipos;
    }

    public String getTcd() {
        return tcd;
    }

    public void setTcd(String tcd) {
        this.tcd = tcd;
    }

    public int getTipos() {
        return tipos;
    }

    public void setTipos(int tipos) {
        this.tipos = tipos;
    }
}
