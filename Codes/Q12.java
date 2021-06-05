// Rename the filename.java to be same as public class name.

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samarth Gupta
 */

// index.html
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="page1.java"></form>
    </body>
</html>

------------------------------------------------------------
// page1.java

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet (name="page1",urlPatterns={"/page1"})
public class page1 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, 	HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            HttpSession session = request.getSession();
            int total1 = 0;
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<body>");
            out.println("<h1>19BDS0042 SHOPPING MALL</h1>");
            out.println("<h2>1ST PAGE</h2>");
            out.println("<h3>SELECT PRODUCTS TO BUY :</h3>");
            
            
    out.println("<form method='post'>"
    +"<input type='checkbox' name='product' value='20'>Notebook - 20 Rs<br>"
    +"<input type='checkbox' name='product' value='30'>Bottle - 30 Rs<br>"
    +"<input type='checkbox' name='product' value='40'>Mask - 40 Rs<br>"
    +"<input type='checkbox' name='product' value='50'>Pillow - 50 Rs<br>"
    +"<input type='checkbox' name='product' value='60'>Sanitizer - 60 Rs<br>"
    +"<input type='checkbox' name='product' value='70'>Detergent - 70 Rs<br>"
    +"<input type='checkbox' name='product' value='80'>Powder - 80 Rs<br><br>"
    +"<input type='submit' value='Submit'><input type='Reset'>"
    +"</form>");
    out.println("</body>");
    out.println("</html>");
            
            
            if(request.getMethod().equals("POST")){
                String[] s1 = request.getParameterValues("prod");
                for (String s11 : s1) {
                    total1 += Integer.parseInt(s11);
                    
                }
            
                session.setAttribute("total", total1);
                out.println(session.getAttribute("total").toString());
                response.sendRedirect("page2");
            }  
        }
        
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
-------------------------------------------------------------
// page2.java


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet (name="page2",urlPatterns={"/page2"})
public class page2 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            HttpSession session = request.getSession(false);
            int t1 = Integer.parseInt(session.getAttribute("total").toString());
           
            int total2 = 0;
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<body>");
            out.println("<h1>19BDS0042 SHOPPING MALL</h1>");
            out.println("<h2>2ND PAGE</h2>");
            out.println("<h3>SELECT PRODUCTS TO BUY :</h3>");
            out.println("<form method='post'>"
    +"<input type='checkbox' name='product' value='90'>Chair - 90 Rs<br>"
    +"<input type='checkbox' name='product' value='100'>Cup - 100 Rs<br>"
    +"<input type='checkbox' name='product' value='110'>Remote - 110 Rs<br>"
    +"<input type='checkbox' name='product' value='120'>Shampoo - 120 Rs<br>"
    +"<input type='checkbox' name='product' value='130'>Mirror - 130 Rs<br>"
    +"<input type='checkbox' name='product' value='140'>Clock - 140 Rs<br>"
    +"<input type='checkbox' name='product' value='150'>Slipper - 150 Rs<br><br>"
    +"<input type='submit' value='Submit'><input type='Reset'>"
    + "</form>");
    out.println("</body>");
    out.println("</html>");
            
            if(request.getMethod().equals("POST")){
                String[] s1 = request.getParameterValues("prod");
                for (String s11 : s1) {
                    total2 += Integer.parseInt(s11);
                    
                }
                total2 += t1;
                session.setAttribute("total", total2);
                response.sendRedirect("page3");
            }
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
--------------------------------------------------------------
// page3.java


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet (name="page3",urlPatterns={"/page3"})
public class page3 extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            
            HttpSession session = request.getSession(false);
            int final_bill = Integer.parseInt(session.getAttribute("total").toString());
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<body>");
            out.println("<h1>19BDS0042 SHOPPING MALL</h1>");
            out.println("<h2>BILL</h2>");
            out.println("<h1>GRAND TOTAL : "+final_bill+" RS /-</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
-------------------------------------------------------------