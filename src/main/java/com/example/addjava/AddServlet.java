package com.example.addjava;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class AddServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World from Krishna from Webmvncmd002!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        int i = Integer.parseInt(request.getParameter("num1"));
        int k = Integer.parseInt(request.getParameter("num2"));
        int l = i + k;
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h1>" + l + "</h1>");
        out.println("</body></html>");



    }

    public void destroy() {
    }
}