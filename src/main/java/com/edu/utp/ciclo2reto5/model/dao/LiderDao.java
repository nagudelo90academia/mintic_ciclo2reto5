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

import com.edu.utp.ciclo2reto5.model.vo.LiderVo;
import com.edu.utp.ciclo2reto5.util.JDBCUtilities;

public class LiderDao {
    public List<LiderVo> listar() throws SQLException {
        ArrayList<LiderVo> respuesta = new ArrayList<LiderVo>();
        Connection conn = JDBCUtilities.getConnection();
        Statement stmt = null;
        ResultSet rset = null;
        String consulta = "Select L.ID_Lider , L.Nombre , L.Primer_Apellido , Ciudad_Residencia" 
                    + " From Lider L"
                    + " Order By L.Ciudad_Residencia ASC"; 
        try {
            stmt = conn.createStatement();
            rset = stmt.executeQuery(consulta);       
            while (rset.next()) {   //
                LiderVo vo = new LiderVo();
                vo.setIdLider(rset.getInt("ID_Lider"));
                vo.setNombre(rset.getString("Nombre"));
                vo.setPrimerApellido(rset.getString("Primer_Apellido"));
                vo.setCiudadResidencia(rset.getString("Ciudad_Residencia"));
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
