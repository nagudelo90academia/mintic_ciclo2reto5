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

import com.edu.utp.ciclo2reto5.model.vo.ComprasProveedorVo;
import com.edu.utp.ciclo2reto5.util.JDBCUtilities;

public class ComprasProveedorDao {
    public List<ComprasProveedorVo> listar() throws SQLException {
        ArrayList<ComprasProveedorVo> respuesta = new ArrayList<ComprasProveedorVo>();
        Connection conn = JDBCUtilities.getConnection();
        Statement stmt = null;
        ResultSet rset = null;
        String consulta = "Select C.ID_Compra ,	C.Proveedor , P.Constructora , P.Banco_Vinculado , P.Ciudad" 
                            + " From Proyecto P"
                            + " Join Compra C On (P.ID_Proyecto = C.ID_Proyecto)"
                            + " Where C.Proveedor = 'Homecenter' and P.Ciudad = 'Salento'" ; 
        
        try {
            stmt = conn.createStatement();
            rset = stmt.executeQuery(consulta);       
            while (rset.next()) {   //
                ComprasProveedorVo vo = new ComprasProveedorVo();
                vo.setIdCompra(rset.getInt("ID_Compra"));
                vo.setProveedor(rset.getString("Proveedor"));
                vo.setConstructora(rset.getString("Constructora"));
                vo.setBancoVinculado(rset.getString("Banco_Vinculado"));
                vo.setCiudad(rset.getString("Ciudad"));
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
