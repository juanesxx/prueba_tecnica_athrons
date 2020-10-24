/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.PaqueteDAO;
import dto.PaquetesDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gaurav
 */
public class Punto2Controller extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
                   PaqueteDAO paqueteDAO=new PaqueteDAO();
            PaquetesDTO paquete2=paqueteDAO.obtenerPorID(2);

        request.setAttribute("paquete2",paquete2);
        request.getRequestDispatcher("punto2.jsp").forward(request, response); 
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
//        String username= request.getParameter("username");
//        String password= request.getParameter("password");
//        String conPassword= request.getParameter("conPassword");
//        String oldPassword= request.getParameter("oldPassword");
//        String fname= request.getParameter("fname");
//        String lname= request.getParameter("lname");
//        String phone= request.getParameter("phone");
//        String city= request.getParameter("city");
//        String age= request.getParameter("age");
//
//        if(username.isEmpty() || fname.isEmpty() || lname.isEmpty() || phone.isEmpty() || city.isEmpty() || age.isEmpty() || password.isEmpty()|| oldPassword.isEmpty() || !password.equals(conPassword))
//        {
//            response.sendRedirect("updationFail.jsp"); 
//            return;//to avoid 'HTTP Status 500 - cannot call sendRedirect() after the response has been commited', as we have multiple sendRedirect on one page.
//        }
//        
//        UserDTO user=new UserDTO();
//        user.setUsername(username);
//        user.setPassword(password);
//        user.setOldPassword(oldPassword);
//        user.setFname(fname);
//        user.setLname(lname);
//        user.setPhone(phone);
//        user.setCity(city);
//        user.setAge(age);
//        
//        UpdationAuthenticator authenticator=new UpdationAuthenticator();
//        Boolean update=authenticator.isUpdate(user);
//        
//        if(update)
//        {
//            response.sendRedirect("home.jsp");
//        }
//        else
//        {
//            response.sendRedirect("updationFail.jsp");
//        }
    }
}
