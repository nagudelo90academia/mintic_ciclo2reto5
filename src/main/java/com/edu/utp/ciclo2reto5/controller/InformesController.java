/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.utp.ciclo2reto5.controller;

import com.edu.utp.ciclo2reto5.model.dao.ComprasProveedorDao;
import com.edu.utp.ciclo2reto5.model.dao.LiderDao;
import com.edu.utp.ciclo2reto5.model.dao.ProyectoDao;
import com.edu.utp.ciclo2reto5.model.vo.ComprasProveedorVo;
import com.edu.utp.ciclo2reto5.model.vo.LiderVo;
import com.edu.utp.ciclo2reto5.model.vo.ProyectoVo;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author NORBERTO AGUDELO
 */
public class InformesController {
    private LiderDao liderDao;      
    private ProyectoDao proyectoDao;
    private ComprasProveedorDao comprasProveedorDao;

    public InformesController() {
        liderDao = new  LiderDao();        
        proyectoDao = new ProyectoDao();
        comprasProveedorDao = new ComprasProveedorDao();
        
    }
    
   public List<LiderVo> listarLideres() throws SQLException{
        return liderDao.listar();        
    }
   
   
    public List<ProyectoVo> listarProyectos() throws SQLException{
        return proyectoDao.listar();        
    }
    
    public List<ComprasProveedorVo> listarComprasProveedor() throws SQLException{
        return comprasProveedorDao.listar();        
    }

    
}
