/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author franc
 */
public class francisco {

    public String tipoProd;
    public String MarcaProd;
    public String nombreProd;
    public Integer precioProd;
    public String fechavencimiento;
    public String fechaProduccion;

    public francisco() {
    }

    public francisco(String tipoProd, String MarcaProd, String nombreProd, Integer precioProd, String fechavencimiento, String fechaProduccion) {
        this.tipoProd = tipoProd;
        this.MarcaProd = MarcaProd;
        this.nombreProd = nombreProd;
        this.precioProd = precioProd;
        this.fechavencimiento = fechavencimiento;
        this.fechaProduccion = fechaProduccion;
    }

    public String getTipoProd() {
        return tipoProd;
    }

    public void setTipoProd(String tipoProd) {
        this.tipoProd = tipoProd;
    }

    public String getMarcaProd() {
        return MarcaProd;
    }

    public void setMarcaProd(String MarcaProd) {
        this.MarcaProd = MarcaProd;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public Integer getPrecioProd() {
        return precioProd;
    }

    public void setPrecioProd(Integer precioProd) {
        this.precioProd = precioProd;
    }

    public String getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(String fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    public String getFechaProduccion() {
        return fechaProduccion;
    }

    public void setFechaProduccion(String fechaProduccion) {
        this.fechaProduccion = fechaProduccion;
    }
    

}
