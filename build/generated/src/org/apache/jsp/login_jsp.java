package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/jspviews/widgets/header.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if lt IE 7 ]> <html lang=\"en\" class=\"ie6 ielt8\"> <![endif]-->\n");
      out.write("<!--[if IE 7 ]>    <html lang=\"en\" class=\"ie7 ielt8\"> <![endif]-->\n");
      out.write("<!--[if IE 8 ]>    <html lang=\"en\" class=\"ie8\"> <![endif]-->\n");
      out.write("<!--[if (gte IE 9)|!(IE)]><!--> <html lang=\"en\"> <!--<![endif]-->\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>iShop Login</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/loginStyle.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/navbar.ishop.css\"/>\n");
      out.write("        <link href=\"css/prodList.css\" rel=\"stylesheet\"/>\n");
      out.write("        <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("        <div class=\"container\">\n");
      out.write("            <section id=\"content\">\n");
      out.write("                <form action=\"LoginServlet\" method=\"post\">\n");
      out.write("                    <h1>Login Form</h1>\n");
      out.write("                    <div>\n");
      out.write("                        <input type=\"text\" placeholder=\"Username\" required=\"\" id=\"username\" name=\"username\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <input type=\"password\" placeholder=\"Password\" required=\"\" id=\"password\" name=\"password\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <input type=\"submit\" value=\"Log in\" />\n");
      out.write("                        <a href=\"#\">Lost your password?</a>\n");
      out.write("                        <a href=\"register.jsp\">Register</a>\n");
      out.write("                    </div>\n");
      out.write("                </form><!-- form -->\n");
      out.write("\n");
      out.write("            </section><!-- content -->\n");
      out.write("        </div><!-- container -->\n");
      out.write("    </body>\n");
      out.write("</html>");
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
