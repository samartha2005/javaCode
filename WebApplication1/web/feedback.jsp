<%-- 
    Document   : feedback
    Created on : Aug 9, 2024, 12:09:50 AM
    Author     : Shrinivas
--%>

<%@page import="javax.persistence.*,java.util.*,p1.Student" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%! 
    private EntityManagerFactory emf;
private EntityManager em;
private EntityTransaction et;
List<Student> st;
%>
<%
    emf=Persistence.createEntityManagerFactory("WebApplication1PU2");
    em=emf.createEntityManager();
    String  name,message;
    name=request.getParameter("t1");
    message=request.getParameter("t2");
    Student st=new Student();
    st.setName(name);
    st.setMessage(message);
    et=em.getTransaction();
    et.begin();
    em.persist(st);
    et.commit();
    
%>
