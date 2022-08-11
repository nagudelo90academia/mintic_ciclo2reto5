/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.utp.ciclo2reto5.model.dao;

/**
 *
 * @author NORBERTO AGUDELO
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.edu.utp.ciclo2reto5.model.vo.ProyectoVo;
import com.edu.utp.ciclo2reto5.util.JDBCUtilities;

public class ProyectoDao {
    public List<ProyectoVo> listar() throws SQLException {
        ArrayList<ProyectoVo> respuesta = new ArrayList<ProyectoVo>();
        Connection conn = JDBCUtilities.getConnection();
        Statement stmt = null;
        ResultSet rset = null;
        String consulta = "Select P.ID_Proyecto , P.Constructora , P.Numero_Habitaciones , P.Ciudad , P.Clasificacion" 
                    + " FROM Proyecto P"
                    + " Where P.Clasificacion IN ('Casa Campestre') And P.Ciudad  IN ('Santa Marta','Cartagena','Barranquilla')";
                    //+ " Order BY P.Ciudad"; 
        
        try {
            stmt = conn.createStatement();
            rset = stmt.executeQuery(consulta);       
            while (rset.next()) {   //
                ProyectoVo vo = new ProyectoVo();
                vo.setIdProyecto(rset.getInt("ID_Proyecto"));
                vo.setConstructora(rset.getString("Constructora"));
                vo.setNumeroHabitaciones(rset.getInt("Numero_Habitaciones"));
                vo.setCiudad(rset.getString("Ciudad"));
                vo.setClasificacion(rset.getString("Clasificacion"));
                respuesta.add(vo);
            }   
        } finally {
            if (rset != null) {
                rset.close();                
            }
            if (stmt != null) {
                stmt.close();                
            }
            if (conn != null) {
                conn.close();                
            }
        }
        return respuesta;        
    }    
}    
