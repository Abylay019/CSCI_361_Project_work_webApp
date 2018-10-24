package webapp;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = { "/signup" })
public class SignUp extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public SignUp() {
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
        
        String first_name = request.getParameter("signup-fname");
        String second_name = request.getParameter("signup-lname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirm_password = request.getParameter("password_2");
        
        if(first_name.isEmpty()||second_name.isEmpty()||email.isEmpty()||password.isEmpty()||confirm_password.isEmpty())
        {
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            out.println("<div> Please fill all the fields </div>");
            rd.forward(request, response);
        } 
        else
        {
            System.out.println("first_name: " + first_name + " " + " || second_name: " + second_name);
            if(!password.equals(confirm_password)){
                RequestDispatcher rd = request.getRequestDispatcher("signup.jsp");
                out.println("<font color=red>Please, confirm password</font>");
                rd.include(request, response);
            } else{
                RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");
                rd.forward(request, response);
            }
        }
    }
}