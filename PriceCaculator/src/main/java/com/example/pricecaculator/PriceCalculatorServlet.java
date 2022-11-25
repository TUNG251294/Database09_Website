package com.example.pricecaculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "PriceCalculatorServlet", value = "/priceCalculator")
public class PriceCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,Double> priceList = new HashMap<>();
        priceList.put("Cocacola",7000.0);
        priceList.put("Pepsi",8500.0);
        priceList.put("Fanta",11000.0);
        priceList.put("7Up",9000.0);

        double discountPercent = 0.02;
        String productGet = request.getParameter("product");
        Double productPrice = priceList.get(productGet);
        Integer quantityGet = Integer.parseInt(request.getParameter("quantity"));
        double total = productPrice * quantityGet;
        double discount = total*discountPercent;
        double realPrice = total - discount;


        PrintWriter writer = response.getWriter();
        writer.println("<html><body>");
        writer.println("<p>Product: " + productGet + "<p>");
        writer.println("<p>Price of the product: " + productPrice + "<p>");
        writer.println("<p>Original Price: " + total + "</p>");
        writer.println("<p>Discount Price: " + discount + "</p>");
        writer.println("<p>Price to Pay: " + realPrice + "</p>");
        writer.println("<body><html>");
    }
}
