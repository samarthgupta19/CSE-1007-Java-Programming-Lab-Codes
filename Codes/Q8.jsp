<!--
// Rename the filename.jsp to be same as public class name.

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samarth Gupta
 */ -->
<%-- 
    Document   : States
    Created on : 28 Apr, 2021, 9:29:15 PM
    Author     : 19BDS0042 Samarth Gupta
--%>
<%@page import="java.sql.Connection"%>
<%@page import="java.beans.Statement"%>
<%@page import="java.sql.DriverManager"%>
        <%
         final String JDBC_DRIVER="com.mysql.jdbc.Driver";
         final String DB_URL="jdbc:mysql://localhost/test"; 
         Connection conn=null; 
         Statement stmt=null; 
         try { Class.forName("com.mysql.jdbc.Driver"); 
         conn=DriverManager.getConnection(DB_URL); 

//String sql="create table states(name varchar(10),capital varchar(10));"; 
//String sql_1 = "insert into states values('TamilNadu','Chennai')"; 
//String sql_2 = "insert into states values('Jharkhand','Ranchi')"; 
//String sql_3 = "insert into states values('Assam','Guwahati')";
//String sql_4 = "insert into states values('Nagaland','Jaipur')";

//String sql_5 = "update states set name='Rajasthan' where capital='Jaipur'";

//String sql_6 = "delete from states where name='Rajasthan'";

//stmt=conn.createStatement(); 
//stmt.executeUpdate(sql);
//stmt.executeUpdate(sql_1);
//stmt.executeUpdate(sql_2);
//stmt.executeUpdate(sql_3);
//stmt.executeUpdate(sql_4);
//stmt.executeUpdate(sql_5);
//stmt.executeUpdate(sql_6); 
         } 
catch(Exception e) 
{ 
    out.print("Error: Record insertion failed." + e);
}
%>
