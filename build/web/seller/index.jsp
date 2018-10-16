<%-- 
    Document   : index
    Created on : Oct 16, 2018, 10:37:11 AM
    Author     : shitalk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>iShop: Seller Dashboard</title>
        <link rel="stylesheet" href="../bootstrap/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="../css/navbar.ishop.css"/>
        <link href="../css/prodList.css" rel="stylesheet"/>
        <script src="../js/jquery-3.3.1.min.js"></script>
        <script src="../bootstrap/js/bootstrap.min.js"></script>
    </head>
    <body>
         <%@include file="jspviews/header.jsp" %>
         <div class="container">
             <div class="col-lg-12"><h2>Manage your products</h2></div>
             <%@include file="jspviews/productsGrid.jsp" %>
         </div>
    </body>
</html>
