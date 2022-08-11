/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.utp.ciclo2reto5.model.vo;

/**
 *
 * @author NORBERTO AGUDELO
 */
public class ProyectoVo {
   private Integer idProyecto; 
   private String constructora;
   private Integer numeroHabitaciones;
   private String ciudad;
   private String clasificacion;

    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public Integer getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(Integer numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return "ProyectoVo{" + "idProyecto=" + idProyecto + ", constructora=" + constructora + ", numeroHabitaciones=" + numeroHabitaciones + ", ciudad=" + ciudad + ", clasificacion=" + clasificacion + '}';
    }
   
   
   
}
