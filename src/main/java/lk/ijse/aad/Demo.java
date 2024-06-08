package lk.ijse.aad;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(value = "/health")
public class Demo extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("Nishan");
    }

    }
