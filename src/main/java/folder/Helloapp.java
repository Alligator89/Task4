package folder;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet("/hello")
public class Helloapp extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Application is working...");
    }
}
