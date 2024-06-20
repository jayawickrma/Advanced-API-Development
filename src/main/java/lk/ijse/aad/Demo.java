package lk.ijse.aad;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
@WebServlet(value = "/health")
public class Demo extends HttpServlet {
    public void init(ServletConfig config)  {
        System.out.println("server started");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("Nishan");
    }

    protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hhhah");
    }

    public void destroy(){
        System.out.println("bye byeee !!!!!!!");
    }
}
