package com.example.servlet;

import com.example.BMICalculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "BMIServlet", urlPatterns = {"/calculate"})
public class BMIServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get parameters from request
        String weightStr = request.getParameter("weight");
        String heightStr = request.getParameter("height");

        // Convert parameters to double
        double weight = Double.parseDouble(weightStr);
        double height = Double.parseDouble(heightStr);

        // Calculate BMI
        double bmi = BMICalculator.calculateBMI(weight, height);

        // Set response content type
        response.setContentType("text/html");

        // Return the result to the user
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>BMI Result</title><link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\"></head><body>");
        out.println("<div class=\"container\">");
        out.println("<h1>Your BMI is: " + bmi + "</h1>");
        out.println("<a href=\"index.html\">Go back</a>");
        out.println("</div>");
        out.println("</body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
