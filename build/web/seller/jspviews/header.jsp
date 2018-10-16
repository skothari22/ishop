<%-- 
    Document   : header
    Created on : Oct 16, 2018, 10:37:31 AM
    Author     : shitalk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="index.jsp"><img src="../images/logo.png"/> </a>
        </div>
                            <ul class="nav navbar-nav">
                                <!--<li class="active"><a href="#">Home</a></li>-->
                                <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Products<span class="caret"></span></a>
                                    <ul class="dropdown-menu">
                                        <li><a href="#">Add New Product</a></li>
                                        <li><a href="#">Selling History</a></li>
                                        <!--<li><a href="#">Page 1-3</a></li>-->
                                    </ul>
                                </li>
                                <li><a href="#">Orders</a></li>
                                <!--<li><a href="#"></a></li>-->
                            </ul>-->
        <%
            if(session.getValue("user")==null){
        %>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="../register.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
            <li><a href="../login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        </ul>    
        <%}else{
        %>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="#"><span class="glyphicon glyphicon-user"><%=session.getValue("user")%></span></a></li>
            <li><a href="../index.jsp"><span class="glyphicon glyphicon-user">Buyer Dashboard</span></a></li>
            <li><a href="../LogoutServlet"><span class="glyphicon glyphicon-user">Logout</span></a></li>
        </ul>
        <%
        }
        %>
    </div>

</nav>
