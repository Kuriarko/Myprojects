
package testclasses;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.login.dao.EditshiftDao;
import javax.servlet.RequestDispatcher;



public class Editshift extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Editshift</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Editshift at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
               int id=Integer.parseInt(request.getParameter("id"));
                String name=request.getParameter("name");
        String shift_title=request.getParameter("shift");
                String days=request.getParameter("days");

        
         Shiftpojo shift =new Shiftpojo(id,name,shift_title,days);
         EditshiftDao ed=new EditshiftDao();
        boolean status=ed.updateShift(shift);
         if(status==true)
        {
             RequestDispatcher rd=request.getRequestDispatcher("viewshiftController");
             rd.forward(request, response);
         
        }
        else
        {
            out.print("Trainer update failed");
        }

    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
