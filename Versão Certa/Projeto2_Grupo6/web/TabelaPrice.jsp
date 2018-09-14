


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="WEB-INF/jspf/cabecalho.jspf" %>
        
    </head>
    
    <body>
        <%@include file="WEB-INF/jspf/menu.jspf" %>
        <br/><br/><br/><br/>
        <div class="container" style="margin-bottom: 60%">
            
                <div class="col-sm-10" style="margin-right: 60%">
                <form method="post" class="fonte">
                    Empréstimo inicial (em R$): <br><input type="text" name="C"><br><br>
                    Tempo (em meses): <br><input type="text" name="n"><br><br>
                    Taxa de juros (% em meses): <br><input type="text" name="i"><br><br>
                     <input type="submit" value="Calcular" class="btn btn-lg">
                </form>
    
                </div>
    
                <!-- TABELA Americana -->
                <%try{
                            
                    //emprestimo 
                    double C = Double.parseDouble(request.getParameter("C"));
                    double amortizacao = 0.0;
                    //taxa de juros
                    double i = Double.parseDouble(request.getParameter("i")) / 100;
                    //tempo
                    int n = Integer.parseInt(request.getParameter("n"));
                    int ct=0;
                    double pmt=0.0;
                        
                    if (C > 0.0 && n > 0 && i > 0.0){  %>
                                      
                        <div class="col-sm-10" style="margin-left: 40%">
                        <table border="1" class="fonte"; font-size: 1.5em;">
                        <tr>
                            <th>Mês</th>
                            <th>Saldo Devedor</th>
                            <th>Parcela</th>
                            <th>Juros</th>
                            <th>Amortização</th>
                        </tr>
                        
                        <%
                             pmt = C * (((Math.pow((1+i),n))*i)/((Math.pow((1+i),n))-1));
                             amortizacao = pmt - i; 
                        %>
                                        
                        <%do{
                            ct++; 
                            
                        %>

                        <tr><th><%= ct %><td><%= String.format("%.2f", C) %></td><td><%= String.format("%.2f", pmt) %>
                        </td><td><%= String.format("%.2f", i) %></td><td><%=String.format("%.2f", amortizacao)%></td></tr>
                                       
                        <% }while(ct < (n-1));
                            ct++;                                        
                        %> 
                        <% if (ct == n){
                            
                            
                        %>
                        <tr><th><%= ct %><td><%= String.format("%.2f", amortizacao) %></td><td><%= String.format("%.2f", (C*i)) %>
                        </td><td><%= String.format("%.2f", C) %><td><%=String.format("%.2f", i)%></td></td></tr>
                        <%} 
                               }
                               %>
                                    </table>
                               <% }catch(Exception e){%> 
                               <br/>
                        <h3 class="h3fonte">Dados inconsistentes</h3>
                        <%}%>
        
             </div>
                        
        </div>
    <!--Rodapé-->            
    <%@include file="WEB-INF/jspf/rodape.jspf" %> 
    </body>
</html>
