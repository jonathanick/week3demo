
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class helloWorldServlet extends HttpServlet {

   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      getServletContext().getRequestDispatcher("/WEB-INF/helloWorldForm.jsp")
              .forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstName=request.getParameter("firstName");
         String lastName=request.getParameter("lastName");
         
         request.setAttribute("firstName",firstName);
         request.setAttribute("lastName",lastName);
         
         getServletContext().getRequestDispatcher("/WEB-INF/sayHello.jsp")
                 .forward(request,response);
         
       
    }

}
