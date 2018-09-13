<%-- 
    Document   : price
    Created on : 13/09/2018, 10:08:07
    Author     : vinic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        <h1>Tabuada</h1>
        Emprestimo: <input type="text" name="pv"/>
        Juros mensais: <input type="text" name="juros"/>
        Parcelas: <input type="text" name="parcelas"/>
        <input type="submit" value="Calcular"/>
        </form>
        <%
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
        %>
        <%
          int linhas = parcelas; int colunas = 4;
          int auxPar[] = new int[parcelas];
          int iPar=0;
        %>
        
        <tr>
               <th>Período n</th>
               <th>Saldo devedor</th>
               <th>Parcela</th>
               <th>Juros</th>
        </tr>
        <%for(int i=1; i<linhas; i++){%>
        
            <%for(int c=1; c<=colunas; c++){
                if(c==1){
                  <td><% auxPAR[i] %></td>
                }
            %>
            <%}%>
        
        <%}%>
        
    <a href="home.jsp">Voltar</a>
    
</html>
