package hello.servlet.basic.response;

import hello.servlet.basic.HelloData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;
import java.io.IOException;

@WebServlet(name = "responseHeaderServlet", urlPatterns = "/response-header")
public class ResponseHeaderServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        //status-line
        response.setStatus(HttpServletResponse.SC_OK);

        //response-headers
        response.setHeader("cache-control","no-cache, no-store, must-revalidate");
        response.setHeader("my-header","hello");


        response.getWriter().write("OK!!!");

    }
}
