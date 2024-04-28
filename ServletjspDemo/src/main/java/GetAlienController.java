
import com.alien.dao.AlienDAO;
import com.kabin.learning.model.Alien;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "GetAlienController", value = "/GetAlienController")
public class GetAlienController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

   int id  = Integer.parseInt(request.getParameter("id"));

        AlienDAO dao = new AlienDAO();

        Alien a1 = dao.getAlien(id);

        request.setAttribute("label",a1);

        RequestDispatcher rd = request.getRequestDispatcher("showAlien.jsp");

        rd.forward(request, response);

        //we can also use redirect as and we have to use session for redirect

//        HttpSession session = request.getSession();
//        session.setAttribute("label",a1);
//
//        response.sendRedirect("showAlien.jsp");




    }


}