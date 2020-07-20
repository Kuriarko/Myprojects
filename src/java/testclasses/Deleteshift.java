
package testclasses;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.login.dao.DeleteshiftDao;
import javax.servlet.RequestDispatcher;

public class Deleteshift extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Deleteshift</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Deleteshift at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     PrintWriter out = response.getWriter();
      int id=Integer.parseInt(request.getParameter("id"));
    DeleteshiftDao ds=new DeleteshiftDao();
    boolean status=ds.delShift(id);
    
     if(status==true)
     {
        
         RequestDispatcher rd=request.getRequestDispatcher("viewdeleteshiftController");
         rd.forward(request, response);
     }
     else
     {
         out.print("shift deletion unsuccessful");
     }
     
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
