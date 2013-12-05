package test;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/simple"})
public class SimpleServlet extends javax.servlet.http.HttpServlet {

    @Inject
    private MessageBean bean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        try(PrintWriter out = response.getWriter()) {
            response.setContentType("text/plain");
            out.println("Hi there, it's the simple servlet.");
            String message = bean != null ? bean.getMessage() : "NOTHING - it's null, so field injection has failed miserably!";
            out.println("My injected bean says: '" + message + "'");
        }
    }
}
