package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Amortizacao_002dAmericana_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
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
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
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
      out.write("        <br/><br/><br/><br/>\n");
      out.write("        <div class=\"container\" style=\"margin-bottom: 60%\">\n");
      out.write("            \n");
      out.write("                 <div class=\"col-sm-10\" style=\"margin-right: 60%\">\n");
      out.write("                            <form method=\"post\" class=\"fonte\">\n");
      out.write("                                Empréstimo inicial (em R$): <br><input type=\"text\" name=\"C\"><br><br>\n");
      out.write("                                Tempo (em meses): <br><input type=\"text\" name=\"n\"><br><br>\n");
      out.write("                                Taxa de juros (% em meses): <br><input type=\"text\" name=\"i\"><br><br>\n");
      out.write("                                <input type=\"submit\" value=\"Calcular\" class=\"btn btn-lg\">\n");
      out.write("                              \n");
      out.write("                            </form>\n");
      out.write("    \n");
      out.write("                    </div>\n");
      out.write("   \n");
      out.write("        \n");
      out.write("                 \n");
      out.write("        <!-- TABELA Americana -->\n");
      out.write("        \n");
      out.write("                        ");
      try{
                            
                        
                                //emprestimo 
                                double C = Double.parseDouble(request.getParameter("C"));
                                double amortizacao = 0.0;
                                //taxa de juros
                                double i = Double.parseDouble(request.getParameter("i")) / 100;
                                //tempo
                                int n = Integer.parseInt(request.getParameter("n"));
                                int ct=0;
                                double mensalidade =0;
                        
                        
                                      if (C > 0.0 && n > 0 && i > 0.0){  
      out.write("\n");
      out.write("                                      \n");
      out.write("                                      <div class=\"col-sm-10\" style=\"margin-left: 40%\">\n");
      out.write("                                    <table border=\"1\" class=\"fonte\"; font-size: 1.5em;\">\n");
      out.write("                                           <tr><th>Mês</th><th>Amortização</th><th>Juros</th><th>Saldo Devedor</th><th>Pagamento Mensal Acumulado</th></tr>\n");
      out.write("                                        \n");
      out.write("                                        ");
 do{
                                        ct++; 
                                        mensalidade = mensalidade+(C*i);
                                        
      out.write("\n");
      out.write("\n");
      out.write("                                        <tr><th>");
      out.print( ct );
      out.write("<td>");
      out.print( String.format("%.2f", amortizacao) );
      out.write("</td><td>");
      out.print( String.format("%.2f", (C*i)) );
      out.write("\n");
      out.write("                                            </td><td>");
      out.print( String.format("%.2f", C) );
      out.write("</td><td>");
      out.print(String.format("%.2f", mensalidade));
      out.write("</td></tr>\n");
      out.write("                                       \n");
      out.write("                                        ");
 }while(ct < (n-1));
                                        ct++;                                        
                                        
      out.write(" \n");
      out.write("                                         ");
 if (ct == n){
                                         amortizacao=C+(C*i);
                                         mensalidade = amortizacao+mensalidade;
                                         
      out.write("\n");
      out.write("                                         <tr><th>");
      out.print( ct );
      out.write("<td>");
      out.print( String.format("%.2f", amortizacao) );
      out.write("</td><td>");
      out.print( String.format("%.2f", (C*i)) );
      out.write("\n");
      out.write("                                             </td><td>");
      out.print( String.format("%.2f", C) );
      out.write("<td>");
      out.print(String.format("%.2f", mensalidade));
      out.write("</td></td></tr>\n");
      out.write("                                        ");
} 
                               }
                               
      out.write("\n");
      out.write("                                    </table>\n");
      out.write("                               ");
 }catch(Exception e){
      out.write(" \n");
      out.write("                               <br/>\n");
      out.write("                        <h3 class=\"h3fonte\">Dados inconsistentes</h3>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("        \n");
      out.write("             </div>\n");
      out.write("             </div>\n");
      out.write("\n");
      out.write("    <!--Rodapé-->            \n");
      out.write("     ");
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
      out.write(" \n");
      out.write("     \n");
      out.write("    \n");
      out.write("    </body>\n");
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
