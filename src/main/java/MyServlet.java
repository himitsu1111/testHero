import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by secret on 10.04.2017.
 */
@WebServlet("/srv")
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();

        out.print("<html>");
        out.print("<head>");
        out.print("<title>Hello, its a servlet</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Servet work here</h1>");
        out.print("</body>");
        out.print("</html>");


    }


}
