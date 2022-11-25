package com.example.dictionary;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@WebServlet(name = "TranslationServlet", value = "/translate")
public class TranslationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> dictionary = new HashMap<>();
        dictionary.put("ghế","chair");
        dictionary.put("bàn","desk");
        dictionary.put("bút","pen");
        dictionary.put("thước","rule");

//        xu ly loi tieng viet
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");

        String word = request.getParameter("search");

        PrintWriter writer = response.getWriter();
        String result = dictionary.get(word);

        writer.println("<html><body>");
        if(result != null){
            writer.println("<p>word: " + word + "</p>");
            writer.println("<p>result: " + result + "</p>");
        } else {
            writer.println("<p>not found</p>");
        }
        writer.println("<body><html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
