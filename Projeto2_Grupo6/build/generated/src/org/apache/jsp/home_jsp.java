package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/jspf/cabecalho.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/menu.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/rodape.jspf");
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head><!-- Latest compiled and minified CSS -->\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- jQuery library -->\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Latest compiled JavaScript -->\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <!--css - google fonts-->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Raleway\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css.css\">");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body style=\"background-color: whitesmoke\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- NavBar-->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write(" <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"home.jsp\">Home</a>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"Amortizacao-Americana.jsp\">Amortização Americana</a>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"Amortizacao-constante.jsp\">Amortização Constante</a>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"TabelaPrice.jsp\">Tabela Price</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--Corpo-->\n");
      out.write("        <div class=\"jumbotron\" style=\"background-color: #4169E1\">\n");
      out.write("            <div class=\"container\" style=\"margin-left: 10%; color: white\">\n");
      out.write("                <h1>Calculadora Finaceira</h1>\n");
      out.write("                <p>Uma aplicação que possui a finalidade de ajudar você no cálculo de qualquer amortização de forma rápida e eficiente</p> \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\" >\n");
      out.write("            <div class=\"row slideanim\" style=\"margin-left: 2%\">\n");
      out.write("                <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("                    <div class=\"panel panel-default text-center\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <h1>Constante</h1>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("                            <p>O valor da amortização é calculada dividindo-se o valor do principal pelo número de períodos de pagamento, ou seja, de parcelas.</p>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-footer\">\n");
      out.write("\n");
      out.write("                            <a href=\"Amortizacao-constante.jsp\" class=\"btn btn-lg\" role=\"button\">Calcular</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-4 col-xs-12\" style=\"margin-top: -21.1%;margin-left: 34% \">\n");
      out.write("                <div class=\"panel panel-default text-center\">\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        <h1>Americana</h1>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("                        <p>Esse sistema de amortização tem a vantagem em relação ao sistema de pagamento único, pois nele não há incidência de juros sobre juros.</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-footer\">\n");
      out.write("\n");
      out.write("                        <a href=\"Amortizacao-Americana.jsp\" class=\"btn btn-lg\" role=\"button\">Calcular</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>      \n");
      out.write("            </div>       \n");
      out.write("\n");
      out.write("            <div class=\"col-sm-4 col-xs-12\"Style=\"margin-top: -21.1%; margin-left: 66%\">\n");
      out.write("                <div class=\"panel panel-default text-center\">\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        <h1>Tabela Price</h1>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <p> É um método usado em amortização de empréstimo cuja principal característica é apresentar prestações (ou parcelas) iguais. </p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-footer\">\n");
      out.write("\n");
      out.write("                        <a href=\"TabelaPrice.jsp\" class=\"btn btn-lg\" role=\"button\">Calcular</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>      \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--Apresentação dos alunos-->\n");
      out.write("        <div  class=\"container-fluid\"style=\"background-color: whitesmoke;\">\n");
      out.write("            <div class=\"row\" style=\"margin-left: 17%\">\n");
      out.write("                <div class=\"jumbotron\" style=\"text-indent:30%; background-color: whitesmoke\"><h2>Equipe</h2></div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <h3>Daniel Beserra Gomes</h3>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <h3>Peterson da Silva</h3>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\" style=\"margin-left: \">\n");
      out.write("                    <h3>Vinícius Lopes Lima</h3>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <br/><br/>\n");
      out.write("        <br/><br/>\n");
      out.write("   \n");
      out.write("\n");
      out.write("        <!--Rodapé-->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container-fluid\" style=\"max-height: 200px; \">\n");
      out.write("<footer class=\"footer-css\" style=\"; position: fixed;\n");
      out.write("    left: 0;\n");
      out.write("    bottom: 0;\n");
      out.write("    width: 100%;\n");
      out.write("    background-color: #4169E1;\n");
      out.write("    color: white;\n");
      out.write("    text-align: center;\">\n");
      out.write("    <p class=\"fonte\">Desenvolvido em Setembro/2018</p>\n");
      out.write("</footer>\n");
      out.write("</div>");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html> \n");
      out.write("\n");
      out.write("\n");
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
