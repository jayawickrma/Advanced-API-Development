package lk.ijse.aad;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name ="/student")
public class student extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("nishan");
        System.out.println("context path: "+req.getContextPath());
        System.out.println("servelet path: "+req.getServletPath());
        System.out.println("path info: "+req.getPathInfo());
        System.out.println("path trancelated: "+req.getPathTranslated());
        System.out.println("Query String: "+req.getQueryString());
        System.out.println("request URI: "+req.getRequestURI());
        System.out.println("request URL: "+req.getRequestURL());
        System.out.println("get prptocol: "+req.getProtocol());
        System.out.println("get scheema: "+req.getScheme());
        System.out.println(req.getParameter("name"));
    }
}
