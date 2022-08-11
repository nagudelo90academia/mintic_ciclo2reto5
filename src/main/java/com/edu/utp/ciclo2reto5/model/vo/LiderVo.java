/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.utp.ciclo2reto5.model.vo;

/**
 *
 * @author NORBERTO AGUDELO
 */
public class LiderVo {
    private Integer idLider;
    private String nombre;
    private String primerApellido;
    private String ciudadResidencia;

    public Integer getIdLider() {
        return idLider;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setIdLider(Integer idLider) {
        this.idLider = idLider;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    @Override
    public String toString() {
        return "Lider{" + "idLider=" + idLider + ", nombre=" + nombre + ", primerApellido=" + primerApellido + ", ciudadResidencia=" + ciudadResidencia + '}';
    }
    
}
