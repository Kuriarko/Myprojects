
package testclasses;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import com.login.dao.viewmemberDao;
import java.util.*;




public class viewmemberController extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet viewmemberController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet viewmemberController at " + request.getContextPath() + "</h1>");
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
          
          viewmemberDao vm=new viewmemberDao();
          List<Memberpojo> member=vm.getMemberList();
          
          request.setAttribute("member",member);
         
          
          RequestDispatcher rd=request.getRequestDispatcher("viewmember.jsp");
          rd.forward(request, response);
         
          
          
          
          
          
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
