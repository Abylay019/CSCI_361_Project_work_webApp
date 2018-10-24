/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webapp;

/**
 *
 * @author Yerassyl
 */
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = { "/signin" })
public class SignIn extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public SignIn() {
        super();
    }

    /* protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    } */
    
    protected void doGet (HttpServletRequest request, HttpServletResponse response)
        throws ServletException , IOException {
        response.setContentType("text/jsp");
        response.sendRedirect("index.jsp");
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/jsp");
        PrintWriter out = response.getWriter();
        
        String username = request.getParameter("login-fname");
        String password = request.getParameter("login-lname");
        
        if(username.isEmpty() || password.isEmpty())
        {
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            out.println("<font color=red>Please fill all the fields</font>");
            rd.include(request, response);
        } 
        else
        {
            RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");
            rd.forward(request, response);
        }
    }
}