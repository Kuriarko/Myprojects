
package testclasses;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.login.dao.ShiftBean;
import com.login.dao.ShiftDao;
import javax.servlet.RequestDispatcher;



/**
 *
 * @author DEBANJAN KURI
 */
public class shift extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet shift</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet shift at " + request.getContextPath() + "</h1>");
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
        
         String name=request.getParameter("name");
      String shift_title=request.getParameter("shift");
            String days=request.getParameter("days");

      
     
      ShiftBean mb=new ShiftBean(name,shift_title,days);
      ShiftDao md=new ShiftDao();
      String status=md.add_shift(mb);
      
        if(status.equals("success"))
      {
          RequestDispatcher rd=request.getRequestDispatcher("viewshiftController");
             rd.forward(request, response);
         
      }
      else
      {
          out.println("trainer addition failed");
        
      }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
