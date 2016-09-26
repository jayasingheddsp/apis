<%-- 
    Document   : index
    Created on : Sep 26, 2016, 6:22:10 PM
    Author     : ADP-006
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="hmap.Crew"%>
<%@page import="hmap.Flight"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="hmap.Passenger"%>
<%@page import="org.hibernate.Session"%>
<%@page import="hmap.NewHibernateUtil"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%Session hbsesion = NewHibernateUtil.getSessionFactory().openSession(); %>
        <%
                Criteria c1 = hbsesion.createCriteria(Crew.class);
                List<Crew> list = c1.list();
                for(Crew crew:list){
                    out.write(crew.getFirstName());
        }                
%>
                
    </body>
</html>
