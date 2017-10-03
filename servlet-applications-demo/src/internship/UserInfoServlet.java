package internship;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/UserInfoServlet")
public class UserInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.setContentType("text/html");

       PrintWriter out = response.getWriter();

       String firstName = request.getParameter("firstName");
       String lastName = request.getParameter("lastName");

       out.println("<h3>Reading QueryString data using 'String getParameter(String name)'" +
               " method : </h3>");
       out.println("<div>");
       out.println("<p>First Nanme : " + firstName + "</p>");
       out.println("<p>Last Name : " + lastName + "</p>");
       out.println("</div>");

       out.println("<h3>Rading QueryString data using 'Enumeration getParameterNames() 'method</h3>");
       Enumeration<String> paramNames = request.getParameterNames();
       out.println("<div>");
       while (paramNames.hasMoreElements()) {
           String paramName = paramNames.nextElement();
           String paramValue = request.getParameter(paramName);
           out.println("<p>" + paramName + " : " + paramValue + "</p>");
       }
       out.println("</div");
    }
}
