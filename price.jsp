<%-- 
    Document   : price
    Created on : 13/09/2018, 11:46:07
    Author     : vinic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tabuada</h1>
        <form>
        Empréstimo inicial (em R$): <input type="text" name="pv"/>
        Tempo (em meses): <input type="text" name="parcelas"/>
        Taxa de juros (% em meses): <input type="text" name="juros"/>
        <input type="submit" value="Calcular"/>
        </form>
        <%
           double PV = Double.parseDouble(request.getParameter("pv"));
           int Parcelas = Integer.parseInt(request.getParameter("parcelas"));
           double Juros = Double.parseDouble(request.getParameter("juros")) / 100;
           double amortizacao;
           int linhas = Parcelas;
           double pmt=0;
           int i=0;
           double auxJ=0;
           
        %>
        <table border="1">
        <tr>
             <th>Período</th>
             <th>Saldo Devedor</th>
             <th>Parcela</th>
             <th>Juros</th>
             <th>Amortização</th>
        </tr>
        <%
            pmt = PV * (((Math.pow((1+Juros),Parcelas))*Juros)/((Math.pow((1+Juros),Parcelas))-1));
        %>
        <% while(i<=linhas){%>
         <tr>
              <td><%out.println(i);%></td>
              <td><%out.println(PV);%></td>
              <td>
              <%
                  if(i==0){
                      out.println(" ");
                  } else {
                      out.println(pmt);
                  }
              %>
              </td>
              <%
                   auxJ = Juros * PV;
              %>
              <td><%out.println(auxJ);%></td>
              <td>
              <%
                  if(i==0){
                      out.println(" ");
                      i++;
                  } else {
                      amortizacao = pmt-auxJ;
                      out.println(amortizacao);
                      
                      PV = PV - amortizacao;
                      
                      i++;
                  }
              %>
              </td>
        </tr>
        <%}%>
        </table>
    <a href="home.jsp">Voltar</a>
    </body>
</html>
