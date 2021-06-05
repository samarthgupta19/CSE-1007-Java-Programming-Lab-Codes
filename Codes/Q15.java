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

// <!--index.html-->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Course Details</title>
</head>
<body>
<form action="course_servlet" method="post">
COUSECODE: <input type="text" name="ccode"><br>
COURSETITLE: <input type="text" name="ctitle"><br>
<input type="submit" value="submit">
</form>
</body>
</html>
//--------------------------------------------
//course_servlet.java 

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class course_servlet extends HttpServlet {
/**
* Processes requests for both HTTP <code>GET</code> and <code>POST</code>
* methods.
*
* @param request servlet request
* @param response servlet response
* @throws ServletException if a servlet-specific error occurs
* @throws IOException if an I/O error occurs
*/
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
response.setContentType("text/html;charset=UTF-8");
try (PrintWriter out = response.getWriter()) {
/* TODO output your page here. You may use following sample code. */
String cd = request.getParameter("ccode");
String ct = request.getParameter("ctitle");
if(cd.startsWith("CSE")){
out.print("<h1>"+cd+"</h1>");
out.print("<h1>"+ct+"</h1>");
}
else{
out.print("<h1>Invalid Details</h1>");
}
out.println("<!DOCTYPE html>");
out.println("<html>");
out.println("<head>");
out.println("<title></title>");
out.println("</head>");
out.println("<body>");
out.println("<h1></h1>");
out.println("</body>");
out.println("</html>");
}
}
// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
/**
* Handles the HTTP <code>GET</code> method.
*
* @param request servlet request
* @param response servlet response
* @throws ServletException if a servlet-specific error occurs
* @throws IOException if an I/O error occurs
*/
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
processRequest(request, response);
}
/**
* Handles the HTTP <code>POST</code> method.
*
* @param request servlet request
* @param response servlet response
* @throws ServletException if a servlet-specific error occurs
* @throws IOException if an I/O error occurs
*/
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
processRequest(request, response);
}
/**
* Returns a short description of the servlet.
*
* @return a String containing servlet description
*/
@Override
public String getServletInfo() {
return "Short description";
}// </editor-fold>
}