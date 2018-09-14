<%-- 
    Document   : price
    Created on : 13/09/2018, 11:46:07
    Author     : vinic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        <h1>Tabuada</h1>
        <form>
        Empréstimo inicial (em R$): <input type="text" name="pv"/>
        Tempo (em meses): <input type="text" name="parcelas"/>
        Taxa de juros (% em meses): <input type="text" name="juros"/>
        <input type="submit" value="Calcular"/>
        </form>
        <%
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
           
           %>
           
           <%if(inicio==1){%>
           <table border="1">
               <tr>
                    <th>Período</th>
                    <th>Saldo Devedor</th>
                    <th>Parcela</th>
                    <th>Juros</th>
                    <th>Amortização</th>
                </tr>
           <%}%>
        
        
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
                      amortizacao = pmt - Juros;
                  } else {
                      out.println(amortizacao);
                      amortizacao = pmt - Juros;
                  }
              %>
              </td>    
        </tr>
        <%}%>
        </table>
    
    