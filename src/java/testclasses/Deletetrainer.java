
package testclasses;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import com.login.dao.DeletetrainerDao;

public class Deletetrainer extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Deletetrainer</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Deletetrainer at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      PrintWriter out = response.getWriter();
       
     int id=Integer.parseInt(request.getParameter("id"));
     
     DeletetrainerDao dt =new DeletetrainerDao();
     
     boolean status=dt.delTrainer(id);
    // out.print(status);
     
     if(status==true)
     {
        
         RequestDispatcher rd=request.getRequestDispatcher("viewdeletetrainerController");
         rd.forward(request, response);
     }
     else
     {
         out.print("trainer deletion unsuccessful");
     }
     
   
       
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
        
    }// </editor-fold>

}
