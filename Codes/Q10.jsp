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
 */
-->

<!--Quiz_1.jsp-->

<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page-1</title>
    </head>
    <body>
        <h1>ONLINE MCQ QUIZ</h1>
        <%
            int n = (int)(Math.random()*(3)+0); 
            System.out.println(n);
            String q="";
            int ca=0;
            final String JDBC_DRIVER="com.mysql.jdbc.Driver";
            final String DB_URL="jdbc:mysql://localhost/test";

            final String USER="admin";
            final String PASS="admin";

            Connection conn=null;
            PreparedStatement stmt=null;

            try
            {
                Class.forName("com.mysql.jdbc.Driver");

                conn=DriverManager.getConnection(DB_URL,USER,PASS);

                String sql="select * from questions where id =?;";

                stmt=conn.prepareStatement(sql);

                stmt.setInt(1, n+1);

                ResultSet rs = stmt.executeQuery();

                while(rs.next()){

                    q = rs.getString(2);
                    ca = rs.getInt(3);
                }

            }catch(Exception e)
            {
                out.print("Error: Record insertion failed." + e);
            }
       %>
       <form action="quiz_2.jsp?c=<%=ca%>" method="post">
           <h2>Q1. <%=q%>?</h2>
           <input type="radio" value="1" name="q-btn">Jaipur<br>
           <input type="radio" value="2" name="q-btn">Shimla<br>
           <input type="radio" value="3" name="q-btn">Bhopal<br>
           <input type="radio" value="4" name="q-btn">Ranchi<br><br>
           <input type="submit" value="Next Question">
       </form>
    </body>
</html>

<!--Quiz_2.jsp-->

<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page-2</title>
    </head>
    <body>
        <%
            int score = 0;
            String v = request.getParameter("q-btn");
            String c = request.getParameter("c");
            if(v.equals(c)){
                score+=1;
            }
            int n = (int)(Math.random()*(3)+0); 
            System.out.println(n);
            String q="";
            int ca=0;
            final String JDBC_DRIVER="com.mysql.jdbc.Driver";
            final String DB_URL="jdbc:mysql://localhost/test";

            final String USER="admin";
            final String PASS="admin";

            Connection conn=null;
            PreparedStatement stmt=null;

            try
            {
                Class.forName("com.mysql.jdbc.Driver");

                conn=DriverManager.getConnection(DB_URL,USER,PASS);

                String sql="select * from questions where id =?;";

                stmt=conn.prepareStatement(sql);

                stmt.setInt(1, n+1);

                ResultSet rs = stmt.executeQuery();

                while(rs.next()){

                    q = rs.getString(2);
                    ca = rs.getInt(3);
                }

            }catch(Exception e)
            {
                out.print("Error: Record insertion failed." + e);
            }
       %>
       
       <form action="final_quiz.jsp?c1=<%=ca%>&sc=<%=score%>" method="post">
           <h2>Q2. <%=q%>?</h2>
           <input type="radio" value="1" name="q-btn">Cricket<br>
           <input type="radio" value="2" name="q-btn">BasketBall<br>
           <input type="radio" value="3" name="q-btn">Football<br>
           <input type="radio" value="4" name="q-btn">Hockey<br><br>
           <input type="submit" value="Submit">
       </form>
    </body>
</html>

<!--final_quiz.jsp-->

<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page-2</title>
    </head>
    <body>
        <%
            int score = 0;
            String v = request.getParameter("q-btn");
            String c = request.getParameter("c");
            if(v.equals(c)){
                score+=1;
            }
            int n = (int)(Math.random()*(3)+0); 
            System.out.println(n);
            String q="";
            int ca=0;
            final String JDBC_DRIVER="com.mysql.jdbc.Driver";
            final String DB_URL="jdbc:mysql://localhost/test";

            final String USER="admin";
            final String PASS="admin";

            Connection conn=null;
            PreparedStatement stmt=null;

            try
            {
                Class.forName("com.mysql.jdbc.Driver");

                conn=DriverManager.getConnection(DB_URL,USER,PASS);

                String sql="select * from questions where id =?;";

                stmt=conn.prepareStatement(sql);

                stmt.setInt(1, n+1);

                ResultSet rs = stmt.executeQuery();

                while(rs.next()){

                    q = rs.getString(2);
                    ca = rs.getInt(3);
                }

            }catch(Exception e)
            {
                out.print("Error: Record insertion failed." + e);
            }
       %>
       
       <form action="final_quiz.jsp?c1=<%=ca%>&sc=<%=score%>" method="post">
           <h2>Q2. <%=q%>?</h2>
           <input type="radio" value="1" name="q-btn">Cricket<br>
           <input type="radio" value="2" name="q-btn">BasketBall<br>
           <input type="radio" value="3" name="q-btn">Football<br>
           <input type="radio" value="4" name="q-btn">Hockey<br><br>
           <input type="submit" value="Submit">
       </form>
    </body>
</html>

