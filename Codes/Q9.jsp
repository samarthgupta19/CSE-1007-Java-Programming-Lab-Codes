<!-- // Rename the filename.jsp to be same as public class name.

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samarth Gupta
 */
-->
<%-- 
    Document   : login_validation
    Created on : 20 May, 2021, 5:45:58 PM
    Author     : Samarth Gupta
--%>

        <%
            String log="";
            boolean check = false;
            if("POST".equals(request.getMethod())){
                log = request.getParameter("name");
                String pass = request.getParameter("pass");
                if(log.equals("samarth") && pass.equals("19bds0042")){
                       check = true; %>
                       <h1>LOGIN VALIDATION SUCCESSFUL!</h1>
               <% }
            } %>
            <% if(!check){ %>
            <h1>WRONG DETAILS GIVEN!</h1>
         <%   }
         %>
         