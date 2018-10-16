package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/jspviews/widgets/header.jsp");
    _jspx_dependants.add("/jspviews/widgets/searchWidget.jsp");
    _jspx_dependants.add("/jspviews/widgets/topRecommendations.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--  <meta charset=\"utf-8\">\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>i-Shop Home Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/navbar.ishop.css\"/>\n");
      out.write("        <link href=\"css/prodList.css\" rel=\"stylesheet\"/>\n");
      out.write("        <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"showMessage()\">\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.jsp\"><img src=\"images/logo.png\"/> </a>\n");
      out.write("        </div>\n");
      out.write("        <!--                    <ul class=\"nav navbar-nav\">\n");
      out.write("                                <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("                                <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Page 1 <span class=\"caret\"></span></a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        <li><a href=\"#\">Page 1-1</a></li>\n");
      out.write("                                        <li><a href=\"#\">Page 1-2</a></li>\n");
      out.write("                                        <li><a href=\"#\">Page 1-3</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"#\">Page 2</a></li>\n");
      out.write("                                <li><a href=\"#\">Page 3</a></li>\n");
      out.write("                            </ul>-->\n");
      out.write("        ");

            if(session.getValue("user")==null){
        
      out.write("\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("            <li><a href=\"register.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("            <li><a href=\"login.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("        </ul>    \n");
      out.write("        ");
}else{
        
      out.write("\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("            <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\">");
      out.print(session.getValue("user"));
      out.write("</span></a></li>\n");
      out.write("            <li><a href=\"LogoutServlet\"><span class=\"glyphicon glyphicon-user\">Logout</span></a></li>\n");
      out.write("        </ul>\n");
      out.write("        ");

        }
        
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("        ");
            String message = "";
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
        
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function showMessage() {\n");
      out.write("                alert(\"");
      out.print(message);
      out.write("\");\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("                <center>\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"search-widget\">\n");
      out.write("    <input type=\"text\" name=\"search\" placeholder=\"Click to Search..\">\n");
      out.write("</div>");
      out.write("\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("                <h3> Top Recommendations:</h3>\n");
      out.write("                <center>\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\" style=\"margin: 20px\">\n");
      out.write("    <div class=\"col-12 col-sm-3\">\n");
      out.write("        <div class=\"card bg-light mb-3\">\n");
      out.write("            <div class=\"card-header bg-primary text-white text-uppercase\"><i class=\"fa fa-list\"></i> Categories</div>\n");
      out.write("            <ul class=\"list-group category_block\">\n");
      out.write("                <li class=\"list-group-item\"><a href=\"category.html\">Furniture</a></li>\n");
      out.write("                <li class=\"list-group-item\"><a href=\"category.html\">Computers/ Laptops</a></li>\n");
      out.write("                <li class=\"list-group-item\"><a href=\"category.html\">Mobile</a></li>\n");
      out.write("                <li class=\"list-group-item\"><a href=\"category.html\">Accessories</a></li>\n");
      out.write("                <li class=\"list-group-item\"><a href=\"category.html\">Electronics</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"card bg-light mb-3\">\n");
      out.write("            <div class=\"card-header bg-success text-white text-uppercase\">Last product</div>\n");
      out.write("\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <img class=\"card-img-top\" src=\"https://dummyimage.com/600x400/55595c/fff\" />\n");
      out.write("                <h5 class=\"card-title\"><a href=\"product.html\" title=\"View Product\">Product title</a></h5>\n");
      out.write("                <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
      out.write("                <p class=\"bloc_left_price\">99.00 $</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <!--for each recommended product-->\n");
      out.write("            ");
 for (int i = 0; i < 10; i++) { 
      out.write("\n");
      out.write("            <div class=\"col-12 col-md-6 col-lg-4\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <img class=\"card-img-top\" src=\"https://dummyimage.com/600x400/55595c/fff\" alt=\"Card image cap\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h4 class=\"card-title\"><a href=\"product.html\" title=\"View Product\">Product title</a></h4>\n");
      out.write("                        <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-12\">\n");
      out.write("                                <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                                    <p class=\"btn btn-danger btn-block\">99.00 $</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-success btn-block\">Add to cart</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-12\">\n");
      out.write("        <nav aria-label=\"...\">\n");
      out.write("            <ul class=\"pagination\">\n");
      out.write("                <li class=\"page-item disabled\">\n");
      out.write("                    <a class=\"page-link\" href=\"#\" tabindex=\"-1\">Previous</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"page-item\"><a class=\"page-link\" href=\"#\">1</a></li>\n");
      out.write("                <li class=\"page-item active\">\n");
      out.write("                    <a class=\"page-link\" href=\"#\">2 <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"page-item\"><a class=\"page-link\" href=\"#\">3</a></li>\n");
      out.write("                <li class=\"page-item\">\n");
      out.write("                    <a class=\"page-link\" href=\"#\">Next</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"jumbotron\">\n");
      out.write("                <center>\n");
      out.write("                    <h3>Now Shop with Intelligence!</h3>\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"banner-image\">  \n");
      out.write("                <center>\n");
      out.write("                    <img src=\"images/webmerce+machine+learning.jpg\" width=\"100%\" height=\"70%\"/>\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        var jumboHeight = $('.jumbotron').outerHeight();\n");
      out.write("        function parallax() {\n");
      out.write("            var scrolled = $(window).scrollTop();\n");
      out.write("            $('.bg').css('height', (jumboHeight - scrolled) + 'px');\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        $(window).scroll(function (e) {\n");
      out.write("            parallax();\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
