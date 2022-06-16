package hello.servlet.basic.request;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.http.HttpRequest;

@WebServlet(name ="requestGetQueryParameter", urlPatterns = "/requestGetQueryParameter")
public class RequestGetQueryParameter extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String age = request.getParameter("age");
        String[] sames = request.getParameterValues("same");

        for(String same : sames){
            response.getWriter().write(same + " : ");
        }
        response.getWriter().write(username + " : " + age);
    }

}
