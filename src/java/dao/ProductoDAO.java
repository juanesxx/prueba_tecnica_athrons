/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBConnector;
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
public class ProductoDAO 
{
    public ProductosDTO obtenerPorID(int id)
    {
        ProductosDTO producto=null;
        try
        {
            Statement st=DBConnector.getStatement();
            String query="SELECT * FROM products WHERE id="+id; 
            ResultSet rs=st.executeQuery(query);
             
            if (rs.next())
            {
                producto=new ProductosDTO();
                producto.setId(rs.getInt(1));
                producto.setCode(rs.getString(2));
                producto.setDescription(rs.getString(3));
                producto.setWarehouseid(rs.getInt(4));
                producto.setValue(rs.getBigDecimal(5));

            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return producto;
    }
   
}
