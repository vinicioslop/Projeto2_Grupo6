


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container" 
             >
             <div class="row"> 
                 <div class="col-sm-10" style="margin-right: 60%">
                            <form method="post" class="fonte">
                                Empréstimo inicial (em R$): <input type="text" name="C"><br><br>
                                Tempo (em meses): <input type="text" name="n"><br><br>
                                Taxa de juros (% em meses): <input type="text" name="i"><br><br>
                                <input type="submit" value="Calcular">
                            </form>
    
                    </div>
   
        
                 
        <!-- TABELA Americana -->
                        <%      try{
                            
                        
                                //emprestimo 
                                double C = Double.parseDouble(request.getParameter("C"));
                                double amortizacao = 0.0;
                                //taxa de juros
                                double i = Double.parseDouble(request.getParameter("i")) / 100;
                                //tempo
                                int n = Integer.parseInt(request.getParameter("n"));
                                int ct=0;
                                double mensalidade =0;
                        
                        
                                      if (C > 0.0 && n > 0 && i > 0.0){  %>
                                      
                                      <div class="col-sm-10" style="margin-left: 40%">
                                    <table border="1" class="fonte"; font-size: 1.5em;">
                                           <tr><th>Mês</th><th>Amortização</th><th>Juros</th><th>Saldo Devedor</th><th>Pagamento Mensal Acumulado</th></tr>
                                        
                                        <% do{
                                        ct++; 
                                        mensalidade = mensalidade+(C*i);
                                        %>

                                        <tr><th><%= ct %><td><%= String.format("%.2f", amortizacao) %></td><td><%= String.format("%.2f", (C*i)) %></td><td><%= String.format("%.2f", C) %></td><td><%=String.format("%.2f", mensalidade)%></td></tr>
                                       
                                        <% }while(ct < (n-1));
                                        ct++;                                        
                                        %> 
                                         <% if (ct == n){
                                         amortizacao=C+(C*i);
                                         mensalidade = amortizacao+mensalidade;
                                         %>
                                         <tr><th><%= ct %><td><%= String.format("%.2f", amortizacao) %></td><td><%= String.format("%.2f", (C*i)) %></td><td><%= String.format("%.2f", C) %><td><%=String.format("%.2f", mensalidade)%></td></td></tr>
                                        <%} 
                               }
                               %>
                                    </table>
                               <% }catch(Exception e){%> 
                                
                        <h3 class="h3fonte">Dados inconsistentes</h3>
                        <%}%>
        
             </div>
             </div>
             </div>
             <a href="home.jsp">Voltar</a>
    </body>
</html>
