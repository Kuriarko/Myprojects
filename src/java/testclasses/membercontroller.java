
package testclasses;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.login.dao.mloginDao;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;


public class membercontroller extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet membercontroller</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet membercontroller at " + request.getContextPath() + "</h1>");
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
        String password=request.getParameter("password");
        
        mloginDao dao=new mloginDao();
        
         if(dao.checkCredentials(name,password))
        {
            HttpSession session=request.getSession();
            session.setAttribute("username", name);
            RequestDispatcher rd=request.getRequestDispatcher("welcome_member.jsp");
            rd.forward(request, response);
        }
        else
        {
            RequestDispatcher rd=request.getRequestDispatcher("m_relogin.jsp");
            rd.forward(request, response); 
        }
        
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
