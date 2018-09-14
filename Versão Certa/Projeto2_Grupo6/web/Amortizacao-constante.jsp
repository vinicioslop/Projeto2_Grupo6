

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="WEB-INF/jspf/cabecalho.jspf" %>
    </head>
    <body>
       <%@include file="WEB-INF/jspf/menu.jspf" %>
        <!--corpo-->
        
        <div class="container" style="margin-left: 40%">
            <br/><br/><br/><br/><br><br>
            
                 <div class="col-md-4" style="margin-right: -40%">
                            <form method="post" class="fonte">
                                Empréstimo inicial (em R$): <br><input type="text" name="C"><br><br>
                                Tempo (em meses): <br><input type="text" name="n"><br><br>
                                Taxa de juros (% em meses): <br><input type="text" name="i"><br><br>
                                <input type="submit" value="Calcular" class="btn btn-lg">
                              
                            </form>
    
                    </div>
        </div>
        <br><br>
        
        
         <% try{
                            //emprestimo 
                            double C = Double.parseDouble(request.getParameter("C"));
                            //taxa de juros
                            double i = Double.parseDouble(request.getParameter("i")) / 100;
                            //tempo
                            int n = Integer.parseInt(request.getParameter("n"));
                            int ct=0;
                            double amortizacao = (C / n);
                            double saldoDevedor = C;
                            double jurosMes=  saldoDevedor*i;
                            double prestacao = amortizacao +jurosMes;
                            
                            if (C > 0.0 && n > 0 && i > 0.0){  %>
                                <table border="2" class="table table-striped"; font-size: 1.5em;">
                                    <tr><th>Mês</th><th>Amortização</th><th>Juros</th><th>Saldo Devedor</th><th>Pagamento</th></tr>

                                    <% for (ct=1;ct <=n; ct++){ %>
                                        <tr><th><%=ct%></th><td><%=String.format("%.2f", amortizacao)%></td><td><%=String.format("%.2f",jurosMes)%></td><td><%=String.format("%.2f",saldoDevedor)%></td><td><%=String.format("%.2f",prestacao)%></td></th></tr>
                                        <%  saldoDevedor = saldoDevedor-amortizacao;
                                            jurosMes = saldoDevedor*i; 
                                            prestacao = amortizacao+jurosMes;} 
                                        %>
                                </table> 
                            <% }
                            }catch(Exception e){%> 
                                <h3 class="h3fonte">Dados inconsistentes</h3>
                            <% } %>
                        
                

        
                        
        <br>
        
        
      <%@include file="WEB-INF/jspf/rodape.jspf" %>  
    </body>
</html>
