package lk.ijse.aad;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(value = "/assignment")
public class inClassAssignment extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int pn =40;
        int fn = Integer.parseInt(req.getParameter("fn"));
        int sn =Integer.parseInt(req.getParameter("sn"));

        PrintWriter writer =resp.getWriter();

        if ((fn+pn)%2==0){
            writer.println("even number");
        }else{
            writer.println("odd number");
        }

        if ((sn+pn)%2==0) {
            writer.println("second number is even");
        }
        else{
            writer.println("second number is odd");
        }
    }
 }

