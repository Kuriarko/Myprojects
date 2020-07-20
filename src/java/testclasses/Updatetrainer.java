
package testclasses;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.login.dao.FetchtrainerrecordDao;
import java.util.List;
import javax.servlet.RequestDispatcher;

public class Updatetrainer extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Updatetrainer</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Updatetrainer at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        int id=Integer.parseInt(request.getParameter("id"));
        
          FetchtrainerrecordDao ft=new FetchtrainerrecordDao();
           List<Trainerpojo> trainer=ft.getTrainerRecord(id);
           
              request.setAttribute("trainer",trainer);
              
              RequestDispatcher rd=request.getRequestDispatcher("updatetrainer.jsp");
              rd.forward(request, response);
         
        
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
