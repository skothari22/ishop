<%-- 
    Document   : index
    Created on : Sep 30, 2018, 11:14:40 AM
    Author     : shitalk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!--  <meta charset="utf-8">
-->
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>i-Shop Home Page</title>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="css/navbar.ishop.css"/>
        <link href="css/prodList.css" rel="stylesheet"/>
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
    </head>
    <body onload="showMessage()">
        <%@include file="jspviews/widgets/header.jsp" %>
        <%            String message = "";
            if (request.getParameter("signup") != null) {
                int signup = Integer.parseInt(request.getParameter("signup").toString());
                if (signup == -1) {
                    message = "already logged in, please logout to signup";
                }
                else if (signup ==1){
                    message = "User signed up successfully, please login!";
                }
                else if (signup ==-2){
                    message = "User signed up failed, please try again with valid information!";
                }
            }
            if (request.getParameter("login") != null) {
                int signup = Integer.parseInt(request.getParameter("login").toString());
                if (signup == 1) {
                    message = "Logged in successfully!";
                } else {
                    message = "Error In Logging In, Please try again!";
                }
            }
            if (message != "") {
        %>
        <script>
            function showMessage() {
                alert("<%=message%>");
            }
        </script>
        <%
            }
        %>
        <div class="container">

            <div class="col-lg-12">
                <center>
                    <%@include file="jspviews/widgets/searchWidget.jsp" %>
                </center>
            </div>
            <div class="col-lg-12">
                <h3> Top Recommendations:</h3>
                <center>
                    <%@include file="jspviews/widgets/topRecommendations.jsp" %>
                </center>
            </div>
            <div class="jumbotron">
                <center>
                    <h3>Now Shop with Intelligence!</h3>
                </center>
            </div>
            <div class="banner-image">  
                <center>
                    <img src="images/webmerce+machine+learning.jpg" width="100%" height="70%"/>
                </center>
            </div>
        </div>
    </body>
    <script type="text/javascript">
        var jumboHeight = $('.jumbotron').outerHeight();
        function parallax() {
            var scrolled = $(window).scrollTop();
            $('.bg').css('height', (jumboHeight - scrolled) + 'px');
        }

        $(window).scroll(function (e) {
            parallax();
        });
    </script>
</html>
