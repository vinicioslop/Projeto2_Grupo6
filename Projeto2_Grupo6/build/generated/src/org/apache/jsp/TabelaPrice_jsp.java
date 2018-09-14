package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TabelaPrice_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Tabuada</h1>\n");
      out.write("        <form>\n");
      out.write("        Empréstimo inicial (em R$): <input type=\"text\" name=\"pv\"/>\n");
      out.write("        Tempo (em meses): <input type=\"text\" name=\"parcelas\"/>\n");
      out.write("        Taxa de juros (% em meses): <input type=\"text\" name=\"juros\"/>\n");
      out.write("        <input type=\"submit\" value=\"Calcular\"/>\n");
      out.write("        </form>\n");
      out.write("        ");

           double PV = 0; 
           
           PV = Double.parseDouble(request.getParameter("pv"));
           
           int Parcelas = 0;
           
           Parcelas = Integer.parseInt(request.getParameter("parcelas"));
           
           double Juros = Double.parseDouble(request.getParameter("juros")) / 100;
           
           double amortizacao = 0;
           int linhas = Parcelas;
           double pmt=0;
           int i=0;
           int inicio=0;
           double auxJ=0;
           
           if (PV != 0) {
               inicio=1;
           }
           
         
      out.write("\n");
      out.write("           \n");
      out.write("           ");
if(inicio==1){
      out.write("\n");
      out.write("               <table border=\"1\">\n");
      out.write("               <tr>\n");
      out.write("                    <th>Período</th>\n");
      out.write("                    <th>Saldo Devedor</th>\n");
      out.write("                    <th>Parcela</th>\n");
      out.write("                    <th>Juros</th>\n");
      out.write("                    <th>Amortização</th>\n");
      out.write("                </tr>\n");
      out.write("           ");
}
      out.write("\n");
      out.write("        %>\n");
      out.write("        \n");
      out.write("        ");

            pmt = PV * (((Math.pow((1+Juros),Parcelas))*Juros)/((Math.pow((1+Juros),Parcelas))-1));
        
      out.write("\n");
      out.write("        ");
 while(i<=linhas){
      out.write("\n");
      out.write("         <tr>\n");
      out.write("              <td>");
out.println(i);
      out.write("</td>\n");
      out.write("              <td>");
out.println(PV);
      out.write("</td>\n");
      out.write("              <td>\n");
      out.write("              ");

                  if(i==0){
                      out.println(" ");
                  } else {
                      out.println(pmt);
                  }
              
      out.write("\n");
      out.write("              </td>\n");
      out.write("              ");

                   auxJ = Juros * PV;
              
      out.write("\n");
      out.write("              <td>");
out.println(auxJ);
      out.write("</td>\n");
      out.write("              <td>\n");
      out.write("              ");

                  if(i==0){
                      out.println(" ");
                      amortizacao = pmt - Juros;
                  } else {
                      out.println(amortizacao);
                      amortizacao = pmt - Juros;
                  }
              
      out.write("\n");
      out.write("              </td>    \n");
      out.write("        </tr>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        </table>\n");
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
