
package testclasses;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.login.dao.EditmemberDao;
import javax.servlet.RequestDispatcher;

public class Editmember extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Editmember</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Editmember at " + request.getContextPath() + "</h1>");
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
        String phone=request.getParameter("phone");
        String email= request.getParameter("email");
         String password=request.getParameter("password");
         
                 Memberpojo member =new Memberpojo(id,name,phone,email,password);
                         EditmemberDao ed=new EditmemberDao();
                                 boolean status=ed.updateMember(member);
                                 
                                 if(status==true)
        {
             RequestDispatcher rd=request.getRequestDispatcher("viewmemberController");
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
