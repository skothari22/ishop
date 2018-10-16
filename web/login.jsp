<%-- 
    Document   : login
    Created on : Oct 12, 2018, 11:07:25 AM
    Author     : shitalk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="ie6 ielt8"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="ie7 ielt8"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="ie8"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--> <html lang="en"> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <title>iShop Login</title>
        <link rel="stylesheet" type="text/css" href="css/loginStyle.css" />
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="css/navbar.ishop.css"/>
        <link href="css/prodList.css" rel="stylesheet"/>
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
    </head>
    <body>
        <%@include file="jspviews/widgets/header.jsp" %>
        <div class="container">
            <section id="content">
                <form action="LoginServlet" method="post">
                    <h1>Login Form</h1>
                    <div>
                        <input type="text" placeholder="Username" required="" id="username" name="username" />
                    </div>
                    <div>
                        <input type="password" placeholder="Password" required="" id="password" name="password" />
                    </div>
                    <div>
                        <input type="submit" value="Log in" />
                        <a href="#">Lost your password?</a>
                        <a href="register.jsp">Register</a>
                    </div>
                </form><!-- form -->

            </section><!-- content -->
        </div><!-- container -->
    </body>
</html>