/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBConnector;
import dto.PaquetesDTO;
import dto.ProductosDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gaurav
 */
public class PaqueteDAO 
{
    public PaquetesDTO obtenerPorID(int id)
    {
        PaquetesDTO paquete=null;
        try
        {
            Statement st=DBConnector.getStatement();
            String query="SELECT * FROM packages WHERE id="+id; 
            ResultSet rs=st.executeQuery(query);
             
            if (rs.next())
            {
                paquete=new PaquetesDTO();
                paquete.setId(rs.getInt(1));
                paquete.setCode(rs.getString(2));
                paquete.setDescription(rs.getString(3));
                paquete.setProductid(rs.getInt(4));
                paquete.setAmount(rs.getInt(5));
                paquete.setValue(rs.getBigDecimal(6));

            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return paquete;
    }
   
}
