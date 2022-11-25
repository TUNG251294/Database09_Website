package com.example.chuyendoitientetest;

import java.io.*;
import java.text.DecimalFormat;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "CurrencyServlet", value = "/chuyendoitiente")
public class CurrencyServlet extends HttpServlet {
    private String message;

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        float rate = Float.parseFloat(request.getParameter("rate"));
        float usd = Float.parseFloat(request.getParameter("usd"));
        float vnd = Float.parseFloat(request.getParameter("vnd"));
        float toVND = usd*rate;
        float toUSD = vnd/rate;

        DecimalFormat df = new DecimalFormat("0.00");

        PrintWriter writer = response.getWriter();
        writer.println("<html><body>");
        writer.println("<p>Rate: " + rate + "<p>");
        writer.println("<p>USD: " + usd + "<p>");
        writer.println("<p>toVND: " + toVND + "<p>");
        writer.println("<p>VND: " + vnd + "<p>");
        writer.println("<p>toUSD: " + df.format(toUSD) + "<p>");
        writer.println("<body><html>");
    }

    public void destroy() {
    }
}