/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import Exceptions.LoginSampleException;
import Model.Customer;
import Model.User;
import FunctionLayer.SVG;

import java.io.IOException;
import java.util.ArrayList;
import javax.activation.MimeType;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**

 @author kasper
 */
@WebServlet( name = "FrontController", urlPatterns = { "/FrontController" } )
public class FrontController extends HttpServlet {


    /**
     Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     methods.

     @param request servlet request
     @param response servlet response
     @throws ServletException if a servlet-specific error occurs
     @throws IOException if an I/O error occurs
     */
    protected void processRequest( HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException {
        try {
            Command action = Command.from( request );
            String view = action.execute( request, response );
            request.getRequestDispatcher( "/WEB-INF/" + view + ".jsp" ).forward( request, response );
        } catch ( LoginSampleException ex ) {
            request.setAttribute( "error", ex.getMessage() );
            request.getRequestDispatcher( "fejl.jsp" ).forward( request, response );
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     Handles the HTTP <code>GET</code> method.

     @param request servlet request
     @param response servlet response
     @throws ServletException if a servlet-specific error occurs
     @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet( HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException {

        String destination = "index.jsp";

        String source = request.getParameter("source");
        HttpSession session = request.getSession();


        switch(source){

            case "profil":
                destination = "/WEB-INF/brugerside.jsp";
                break;

            case "logout":
                session.removeAttribute("login");

                destination = "/index.jsp";
                break;

        }

        request.getRequestDispatcher(destination).forward(request,response);
    }

    /**
     Handles the HTTP <code>POST</code> method.

     @param request servlet request
     @param response servlet response
     @throws ServletException if a servlet-specific error occurs
     @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost( HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException {


        String destination = "index.jsp";
        String source = request.getParameter("source");

        HttpSession session = request.getSession();


        ArrayList<Customer> customer;
        customer = (ArrayList<Customer>) session.getAttribute("login");
        if(customer == null){
            customer = new ArrayList<>();
        }


        switch(source){

            case "login":

                ArrayList<Customer> customerList = FacadeLayer.KundeFacade.getKunderList();

                String email = request.getParameter("email");
                String password = request.getParameter("password");


                for (int i = 0; i < customerList.size(); i++) {
                    if(customerList.get(i).getEmail().equals(email) && customerList.get(i).getPassword().equals(password)){

                        int customer_id = customerList.get(i).getCustomer_id();
                        String name = customerList.get(i).getName();
                        String phone = customerList.get(i).getPhone();
                        String address = customerList.get(i).getAdress();
                        String zipcode = customerList.get(i).getZipcode();
                        String city = customerList.get(i).getCity();

                        customer.add(new Customer(customer_id, name, email, password, phone, address, zipcode, city));
                        session.setAttribute("login", customer);
                    }

                }
                destination = "/WEB-INF/brugerside.jsp";
                break;

            case "generate_SVG":
                String height = request.getParameter("height");
                String width = request.getParameter("width");
                String length = request.getParameter("length");
                SVG svg = new SVG();

                int height_int = Integer.parseInt(height);
                int width_int = Integer.parseInt(width);
                int length_int = Integer.parseInt(length);

                session.setAttribute("svg", svg.createSVG(400,500,300));

                destination = "printDrawing.jsp";
                break;
        }




        request.getRequestDispatcher(destination).forward(request,response);

//        processRequest( request, response );

    }

    /**
     Returns a short description of the servlet.

     @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
