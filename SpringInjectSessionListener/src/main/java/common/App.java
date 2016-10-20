package common;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class App extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

        HttpSession session = httpServletRequest.getSession();
        session.setAttribute("url", "google.com");
        session.invalidate();


        PrintWriter out = httpServletResponse.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Spring Dependency Injection into Servlet Listenner</h1>");
        out.println("</body>");
        out.println("</html>");

    }
}
