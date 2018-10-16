<%-- 
    Document   : register
    Created on : Oct 12, 2018, 11:20:22 AM
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
        <title>iShop Register</title>
        <link rel="stylesheet" type="text/css" href="css/loginStyle.css" />
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="css/navbar.ishop.css"/>
        <link href="css/prodList.css" rel="stylesheet"/>
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
    </head>
    <body>
        <%@include file="jspviews/widgets/header.jsp" %>
        <%      
            if (session.getAttribute("user") != null) {
                String site = new String("index.jsp?signup=-1");
                response.setStatus(response.SC_MOVED_TEMPORARILY);
                response.setHeader("Location", site);
            }
        %>
        <div class="container">
            <section id="content">
                <form action="registerServlet" method="post">
                    <h1>iShop Signup</h1>
                    <div>
                        <input type="text" placeholder="Email" required="" id="email" name="email" />
                    </div>
                    <div>
                        <input type="password" placeholder="Password" required="" id="password"  name="password"/>
                    </div>
                    <div>
                        <input type="text" placeholder="Firstname" required="" id="firstname" name="firstname"/>
                    </div>
                    <div>
                        <input type="text" placeholder="Lastname" required="" id="lastname" name="lastname" />
                    </div>
                    <div>
                        <input type="text" placeholder="Primary Contact No" required="" id="pcontact" name="pcontact" />
                    </div>
                    <div>
                        <input type="text" placeholder="Secondary Contact No" required="" id="scontact" name="scontact" />
                    </div>
                    <div>
                        <input type="text" placeholder="Address" required="" id="address" name="address"/>
                    </div>

                    <div>
                        <input type="submit" value="Sign Up" />
                        <a href="login.jsp">Login</a>
                    </div>
                </form><!-- form -->

            </section><!-- content -->
        </div><!-- container -->
    </body>
</html>