
package testclasses;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.login.dao.trainerDao;
import javax.servlet.RequestDispatcher;
import testclasses.trainerBean;


public class trainer extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet trainer</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet trainer at " + request.getContextPath() + "</h1>");
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
      String phone=request.getParameter("phone");
      String email=request.getParameter("email");
      String password=request.getParameter("password");
     
      trainerBean mb=new trainerBean(name,phone,email,password);
      trainerDao md=new trainerDao();
      String status=md.add_trainer(mb);
      
        if(status.equals("success"))
      {
          RequestDispatcher rd=request.getRequestDispatcher("viewtrainerController");
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
