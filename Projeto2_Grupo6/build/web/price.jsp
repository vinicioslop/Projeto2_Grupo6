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
          int linhas = 10; int colunas = 4;
        %>
        <table border="1">
        <tr>
             <th>Período</th>
             <th>Saldo Devedor</th>
             <th>Parcela</th>
             <th>Juros</th>
             <th>Amortização</th>
        </tr>
        <%for(int i=1; i<linhas; i++){%>
          <tr>
              <%for(int c=1; c<=colunas; c++){%>
              <td><%= 1 %>, <%= c %></td>
              <%}%>
          </tr>
        <%}%>
        </table>
    <a href="home.jsp">Voltar</a>
    </body>
</html>
