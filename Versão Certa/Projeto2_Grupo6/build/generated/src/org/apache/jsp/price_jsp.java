package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class price_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("        <h1>Tabuada</h1>\n");
      out.write("        Emprestimo: <input type=\"text\" name=\"pv\"/>\n");
      out.write("        Juros mensais: <input type=\"text\" name=\"juros\"/>\n");
      out.write("        Parcelas: <input type=\"text\" name=\"parcelas\"/>\n");
      out.write("        <input type=\"submit\" value=\"Calcular\"/>\n");
      out.write("        </form>\n");
      out.write("        ");

             double pmv = 0;
             double pv = 2;
             double juros = 0;
             int parcelas = 0;
             
             if(request.getParameter("pv")!=null){
                  pv = Integer.parseInt(request.getParameter("pv"));
                  juros = Integer.parseInt(request.getParameter("juros"));
                  parcelas = Integer.parseInt(request.getParameter("parcelas"));
                  
                  pmv = pv * (((Math.pow((1+juros),parcelas))*juros)/
                          ((Math.pow((1+juros),parcelas))*juros));
             }
        
      out.write("\n");
      out.write("        ");

          int linhas = parcelas; int colunas = 4;
          int auxPar[] = new int[parcelas];
          int iPar=0;
        
      out.write("\n");
      out.write("        \n");
      out.write("        <tr>\n");
      out.write("               <th>Período n</th>\n");
      out.write("               <th>Saldo devedor</th>\n");
      out.write("               <th>Parcela</th>\n");
      out.write("               <th>Juros</th>\n");
      out.write("        </tr>\n");
      out.write("        ");
for(int i=1; i<linhas; i++){
      out.write("\n");
      out.write("        \n");
      out.write("            ");
for(int c=1; c<=colunas; c++){
                if(c==1){
                
                }
            
      out.write("\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        \n");
      out.write("        ");
}
      out.write("\n");
      out.write("        \n");
      out.write("    <a href=\"home.jsp\">Voltar</a>\n");
      out.write("    \n");
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
